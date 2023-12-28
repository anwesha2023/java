package test1;
class PrintNumbers extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class PrintAlphabets extends Thread {
    public void run() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class multithread {
    public static void main(String[] args) {
        PrintNumbers printNumbersThread = new PrintNumbers();
        PrintAlphabets printAlphabetsThread = new PrintAlphabets();

        printNumbersThread.start();
        printAlphabetsThread.start();
    }
}
