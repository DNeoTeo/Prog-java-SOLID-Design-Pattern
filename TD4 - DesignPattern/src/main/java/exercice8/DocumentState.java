package exercice8;

public class DocumentState implements IDocumentState {
    private DraftDoc draftDoc;
    private Moderation moderation;
    private Published published;
    private Removed removed;
    public int review_failed;
    private IDocumentState state;
    public DocumentState(){
        this.draftDoc = new DraftDoc(this);
        this.moderation = new Moderation(this);
        this.published = new Published(this);
        this.removed = new Removed(this);
        this.state = getModeration();
        this.review_failed = 0;
    }
    @Override
    public void create(){
        this.state.create();
    }
    @Override
    public void review(Boolean success) {
        this.state.review(success);
    }
    @Override
    public void publish() {
        this.state.publish();
    }

    public void setState(IDocumentState state) {
        this.state = state;
    }

    public DraftDoc getDraftDoc() {
        return draftDoc;
    }

    public Moderation getModeration() {
        return moderation;
    }

    public Published getPublished() {
        return published;
    }

    public Removed getRemoved() {
        return removed;
    }

    @Override
    public String toString() {
        return "Publishing Corporation, Inc. Document is "+state.toString();
    }
}
