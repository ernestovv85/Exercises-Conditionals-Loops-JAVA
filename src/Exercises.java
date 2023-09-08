import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercises {
  private static final Scanner in = new Scanner(System.in);
  //1. Mostrar en consola el mensaje de "Aprobado" en caso la calificación de un alumno sea mayor igual a 70.
  //En caso contrario mostrar el mensaje "Reprobado".
  public static void exercise1() {
    System.out.println("La calificación debe ser ingresada en decenas.\n" +
            "Por ejemplo: 50, 70, 85, 94, etc.");
    System.out.println("Digite la calificación:");
    int rating = in.nextInt();
    if (rating >= 70) {
      System.out.println("Aprobado");
    } else {
      System.out.println("Reprobado");
    }
  }

  //2. Dados 3 números enteros, mostrar en consola los números de forma ascendente, de menor a mayor.
  //Ejemplo Números = 9, 50, 4 Salida = 4, 9, 50
  public static void exercise2() {
    int[] numbers = new int[3];
    numbers[0] = 9;
    numbers[1] = 50;
    numbers[2] = 4;
    Arrays.sort(numbers);
    List<Integer> sorted = new ArrayList<>();
    for (int num: numbers){
      sorted.add(num);
    }
    System.out.println(sorted);
  }

  //3. Imprimir en consola la tabla de multiplicar del número 9.
  public static void exercise3() {
    for(int i= 0; i <= 10; i++) {
      System.out.println("9 X " + i + " = " + 9 * i);
    }
  }

  //4. Replicar la siguiente salida en consola.
  //*
  //**
  //***
  //****
  //*****
  //******

  public static void exercise4() {
    int filas =6;
    for (int i = 1; i <= filas; i++){
      for (int j= 1; j <= i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  //5. Replicar la siguiente salida en consola.
  //     *
  //    ***
  //   *****
  //  *******
  // *********
  //Ayuda: Podrás apoyarte de ciclos anidados así como de los métodos println y print
  public static void exercise5() {
    int filas = 5;
    for (int i = 1; i <= filas; i++){
      for (int j = 1; j<= filas-i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k<= 2*i-1; k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  //6. Imprimir en consola los primero diez números de la serie Fibonacci.

  //7. Dado un número saber si este es primo o no.

  //8. Imprimir en consola todos los números múltiplos de 2. El ciclo finalizará cuando el último múltiplo sea menor a 4570

  //9. Dado un número entero obtener su factorial.

  //10. Crear un programa el cual nos permita conocer el valor de la constante e.
}
