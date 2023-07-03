package Array;

import java.util.Scanner;

//가위바위보
//ex) 5     2 3 3 1 3   1 1 2 2 3
public class rock_paper_scissors {
    public String solution(int n, int[] arrA, int [] arrB ){
        String answer ="";
        for(int i=0; i< n; i++){
            if(arrA[i] == arrB[i]){
                answer += "D";
            } else if (arrA[i]==1 && arrB[i] ==3) {
                answer += "A";
            } else if (arrA[i]==2 && arrB[i] == 1) {
                answer += "A";
            } else if (arrA[i] ==3 && arrB[i] == 2){
                answer += "A";
            }else{
                answer += "B";
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        rock_paper_scissors T = new rock_paper_scissors();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];
        for(int i=0; i<n; i++){
            arrA[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arrB[i] = sc.nextInt();
        }
        for(char x : T.solution(n, arrA, arrB).toCharArray()) {
            System.out.println(x);
        }
    }

}
