package main.java.com.tattookot.javacore.chapter21;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MappedChannelWrite {
    public static void main(String[] args) {
        try (FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("test1.txt"), StandardOpenOption.WRITE,StandardOpenOption.READ, StandardOpenOption.CREATE)) {

            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_WRITE, channel.size(), 26);

            for(int i = 0; i<26; i++) buffer.put((byte) ('a' + i));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
