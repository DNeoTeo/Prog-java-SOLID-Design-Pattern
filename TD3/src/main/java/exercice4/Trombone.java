package exercice4;

public class Trombone extends Brass implements Tenor{
    public void play(){
        System.out.println("Trombone plays like an Instrument");
    }
    @Override
    public void playLikeATenor() {
        System.out.println("Trombone plays like a Tenor");
    }
}
