public class Student {

    String surname;
    String firstName;
    Character middleInitial;
    String dateOfBirth;
    int studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;

    public void sayMyStudentNumber() {
        System.out.println("Hello! My student number is " + studentNumber);
    }
    public void sayMyEmailAddress() {
        System.out.println("My email address is " + studentEmailAddress);
    }
    public void amIAwesome() {
        System.out.println("If you think I am awesome.. well, that's " + iAmAwesome);
    }
}
