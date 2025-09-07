abstract class Student extends Person {
    
    

    private int StudentId;
    private String course;

    public Student(String name,int age,int StudentId,String course){

       super(name,age);

       this.StudentId = StudentId;
       this.course = course;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    abstract void study();
    
    public void displayStudent(){

        displayInfo();
        System.out.println("Student Id: " + StudentId);
        System.out.println("Course: " + course);
    }
}


