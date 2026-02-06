import java.util.Scanner;

class Complex {
    int real;
    int imag;

    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    Complex add(Complex other) {
        int r = this.real + other.real;
        int i = this.imag + other.imag;
        return new Complex(r, i);
    }
}

public class ComplexAddition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int real1 = sc.nextInt();
        int imag1 = sc.nextInt();
        int real2 = sc.nextInt();
        int imag2 = sc.nextInt();

        Complex c1 = new Complex(real1, imag1);
        Complex c2 = new Complex(real2, imag2);

        Complex result = c1.add(c2);

        System.out.println(result.real + " + " + result.imag + "i");

        sc.close();
    }
}