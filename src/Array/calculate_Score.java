package Array;

import java.util.Scanner;

//점수 계산
//ex) 10        1 0 1 1 1 0 0 1 1 0
public class calculate_Score {

    public int solution(int n, int[] arr){
        int answer = 0;
        int cnt =0;
        for(int i =0; i<n; i++){
            if(arr[i]==1){
                cnt++;
                answer += cnt;
            }else{
                cnt = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        calculate_Score T = new calculate_Score();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("score = " + T.solution(n, arr));

    }

}
