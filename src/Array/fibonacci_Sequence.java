package Array;

import java.util.Scanner;

//피보나치수열
//ex) 10
public class fibonacci_Sequence {
    public int[] solution(int n){
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for(int i =2; i<n; i++){
            answer[i] = answer[i-1] + answer[i-2];
        }

        /*      배열을 쓰지 않는 경우 + 반환을 void로 해야한다.
        int a = 1, b = 1, c;
        System.out.println(a + " " + b + " ");
        for(int i=2; i<n; i++){
            c = a + b;
            System.out.println(c+ " ");
            a = b;
            b = c;
        }

         */


        return answer;
    }

    public static void main(String[] args) {
        fibonacci_Sequence T = new fibonacci_Sequence();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = T.solution(n);
        for(int x : arr){
            System.out.print(x + " ");
        }
        //T.solution(n)     주석처리된 코딩
    }

}
