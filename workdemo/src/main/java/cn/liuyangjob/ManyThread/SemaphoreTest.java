package cn.liuyangjob.ManyThread;

/**
 * Created by  liuyang
 * 2019/7/25    20:45
 * cn.liuyangjob.ManyThread
 * All Right Reserved by liuyang.
 **/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;

/**
 * Semaphore 是syschronized 的加强版。 控制并发线程的数量的
 */
public class SemaphoreTest {
    public static void main(String args[]) {
        ExecutorService executorService = MyThreadFactory.getExecutorService();
        // executorService.execute();
    }
}

class Task implements Runnable {
    private SemService semService;

    public Task(String name, SemService semService) {
        super();
        this.semService = semService;
    }

    @Override
    public void run() {
        semService.doSomething();
    }
}

class SemService {
    private Semaphore semaphore = new Semaphore(1);

    public void doSomething() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + System.currentTimeMillis());
            Thread.sleep(5000);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}