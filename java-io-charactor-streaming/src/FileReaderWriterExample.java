import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderWriterExample {
    public static void main(String[] args) throws IOException {
        Reader fileReader = new FileReader("C:\\Users\\vikra\\IdeaProjects\\java-io-concepts\\java-io-charactor-streaming\\src\\inputFile.txt");

        System.out.println(fileReader.ready());


        int size = 10;
        char[] chars = new char[size];
        fileReader.read(chars);
        System.out.println(chars);

        while (fileReader.ready()){
            System.out.println((char) fileReader.read());
        }
    }
}
