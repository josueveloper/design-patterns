package com.patterns;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Restaurant {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> ordersQueue = new ArrayBlockingQueue<>(3); // Cola para 3 pedidos

        System.out.println("Nuevos pedidos");
        // Simulando añadir pedidos a la cola
        ordersQueue.put("Pedido 1"); // Se añade sin problema
        ordersQueue.put("Pedido 2"); // Se añade sin problema
        ordersQueue.put("Pedido 3"); // Se añade, pero la cola está ahora llena

        // Intentamos añadir otro pedido. Esto se bloqueará hasta que haya espacio.
        // En un escenario real, esto podría ejecutarse en otro hilo.
        new Thread(() -> {
            try {
                ordersQueue.put("Pedido 4");
                System.out.println("Pedido 4 añadido a la cola");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();

        // Simulando procesamiento de un pedido
        Thread.sleep(5000); // Esperamos para simular el tiempo de procesamiento
        System.out.println("Pedido1 procesado " + ordersQueue.take()); // Procesamos un pedido

        // Ahora hay espacio para "Pedido 4" en la cola
    }
}
