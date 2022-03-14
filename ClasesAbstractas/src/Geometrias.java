import java.util.Arrays;

public class Geometrias {
    public static void main(String[] args) throws Exception {

        Rectangulo[] rects = new Rectangulo[4];
        Circulo[] circs = new Circulo[4];
        Triangulo[] trians = new Triangulo[4];

        rects[0] = new Rectangulo(2.5, 3.0);
        rects[1] = new Rectangulo(1.7, 2.2);
        rects[2] = new Rectangulo(2.8, 3.1);
        rects[3] = new Rectangulo(3.5, 1.2);
        Arrays.sort(rects);
        
        circs[0] = new Circulo(3.41);
        circs[1] = new Circulo(1.19);
        circs[2] = new Circulo(5.46);
        circs[3] = new Circulo(4.21);
        Arrays.sort(circs);

        trians[0] = new Triangulo(2.22, 7.21);
        trians[1] = new Triangulo(1.12, 9.01);
        trians[2] = new Triangulo(4.54, 3.33);
        trians[3] = new Triangulo(7.65, 2.22);
        Arrays.sort(trians);
    }
}

