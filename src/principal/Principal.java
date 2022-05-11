package principal;

public class Principal {

    public static void main(String[] args) {

        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
        Shape blueCircle = new Circle(100, 100, 10, new BlueCircle());

        Shape redSquare = new Quadrado(50, new RedSquare());
        Shape greenSquare = new Quadrado(25, new GreenSquare());

        redCircle.draw();
        greenCircle.draw();
        blueCircle.draw();

        redSquare.draw();
        greenSquare.draw();
    }

}
