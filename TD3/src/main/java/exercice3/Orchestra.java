package exercice3;

import java.util.ArrayList;

public class Orchestra {
    ArrayList<Instrument> instrument;
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
    public void tuneTenor(Soloist i){
        i.playLikeATenor();
    }
    public void tuneSoprano(Soloist i){
        i.playLikeASoprano();
    }
}
