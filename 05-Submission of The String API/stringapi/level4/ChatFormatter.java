package stringapi.level4;

import java.text.SimpleDateFormat;
import java.util.*;

class Message {
    String user;
    String content;
    String timestamp;

    public Message(String user, String content, String timestamp) {
        this.user = user;
        this.content = content;
        this.timestamp = timestamp;
    }
}

class ChatFormatter {

    // Part A: Parse message
    public static Map<String, List<String>> parseMessage(String message) {
        Map<String, List<String>> tokens = new HashMap<>();
        tokens.put("words", new ArrayList<>());
        tokens.put("mentions", new ArrayList<>());
        tokens.put("hashtags", new ArrayList<>());
        tokens.put("commands", new ArrayList<>());

        StringTokenizer st = new StringTokenizer(message, " ");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (token.startsWith("@")) tokens.get("mentions").add(token);
            else if (token.startsWith("#")) tokens.get("hashtags").add(token);
            else if (token.startsWith("/")) tokens.get("commands").add(token.substring(1)); // remove /
            else tokens.get("words").add(token);
        }
        return tokens;
    }

    // Part B: Format message with StringBuilder
    public static String formatMessage(Message msg) {
        StringTokenizer st = new StringTokenizer(msg.content, " ");
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(msg.timestamp).append("] ").append(msg.user).append(": ");

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (token.startsWith("@")) sb.append("**").append(token).append("** ");
            else if (token.startsWith("#")) sb.append("*").append(token).append("* ");
            else if (token.startsWith("/")) sb.append("[CMD: ").append(token.substring(1)).append("] ");
            else sb.append(token).append(" ");
        }

        // Message metadata
        String plainText = msg.content.replaceAll("[@#\\/]", ""); // remove symbols for count
        int charCount = msg.content.length();
        int wordCount = msg.content.trim().split("\\s+").length;

        sb.append(" (Chars: ").append(charCount).append(", Words: ").append(wordCount).append(")");
        return sb.toString().trim();
    }
}

class ChatAnalytics {
    private Map<String, Integer> mentionCount = new HashMap<>();
    private Map<String, Integer> hashtagCount = new HashMap<>();
    private int totalMessages = 0;
    private int totalLength = 0;
    private String longestMessage = "";
    private String shortestMessage = null;

    public void analyze(Message msg) {
        totalMessages++;
        totalLength += msg.content.length();

        StringTokenizer st = new StringTokenizer(msg.content, " ");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (token.startsWith("@")) mentionCount.put(token, mentionCount.getOrDefault(token, 0) + 1);
            else if (token.startsWith("#")) hashtagCount.put(token, hashtagCount.getOrDefault(token, 0) + 1);
        }

        if (longestMessage.length() < msg.content.length()) longestMessage = msg.content;
        if (shortestMessage == null || shortestMessage.length() > msg.content.length()) shortestMessage = msg.content;
    }

    public void report(int conversationDurationSec) {
        System.out.println("\n==== Analytics Report ====");
        System.out.println("Total Messages: " + totalMessages);
        System.out.println("Average Message Length: " + (totalMessages == 0 ? 0 : totalLength / totalMessages));
        System.out.println("Longest Message: " + longestMessage);
        System.out.println("Shortest Message: " + shortestMessage);

        String mostMentioned = mentionCount.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse("None");
        String mostHashtag = hashtagCount.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse("None");

        System.out.println("Most Mentioned User: " + mostMentioned);
        System.out.println("Most Used Hashtag: " + mostHashtag);
        System.out.println("Total Conversation Duration (simulated): " + conversationDurationSec + " seconds");
    }
}

class ChatUser extends Thread {
    private String userName;
    private StringBuffer conversation;
    private ChatAnalytics analytics;
    private List<String> messages;
    private int delay;

    public ChatUser(String userName, List<String> messages, StringBuffer conversation, ChatAnalytics analytics, int delay) {
        this.userName = userName;
        this.messages = messages;
        this.conversation = conversation;
        this.analytics = analytics;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (String msgContent : messages) {
            String timestamp = new SimpleDateFormat("HH:mm:ss").format(new Date());
            Message msg = new Message(userName, msgContent, timestamp);
            String formatted = ChatFormatter.formatMessage(msg);

            synchronized (conversation) {
