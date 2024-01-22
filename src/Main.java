import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(10);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(2);
        numeros.add(5);
        numeros.add(8);
        numeros.add(6);
        numeros.add(1);

        Collections.sort(numeros);

        for (int i : numeros){
            System.out.println(i);
        }
    }
}