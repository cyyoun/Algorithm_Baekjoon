package Doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RestSum_Retry {
    public static void main(String argsp[]) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int iNo = Integer.parseInt(stringTokenizer.nextToken());
        int iDiv = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int S[] = new int[iNo + 1];
        int iCnt = 0;

        for (int i = 1; i <= iNo; i++) {
            int iItem = Integer.parseInt(stringTokenizer.nextToken());

            S[i] = S[i - 1] + iItem;
            if (S[i] % iDiv == 0)
                iCnt++;

            for (int j = 1; j <= i - 1; j++) {
                int iSub = S[i] - S[j];

                if (iSub % iDiv == 0)
                    iCnt++;
            }
        }
        System.out.println(iCnt);
    }
}

