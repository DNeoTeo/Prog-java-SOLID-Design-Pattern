package exercice8;

public class Published implements IDocumentState {
    DocumentState docState;
    public Published(DocumentState docState){
        this.docState = docState;
    }
    @Override
    public void create() {
        System.out.println("Your document is already created and reviewed");
    }
    @Override
    public void review(Boolean success) {
        System.out.println("Your document is already reviewed, now publish it");
    }
    @Override
    public void publish() {
        System.out.println("Your document isn't reviewed");
    }

    @Override
    public String toString() {
        return "published";
    }
}
