public class TestaPontos2D {
    public static void main(String[] args) {
    
        Ponto2D ponto1 = new Ponto2D();
        Ponto2D ponto2 = new Ponto2D(3, 2);
        Ponto2D ponto3 = new Ponto2D(1, 2);

        System.out.println("Ponto 1:");
        System.out.println("Coordenada X: " + ponto1.getX());
        System.out.println("Coordenada Y: " + ponto1.getY());

        System.out.println("Ponto 2:");
        System.out.println("Coordenada X: " + ponto2.getX());
        System.out.println("Coordenada Y: " + ponto2.getY());
        
        System.out.println("Ponto 3:");
        System.out.println("Coordenada X: " + ponto3.getX());
        System.out.println("Coordenada Y: " + ponto3.getY());

        System.out.println("Número de instâncias de Ponto2D criadas: " + Ponto2D.getContadorInstancias());
    }
}