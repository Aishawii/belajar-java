package bootcamp;

public class Home {
    public static void main(String[] args) {
       // psvm + tab
        //sout + tab
        // basic output
        System.out.println("Hello world!");

//byte, short, int, long, float, double, boolean
        //integer
        byte a = 1;
        short b = 3;
         int c = 12;
         long d = 100L;

         //float
         float e = 10.5F;
         double f = 10.001;

         //other
         boolean g = true;
         boolean h = false;
         char i = 'A';

         float angka2 = (int) c;


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);

        //operator
        //simple assignment '='
        //arithmetic + - / * %
        int num1 = 5 + 7;
        int num2 = 10 - 6;
        int num3 = num1 * num2;
        int num4 = 10 / 2;
        //unary +(positive) -(minus) ++(increment) --(decrement) !(inverts boolean value)
        int bilanganA = 100;
        bilanganA++;
        bilanganA--;


        //equality == != > >= < <=
        boolean hasilA = num1 == bilanganA;
        boolean hasilB = num1 != bilanganA;
        boolean hasilC = num2 < bilanganA;
        boolean hasilD = num1 <= bilanganA;
        boolean hasilE = num2 >= bilanganA;
        boolean hasilF = num1 > bilanganA;

        //condtional operator && ||
        boolean hasilG = num4 > num2 && num2 < num1;
        boolean hasilH = num3 == num1 ||  num4 != num1;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(bilanganA);
        System.out.println(hasilA);
        System.out.println(hasilB);
        System.out.println(hasilC);
        System.out.println(hasilD);
        System.out.println(hasilE);
        System.out.println(hasilF);
        System.out.println(hasilG);
        System.out.println(hasilH);











    }
}
