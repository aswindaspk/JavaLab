
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileC {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("newf.txt",true);
            writer.write("HI!");
            writer.close();
            FileReader reader = new FileReader("newf.txt");
            BufferedReader br= new BufferedReader(reader);
            String line;
            System.out.println("Data read from the file");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("-----Error-----");
        }

    }

}
