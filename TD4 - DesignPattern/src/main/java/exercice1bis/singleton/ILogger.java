package exercice1bis.singleton;

import exercice1bis.singleton.static_logger.Level;

public interface ILogger {
    public abstract void write(Level l, String error);
}
