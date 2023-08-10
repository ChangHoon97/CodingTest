package TwoPointers;

import java.util.Scanner;

//연속된 자연수의 합
//15
public class ContinousNaturalNum {
    public int solution(int n){
//        int answer =0;
//        for(int i=1; i<=n/2; i++){
//            int sum = i;
//            for(int j=i+1; j<n; j++){
//                sum += j;
//                if(sum > n) break;
//                if(sum == n) answer++;
//            }
//        }

        int answer=0, sum=0, lt=0;
        int m = n/2+1;
        int[] arr = new int[m];
        for(int i=0; i<m; i++) arr[i]= i+1;     //n에따른 배열 만들기
        for(int rt=0; rt<m; rt++){
            sum += arr[rt];
            if(sum ==n) answer++;
            while(sum >=n){
                sum -= arr[lt++];
                if(sum==n) answer++;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        ContinousNaturalNum T = new ContinousNaturalNum();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
