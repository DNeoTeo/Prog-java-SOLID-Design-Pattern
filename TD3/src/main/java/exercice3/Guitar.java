package exercice3;

public class Guitar extends Stringed implements Soloist{
    public void play(){
        System.out.println("Guitar plays like an Instrument");
    }
    @Override
    public void playLikeASoprano(){
        System.out.println("Guitar cannot play like a Soprano");
    }
    @Override
    public void playLikeATenor() {
        System.out.println("Guitar plays like a Tenor");
    }
}
