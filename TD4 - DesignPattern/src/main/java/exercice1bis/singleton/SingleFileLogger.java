package exercice1bis.singleton;

import exercice1bis.singleton.static_logger.Level;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class SingleFileLogger implements ILogger {
    static private final String DIR = "resultTest/";
    static private final String LOGS_FILE_PATH = "logs_file_exo2.txt";
    static private SingleFileLogger logger;

    private SingleFileLogger(){ }

    public static synchronized SingleFileLogger getInstance(){
        if (logger == null) //création d’instance unique
        logger = new SingleFileLogger();
        return logger;
    }

    @Override
    public void write(Level l, String error){
        writeToFile(l, error, DIR+LOGS_FILE_PATH);
    }

    public void writeToFile(Level l, String error, String fileName){
        try{
            FileWriter myWriter = new FileWriter(fileName, true);
            myWriter.write(LocalDateTime.now() +" **** "+l+" **** "+error);
            myWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println("ERROR ********* writeToFile --> PrintWriter");
        }
    }

}
