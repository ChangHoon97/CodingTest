package TwoPointers;

import java.util.*;

//최대 매출
//10 3
//12 15 11 20 25 10 20 19 13 15
// 모든 수를 3개씩 더한걸 비교하면 TimeLimitExceed 발생
// sliding window 사용
class SlidingWindow {
    public int solution(int n,int m, int[] a){
        int answer =0;
        int sum =0;
        for(int i=0; i<m; i++){
            sum += a[i];
        }
        answer = sum;
//        for(int i=1; i<n-m; i++){
//            sum -= a[i-1];
//            sum += a[i+m-1];
//            if(sum > answer) answer = sum;
//        }
        for(int i=m; i<n; i++){
            sum += (a[i] - a[i-m]);
            answer = Math.max(answer,sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        SlidingWindow T = new SlidingWindow();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for(int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,m,a));
    }

}
