package HashMap;

import java.util.HashMap;
import java.util.Scanner;

//학급 회장(해쉬)
//15
//BACBACCACCBDEDE
public class voteHashMap {
    public char solution(int n, String str){
        char answer = ' ';
        int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();      //char하고 int 써도 될까? 오류난다
        for(char x : str.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1); //map.getOrDefault는 x의 value값을 가져온다 존재하지 않으면 default 값 0을 가져온다
        }
        for(char key : map.keySet()){
            if(map.get(key) > max){
                max= map.get(key);
                answer=key;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        voteHashMap T = new voteHashMap();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(n,str));
    }
}
