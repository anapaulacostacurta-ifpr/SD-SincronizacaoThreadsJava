class ImprimirThread_1 implements Runnable {
    String str;
    public ImprimirThread_1(String str) {
        this.str = str;
    }
    public void run() {
        for(;;)
          System.out.print(str);
    }   
}