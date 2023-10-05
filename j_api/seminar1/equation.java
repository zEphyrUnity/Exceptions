package j_api.seminar1;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class equation {
    public static void main(String[] args) {
        String file = "file1.txt";
        String solution = getSolution(file);
        System.out.println(solution);
    }

    public static String getSolution(String str) {
        String dataf = "";

        try {
            Path path = Paths.get(str);
            Scanner scanner = new Scanner(path);

            if (scanner.hasNextLine()) {
                dataf = scanner.nextLine();
            }
        }catch (Exception ex)
        {
            System.out.println(ex);
        }

        String fileData = String.format("Given the equation: {%s}", dataf);
        System.out.println(fileData);

        String data = dataf.replaceAll("\\r|\\n|\\s", "");
        String[] parts = data.split("=");
        String leftPart = parts[0];
        String rightPart = parts[1];
        String[] nums = leftPart.split("\\+");

        int e = Integer.parseInt(rightPart);

        if (nums[0].contains("?") && nums[0].length() == 1) {
            int w = Integer.parseInt(nums[1].replaceAll("[?]", ""));
            int q = e - w;

            return String.format("Result: {%d + %d = %d}", q , w, e);

        } else if (nums[1].contains("?") && nums[1].length() == 1) {
            int q = Integer.parseInt(nums[0].replaceAll("[?]", ""));
            int w = e - q;

            return String.format("Result: {%d + %d = %d}", q, w, e);

        } else {
            int q = Integer.parseInt(nums[0].replaceAll("[?]", ""));
            int w = Integer.parseInt(nums[1].replaceAll("[?]", ""));

            if ((nums[0].contains("?") && nums[0].charAt(0) == '?') && nums[1].charAt(0) == '?') {
                for (int i = 0; i <= 9; i++) {
                    for (int j = 0; j <= 9; j++) {
                        if (i == 0 && j == 0 && q + w == e) {
                            return String.format("Result: {%d + %d = %d}", q, w, e);
                        } else if ((i * 10 + q) + (j * 10 + w) == e) {
                            return String.format("Result: {%d + %d = %d}", i * 10 + q, j * 10 + w, e);
                        }
                    }
                }

            } else if ((nums[0].contains("?") && nums[0].charAt(0) == '?') && nums[1].charAt(1) == '?') {
                for (int i = 0; i <= 9; i++) {
                    for (int j = 0; j <= 9; j++) {
                        if (i == 0 && j == 0 && q + (w + j) == e) {
                            return String.format("Result: {%d + %d = %d}", q, w * 10 + j, e);
                        } else if ((i * 10 + q) + (w * 10 + j) == e) {
                            return String.format("Result: {%d + %d = %d}", i * 10 + q, w * 10 + j, e);
                        }
                    }
                }

            } else if ((nums[0].contains("?") && nums[0].charAt(1) == '?') && nums[1].charAt(0) == '?') {
                for (int i = 0; i <= 9; i++) {
                    for (int j = 0; j <= 9; j++) {
                        if (j == 0 && (q * 10 + i) + w == e) {
                            return String.format("Result: {%d + %d = %d}", q * 10 + i, w, e);
                        } else if ((q * 10 + i) + (j * 10 + w) == e) {
                            return String.format("Result: {%d + %d = %d}", q * 10 + i, j * 10 + w, e);
                        }
                    }
                }

            } else if ((nums[0].contains("?") && nums[0].charAt(1) == '?') && nums[1].charAt(1) == '?') {
                for (int i = 0; i <= 9; i++) {
                    for (int j = 0; j <= 9; j++) {
                        if ((q * 10 + i) + (w * 10 + j) == e) {
                            return String.format("Result: {%d + %d = %d}", q * 10 + i, w * 10 + j, e);
                        }
                    }
                }
            }
        }

        return "No solution";
    }
}



