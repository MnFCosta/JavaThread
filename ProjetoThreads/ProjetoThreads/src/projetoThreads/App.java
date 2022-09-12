package projetoThreads;

public class App {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        Thread menuthread = new Thread(menu);
        Relogio rel = new Relogio();

        rel.setDaemon(true);
        menuthread.start();
        rel.start();

    }
}

