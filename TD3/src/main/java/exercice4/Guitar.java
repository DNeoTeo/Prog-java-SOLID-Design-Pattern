package exercice4;

public class Guitar extends Stringed implements Tenor {
    public void play(){
        System.out.println("Guitar plays like an Instrument");
    }
    @Override
    public void playLikeATenor() {
        System.out.println("Guitar plays like a Tenor");
    }
}
