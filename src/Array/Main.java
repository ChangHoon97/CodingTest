package Array;

import java.util.*;

//봉우리
//ex) 5
public class Main {

    public int solution(int n, int[][] arr){
        int answer = Integer.MIN_VALUE;

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i< n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));

    }

}
