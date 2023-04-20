package exercice7;

import java.util.ArrayList;

public class StudentController implements IStudentController{
    private IStudentModel model;
    private IStudentView view;

    public StudentController(IStudentModel model){
        this.model = model;
        this.view = new StudentView(model, this);
    }

    public void updateView(){
        this.model.notifyObserver();
    }

    @Override
    public void setStudentName(String name) {
        this.model.setName(name);
    }

    @Override
    public String getStudentName() {
        return this.model.getName();
    }

    @Override
    public void setStudentRollNo(String rollNo) {
        this.model.setRollNo(rollNo);
    }

    @Override
    public String getStudentRollNo() {
        return this.model.getName();
    }
}
