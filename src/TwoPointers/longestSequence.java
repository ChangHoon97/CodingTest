package TwoPointers;

import java.util.Scanner;

//최대 길이 연속부분수열
//14 2
//1 1 0 0 1 1 0 1 1 0 1 1 0 1

public class longestSequence {
    public int solution(int n, int k, int[] arr){
        int answer=0, cnt=0, lt=0;
        for(int rt=0; rt<n; rt++){
            if(arr[rt] == 0 ) cnt++;
            while(cnt>k){
                if(arr[lt]==0) cnt--;
                lt++;
            }
            answer = Math.max(answer,rt-lt+1);
        }


        return answer;
    }

    public static void main(String[] args) {
        longestSequence T = new longestSequence();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n,k,arr));
    }
}
