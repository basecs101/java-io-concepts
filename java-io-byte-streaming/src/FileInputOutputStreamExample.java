import java.io.*;

public class FileInputOutputStreamExample {
    public static void main(String... args) {
        try{
            InputStream inputStream = new FileInputStream("C:\\Users\\vikra\\IdeaProjects\\java-io-concepts\\java-io-byte-streaming\\src\\input.txt");

            System.out.println(inputStream.available());

            OutputStream outputStream = new FileOutputStream("C:\\Users\\vikra\\IdeaProjects\\java-io-concepts\\java-io-byte-streaming\\src\\ouput.txt");

            outputStream.write(inputStream.readAllBytes());

            inputStream.close();
            outputStream.close();

        } catch (IOException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }
    }
}
