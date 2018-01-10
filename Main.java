import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i<3 ; i++){
            int v1 = scn.nextInt();
            if(max<v1){
                max = v1;
            }
            if(min>v1){
                min = v1;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}