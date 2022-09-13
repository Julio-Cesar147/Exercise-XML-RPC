package Server;

import java.util.Arrays;

// Julio Cesar Gutierrez Rojas 4A
public class Methods {
    public String ej2 (String name, double nu1, double nu2, double nu3){
        String message;
        double sum = nu1 + nu2 + nu3;
        double prom = sum/3;
        message = "Hola, el producto es: " + name + ", la suma es: " + sum + ", y el promedio es: " + prom;
        return message;
    }

    public int ej3 (int num1, int num2){
        int suma = 0;
        for(int i = num1; i < num2; i++){
            suma += i;
        }
        return suma - num1;
    }

    public int[] ej4 (int[] enteros){
        Arrays.sort(enteros);
        for (int i = 0; i < enteros.length; i++){
            System.out.println(""+ enteros[i]);
        }
        return enteros;
    }
}
