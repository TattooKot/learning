package main.java.com.tattookot.javacore.chapter21;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MappedChannelRead {
    public static void main(String[] args) {
        try(FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("test.txt"))) {
            long size = channel.size();

            MappedByteBuffer mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, size);
            for (int i = 0; i<size; i++) System.out.print((char) mappedByteBuffer.get());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
