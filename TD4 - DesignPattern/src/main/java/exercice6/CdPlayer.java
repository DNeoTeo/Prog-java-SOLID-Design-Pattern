package exercice6;

public class CdPlayer {
    public void on(){
        System.out.println("CD Player on");
    }
    public void off(){
        System.out.println("CD Player off");
    }
    public void eject(){
        System.out.println("CD Player eject");
    }
    public void stop(){
        System.out.println("CD Player stopped");
    }
    public void play(String music, int numTrack){
        System.out.println("CD Player playing \""+music+"\"");
        for(int i=0; i<numTrack; i++) System.out.println("CD Player playing track "+i);
    }
    public void pause(){
        System.out.println("CD Player paused");
    }
}
