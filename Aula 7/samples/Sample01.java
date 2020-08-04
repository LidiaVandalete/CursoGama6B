package exercicios;

import java.util.LinkedList;
import java.util.Queue;

public class Sample02 {
    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<>();

        
        //fila.add(1);
        //fila.add(2);
        //fila.add(3);

        

        while (!fila.isEmpty()) {
            System.out.println(fila.remove());

        }

    }
}