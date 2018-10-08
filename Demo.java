package lesson8.HomeWork.arithmetic.Second;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {



    }

     static Student createHighestParent() {

         Course[] course = new Course[5];

         Student student = new Student("Nikolay","Pupkov", 143,course);
         return student;
    }
    Course[] course2 = new Course[0];
    public SpecialStudent createLowestChild() {
        SpecialStudent specialStudent = new SpecialStudent("Nikolay","Pupkov", 143,course2, 123, "@");
        return specialStudent;
    }

}
