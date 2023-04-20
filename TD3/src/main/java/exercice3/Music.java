package exercice3;

import java.util.ArrayList;

public class Music {
    public static void main(String[] args){
        Orchestra orch = new Orchestra();
        Trombone trombone = new Trombone();
        Flute flute = new Flute();
        Guitar guitar = new Guitar();
        Violin violin = new Violin();
        Percussion tambour = new Percussion();
        orch.instrument = new ArrayList<Instrument>();
        orch.instrument.add(tambour);
        orch.instrument.add(trombone);
        orch.instrument.add(flute);
        orch.instrument.add(guitar);
        orch.instrument.add(violin);
        orch.tuneAll();
        orch.tuneTenor(trombone);
        orch.tuneSoprano(violin);
        orch.tuneSoprano(flute);
        orch.tuneTenor(guitar);
        orch.tuneSoprano(guitar);
    }
}

