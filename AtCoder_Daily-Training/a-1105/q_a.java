// https://atcoder.jp/contests/adt_easy_20241105_1/tasks/abc245_a

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) {
        String[] inputed_strs;
        int[] inputed_nums= new int[4];
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        try {
            inputed_strs= br.readLine().split(" ");
            try {
                for (int i=0; i< inputed_strs.length; i++){
                    inputed_nums[i]= Integer.parseInt(inputed_strs[i]);
                }
            } catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (inputed_nums[0] < inputed_nums[2]){
            System.out.println("Takahashi");
        }else if (inputed_nums[0] == inputed_nums[2] && inputed_nums[1] <= inputed_nums[3]){
            System.out.println("Takahashi");
        }else{
            System.out.println("Aoki");
        }
    }
}
