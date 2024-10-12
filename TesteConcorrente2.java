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

class TesteConcorrente2 {
    public static void main(String Args[]) {
        new Thread(new ImprimirThread_2("A")).start();
        new Thread(new ImprimirThread_2("B")).start();
    }
}