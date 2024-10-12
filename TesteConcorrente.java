
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
class TesteConcorrente {
    public static void main(String Args[]) {
        new Thread(new ImprimirThread_1("A")).start();
        new Thread(new ImprimirThread_1("B")).start();
    }
}