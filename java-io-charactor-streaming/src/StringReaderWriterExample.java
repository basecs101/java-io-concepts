import java.io.*;

public class StringReaderWriterExample {
    public static void main(String[] args) throws IOException {
        String s ="Hello from String";

        StringReader stringReader = new StringReader(s);

        char[] charsFromString = new char[20];

        stringReader.read(charsFromString);

        System.out.println(charsFromString);


        StringWriter stringWriter = new StringWriter();

        String writtenString = "";

        stringWriter.write(writtenString);

        System.out.println("Written String "+writtenString);

    }
}
