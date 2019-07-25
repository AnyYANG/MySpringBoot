package cn.liuyangjob.ManyThread;

/**
 * Created by  liuyang
 * 2019/7/25    20:45
 * cn.liuyangjob.ManyThread
 * All Right Reserved by liuyang.
 **/

import java.util.concurrent.Semaphore;

/**
 * Semaphore 是syschronized 的加强版。 控制并发线程的数量的
 */
public class SemaphoreTest {

}
class  Task implements  Runnable{
    private Semaphore semaphore = new Semaphore(1);// 同步关键类，构造方法传入的数字是多少，则同一个时刻，只运行多少个进程同时运行制定代码
    public Task(String name){
        super();
    }
    @Override
    public void run() {

    }
}