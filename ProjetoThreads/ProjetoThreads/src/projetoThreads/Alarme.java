package projetoThreads;

import javax.swing.*;

public class Alarme extends Relogio implements Runnable{
    boolean cont = false;

    @Override
    public void run(){
        int hour = Integer.parseInt(JOptionPane.showInputDialog("\nInsira a hora do alarme\n"));
        int minutes = Integer.parseInt(JOptionPane.showInputDialog("\nInsira os minutos do alarme\n"));
        alarme(hour,minutes);
    }

    public void alarme(int hour, int minutes){
        while(!cont){
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        if (hour == hora && minutes == minuto){
            System.out.printf("\rSão %d:%d HORA DE ACORDAR!",hora,minuto);
            cont = true;
        }
        }

    }

}
