package Array;

import java.util.*;

//임시반장 정하기
//ex) 5     2 3 1 7 3       4 1 9 6 8       5 5 2 4 4       6 5 2 6 7       8 4 2 2 2
// 한번 더 생각해보기
public class choice_President {

    public int solution(int n, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 0; j <= n; j++) {
                for (int k = 1; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (max < cnt) {
                answer = i;
                max = cnt;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        choice_President T = new choice_President();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 1][6];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));

    }

}
