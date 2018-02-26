import Calculator.Calculator;
import Cicle.Cicle;
import Circle.Circle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Circle = 1; Calculator = 2; Cicle = 3");
        int it = Integer.parseInt(reader.readLine());
        if (it == 1) {
            System.out.println(Circle.circle());
        } else if (it == 2) {
            System.out.println(Calculator.calculator());
        } else if (it == 3) {
            Cicle.cicle();
            for (int i = 0; i < 50; i++) {
                System.out.println(Cicle.cicle());
            }
            System.out.println("SOMETEXT");
        }
    }
}
