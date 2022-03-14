public class Triangulo extends Figura implements Comparable<Figura> {
   private double base;
   private double altura;
   private int sides;

   public Triangulo(double pBase, double pAltura) {
       base = pBase;
       altura = pAltura;
       sides = 3;
   }
   public double calcularArea() {
       return (base * altura) / 2;
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
