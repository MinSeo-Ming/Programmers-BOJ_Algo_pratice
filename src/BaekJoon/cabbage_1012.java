package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cabbage_1012 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] list;
        int re = Integer.parseInt(br.readLine());
        for (int i = 0; i < re; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            int Num = Integer.parseInt(st.nextToken());

            list = new boolean[X + 1][Y + 1];

            int count = 0;
            for (int j = 0; j < Num; j++) {
                s = br.readLine();
                st = new StringTokenizer(s, " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                list[x][y] = true;

                if (0 <= x - 1) {
                    if (list[x - 1][y]) continue;
                }
                if (x + 1 <= X-1) {
                    if (list[x + 1][y]) continue;
                }
                if (0 <= y - 1) {
                    if (list[x][y - 1]) continue;
                }
                if (y + 1 <= Y-1) {
                    if (list[x][y + 1]) continue;
                    else count++;
                }
            }
            System.out.println(count);
        }
    }
}
