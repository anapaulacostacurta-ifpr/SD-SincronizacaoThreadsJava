class TesteConcorrente {
    public static void main(String Args[]) {
        new Thread(new ImprimirThread_1("A")).start();
        new Thread(new ImprimirThread_1("B")).start();
    }
}