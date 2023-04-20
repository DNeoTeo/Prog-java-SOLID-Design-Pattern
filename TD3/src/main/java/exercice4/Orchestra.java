package exercice4;

import java.util.ArrayList;

public class Orchestra {
    ArrayList<Instrument> instrument = new ArrayList<>();
    public void tune(Instrument instr){
        instr.play();
    }
    public void tuneAll(){
        for (Instrument instr:this.instrument) {
            tune(instr);
        }
    }
    public void addInstrument(Instrument instr){
        this.instrument.add(instr);
    }
    public void tuneTenor(Tenor i){
        i.playLikeATenor();
    }
    public void tuneSoprano(Soprano i){
        i.playLikeASoprano();
    }
}
