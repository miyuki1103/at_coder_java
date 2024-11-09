// https://atcoder.jp/contests/adt_easy_20241105_2/tasks/codequeen2024_final_a
import java.util.Scanner;

// 6 ≤ X ≤ 17
class Main{
    static final int TIME_ONE= 10;
    static final int TIME_TWO= 15;
    static final int TIME_THREE= 17;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String inputStr= sc.next();
        int parsedInt;
        try {
            parsedInt= Integer.parseInt(inputStr);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
        int one= Math.abs(parsedInt - TIME_ONE) ;
        int two= Math.abs(parsedInt - TIME_TWO);
        int three= Math.abs(parsedInt - TIME_THREE);

        if (parsedInt == 10){
            System.out.println("10");
        }else if (parsedInt == 15){
            System.out.println("15");
        }else if (parsedInt == 17){
            System.out.println("17");
        }

        if (one >= 0 && one < 3){
            System.out.println("10");
        }else if (two < 3){
            System.out.println("15");
        }else{
            System.out.println("17");
        }
    }
}
