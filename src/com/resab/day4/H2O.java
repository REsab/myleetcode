package com.resab.day4;


import java.util.concurrent.Semaphore;
import java.util.concurrent.CountDownLatch;

class H2O {

    private Semaphore h = new Semaphore(2);
    private Semaphore o = new Semaphore(0);

    public H2O() {
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        h.acquire();
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();
        o.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        o.acquire(2);
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        releaseOxygen.run();
        h.release(2);
    }
}

//作者：hua-shang-1
//        链接：https://leetcode-cn.com/problems/building-h2o/solution/yong-xin-hao-liang-jian-dan-cu-bao-by-hua-shang-1/
//        来源：力扣（LeetCode）
//        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。