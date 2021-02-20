package simplehrm01.model;


public abstract class Employee extends Person{
        private String office;
        private double salary;
        
        public Employee() {
          this("Unknown",0.0);
      }
     public Employee(String name,  String email){
            super (name,email);
     }
     public Employee(String office, double salary) {
         this.office = office;
         this.salary = salary;
         this.pstatus="Employee";
     }  

}
