package Doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 스택으로 오름차순 수열 만들기
public class P1874 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt((new StringTokenizer(br.readLine())).nextToken());
        }

        int No = 0;
        Stack<Integer> stack = new Stack<>();
        String str = "";

        for (int i = 0; i < N; i++) {

            while (A[i] <= N) {
                if (stack.empty()){
                    No++;
                    stack.push(No);
                    str = str + "\n+";
                }
                else if (stack.peek() == A[i]) {
                    str = str + "\n-";
                    stack.pop();
                    break;
                } else if (stack.peek() < A[i]) {
                    No++;
                    stack.push(No);
                    str = str + "\n+";
                } else {
                    str = "NO";
                    break;
                }
            }

            if (str.contains("NO"))
                break;
        }
        System.out.println(str.trim());
    }
}
