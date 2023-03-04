package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        int width = numberOfRows;
        StringBuilder stars = new StringBuilder("");
        for (int i = 1; i < width;i++) {
            for (int j = 1;j <= i;j++) {
                stars.append("*");
            }stars.append("\n");
        } return stars.toString();
    }

    public static String getRow(int numberOfStars) {
        int width = numberOfStars;
        String stars = "";
        for (int i = 1; i <= width; i++) {
            stars+= "*";
        } return stars;
    }

    public static String getSmallTriangle() {
        int width = 4;
        StringBuilder stars = new StringBuilder("");
        for (int i = 1; i <= width;i++) {
            for (int j = 1;j <= i;j++) {
                stars.append("*");
            }stars.append("\n");
        } return stars.toString();
    }

    public static String getLargeTriangle() {
        int width = 10;
        StringBuilder stars = new StringBuilder("");
        for (int i = 1; i < width;i++) {
            for (int j = 1;j <= i;j++) {
                stars.append("*");
            }stars.append("\n");
        } return stars.toString();
    }
}
