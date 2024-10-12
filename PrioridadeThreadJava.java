class BaixaPrioridade extends Thread {
    public void run() {
        setPriority(Thread.MIN_PRIORITY);
        for(;;) {
            System.out.println("Thread de baixa prioridade executando -> 1");
        }
    }
}


class AltaPrioridade extends Thread {
    public void run() {
        setPriority(Thread.MAX_PRIORITY);
        for(;;) {
            for(int i=0; i<5; i++)
                System.out.println("Thread de alta prioridade executando -> 10");
                try {
                    sleep(10);
                } catch(InterruptedException e) {
                    System.exit(0);
                }
        }
    }
}
