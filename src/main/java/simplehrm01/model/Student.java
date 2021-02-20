package simplehrm01.model;

public abstract class Student extends Person {

    private String studentId;
    protected String level;

    public Student(String studentId, String name) {
        super(name, "Unknown Email");
        this.pstatus = "Student";
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return super.toString() + " " + level + " ID: " + studentId + " " + this.getName();
    }

    @Override
    public int compareTo(Person t) {
        String temp = this.level + this.studentId, temp2 = "";
        Student stdT = null;
        if (t instanceof Student) {
            stdT = (Student) t;
            temp2 = stdT.getLevel() + stdT.getStudentId();
            return temp.compareTo(temp2);
        } else {
            return super.compareTo(t);
        }

    }

}
