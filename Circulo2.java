import System.System;

public class Circulo2 {

    public static double PI = 3.141592;
    public double radio; //En centimetros
}
    public class Example {
        public static void main(String[] args) {
            Circle circulo_A = new Circle();
            circulo_A.radio = 10.0;

            Circle circulo_B = new Circle();
            circulo_B.radio = 5.0;

            System.out.println(circulo_A.PI);//De esta forma puede lanzar un error.
            System.out.println(circulo_B.PI);//Puede lanzar un error.
            System.out.println(Circle.PI); //FOrma correcta de accesar al atributo

        }