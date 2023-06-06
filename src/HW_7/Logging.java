package HW_7;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Logging implements Log, sLog {
    private String fileName;
    public Logging(String fileName){this.fileName = fileName;}
    @Override
    public void log(String text) {
        LocalDateTime time = LocalDateTime.now();
        save(text + " " + time);
        System.out.println(text + " " + time);
    }
    @Override
    public void save(String text){
        try(FileWriter fileWriter = new FileWriter(fileName, true);) {
            fileWriter.write(text);
            fileWriter.write("\n");
            fileWriter.flush();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
