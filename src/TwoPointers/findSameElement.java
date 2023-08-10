package TwoPointers;

import java.util.*;

//공통원소 구하기
//5
//1 3 9 5 2
//5
//3 2 5 7 8
//for문으로 싹 다 돌릴시에는 TimeLimitExceed 발생
//따라서 a[0]와 b[0]가 같은지 비교하면서 크거나 작을 시 포인터를 ++ 시켜준다
class findSameElement {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int aPointer=0, bPointer=0;
        while(aPointer<n && bPointer<m){
            if(a[aPointer] == b[bPointer]){
                answer.add(a[aPointer]);
                bPointer++;
            }else if (a[aPointer] < b[bPointer]) {
                aPointer++;
            }else{
                bPointer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        findSameElement T = new findSameElement();
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
