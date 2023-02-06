import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Two types of Streams:
 * 1. Byte Streaming - read bytes and write bytes(1B)
 * 2. Character Streaming - read chars and write chars(2B)
 * Input and Output Stream --> Byte Streaming
 * Reader and Writer --> Character Streaming
 * An InputStreamReader is a bridge from byte streams to character streams:
 * It reads bytes and decodes them into characters using a specified charset.
 * The charset that it uses may be specified by name or may be given explicitly,
 * or the default charset may be used.
 *
 */
public class InputStreamReaderOutputStreamWriterExample {

    public static void main(String[] args) throws IOException {

        InputStream fileInputStream = new FileInputStream("" +
                "C:\\Users\\vikra\\IdeaProjects\\java-io-concepts\\" +
                "java-io-charactor-streaming\\src\\input.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(
                fileInputStream, StandardCharsets.UTF_8);

        char[] charsFromInputFile = new char[50];

        inputStreamReader.read(charsFromInputFile);

        System.out.println(charsFromInputFile);//print char array to console

        OutputStream fileOutputStream = new FileOutputStream(
                "C:\\Users\\vikra\\IdeaProjects\\java-io-concepts\\" +
                        "java-io-charactor-streaming\\src\\output1.txt");

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream
                , StandardCharsets.UTF_8);

        outputStreamWriter.write(charsFromInputFile);


    }
}
