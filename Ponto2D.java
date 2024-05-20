//classe Ponto2D encapsula um ponto no espaço cartesiano de duas dimensões.
public class Ponto2D {
    // Atributos da classe, coordenadas do ponto no espaço bidimensional
    private double x, y;

    private static int contadorInstancias = 0;

    public Ponto2D() {
        this.x = 0.0;
        this.y = 0.0;
        contadorInstancias++;
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
        contadorInstancias++;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static int getContadorInstancias() {
        return contadorInstancias;
    }
}