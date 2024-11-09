///https://atcoder.jp/contests/adt_easy_20241105_3/tasks/abc226_a

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String buf;
        try{
            buf= br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        float f_number= Float.parseFloat(buf);
        var result= Math.round(f_number);
        System.out.println(result);
    }
}


