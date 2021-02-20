package simplehrm01.model;


public class Undergraduate extends  Student{
    public   enum   programFlag{
          normal, english
    }

    private programFlag program;
    
    public Undergraduate(String studentId, String name) {
        this(programFlag.normal,studentId,name);
    }

    public Undergraduate(programFlag status, String studentId, String name ){
        super(studentId, name);
        this.program = status;
        this.level ="Undergraduate";
    }

    @Override
    public String toString() {
        return super.toString()+" ("+program+" program)";
    }
    
}
