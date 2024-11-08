// https://atcoder.jp/contests/adt_easy_20241105_2/tasks/abc268_a

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class Main{
    public static void main(String[] args) {
        String[] inputed_strs;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int[] numbers;

        try {
            inputed_strs= br.readLine().split(" ");
            numbers= new int[inputed_strs.length];
            int number;
            int idx= 0;
            for (var e_str : inputed_strs){
                try{
                    number= Integer.parseInt(e_str);
                    numbers[idx]= number;
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
                idx++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        HashSet set= new HashSet<>();
        for (var e : numbers){
            set.add(e);
        }

        System.out.println(set.size());
    }
}
