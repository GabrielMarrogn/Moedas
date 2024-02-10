import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int total = 0;
            int a = sc.nextInt();
            List<Integer> list = new ArrayList<Integer>();

            for (int i = 0; i < a; i++) {
                int b = sc.nextInt();
                list.add(b);
            }

            int jump = sc.nextInt();

            int x = a - 1;
            while (x >= 0) {
                total += list.get(x);
                x -= jump;
            }

            if (primo(total) == true && total != 1) {
                System.out.println("You’re a coastal aircraft, Robbie, a large silver aircraft.");
            } else {
                System.out.println("Bad boy! I’ll hit you.");
            }
        }

        sc.close();
    }

    public static boolean primo(int num) {
        boolean p = true;

        for (int i = 2; i <= num; i++) {
            p = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    p = false;
                }
            }
        }
        return p;
    }
}
