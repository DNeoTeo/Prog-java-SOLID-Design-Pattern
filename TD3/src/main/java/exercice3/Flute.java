package exercice3;

public class Flute extends WoodWind implements Soloist{
    public void play(){
        System.out.println("Flute plays like an Instrument");
    }
    @Override
    public void playLikeASoprano(){
        System.out.println("Flute plays like a Soprano");
    }
    @Override
    public void playLikeATenor() {
        System.out.println("Flute cannot play like a Tenor");
    }
}
