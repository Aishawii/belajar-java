package bootcamppart2;

public class soal1c {
    public static void main(String[] args) {
        int i, j , N;

        N = 5;

        for (i=N; i>0; i--) {
            for (j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
