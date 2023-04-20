package exercice6;

public class HomeMusicFaçade {
    private TheaterLights lights;
    private CdPlayer cdP;

    public HomeMusicFaçade(TheaterLights l, CdPlayer cd){
        this.lights = l;
        this.cdP = cd;
    }
    public void startListeningCd(String music, int numTrack){
        System.out.println("Get ready to listen to "+ music);
        lights.dim();
        cdP.on();
        cdP.play(music,numTrack);
    }

    public void endListeningCd(){
        System.out.println("Stop listening to CD");
        cdP.stop();
        cdP.eject();
        cdP.off();
        lights.on();
    }
}
