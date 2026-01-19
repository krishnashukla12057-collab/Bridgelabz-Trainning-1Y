class PenDivision{
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;

        int pensEach = totalPens / students;
        int remainingPens = totalPens % students;

        System.out.println("Each student gets = " + pensEach + " pens");
        System.out.println("Remaining pens = " + remainingPens);
    }
}
