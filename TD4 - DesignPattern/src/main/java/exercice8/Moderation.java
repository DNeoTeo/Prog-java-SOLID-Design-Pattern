package exercice8;

public class Moderation implements IDocumentState {
    DocumentState docState;
    public Moderation(DocumentState documentState){
        this.docState = documentState;
    }
    @Override
    public void create() {
        System.out.println("Document draft created, ready for review");
        this.docState.setState(this.docState.getDraftDoc());
    }
    @Override
    public void review(Boolean success) {
        System.out.println("You need to create your document first");
    }
    @Override
    public void publish() {
        System.out.println("You tried to publish but, there has been no review");
    }

    @Override
    public String toString() {
        return "draft";
    }
}
