package exercice3;

public class Trombone extends Brass implements Soloist{
    public void play(){
        System.out.println("Trombone plays like an Instrument");
    }
    @Override
    public void playLikeASoprano(){
        System.out.println("Trombone cannot play like a Soprano");
    }
    @Override
    public void playLikeATenor() {
        System.out.println("Trombone plays like a Tenor");
    }
}
