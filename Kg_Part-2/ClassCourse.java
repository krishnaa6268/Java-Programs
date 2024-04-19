class ClassCourse {
    
    static int maxCapacity;

    String courseName; 
    int enrollments;

    String[] enrollStudents;

    ClassCourse(String courseName)
    {
        this.courseName=courseName;
        this.enrollments=0;
        this.enrollStudents=new String[maxCapacity];
    }

    static{
        maxCapacity=100;
    }

    
    
    static void setMaxCapacity(int maxCapacity)
    {
        ClassCourse.maxCapacity=maxCapacity;
    }

    void enrolledStudent(String sName){
        enrollStudents[enrollments]=sName;
        enrollments++;
    }

    void unenrollStudent(String sName){
        System.out.println("Student Removed...");
        enrollments--;
    }
    public static void main(String[] args) {
        //ClassCourse cc= new ClassCourse("MCA");

    }

}
