package Empleado;
public class CalculadoraCirculo {
    private static CalculadoraCirculo instancia;

    private CalculadoraCirculo() {}

    public static CalculadoraCirculo obtenerInstancia() {
        if (instancia == null) {
            instancia = new CalculadoraCirculo();
        }
        return instancia;
    }

    public double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public void imprimirArea(double radio) {
        double area = calcularAreaCirculo(radio);
        System.out.println("El área del círculo con radio " + radio + " es " + area);
    }

    public static void main(String[] args) {
        CalculadoraCirculo calculadora = CalculadoraCirculo.obtenerInstancia();
        calculadora.imprimirArea(5.0);
    }
}