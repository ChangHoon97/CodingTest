import java.util.Scanner;

// ex) StuDY
public class changeUpperLower {
    public String solution(String str){
        String answer ="";

        for(char x : str.toCharArray()){
            if(x >= 97 && x <= 122){
                answer += (char)(x-32);
            }else{
                answer += (char)(x+32);
            }
        }

        /*
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)){
                answer += Character.toUpperCase(x);
            }else{
                answer += Character.toLowerCase(x);
            }

        }
        */
        return answer;
    }

    public static void main(String[] args) {
        changeUpperLower T = new changeUpperLower();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}