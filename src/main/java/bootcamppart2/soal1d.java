package bootcamppart2;

public class soal1d {
    public static void main(String[] args) {
        int i, j, k, l, n;

        n = 5;
        System.out.println();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {

                System.out.print("S");
            }
            System.out.println();
        }
        for (i = 4; i > 0; i--) {
            for (j = 0; j < i; j++) {
                System.out.print("S");
            }
            System.out.println();
        }
    }



}
