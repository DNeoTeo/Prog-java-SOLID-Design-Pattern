package exercice1;
import java.util.*;//ArrayList;

public class Orchestra {
    ArrayList<Wind> winds;
    ArrayList<Percussion> percussions;

    public void tuneWind(Wind win){
        win.play();
    }
    public void tunePercussion(Percussion perc){
        perc.play();
    }
    public void tuneAll(){
        for (Wind instr:this.winds) {
            tuneWind(instr);
        }
        for (Percussion instr :this.percussions) {
            tunePercussion(instr);
        }
    }
    public void addWind(Wind win){
        this.winds.add(win);
    }
    public void addPercussion(Percussion perc){
        this.percussions.add(perc);
    }
}
