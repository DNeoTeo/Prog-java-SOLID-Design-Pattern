package exercice7;

public interface IStudentModel {
    public void registerObserver(IStudentView o);
    public void removeObserver(IStudentView o);
    public void notifyObserver();
    public String getRollNo();
    public void setRollNo(String rollNo);
    public String getName();
    public void setName(String name);
}
