import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class L30readfiles {
    public static void main(String[] args) {

        // How to read a file using Java (3 popular options)

        // BufferedReader + FileReader: Best for reaing text files line-by-line
        // FileInputStream: Best for binary files (e.g., images, audio files)
        // RandomAccessFile: Best for read/write specific portions of a large file

        String filePath = "C:\\Users\\HP\\Desktop\\test.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){

            String line;
            while((line = reader.readeline()) != null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Something went wrong");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
    }
}