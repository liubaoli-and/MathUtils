// This is a mutant program.
// Author : ysma
package cn.edu.ustb.ROR_278;

public class test1
{

    public static  int test( int[] number )
    {
        if (number.length < 2) {
            return -1;
        }
        if (number[0] < 0) {
            return -1;
        } else {
            return number[1];
        }
    }

    public static  int test1( int p, int q )
    {
        if (p > 20 || q > 20) {
            return -11;
        }
        if (p < 0 || q < 0) {
            return -12;
        }
        int u = p;
        int v = q;
        if (u == 0 || v == 0) {
            if (u == Integer.MIN_VALUE || v == Integer.MIN_VALUE) {
                return -21;
            }
            return u + v;
        }
        if (u > 0) {
            u = -u;
        }
        if (v > 0) {
            v = -v;
        }
        int k = 0;
        int number = 0;
        int a = p;
        int b = q;
        int number1 = 0;
        int number2 = 0;
        while (a - 2 >= 0) {
            a = a - 2;
            if (number1 > 12) {
                return -31;
            }
            number1++;
        }
        while (b - 2 >= 0) {
            b = b - 2;
            if (number2 > 12) {
                return -32;
            }
            number2++;
        }
        while (a == 0 && b == 0 && k < 31) {
            u = (int) (u * 0.5);
            v = (int) (v * 0.5);
            a = -1 * u;
            k++;
            b = -v;
            int number21 = 0;
            int number22 = 0;
            while (a - 2 >= 0) {
                a = a - 2;
                if (number21 > 12) {
                    return -41;
                }
                number1++;
            }
            while (b - 2 >= 0) {
                b = b - 2;
                if (number22 > 12) {
                    return -42;
                }
                number1++;
            }
            number++;
            if (number > 12) {
                return -5;
            }
        }
        if (k == 31) {
            return -22;
        }
        int c = -u;
        int number31 = 0;
        while (c - 2 >= 0) {
            c = c - 2;
            if (number31 > 12) {
                return -6;
            }
            number31++;
        }
        int t;
        if (c == 1) {
            t = v;
        } else {
            t = (int) (u * -0.5);
        }
        int number41 = 0;
        do {
            int d;
            if (t > 0) {
                d = t;
            } else {
                d = -1 * t;
            }
            int number42 = 0;
            while (d - 2 >= 0) {
                d = d - 2;
                if (number42 > 12) {
                    return -71;
                }
                number42++;
            }
            int number43 = 0;
            while (d == 0) {
                int number431 = 0;
                t = (int) (t * 0.5);
                if (t > 0) {
                    d = t;
                } else {
                    d = -1 * t;
                }
                while (d - 2 >= 0) {
                    d = d - 2;
                    if (number431 > 12) {
                        return -721;
                    }
                }
                if (number43 > 12) {
                    return -72;
                }
                number43++;
            }
            if (t > 0) {
                u = -t;
            } else {
                v = t;
            }
            t = (int) ((v - u) * 0.5);
            number41++;
            if (number41 > 14) {
                return -7;
            }
        } while (t != 0);
        int e = -u;
        int number5 = 0;
        for (int i = 1; i != k; i++) {
            e = e * 2;
            if (number5 > 10) {
                return -8;
            }
            number5++;
        }
        return e;
    }

    public static  int getR( int a, int b )
    {
        int d = a;
        if (a > 10 || b > 10) {
            return 1;
        }
        do {
            while (d - 2 >= 0) {
                d = d - 2;
            }
            if (d == -1) {
                d = 1;
            } else {
                d = 2;
            }
        } while (d > 0);
        return d;
    }

    public static  void main( java.lang.String[] args )
    {
        System.out.println( test1( 32, 21 ) );
    }

}
