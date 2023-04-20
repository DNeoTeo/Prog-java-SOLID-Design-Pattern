package exercice4;

import java.util.ArrayList;

public class Music {
    public static void main(String[] args){
        Orchestra orch = new Orchestra();
        Trombone trombone = new Trombone();
        Flute flute = new Flute();
        Guitar guitar = new Guitar();
        Violin violin = new Violin();
        Percussion tambour = new Percussion();
        orch.addInstrument(tambour);
        orch.addInstrument(trombone);
        orch.addInstrument(flute);
        orch.addInstrument(guitar);
        orch.addInstrument(violin);

        orch.tuneAll();
        orch.tuneTenor(trombone);
        orch.tuneSoprano(violin);
        orch.tuneSoprano(flute);
        orch.tuneTenor(guitar);
    }
}

