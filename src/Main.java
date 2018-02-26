import Calculator.Calculator;
import Cicle.Cicle;
import Circle.Circle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Какую программу запустить? Радиус круга = 1; Калькулятор = 2; Cicle = 3");
        String st = reader.readLine();
        if (st == "1"){
            new Circle();
        }
        else if (st == "2"){
            new Calculator();
        System.out.println("есть че?");}
        else if (st == "3"){
            new Cicle();}
        System.out.println("есть че?");
    }
}