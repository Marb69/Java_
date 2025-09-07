public class App {
    public static void main(String[] args) throws Exception {
       


        Student student[] = new Student[2];

        student[0] = new highschool("Jan Jan", 17, 143, "Gas");
        student[1] = new college("Alvert", 20, 123, "IT");

        for (Student studentList : student) {
            
            studentList.displayStudent();
           studentList.study();
        }
    }
}
