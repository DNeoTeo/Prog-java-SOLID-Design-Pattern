package exercice1;

import java.util.ArrayList;

public class Music {
    public static void main(String[] args){
        Orchestra orch = new Orchestra();
        Brass trumpet = new Brass();
        WoodWind flute = new WoodWind();
        Percussion tambour = new Percussion();
        Wind windinstr = new Wind();
        orch.winds = new ArrayList<Wind>();
        orch.percussions = new ArrayList<Percussion>();
        orch.winds.add(windinstr);
        orch.winds.add(trumpet);
        orch.winds.add(flute);
        orch.percussions.add(tambour);
        orch.tuneAll();
    }
}

