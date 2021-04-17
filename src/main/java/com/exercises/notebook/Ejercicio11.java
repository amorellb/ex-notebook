package com.exercises.notebook;

public class Ejercicio11 {
    public static void main(String[] args) {

        Ejercicio11 ejercicio11 = new Ejercicio11();

        /* Inicializamos la agenda llamando al método initializeDiary y mostramos el contenido por pantalla */
        System.out.println("Empty diary:");
        ejercicio11.initializeDiary();

        /* Añadimos algunas tareas a la agenda */
        ejercicio11.diary[1][17] = "Comprar pan!";
        ejercicio11.diary[3][12] = "Ir a por kikos";
        ejercicio11.diary[0][19] = "Partidito";
        ejercicio11.diary[6][0] = "Merendola";

        /* Mostramos las tareas pendientes que ahora hay en la agenda */
        System.out.println("\n");
        System.out.println("Tasks to do:");
        ejercicio11.populateDiary();

    }

    /* Atributo de tipo array de string que representa la agenda */
    private final String[][] diary = new String[7][24];

    /* Método para inicializar la agenda y mostrar el contenido */
    public void initializeDiary() {
        for (int i = 0; i < this.diary.length; i++) {
            for (int j = 0; j < this.diary[i].length; j++) {
                this.diary[i][j] = "No tasks.";
                System.out.println(diary[i][j]);
            }
        }
    }

    /* Método para mostrar las tareas añadidas a la agenda */
    public void populateDiary() {
        for (int i = 0; i < this.diary.length; i++) {
            for (int j = 0; j < this.diary[i].length; j++) {
                if (!diary[i][j].equals("No tasks.")) {
                    System.out.println("The day " + (i + 1) + " at " + j + ":00 you have: " + diary[i][j]);
                }
            }
        }
    }
}