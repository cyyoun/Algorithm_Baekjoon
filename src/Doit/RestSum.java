package Doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RestSum {
    public static void main(String argsp[]) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int iNo = Integer.parseInt(stringTokenizer.nextToken());
        int iDiv = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int T[] = new int[iNo+1];

        // 토큰으로 배열 생성
        for (int i = 1; i <= iNo; i++) {
            T[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int iCount = 0;
        for (int j = 1; j <= iNo; j++) {
            int S[] = new int[iNo+1];

            for (int k = j; k <= iNo; k++) {
                // 합배열 S[j] = S[j-1] + A[j];
                S[k] = S[k-1] + T[k];
                if (S[k] % iDiv == 0) {
                    iCount++;
                }
            }
        }
        System.out.println(iCount);

    }
}
