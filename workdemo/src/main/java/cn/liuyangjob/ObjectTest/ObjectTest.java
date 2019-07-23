package cn.liuyangjob.ObjectTest;

/**
 * Created by  liuyang
 * 2019/7/23    14:58
 * cn.liuyangjob.ObjectTest
 * All Right Reserved by liuyang.
 **/

public class ObjectTest {

    /**
     * object  可以接受所有对象， 接入基本类型数据的时候 会封装成Integer类型。
     * @param args
     */
    public static void main(String args[]) {
        Object num = 1;
        Object flag = true;
        int count = 0;
        count = ++count;
        System.out.println(count);
    }
}
