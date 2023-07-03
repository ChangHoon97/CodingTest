package Array;

import java.util.Scanner;

//등수 구하기
//ex) 5     87 89 92 100 76
public class get_Grade {

    public int[] solution(int n, int[] arr){
        int[] answer = new int[n];
        for(int i=0; i<n; i++){
            int cnt = 1;
            for(int j =0; j<n; j++){
                if(arr[i] < arr[j]){
                    cnt++;
                }
            }
            answer[i] = cnt;
        }


        return answer;
    }

    public static void main(String[] args) {
        get_Grade T = new get_Grade();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        for(int x : T.solution(n, arr)){
            System.out.print(x + " ");
        }

    }

}
