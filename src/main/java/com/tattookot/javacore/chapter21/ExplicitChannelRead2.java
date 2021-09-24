package main.java.com.tattookot.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExplicitChannelRead2 {
    public static void main(String[] args) {


        try (SeekableByteChannel byteChannel = Files.newByteChannel(Paths.get("test.txt"))){
            ByteBuffer buffer = ByteBuffer.allocate(128);

            int count;
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
