package bootcamppart2;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import com.sun.org.apache.xerces.internal.dom.PSVIDOMImplementationImpl;

public class soal2 {

    public static void main(String[] args) {
int n = 10000000;

if ( n < 10)
    System.out.println("satuan");
else if (n < 100)
    System.out.println("puluhan");
            else if (n < 999)
    System.out.println("ratusan");
            else if (n < 999999)
            System.out.println("ribuan");
            else
    System.out.println("tidak valid");
    }
}