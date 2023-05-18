package Doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 주몽의 명령
public class P1940 {
    public static void main (String args[]) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int itemCnt = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int itemSum = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int S[] = new int[itemCnt + 1];

        for (int i = 1; i <= itemCnt; i++) {
            S[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(S);
        int SumCnt = 0;

        for (int i = 1; i <= itemCnt; i++) {
            int start = S[i];

            for (int j = i + 1; j <= itemCnt; j++) {
                int end = S[j];

                if (start + end == itemSum) {
                    SumCnt++;
                    break;
                }
            }

        }
        System.out.println(SumCnt);
    }
}
