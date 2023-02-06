import java.io.*;

/**
 * Reads text from a character-input stream, buffering characters so as to provide
 * for the efficient reading of characters, arrays, and lines.
 * The buffer size may be specified, or the default size may be used.
 * The default is large enough for most purposes.
 */
public class BufferedReaderWriterExample {
    public static void main(String[] args) throws IOException {
        Reader fileReader = new FileReader("C:\\Users\\vikra\\IdeaProjects" +
                "\\java-io-concepts\\java-io-charactor-streaming\\src\\input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        char[] charsFromInputFile = new char[50];
        bufferedReader.read(charsFromInputFile);
        System.out.println(charsFromInputFile);//print char array to the console

        Writer fileWriter = new FileWriter("C:\\Users\\vikra\\IdeaProjects" +
                "\\java-io-concepts\\java-io-charactor-streaming\\src\\output.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(charsFromInputFile);
    }
}
