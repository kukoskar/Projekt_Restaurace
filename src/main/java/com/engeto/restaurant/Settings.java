package com.engeto.restaurant;

public class Settings {

    private static final String FILENAME = "objednavky.txt";
    private static final String DELIMITER = "\t";
    public static String getFilename() {
        return FILENAME;
    }
    public static String getDelimiter() {
        return DELIMITER;
    }
}
