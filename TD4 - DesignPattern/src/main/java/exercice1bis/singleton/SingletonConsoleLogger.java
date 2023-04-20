package exercice1bis.singleton;

import exercice1bis.singleton.static_logger.Level;

import java.time.LocalDateTime;

public class SingletonConsoleLogger implements ILogger {
    static private SingletonConsoleLogger logger;

    private SingletonConsoleLogger() {}

    public static synchronized SingletonConsoleLogger getInstance() {
        if (logger == null) //création d’instance unique
            logger = new SingletonConsoleLogger();
        return logger;
    }

    @Override
    public void write(Level l, String error) {
        System.out.println(LocalDateTime.now() +" **** "+l+" **** "+error);
    }
}
