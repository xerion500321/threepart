import java.util.Scanner;
public class Main2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Float number = scn.nextFloat();
        int howmany = scn.nextInt();
        System.out.println(Math.round(number*Math.pow(10,howmany))/Math.pow(10,howmany));
    }
}