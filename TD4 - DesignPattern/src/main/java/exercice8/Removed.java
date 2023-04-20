package exercice8;

public class Removed implements IDocumentState {
    DocumentState docState;
    public Removed(DocumentState docState){
        this.docState = docState;
    }
    @Override
    public void create() {
        System.out.println("Your document is removed, cannot create it");
    }
    @Override
    public void review(Boolean success) {
        System.out.println("Your document is removed, cannot review it");
    }
    @Override
    public void publish() {
        System.out.println("Your document is removed, cannot publish it");
    }

    @Override
    public String toString() {
        return "removed";
    }
}
