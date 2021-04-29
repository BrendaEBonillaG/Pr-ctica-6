public class EjemploCirculo {
    final public static double PI = 3.131592;
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

    public static void main(String[] args) {
        double r = 5.0;

        System.out.println(circle.getDiameter(r));
        System.out.println(circle.getPerimeter(r));
        System.out.println(circle.Area(r));

    }
}