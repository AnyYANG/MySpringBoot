package cn.liuyangjob;

import sun.security.jca.GetInstance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * Created by  liuyang
 * 2019/7/12    22:15
 * cn.liuyangjob
 * All Right Reserved by liuyang.
 **/

public class aaaa {
    static List<String> data = new ArrayList<String>();
    static{
        for(int i =1 ;i<2000;i++){
            data.add("123#"+i);
        }
    }
    static  CountDownLatch count=new CountDownLatch(data.size());
    public static void main(String args[]) throws InterruptedException {

        Long start = System.currentTimeMillis();
        aaaa  a=new aaaa();
        a.printobject();
        Long end =System.currentTimeMillis();
        count.await();
        System.out.println(end-start);
    }

    public void printb() {
        data.stream().forEach((o) -> {
            saveModel(o);
            System.out.println("*****" + o.toString());
        });
    }


    public void printobject() {
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
