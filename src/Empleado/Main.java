package Empleado;

//Clase para representar un rectángulo
class Rectangle {
 private double width;  // Ancho del rectángulo
 private double height; // Altura del rectángulo

 // Constructor
 public Rectangle(double width, double height) {
     if (width <= 0 || height <= 0) {
         throw new IllegalArgumentException("El ancho y la altura deben ser mayores que 0.");
     }
     this.width = width;
     this.height = height;
 }

 // Métodos getter
 public double getWidth() {
     return width;
 }

 public double getHeight() {
     return height;
 }

 // Métodos setter con validación
 public void setWidth(double width) {
     if (width <= 0) {
         throw new IllegalArgumentException("El ancho debe ser mayor que 0.");
     }
     this.width = width;
 }

 public void setHeight(double height) {
     if (height <= 0) {
         throw new IllegalArgumentException("La altura debe ser mayor que 0.");
     }
     this.height = height;
 }

 // Método para calcular el área
 public double calculateArea() {
     return width * height;
 }

 // Método para calcular el perímetro
 public double calculatePerimeter() {
     return 2 * (width + height);
 }

 // Método para verificar si es un cuadrado
 public boolean isSquare() {
     return width == height;
 }

 // Método para redimensionar el rectángulo
 public void resize(double widthFactor, double heightFactor) {
     if (widthFactor <= 0 || heightFactor <= 0) {
         throw new IllegalArgumentException("Los factores de redimensionamiento deben ser mayores que 0.");
     }
     this.width *= widthFactor;
     this.height *= heightFactor;
 }

 // Representación como cadena de texto
 public String toString() {
     return String.format("Rectángulo [ancho=%.2f, altura=%.2f, área=%.2f, perímetro=%.2f, esCuadrado=%b]",
             width, height, calculateArea(), calculatePerimeter(), isSquare());
 }
}
