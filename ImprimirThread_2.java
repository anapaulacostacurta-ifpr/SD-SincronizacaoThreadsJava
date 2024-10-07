class ImprimirThread_2 implements Runnable {
    String str;
    public ImprimirThread_2(String str) {
     this.str = str;
    }
    public void run() {
        for(;;) {
            System.out.print(str);
            Thread.currentThread().yield();
        }
    }
}