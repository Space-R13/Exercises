package andrey;

public class Operatory {
    int a1 = -2147483648;
    int a2 = 2147483647;
    int a3 = 4;
    int a4 = 0b1001;
    int a5 = 16;
    int a6;


//    long b1 = -9223372036854775808;
//    long b2 = -9223372036854775807;


    short c1 = -32768;
    short c2 = 32767;
    short c3 = 2;


    byte d1 = -128;
    byte d2 = 127;
    byte d3 = 1;

    float e1 = -3.40282347E+38F;
    float e2 = 3.40282347E+38F;
    float e3 = 4;
    float e4;

    double f1 = -1.7976931348623157E+308D;
    double f2 = 1.7976931348623157E+308D;
    double f3 = 8;
    double f4 = 2;
    double f5;

    char g1 = 69;
    char g2 = 'A';
    char g3 = '\u2122';

    boolean h1 = true;

    String i1 = "Строка";

    Operatory(){
        a6 = (int) Math.sqrt(a5);
        System.out.println(a6);
        a6 = (int)Math.pow(a3, a5);
        System.out.println(a6);
        f5 = Math.pow(f3, f4);
        System.out.println(f5);
        a6 = Math.floorMod(a3 + 1, 4);
        System.out.println(a6);
        e4 = a5;
        System.out.println(e4);
        a6 = a3++;
        System.out.println(a6);
        a6 = ++a3;
        System.out.println(a6);
        a6 = a3--;
        System.out.println(a6);
        a6 = --a3;
        System.out.println(a6);
    }

}
