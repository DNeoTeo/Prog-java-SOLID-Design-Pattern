package exercice1bis.singleton;

import exercice1bis.singleton.static_logger.Level;

public class SingletonLoggerTest {
    public static void main(String[] args) {
        SingletonConsoleLogger.getInstance().write(Level.INFO, "JE SUIS DANS LA Console");
        SingleFileLogger.getInstance().write(Level.DEBUG, "Après avoir écrit dans la console tu ecrit dans un fichier");
    }
}
