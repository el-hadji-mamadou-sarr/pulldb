package com.elhadji;

import com.elhadji.storage.Storage;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        try {
            storage.writeDataInBynaryFile(null);
            storage.readDataFromBinaryFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}