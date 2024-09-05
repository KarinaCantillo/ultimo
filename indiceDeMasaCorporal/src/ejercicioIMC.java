import javax.swing.*;

public class ejercicioIMC {
    public static void main(String[] args) {
        // CREO VARIABLES
        String nombre = "";
        Double peso, altura, imc;
        String categoria;
        // Mensaje de error
        String msj = "DATO NO VALIDO, INGRESE VALORES POSITIVOS";

        // Solicitar el nombre
        nombre = JOptionPane.showInputDialog(null, "Escriba su nombre");

        // Solicitar el peso
        peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su peso en kilogramos"));

        if (peso > 0) {
            // Solicitar la altura
            altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su altura en metros"));

            if (altura > 0) {
                // Calcular el IMC
                imc = peso / (altura * altura);

                // Determinar la categoría del IMC

                if (imc < 18.5) {
                    categoria = "Bajo peso";

                } else if (imc >= 18.5 && imc < 24.9) {
                    categoria = "Peso normal";
                } else if (imc >= 25 && imc < 29.9) {
                    categoria = "Sobrepeso";
                } else {
                    categoria = "Obesidad";
                }

                // Mostrar el resultado
                JOptionPane.showMessageDialog(null, nombre + ", su IMC es: " + String.format("%.2f", imc) + ". Categoría: " + categoria);
            } else {
                JOptionPane.showMessageDialog(null, msj);
            }
        } else {
            JOptionPane.showMessageDialog(null, msj);
        }
    }
}
