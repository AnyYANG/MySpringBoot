package cn.liuyangjob.ManyThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import sun.security.jca.GetInstance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * Created by  liuyang
 * 2019/7/13    12:21
 * cn.liuyangjob.ManyThread
 * All Right Reserved by liuyang.
 **/

public class LamadaWithRunable {


    static List<String> data = new ArrayList<String>();

    static {
        for (int i = 1; i < 2000; i++) {
            data.add("123#" + i);
        }
    }

    static CountDownLatch count = new CountDownLatch(data.size());

    public static void main(String args[]) throws InterruptedException {

        Long start = System.currentTimeMillis();
        LamadaWithRunable a = new LamadaWithRunable();
       // a.printa();  //多线程
        a.printb();    //单线程
        Long end = System.currentTimeMillis();
      //  count.await();//单线程的时候 需要把这个方法给注释掉
        System.out.println("time:"+(end - start));
    }

    //单线程打印
    public void printb() {
        data.stream().forEach((o) -> {
            saveModel(o);
            System.out.println("*****" + o.toString());
        });
    }

    //多线程打印
    public void printa() {
        data.stream().forEach((o) -> {
            Runnable saverun = () -> {
                saveModel(o);
                count.countDown();
            };
            Thread t = new Thread(saverun);
            t.start();
            System.out.println("*****" + o.toString());
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
}


