package TwoPointers;

import java.util.*;

class Main {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
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
            System.out.println(x + " ");
        }
    }

}
