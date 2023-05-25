package fila_supermercado;

import java.util.ArrayList;

public class FilaSupermercado {
	
	private ArrayList<Integer> fila;

    public FilaSupermercado() {
        fila = new ArrayList<>();
    }

    public void enqueue(int elemento) {
        fila.add(elemento);
    }

    public int dequeue() {
        if (fila.isEmpty()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        return fila.remove(0);
    }

    public boolean isEmpty() {
        return fila.isEmpty();
    }

    public int size() {
        return fila.size();
    }

    public int peek() {
        if (fila.isEmpty()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        return fila.get(0);
    }
    
    public int get(int posicao) {
        if (posicao < 0 || posicao >= fila.size()) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }
        return fila.get(posicao);
    }

}
