package lesson8.HomeWork.arithmetic.Second;

public class SpecialStudent extends CollegeStudent {
    long secretKey;
    String email;

    public SpecialStudent(String firstname, String lastName, int group, Course[] coursesTaken, long secretKey, String email) {
        super(firstname, lastName, group, coursesTaken);
        this.secretKey = secretKey;
        this.email = email;
    }
}
