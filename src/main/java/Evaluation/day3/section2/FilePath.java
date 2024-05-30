package Evaluation.day3.section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class FilePath {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Enter the file name: ");
        var filename = sc.nextLine();
        var count = new HashMap<Character,Integer>();

        try {
            var fsc = new Scanner(new File(filename));
            while (fsc.hasNext()){
                for (var c : fsc.nextLine().toLowerCase().toCharArray()){
                    if (Character.isLetter(c)) {
                        if (count.containsKey(c)) {
                            count.put(c, count.get(c) + 1);
                        } else {
                            count.put(c, 1);
                        }
                    }
                }
            }
            for (var item : count.entrySet()){
                System.out.println(item.getKey() + " => " + item.getValue());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
