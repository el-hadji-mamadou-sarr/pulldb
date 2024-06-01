package com.elhadji.storage;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import com.elhadji.model.Node;

public class Storage {
    private final String filepath = "src/main/resources/kvstore.bin";

    public void writeDataInBynaryFile(Node node) throws IOException{
        // write data in binary file
            DataOutputStream out = new DataOutputStream(new FileOutputStream(filepath, true));
            out.writeUTF("hello");
            out.close(); 
    }

    public void readDataFromBinaryFile() throws IOException {
        // read data from binary file
        DataInputStream inStream = new DataInputStream(new FileInputStream(filepath));
        try {
            while (true) {
                String str = inStream.readUTF();
                System.out.println(str);
            }
        } catch (EOFException e) {
           System.out.println("End of file reached");
        }
        finally {
            inStream.close();
        }
       
    }
}
