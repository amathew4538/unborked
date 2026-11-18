package datasets.java.source.Tier3;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileSystem {
    public static void main(String[] args) throws Exception {
        Path path = Path.of("unborked_tier3.txt");
        Files.writeString(path, "Hello, Dataset!");
        String content = Files.readString(path);
        Files.delete(path);
        System.out.println("filesystem: " + content);
    }
}
