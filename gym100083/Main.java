package CodeForce.gym100083;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        taskA_Ancestor();
    }

    static ArrayList<ArrayList<Integer>> readIntegers() {
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

    static void taskA_Ancestor() {
        try {
            ArrayList<ArrayList<Integer>> input = readIntegers();
            int len = input.get(0).get(0); // sequence length
            ArrayList<Integer> treeData = input.get(1);
            int testsLen = input.get(2).get(0);
            PrintWriter pw = new PrintWriter(new FileOutputStream("output.txt"));
            for (int i = 3; i < testsLen + 3; i++) {
                ArrayList<Integer> test = input.get(i);
                int a = test.get(0);
                int b = test.get(1);
                int curr = b;
                while (curr != 0) {
                    curr = treeData.get(curr - 1);
                    if (curr == a) {
                        pw.println(1);
                        break;
                    }
                }
                if (curr == 0) pw.println(0);
            }
            pw.close();
        } catch(Exception ex) {

        }
    }
}
