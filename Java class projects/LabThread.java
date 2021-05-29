
class ThreadA implements Runnable {
    Thread t;

    ThreadA() {
    }

    public void run() {
        // t=new Thread();
        System.out.println("Even number from 50-100");
        for (int i = 50; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

}

class ThreadB implements Runnable {
    Thread t;

    public void run() {
        //  t = new Thread();
        System.out.println("Odd numbers from 100-200");
        try{
        for (int i = 50; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                Thread.sleep(100);
            }

        }
    }catch(Exception ex){

    }

    }

}

class CreatingThreadObject {
    public static void main(String args[]) {
        ThreadA tA = new ThreadA();
        ThreadB tB = new ThreadB();
        tA.start();
    }
}
