package exercice8;

public class DraftDoc implements IDocumentState {
    DocumentState docState;
    public DraftDoc(DocumentState documentState){
        this.docState = documentState;
    }
    @Override
    public void create() {
        System.out.println("Document draft is already created, ready for review");
    }
    @Override
    public void review(Boolean success) {
        this.docState.review_failed++;
        if(success){
            System.out.println("Document review success, ready for publish");
            this.docState.setState(this.docState.getPublished());
        }
        else if(this.docState.review_failed<3){
            System.out.println("Document review failed, going to draft again");
            this.docState.setState(this.docState.getModeration());
        }
        else{
            System.out.println("Document review failed too many times, it's a crap !");
            this.docState.setState(this.docState.getRemoved());
        }
    }
    @Override
    public void publish() {
        System.out.println("You tried to publish but, but there has been no review");
    }

    @Override
    public String toString() {
        return "draft";
    }
}
