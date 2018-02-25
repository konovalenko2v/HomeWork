package Circle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {
    public Circle() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Привет, какой радиус у твоего круга? Введи значение (см): ");
        String rt = reader.readLine();
        double rd = Double.parseDouble(rt);
        double c = 6.283185307179586D * rd;
        System.out.println("Длина окружности круга = " + c + " см");
    }
}
