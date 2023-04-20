package esiea.tools.validator;

public class PasswordValidator {
    private String password = "";
    String strRegEx = "^(?=.*[0-9]).{6,20}$";
    public boolean validatePassword(String testPW)
    {
        if(testPW.matches(strRegEx)){
            return true;
        }
        else {
            return false;
        }
    }
}
