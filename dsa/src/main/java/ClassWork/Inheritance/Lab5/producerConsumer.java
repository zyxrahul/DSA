package ClassWork.Inheritance.Lab5;

public class producerConsumer {


static class SharedResource {
    private int data;
    private boolean available = false;

    // Producer method
    public synchronized void produce(int value) {
        try {
            while (available) {
                wait(); // wait until data is consumed
            }
            data = value;
            System.out.println("Produced: " + data);
            available = true;
            notify(); // notify consumer
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Consumer method
    public synchronized void consume() {
        try {
            while (!available) {
                wait(); // wait until data is produced
            }
            System.out.println("Consumed: " + data);
            available = false;
            notify(); // notify producer
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Producer Thread
static class Producer extends Thread {
    SharedResource sr;

    Producer(SharedResource sr) {
        this.sr = sr;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            sr.produce(i);
        }
    }
}

// Consumer Thread
static class Consumer extends Thread {
    SharedResource sr;

    Consumer(SharedResource sr) {
        this.sr = sr;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            sr.consume();
        }
    }
}

// Main Class
    public static void main(String[] args) {
        SharedResource sr = new SharedResource();

        Producer p = new Producer(sr);
        Consumer c = new Consumer(sr);

        p.start();
        c.start();
    }
}
