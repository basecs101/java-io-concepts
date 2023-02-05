import java.io.*;

/**
 * Working of BufferedInputStream
 * The BufferedInputStream maintains an internal buffer(means an array) of 8192 bytes.
 * During the read operation in BufferedInputStream,
 * a chunk of bytes is read from the disk and stored in the internal buffer.
 * And from the internal buffer bytes are read individually.
 * Hence, the number of communication to the disk is reduced.
 * This is why reading bytes is faster using the BufferedInputStream.
 */
public class BufferedInputOutputStreamExample {
    public static void main(String[] args) throws IOException {
        InputStream fileInputStream = new FileInputStream("C:\\Users\\vikra\\IdeaProjects\\java-io-concepts\\java-io-byte-streaming\\src\\dummyInputFile.txt");

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        System.out.println(bufferedInputStream.available());
        byte[] bytes = bufferedInputStream.readAllBytes();
        System.out.println(new String(bytes));

        OutputStream fileOutputStream = new FileOutputStream("C:\\Users\\vikra\\IdeaProjects\\java-io-concepts\\java-io-byte-streaming\\src\\dummyOutputFile.txt");

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        bufferedOutputStream.write(bytes);

        }
}
