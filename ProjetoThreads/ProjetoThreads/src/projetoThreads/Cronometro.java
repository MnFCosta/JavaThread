package projetoThreads;

import javax.swing.*;
import java.util.jar.JarEntry;

public class Cronometro extends Thread{

    static int chora = 0;
    static int cminuto = 0;
    static int csegundos = 0;
    static boolean controle;


    @Override
    public void run() {
        controle = false;
        while (!controle) {
            System.out.printf("\rCronometro: %d:%d:%d", chora, cminuto, csegundos);
            csegundos++;
            if (csegundos == 60) {
                csegundos = 0;
                cminuto++;
            } else if (cminuto == 60) {
                cminuto = 0;
                chora++;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//
        }

    }
}
