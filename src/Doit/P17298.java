package Doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 오큰수 구하기
public class P17298 {
    public static void main (String args[]) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[N];
        int[] arr2 = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int j = N-1; j >= 0; j--) {
            stack.push(arr[j]);
        }

        for (int k = 0; k < N; k++) {
            int pp = stack.pop();
            int pk = 0;
            int item = -1;
            Stack<Integer> newStack = new Stack<>();


            if (stack.isEmpty() == false) {
                pk = stack.peek();
            } else {
                arr2[k] = -1;
                break;
            }


            if (pp > pk) {
                while (pp > pk) {
                    int newpp = stack.pop();
                    newStack.push(newpp);
                    if (stack.isEmpty() == false) {
                        pk = stack.peek();
                    }

                    if (pp <= pk) {
                        arr2[k] = pk;
                        while (newStack.isEmpty() == false) {
                            stack.push(newStack.pop());
                        }
                    }
                    else
                        arr2[k] = -1;
                        while (newStack.isEmpty() == false) {
                            stack.push(newStack.pop());
                        }
                        break;
                }
            }
            else
               arr2[k] = pk;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
