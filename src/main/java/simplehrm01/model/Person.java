package simplehrm01.model;


public abstract class Person implements Comparable<Person>{
    private String name, email;
    protected String pstatus="Person";

    public Person() {
        this("Unknown","Unknown email");
    }
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "["+pstatus+"] ";
    }

    @Override
    public int compareTo(Person t) {
       return this.toString().compareTo(t.toString());
    }
    
}
