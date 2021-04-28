class Circle{
    //Cuerpo de la clase
}
public class Ejemplo {

    public static void main(String[] args) {

        Circle circulo_A = new Circle();
        Circle circulo_B = new Circle();
        Circle circulo_C = circulo_A;

        System.out.println(circulo_A.equals(circulo_B));
        System.out.println(circulo_B.equals(circulo_C));
        System.out.println(circulo_C.equals(circulo_A));

    }
}
