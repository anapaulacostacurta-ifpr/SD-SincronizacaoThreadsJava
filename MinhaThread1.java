class MinhaThread1 extends Thread {
    public void run(String str, int count) {
        for (int i=0; i<=count; i++){
            System.out.println(str);
        }
    }
}
