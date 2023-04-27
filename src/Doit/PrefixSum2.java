package Doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrefixSum2 {
    public static void main(String args[]) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int iVal = Integer.parseInt(stringTokenizer.nextToken());
        int iPreSum = Integer.parseInt(stringTokenizer.nextToken());

        long S[] = new long[iVal * iVal + 1];

        for (int i = 0; i < iVal; i++) {
            StringTokenizer rowTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 1; j <= iVal; j++) {
                int iInput = Integer.parseInt(rowTokenizer.nextToken());
                S[i * 4 + j] = S[i * 4 + j - 1] + iInput;
                System.out.println(S[i * 4 + j]);
            }
        }

        for (int k = 0; k < iPreSum; k++) {
            StringTokenizer outputTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x1 = Integer.parseInt(outputTokenizer.nextToken());
            int y1 = Integer.parseInt(outputTokenizer.nextToken());
            int x2 = Integer.parseInt(outputTokenizer.nextToken());
            int y2 = Integer.parseInt(outputTokenizer.nextToken());

            System.out.println(S[x2 + y2 - 1] - S[x1 + y1]);

        }
    }
}
