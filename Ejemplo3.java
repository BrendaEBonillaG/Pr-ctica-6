import System.System;

public class Ejemplo3 {
    public static final double PI = 3.141592;
    public double radio;

    //El método para calcular el diámetro.
    public double getDiameter() {
        double diametro = radio * 2;
        return diametro;
        }
    //El método para calcular el prímetro.
    public double getPerimeter(){
        double perimeter = PI * getDiameter();
        return perimeter;
    }
    //El método para calcular el área.
    public double getArea(){
        double area = PI * (radio * radio);
        return area;
    }
}
public class Example {

    public static void main(String[] args){
        Circle circulo_A = new Circle();
        circulo_A.radio = 5.0;

        System.out.println(circulo_A.getDiameter());
        System.out.println(circulo_A.getPerimeter());
        System.out.println(circulo_A.Area());
        
    }
}

