package Doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 카드 게임
public class P2164 {
    public static void main (String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        while (q.size() != 1) {
            q.poll();
            q.add(q.poll());
//            if(q.size() != 1){
//                q.add(q.peek());
//                q.poll();
//            } else
//                break;
        }
        System.out.println(q.peek());
        }
    }

