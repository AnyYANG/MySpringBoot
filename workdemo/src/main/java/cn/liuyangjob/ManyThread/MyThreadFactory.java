package cn.liuyangjob.ManyThread;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.ThreadFactory;

/**
 * Created by  liuyang
 * 2019/7/25    20:50
 * cn.liuyangjob.ManyThread
 * All Right Reserved by liuyang.
 **/

public class MyThreadFactory {
    private MyThreadFactory(){}
    private static ThreadFactory threadFactory;

    public static ThreadFactory getThreadFactory() {
        if(threadFactory == null){
            threadFactory = new  ThreadFactoryBuilder().setNameFormat("线程-demo-%d").build();
        }
        return threadFactory;
    }
}
