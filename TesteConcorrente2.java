class TesteConcorrente2 {
    public static void main(String Args[]) {
        new Thread(new ImprimirThread_2("A")).start();
        new Thread(new ImprimirThread_2("B")).start();
    }
}