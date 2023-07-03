package Array;

import java.util.Scanner;

//보이는 학생
//ex) 8     130 135 148 140 145 150 150 153
public class biggestNum {
    public int solution(int n, int[] arr){
        int answer = 1, max = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>max){
                answer++;
                max = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        biggestNum T = new biggestNum();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }

}
