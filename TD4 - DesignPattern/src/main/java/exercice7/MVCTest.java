package exercice7;


public class MVCTest {
    public static void main(String[] args) {
        StudentModel sModel  = new StudentModel();
        StudentController sControl = new StudentController(sModel);
    }
}
