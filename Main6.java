import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] data = new int[2][n];
        for (int i = 0; i < n; i++) {
            data[0][i] = scn.nextInt();
            data[1][i] = fun(data[0][i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (data[1][i] > data[1][j]) {
                    int tmp = data[1][i];
                    data[1][i] = data[1][j];
                    data[1][j] = tmp;
                    int tmd = data[0][i];
                    data[0][i] = data[0][j];
                    data[0][j] = tmd;
                }
                else if (data[1][i]==data[1][j]){
                    if(data[0][i]>data[0][j]){
                        int tmp = data[1][i];
                        data[1][i] = data[1][j];
                        data[1][j] = tmp;
                        int tmd = data[0][i];
                        data[0][i] = data[0][j];
                        data[0][j] = tmd;
                    }

                }

            }
            System.out.print(data[0][i] + " ");
        }

    }


    public static int fun(int x) {
        int sum = 0;
        while (x > 0) {
            sum = sum + x % 10;
            x = x / 10;
        }
        return sum;
    }
}