package exercice7;

import java.util.ArrayList;

public class StudentModel implements IStudentModel{
    private ArrayList<IStudentView> observers = new ArrayList<IStudentView>();
    private String rollNo;
    private String name;

    public StudentModel(){
        super();
    }
    @Override
    public void registerObserver(IStudentView o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IStudentView o) {
        if(observers.contains(o)){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for (IStudentView o : observers)
        {
            ArrayList<String> info = new ArrayList<String>();
            info.add(this.name);
            info.add(this.rollNo);
            o.update(info);
        }
    }

    @Override
    public String getRollNo() {
        return this.rollNo;
    }

    @Override
    public void setRollNo(String rollNo) {
        this.rollNo=rollNo;
        notifyObserver();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
        notifyObserver();
    }
}
