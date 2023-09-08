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
    for (int num : numbers) {
      sorted.add(num);
    }
    System.out.println(sorted);
  }

  //3. Imprimir en consola la tabla de multiplicar del número 9.
  public static void exercise3() {
    for (int i = 0; i <= 10; i++) {
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
    int rows = 6;
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= i; j++) {
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
    int rows = 5;
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= rows - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  //6. Imprimir en consola los primero diez números de la serie Fibonacci.
  public static void exercise6() {
    int a = 0, b = 1, c, number = 10;
    for (int i = 0; i < number; i++){
      c = a + b;
      a = b;
      b = c;
      System.out.println(a);
    }
  }

  //7. Dado un número saber si este es primo o no.
  public static void exercise7() {
    System.out.println(
            "Validar si el número es primo.\n" +
            "Digita el número:"
    );
    int number = in.nextInt(), sum = 0;
    for (int i = 1; i < number; i++){
      int aux = number % i;
      if (aux == 0) {
        sum += 1;
      }
    }
    if (sum <= 2) {
      System.out.println("El número " + number + " es primo");
    }else {
      System.out.println("El número " + number + " no es primo");
    }
  }

  //8. Imprimir en consola todos los números múltiplos de 2.
  // El ciclo finalizará cuando el último múltiplo sea menor a 4570
  public static void exercise8() {
    for (int i = 1; i < 4570; i++) {
      if ( i % 2 == 0) {
        System.out.println(i);
      }
    }
  }

  //9. Dado un número entero obtener su factorial.
  public static int exercise9(int number) {
    int factorial = 1;
    for (int i = 2; i < number; i++){
      factorial *= i;
    }
    //System.out.println("El factorial de " + number + " es " + factorial);
    return factorial;
  }

  //10. Crear un programa el cual nos permita conocer el valor de la constante e.
  public static void exercise10(int number){
    double e = 0, term;
    for (int i = 0; i < number; i++) {
      term = (double) 1 / exercise9(i);
      e += term;
    }
    System.out.println(e);
  }
}
