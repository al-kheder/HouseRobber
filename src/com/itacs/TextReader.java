package com.itacs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Ali al-kheder
 * @computer alkhd
 */
public class TextReader {
    public static int[] readFile(String fileName) throws FileNotFoundException {

        File file = new File(fileName);

        Scanner scanner = new Scanner(file);
        List<Integer> integers = new ArrayList<>();
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                integers.add(scanner.nextInt());
            } else {
                scanner.next();
            }
        }
        int[] testData = new int[integers.size()];
        int i = 0;
        for (Integer number : integers) {
            testData[i] = number;
            i++;
        }
        return testData;
    }
}
