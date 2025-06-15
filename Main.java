import Model.Circle;
import Model.Square;
import Model.Triangle;
import Model.Triangulo_equilatero;
import Model.Triangulo_rectangulo;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Círculo:");
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println();

        Square square = new Square(4);
        System.out.println("Cuadrado:");
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println();

        Triangle triangle = new Triangle(6, 4, 5);
        System.out.println("Triángulo:");
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println();

        Triangulo_equilatero equilatero = new Triangulo_equilatero(5);
        System.out.println("Triángulo equilátero:");
        System.out.println(equilatero.getArea());
        System.out.println(equilatero.getPerimeter());
        System.out.println();

        Triangulo_rectangulo rectangulo = new Triangulo_rectangulo(3, 4);
        System.out.println("Triángulo rectángulo:");
        System.out.println(rectangulo.getArea());
        System.out.println(rectangulo.getPerimeter());
        System.out.println();
    }
}