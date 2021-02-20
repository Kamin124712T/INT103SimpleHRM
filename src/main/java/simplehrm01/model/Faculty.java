package simplehrm01.model;

public class Faculty extends Employee {

    public String rank;

    public Faculty(String name, String email) {
        this("", name, email);
    }

    public Faculty(String rank, String name, String email) {
        super(name, email);
        this.rank = rank;
        this.pstatus = "Employee Faculty";
    }

    @Override
    public String toString() {
        return super.toString() + " " + rank + " " + this.getName();
    }

}
