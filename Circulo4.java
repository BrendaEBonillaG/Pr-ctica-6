public class Circulo4 {
    public static final double PI = 3.141592; //Final después de static.
    public double radio;
}

public class Example {
    public static void main(String[] args) {
        Circle circulo_A = new Circle();
        circulo_A.PI = 10.0; //Lanzará error al compilar


        Circle circulo_B = new Circle();

        System.out.println(circulo_A.PI);
        System.out.println(circulo_B.PI);


    }

}
