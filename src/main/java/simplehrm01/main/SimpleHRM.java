package simplehrm01.main;

import java.util.Arrays;
import simplehrm01.model.Faculty;
import simplehrm01.model.Graduated;
import simplehrm01.model.Person;
import simplehrm01.model.Staff;
import simplehrm01.model.Student;
import simplehrm01.model.Undergraduate;

public class SimpleHRM {

    public static void main(String[] args) {

        Person[] person = new Person[7];

        person[0] = new Undergraduate(Undergraduate.programFlag.normal, "585762875", "Sumal Jeb");
        person[1] = new Faculty("Professor Dr. ", "Somchai Mahachok", "mahachok.s@sit.kmutt.ac.th");
        person[2] = new Staff("HRM", "Sompong Thonghong", "sompong@somemail.com");
        person[3] = new Undergraduate(Undergraduate.programFlag.english, "589992827", "Aha Malidee");
        person[4] = new Graduated(Graduated.programFlag.weekend, "585763456", "Juvadee Sukmak");
        person[5] = new Faculty("Professor Dr. ", "Vinai Sukum", "sukum.v@sit.kmutt.ac.th");
        person[6] = new Graduated(Graduated.programFlag.weekdays, "585238759", "Manasuk Katoke");

        //1
        Person person01 = new Staff("HRM", "Ana Jo", "my@sit.com");
        //2
        //Person person02 = new Employee("SIT building",25000);
        //3
        Faculty person03 = new Faculty("Prapakeaw Aristawan","fac@sit.kmutt.com");
        Arrays.sort(person);
        //4
        //Student std01 = new Student();
        //5
        Undergraduate std02 = new Undergraduate("582272667","Yutta Ussamalaw");
        //6
        //Person std03 = new Graduated();
        //7
        Student p002 = (Student)person[0];
        //8
        Student p003 = (Graduated)person[6];
        //9
        //Person p004 = (Employee)person[3];
        //10
        Graduated p005 = (Graduated)person[0];

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());

        }
    }
}
