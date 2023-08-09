package TwoPointers;

import java.util.*;

//두 배열 합치기
//3
//1 3 5
//5
//2 3 6 7 9
class SumTwoSequence {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        int aPointer=0, bPointer=0;
        while(aPointer<n && bPointer <m){
            if(a[aPointer] <= b[bPointer]){
                answer.add(a[aPointer]);
                aPointer++;
            }else{
                answer.add(b[bPointer]);
                bPointer++;
            }
        }
        while(aPointer < n){
            answer.add(a[aPointer]);
            aPointer++;
        }
        while(bPointer < m){
            answer.add(b[bPointer]);
            bPointer++;
        }


        return answer;
    }

    public static void main(String[] args) {
        SumTwoSequence T = new SumTwoSequence();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for(int i =0; i<m; i++){
            b[i] = sc.nextInt();
        }
        for(int x : T.solution(n, m, a, b)){
            System.out.print(x + " ");
        }
    }

}
