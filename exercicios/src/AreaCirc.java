public class AreaCirc {
    double raio;
    final static double PI = 3.14;

    // construtor
    AreaCirc(double raio) {
        //PI = 3.14;
        this.raio = raio;
    }

    // metodo
    double area() {
        return PI * raio * raio;
        // pi * Math.pow(raio, 2);
    }

    static double area(double raio) {
        return PI * Math.pow(raio, 2);
    }
}
