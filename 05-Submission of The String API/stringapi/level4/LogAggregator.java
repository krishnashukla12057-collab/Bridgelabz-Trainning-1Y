package stringapi.level4;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

class LogAggregator {
    private StringBuffer logBuffer = new StringBuffer();
    private int webCount = 0, dbCount = 0, cacheCount = 0, apiCount = 0;

    public synchronized void addLog(String service, String level, String message) {
        String timestamp = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());
        logBuffer.append("[").append(timestamp).append("] ")
                .append("[").append(service).append("] ")
                .append("[").append(level).append("] ")
                .append(message).append("\n");

        switch (service) {
            case "WebServer": webCount++; break;
            case "Database": dbCount++; break;
            case "Cache": cacheCount++; break;
            case "APIGateway": apiCount++; break;
        }
    }

    public void displayLogs() {
        System.out.println("==== Consolidated Logs ====");
        System.out.println(logBuffer.toString());
    }

    public void displayStatistics() {
        System.out.println("==== Log Statistics ====");
        System.out.println("Web Server: " + webCount);
        System.out.println("Database  : " + dbCount);
        System.out.println("Cache     : " + cacheCount);
        System.out.println("API Gateway: " + apiCount);
        System.out.println("Total Log Size (chars): " + logBuffer.length());
    }
}

class ServiceThread extends Thread {
    private String serviceName;
    private int sleepInterval;
    private LogAggregator aggregator;
    private Random random = new Random();
    private String[] levels = {"INFO", "WARNING", "ERROR"};

    public ServiceThread(String serviceName, int sleepInterval, LogAggregator aggregator) {
        this.serviceName = serviceName;
        this.sleepInterval = sleepInterval;
        this.aggregator = aggregator;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            String level = levels[random.nextInt(levels.length)];
            String message = serviceName + " log entry #" + i;
            aggregator.addLog(serviceName, level, message);
            try {
                Thread.sleep(sleepInterval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadedLogAggregator {
    public static void main(String[] args) throws InterruptedException {
        LogAggregator aggregator = new LogAggregator();

        ServiceThread web = new ServiceThread("WebServer", 100, aggregator);
        ServiceThread db = new ServiceThread("Database", 150, aggregator);
        ServiceThread cache = new ServiceThread("Cache", 80, aggregator);
        ServiceThread api = new ServiceThread("APIGateway", 120, aggregator);

        web.start();
        db.start();
        cache.start();
        api.start();

        web.join();
        db.join();
        cache.join();
        api.join();

        aggregator.displayLogs();
        aggregator.displayStatistics();
    }
}
