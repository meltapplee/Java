import java.util.Scanner;

public class Baekjoon1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0;
        int stick = 64;

        while(n > 0) {
            if(stick > n)  stick /= 2;
            else {
                cnt++;
                n -= stick;
            }
        }
        System.out.println(cnt);
    }
}
