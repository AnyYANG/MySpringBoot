package cn.liuyangjob.ClassTest;

/**
 * Created by  liuyang
 * 2019/8/12    14:20
 * cn.liuyangjob.ClassTest
 * All Right Reserved by liuyang.
 **/

/**
 *  1. 执行顺序优先级：静态块>main()>构造块>构造方法
 *  2. 静态块按照申明顺序执行，所以先执行publicstaticB t1 = newB();
 *  该语句创建对象，则又会调用构造块，输出构造块
 */
public class InstantSequence {
}

class B {
    public static B t1 = new B();
    public static B t2 = new B();

    {
        System.out.println("构造块");
    }

    static {
        System.out.println("静态块");
    }

    public static void main(String[] args) {
        B t = new B();
    }
}