package exercice1.singleton.static_logger;

public class StaticLoggerTest {
    public static void main(String[] args) {
        StaticLogger.write(Level.ERROR, "TEST ERREUR DE MOI");
    }
}
