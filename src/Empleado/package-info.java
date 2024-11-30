package Empleado;

class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }
}

// Clase encargada de calcular impuestos
class ImpuestoCalculator {
    public double calculateImpuesto(Empleado empleado) {
        return empleado.getSalario() * 0.2; // 20% de impuesto
    }
}

// Clase encargada de imprimir detalles del empleado
class EmpleadoPrinter {
    public void printDetails(Empleado empleado) {
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Salario: " + empleado.getSalario());
    }
}

