import java.util.Scanner;

public class Baekjoon10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int box = 0;
        int n = sc.nextInt(); //배열 길이 정하기
        int[] arr = new int[n+1];

        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt(); //배열에 입력한 정수 넣기
        }
        int v = sc.nextInt(); //찾으려고 하는 정수
        for(int j = 1; j <= n; j++){
            if(v == arr[j]) box++; //
        }
        System.out.println(box);
    }
}
