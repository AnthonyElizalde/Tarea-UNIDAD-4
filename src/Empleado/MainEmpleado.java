package Empleado;

public class MainEmpleado {
 
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Anthony Elizalde", 5000);
        ImpuestoCalculator calculadora = new ImpuestoCalculator();
        EmpleadoPrinter printer = new EmpleadoPrinter();

        double impuesto = calculadora.calculateImpuesto(empleado);
        System.out.println("Impuesto calculado: " + impuesto);

        printer.printDetails(empleado);
    }
}