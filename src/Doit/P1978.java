package Doit;

import javax.swing.plaf.IconUIResource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1978 {
    public static void main (String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(stringTokenizer.nextToken());
            int k = 2;
            boolean b = false;
            while (k < M) {
                if (M == 1 || M % k == 0) {
                    b = true;
                    System.out.println(M);
                    break;
                }
                k++;
           }
            if (!b) cnt++;
        }
        System.out.println(cnt);
    }
}
