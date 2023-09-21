package HashMap;

public class Main {

    public void solution(String s){
        char[] arr = s.toCharArray();
        for(int i =0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args) {
        Main T = new Main();
        String s = "abce";
        T.solution(s);

    }
}
