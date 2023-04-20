package exercice6;

public class HomeTheaterTestCd {
    public static void main(String[] args) {
        TheaterLights lights = new TheaterLights();
        CdPlayer cd = new CdPlayer();
        HomeMusicFaçade homeTheater = new HomeMusicFaçade(lights, cd);
        homeTheater.startListeningCd("Ray of light", 5);
        homeTheater.endListeningCd();
    }
}
