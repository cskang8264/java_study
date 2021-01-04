package streamstudy;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStreamStudy {
    public static void main(String[] args) throws IOException {
        Stream<String>  lineStream =
                Files.lines(Paths.get("file.txt"),
                Charset.forName("UTF-8"));

    }
}
