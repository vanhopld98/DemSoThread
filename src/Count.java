public class Count implements Runnable {
    private Thread myThread;

    public Thread getMyThread() {
        return myThread;
    }

    public Count() {
        myThread = new Thread(this, "my runnable thread");
        System.out.println("my thread khởi tạo " + myThread);
        myThread.start();


    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("In số lượng " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread bị gián đoạn");
        }
        System.out.println("my thread đã kết thúc");
    }

}