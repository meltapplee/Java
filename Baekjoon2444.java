import java.util.Scanner;
public class Baekjoon2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) System.out.print(" ");
            for (int k = 1; k <= i*2-1; k++) System.out.print("*");
            System.out.print('\n');
        }
        for(int i = 1; i < n; i++){
            for(int j = 1; j <= i; j++) System.out.print(" ");
            for(int k = (n-i)*2-1; k > 0;k--) System.out.print("*");
            System.out.print('\n');
        }
    }
}


