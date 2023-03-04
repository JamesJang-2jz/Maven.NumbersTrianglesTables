package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder table = new StringBuilder("");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                table.append(String.format("%3d",i * j) + " |");
            } table.append("\n");
        }  return table.toString();
    }
    public static String getLargeMultiplicationTable() {
        StringBuilder table = new StringBuilder("");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                table.append(String.format("%3d",i * j) + " |");
            } table.append("\n");
        }  return table.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder table = new StringBuilder("");
        int width = tableSize;
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= width; j++) {
                table.append(String.format("%3d",i * j) + " |");
            } table.append("\n");
        }  return table.toString();
    }
}
