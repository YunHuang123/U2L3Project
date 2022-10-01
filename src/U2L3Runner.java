public class U2L3Runner {
    public static void main(String[] args) {
        //student 1
        Student student1 = new Student("Charles", "Smith", 2021);
        student1.addTestScore(85.5);
        student1.printStudentInfo();
        System.out.println();

        student1.addTestScore(94.5);
        student1.printStudentInfo();
        System.out.println();

        //student 2
        Student student2 = new Student("Amy", "Adams", 2020);
        student2.addTestScore(98.2);
        student2.printStudentInfo();
        System.out.println();

        double student1avg = student1.averageTestScore();
        double student2avg = student2.averageTestScore();

        boolean student1greater = (student1avg > student2avg);
        System.out.println(student1greater);
        boolean student2greater = (student1avg < student2avg);
        System.out.println(student2greater);




    }
}
