package projetoThreads;


import javax.swing.*;

import static projetoThreads.Cronometro.*;
public class Menu extends Relogio implements Runnable {

    int control;
    
    public void run(){

        while (control != 7) {
            int input = Integer.parseInt(JOptionPane.showInputDialog( "\nO que deseja fazer?\n"+
                    "1 - Ajustar Horários\n"+
                    "2 - Visualizar Horário\n"+
                    "3 - Iniciar cronômetro\n"+
                    "4 - Parar cronômetro(mostra valor atual)\n"+
                    "5 - Zerar cronômetro\n"+
                    "6 - Definir Alarme\n"+
                    "7 - Sair\n"));

            switch (input) {

                case 1:
                    hora = Integer.parseInt(JOptionPane.showInputDialog("Qual é a hora?"));
                    minuto = Integer.parseInt(JOptionPane.showInputDialog("Quais são os minutos?"));
                    segundos = Integer.parseInt(JOptionPane.showInputDialog("Quais são os segundos"));
                    JOptionPane.showMessageDialog(null,getHorario());
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,getHorario());
                    break;

                case 3:
                    Cronometro cronometro = new Cronometro();
                    cronometro.setDaemon(true);
                    cronometro.start();
                    JOptionPane.showMessageDialog(null,"Cronometro iniciado!");
                    break;
                case 4:
                    Cronometro.controle = true;
                    System.out.printf("\rCronômetro parado em: %d:%d:%d", chora, cminuto, csegundos);
                    break;
                case 5:
                    Cronometro.controle = true;
                    System.out.printf("\r ");
                    chora = 0;
                    cminuto = 0;
                    csegundos = 0;
                    JOptionPane.showMessageDialog(null,"Cronômetro zerado!");
                    break;
                case 6:
                    Alarme alarme = new Alarme();
                    Thread thAlarme = new Thread(alarme);
                    thAlarme.setDaemon(true);
                    thAlarme.start();
                    JOptionPane.showMessageDialog(null,"Alarme iniciado!");
                    break;
                
                case 7:
                    JOptionPane.showMessageDialog(null,"Saindo....");
                    control = 7;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,String.format("[ERRO]Opção %d inválida, tente novamente", input));
                    break;
            }
        }
    }
}
