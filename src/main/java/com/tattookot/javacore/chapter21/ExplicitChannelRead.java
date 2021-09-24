package main.java.com.tattookot.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        Path filePath = null;
        int count;

        try{
            filePath = Paths.get("test.txt");
        } catch (InvalidPathException e) {
            System.out.println("File error");
            return;
        }

        try (SeekableByteChannel byteChannel = Files.newByteChannel(filePath)){
            ByteBuffer buffer = ByteBuffer.allocate(128);

            do{
               count = byteChannel.read(buffer);

               if(count != -1){
                   buffer.rewind();

                   for(int i = 0; i<count; i++) System.out.print((char) buffer.get());
               }
            }while (count != -1);

        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
}
