import java.io.*;

public class FileInputOutputStreamExample {
    public static void main(String... args) {
        try{
            InputStream inputStream = new FileInputStream("C:\\Users\\vikra\\IdeaProjects\\java-io-concepts\\java-io-byte-streaming\\src\\input.txt");

            System.out.println(inputStream.available());

            OutputStream outputStream = new FileOutputStream("C:\\Users\\vikra\\IdeaProjects\\java-io-concepts\\java-io-byte-streaming\\src\\output.txt");

            byte[] bytes = inputStream.readAllBytes();//read all bytes from input file
            outputStream.write(bytes);//write all bytes to the output file

            inputStream.close();
            outputStream.close();

        } catch (IOException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }
    }
}
