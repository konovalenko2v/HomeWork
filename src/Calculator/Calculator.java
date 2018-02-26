package Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static String calculator() throws IOException {
        System.out.println("первое число = ");
        int n1 = number();
        System.out.println("что будем делать с числом? (введи математический знак) =  ");
        String symb = symb();
        System.out.println("второе число = ");
        int n2 = number();
        long res1 = res(n1, symb, n2);
        return "Результат исчеслений = " + res1;

    }

    public static int number() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String at = reader.readLine();
        return Integer.parseInt(at);
    }

    public static String symb() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static long res(int n1, String symb, int n2) throws IOException {
        long a = 0L;
        byte var6 = -1;
        switch(symb.hashCode()) {
            case 42:
                if (symb.equals("*")) {
                    var6 = 2;
                }
                break;
            case 43:
                if (symb.equals("+")) {
                    var6 = 1;
                }
            case 44:
            case 46:
            default:
                break;
            case 45:
                if (symb.equals("-")) {
                    var6 = 0;
                }
                break;
            case 47:
                if (symb.equals("/")) {
                    var6 = 3;
                }
        }

        switch(var6) {
            case 0:
                a = (long)(n1 - n2);
                return a;
            case 1:
                a = (long)(n1 + n2);
                return a;
            case 2:
                a = (long)(n1 * n2);
                return a;
            case 3:
                a = (long)(n1 / n2);
                return a;
            default:
                return a;
        }
    }
}
