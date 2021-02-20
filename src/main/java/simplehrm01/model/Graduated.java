package simplehrm01.model;


public class Graduated extends Student{
    public   enum   programFlag{
          weekdays, weekend
    }
    private programFlag program;
    
    public Graduated(programFlag status,String studentId, String name) {
        super(studentId,name);
        this.program = status;
        this.level ="Graduated";
    }

    public programFlag getProgram() {
        return program;
    }

    public void setProgram(programFlag program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return super.toString()+" ("+program+" program)";
    }
    
    
}
