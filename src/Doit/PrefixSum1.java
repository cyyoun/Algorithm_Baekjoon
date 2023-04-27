package Doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrefixSum1 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 입력 값 받기 1

        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        long S[] = new long[suNo + 1];
        System.out.println(S.length);


//        for (int i=0; i < suNo; i++){
//            System.out.println(S[i]);
//        }

        stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 입력 값 받기 2
        for (int i = 1; i <= suNo; i++) {
//            System.out.println("S[i-1] = " + S[i-1]);
//            int iToken = Integer.parseInt(stringTokenizer.nextToken());
//            System.out.println("Integer.parseInt(stringTokenizer.nextToken() = " + iToken);
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
            System.out.println("S["+i+"] = " + S[i]);
//            System.out.println("-----------------------------------------------");
        }

        for (int q = 0; q < quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i-1]);
        }
    }
}
