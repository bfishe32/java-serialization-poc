package edu.jhu.cs.bfishe32;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("payload.bin")) {
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                try {
                    ois.readObject();
                    System.out.println("File is done reading!");
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}