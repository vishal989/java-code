package Concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounter {
    private int i;
    private int j;

    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();


    synchronized public void incremenetI(){
        //get Lock for i
        lockForI.lock();
        i++;
        lockForI.unlock();
        // release lock for i

        //get i
        //increment
        //set i
    }

    synchronized public void incremenetJ(){
        //get Lock for j
        lockForJ.lock();
        j++;
        lockForJ.unlock();
        // release lock for j
    }
    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
