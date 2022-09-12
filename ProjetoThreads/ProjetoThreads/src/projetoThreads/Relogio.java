package projetoThreads;

import java.util.Timer;
import java.util.TimerTask;

public class Relogio extends Thread {
    static int hora = 0;
    static int minuto = 0;
    static int segundos = 0;
    private int control = 0;

    @Override
    public void run() {
        while (control != 2) {
            segundos++;
            if (segundos >= 60) {
                segundos = 0;
                minuto++;
            } else if (minuto >= 60) {
                minuto = 0;
                hora++;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String getHorario(){
        String horario = String.format("\rRelogio: %d:%d:%d", hora, minuto, segundos);
        return horario;
    }
}



