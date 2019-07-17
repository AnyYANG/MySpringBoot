package cn.liuyangjob.ManyThread;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.concurrent.TimeUnit.MILLISECONDS;


/**
 * Created by  liuyang
 * 2019/7/13    12:21
 * cn.liuyangjob.ManyThread
 * All Right Reserved by liuyang.
 **/

/**
 * 使用LAMADA表达式单线程多线程打印
 */
public class LamadaWithRunable {
    static ExecutorService mythreadPool;

    static List<String> data = new ArrayList<String>();
    static ThreadFactory myThreadFactory = new ThreadFactoryBuilder().setNameFormat("线程-demo-%d").build();

    static {

        mythreadPool = new ThreadPoolExecutor(50, 200, 1000, MILLISECONDS, new LinkedBlockingQueue(), myThreadFactory);
        for (int i = 1; i < 2000; i++) {
            data.add("123#" + i);
        }
    }

    static CountDownLatch count = new CountDownLatch(data.size());

    public static void main(String args[]) throws InterruptedException {

        Long start = System.currentTimeMillis();
        LamadaWithRunable a = new LamadaWithRunable();
        a.printa();  //多线程
        // a.printb();    //单线程
        Long end = System.currentTimeMillis();
        count.await();//单线程的时候 需要把这个方法给注释掉
        mythreadPool.shutdown();
        System.out.println(start);
        System.out.println(end);
        System.out.println((end - start));

    }

    //单线程打印
    public void printb() {
        data.stream().forEach((o) -> {
            saveModel(o);

        });
    }

    //多线程打印
    public void printa() {
        data.stream().forEach((o) -> {
            Runnable saverun = () -> {
                System.out.println(Thread.currentThread().getName() + "*****" + o.toString());
                printTime();
                count.countDown();
            };
            mythreadPool.execute(saverun);

        });
    }

    private void saveModel(String o) {
        char[] oarr = o.toCharArray();
        try {
            for (int i = 0; i < oarr.length; i++) {
                System.out.println(oarr[i]);
                Thread.sleep(300);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void printTime() {
        Random random = new Random();
        int number = random.nextInt(100);
        long i = System.currentTimeMillis()+number;
        System.out.println( "Time:"+i +"***"+number);
    }
}


