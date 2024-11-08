import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) {
        String inputed;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        try {
            while ( (inputed= br.readLine()) != null){
                System.out.println(inputed);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
