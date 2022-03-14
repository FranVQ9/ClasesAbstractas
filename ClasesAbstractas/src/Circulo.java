public class Circulo extends Figura implements Comparable<Figura>{
    private double pi;
    private double radio;
    private int sides;

    public Circulo(double pRadio) {
        pi = 3.14;
        radio = pRadio;
        sides = 0;
    }
    public double calcularArea() {
        return pi * Math.pow(radio, 2);
    }
    public int getSides() {
        return sides;
    }
    public int compareTo(Figura figura) {
        double areaPorComparar = figura.calcularArea();
        double miArea = this.calcularArea();

        if (miArea == areaPorComparar) {
            if (this.getSides() == figura.getSides()){
                return 0;
            }
            else if (this.getSides() > figura.getSides()) {
                return 1;
            }
            else {
                return -1;
            }
        }
        else if (miArea > areaPorComparar) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
