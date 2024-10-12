class LancadorPrioridade {
    public static void main(String args[]) {
        AltaPrioridade a = new AltaPrioridade();
        BaixaPrioridade b = new BaixaPrioridade();
        System.out.println("Iniciando threads...");
        b.start();
        a.start();
        // deixa as outras threads iniciar a execução.
        Thread.currentThread().yield();
        System.out.println("Lancador Prioridade finalizado.");
    }
}