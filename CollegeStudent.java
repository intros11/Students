package lesson8.HomeWork.arithmetic.Second;

public class CollegeStudent extends Student {
    String collegeName;
    int rating;
    long id;


    public CollegeStudent(String firstname, String lastName, int group, Course[] coursesTaken, String collegeName, int rating, long id) {
        super(firstname, lastName, group, coursesTaken);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    public CollegeStudent(String firstname, String lastName, int group, Course[] coursesTaken) {
        super(firstname, lastName, group, coursesTaken);
    }
}
