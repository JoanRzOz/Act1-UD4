package UD4;

public class NotasFinales {

	/**
	 * Programa que trabaja con un array de notas.
	 * Calcula la nota más alta, comprueba si se repite,
	 * obtiene la nota media y muestra si el alumno
	 * está aprobado o suspendido.
	 */
    public static void main(String[] args) {

        int[] notas = {5, 7, 3, 7, 2, 9, 7};
        int contadorNotaMaxima = 0; // Aquí se guardará la cantidad de veces que la nota más alta se repite.
        int notaMaximaRepetida = 0; // Aquí se guardará 1 si la nota más alta se repite y 0 si no.
        int tempNotaMasAlta = notas[0]; // Aquí se guardará la nota más alta de cada bucle.
        
        /**
         * Este bucle va guardando temporalmente
         * la nota más alta de cada pasada.
         */
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > tempNotaMasAlta) {
                tempNotaMasAlta = notas[i];
            }
        }
        
        /**
         * Este bucle hace, en caso de que la nota
         * de la pasada y la que hay guardada en la
         * temporal sean la misma, sume en 1 la
         * variable b.
         */
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == tempNotaMasAlta) {
                contadorNotaMaxima++;
            }
        }
        
        /**
         * Este if indica que c vale 1 en caso de
         * que b sea más alto que 1.
         */
        if (contadorNotaMaxima > 1) {
            notaMaximaRepetida = 1;
        }
        
        /**
         * Este if te indica si tu nota más alta
         * se repite o no.
         * @return aviso de nota repetida o no
         */
        if (notaMaximaRepetida == 1) {
            System.out.println("Tu nota más alta se repite 1 o más veces!!");
        } else {
            System.out.println("Tu nota más alta no se repite :(");
        }
        
        int sumaTodasNotas = 0; // En esta variable se guardará la suma de todas las notas.
        
        /**
         * Este bucle suma todas las notas y lo
         * guarda en la variable creada justo antes.
         */
        for (int i = 0; i < notas.length; i++) {
            sumaTodasNotas += notas[i];
        }
        
        /**
         * Aquí hay 2 cosas:
         * 1- @param Se saca la nota media y se guarda.
         * 2- @return Te dice cuál es tu nota media.
         */
        double notaMedia = (double) sumaTodasNotas / notas.length;
        System.out.printf("Tu nota media es... %.2f.", notaMedia);
        System.out.println();
        
        /**
         * Este if te comenta si has aprobado o suspendido.
         * @return aviso de aprobado o suspendido
         */
        if (notaMedia >= 5) {
            System.out.println("ESTÁS APROBADO!!!");
        } else {
            System.out.println("Estás suspendido :(");
        }
    }
}