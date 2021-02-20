package simplehrm01.model;

public class Staff extends Employee {

    private String title;

    public Staff(String title, String name, String email) {
        super(name, email);
        this.title = title;
        this.pstatus = "Employee Staff";
    }

    @Override
    public String toString() {
        return super.toString() + "   " + this.getName()
                + "(" + title + ")";

    }
}
