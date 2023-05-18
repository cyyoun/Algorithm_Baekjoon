package Doit;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 절대값 힙 구현하기
public class P11286 {
    public static void main (String args[]) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); //양수
        PriorityQueue<Integer> reverseQueue = new PriorityQueue<>(Collections.reverseOrder()); //음수


        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(bufferedReader.readLine());


            if (M > 0) {
                priorityQueue.add(M);
            } else if (M < 0) {
                reverseQueue.add(M);
            } else {
                int p = priorityQueue.isEmpty() == false ? priorityQueue.peek() : 0;
                int r = reverseQueue.isEmpty() == false ? reverseQueue.peek() : 0;

                if (p == 0 && r == 0) {
                    System.out.println(0);
                } else if (p == 0) {
                    System.out.println(r);
                    reverseQueue.poll();
                } else if (r == 0) {
                    System.out.println(p);
                    priorityQueue.poll();
                } else {
                    if (Math.abs(p) >= Math.abs(r)) {
                        System.out.println(r);
                        reverseQueue.poll();
                    } else {
                        System.out.println(p);
                        priorityQueue.poll();
                    }
                }
            }
        }
    }
}
