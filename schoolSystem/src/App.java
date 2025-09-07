public class App {
    public static void main(String[] args) throws Exception {
     

        student student1 = new student("Jhon Rex", 19, "12345");
        student student2 = new student("Uno Dose", 23, "1223");
        teacher teacher = new teacher("Jesica", 25, "Comprog 1");
        staff staff = new staff("Mr. Obama", 35, "Software Developer");

       
        student1.displayStudent();
        student2.displayStudent();
        teacher.displayTeacher();
        staff.displayStaff();

    }
}
