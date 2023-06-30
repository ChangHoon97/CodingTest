import java.util.Scanner;

// ex) It is time to study
public class findLongestWord {
    public String solution(String str){
        String answer ="";
        int m = Integer.MIN_VALUE, pos;
        while((pos = str.indexOf(' ')) != -1){
            String tmp = str.substring(0,pos);
            int len = tmp.length();
            if(len > m){
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length() > m){
            answer = str;
        }


        /*
        String[] s = str.split(" ");
        for(String x : s){
            int len = x.length();
            if(len> m){
                m = len;
                answer = x;
            }
        }
         */

        return answer;
    }

    public static void main(String[] args) {
        findLongestWord T = new findLongestWord();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}