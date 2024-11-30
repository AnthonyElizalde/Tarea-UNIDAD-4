package Empleado;

public class Rectangulo {
    public static void main(String[] args) {
        try {
            // Crear un rectángulo
            Rectangle rect = new Rectangle(4, 6);

            // Imprimir sus detalles
            System.out.println(rect);

            // Verificar si es un cuadrado
            System.out.println("¿Es cuadrado? " + rect.isSquare());

            // Redimensionar el rectángulo
            rect.resize(1.5, 2.0);
            System.out.println("Después de redimensionar:");
            System.out.println(rect);

            // Modificar dimensiones manualmente
            rect.setWidth(8);
            rect.setHeight(8);
            System.out.println("Después de modificar:");
            System.out.println(rect);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
