package CodeForce.gym100082;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

// http://codeforces.com/gym/100082/attachments/download/1194/20122013-tryenirovka-spbgu-s-1-blic-ru.pdf
class Gym {
    ArrayList<ArrayList<Integer>> readIntegers() {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        try {
            Scanner file = new Scanner(new FileReader("input.txt"));
            file.useDelimiter(System.getProperty("line.separator"));
            while (file.hasNext()) {
                String line = file.next();
                ArrayList<Integer> arr = new ArrayList<>();
                String[] strings = line.split(" ");
                for (int i=0; i<strings.length; i++) {
                    arr.add(Integer.parseInt(strings[i]));
                }
                res.add(arr);
            }
            file.close();
        } catch(Exception ex) {
        }
        return res;
    }

    void writeIntegers(ArrayList<Integer> list) {
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream("output.txt"));
            for(int i: list) {
                pw.println(i);
            }
            pw.close();
        } catch (Exception ex) {
            Exception a = ex;
        }
    }

    void taskA() {
        ArrayList<ArrayList<Integer>> input = readIntegers();
        int len = input.get(0).get(0); // sequence length
        ArrayList<Integer> list = input.get(1);
        writeIntegers(input.get(0));
    }
}