package exercice2;

import java.util.ArrayList;

public class Music {
    public static void main(String[] args){
        Orchestra orch = new Orchestra();
        Brass trumpet = new Brass();
        WoodWind flute = new WoodWind();
        Percussion tambour = new Percussion();
        Wind windinstr = new Wind();
        Stringed guitare = new Stringed();
        orch.instrument = new ArrayList<Instrument>();
        orch.instrument.add(windinstr);
        orch.instrument.add(trumpet);
        orch.instrument.add(flute);
        orch.instrument.add(tambour);
        orch.instrument.add(guitare);
        orch.tuneAll();
    }
}

