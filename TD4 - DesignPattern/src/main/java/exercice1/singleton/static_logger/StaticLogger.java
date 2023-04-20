package exercice1.singleton.static_logger;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class StaticLogger {
    static private String DIR = "resultTEST/";
    static private String LOGS_FILE_PATH = "logs_file_exo1.txt";

    public static void write(Level level, String error){
        writeToFile(level, error, DIR+LOGS_FILE_PATH);
    }

    private static void writeToFile(Level level, String error, String fileName){
        try{
            FileWriter myWriter = new FileWriter(fileName, true);
            myWriter.write(LocalDateTime.now() +" **** "+level+" **** "+error);
            myWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println("ERROR ********* writeToFile --> PrintWriter");
        }

    }

}
