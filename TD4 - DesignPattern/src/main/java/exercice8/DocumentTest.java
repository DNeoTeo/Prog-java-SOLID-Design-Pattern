package exercice8;

public class DocumentTest {
    public static void main(String[] args) {
        DocumentState document1 = new DocumentState();
        System.out.println(document1);

        document1.create();
        document1.review(false);
        document1.create();
        document1.review(false);
        document1.create();
        document1.review(false);
        System.out.println(document1);

        DocumentState document2 = new DocumentState();
        System.out.println(document2);

        document2.create();
        document2.review(false);
        document1.create();
        document2.review(true);
        document2.publish();
        System.out.println(document2);
    }
}
