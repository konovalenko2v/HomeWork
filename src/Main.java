import Calculator.Calculator;
import Circle.Circle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Какую программу запустить? Радиус круга = 1; Калькулятор = 2");
        String st = reader.readLine();
        byte var4 = -1;
        switch (st.hashCode()) {
            case 49:
                if (st.equals("1")) {
                    var4 = 0;
                }
                break;
            case 50:
                if (st.equals("2")) {
                    var4 = 1;
                }
        }

        switch(var4) {
            case 0:
                new Circle();
            case 1:
                new Calculator();
            default:
                System.out.println("ты условие читать умеешь?");
                System.out.println("Программа завершена без ошибок");
        }
    }
}
