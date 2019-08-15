package cn.liuyangjob.ClassTest;

import cn.liuyangjob.StringTest.TestStringMethod;

/**
 * Created by  liuyang
 * 2019/8/15    18:09
 * cn.liuyangjob.ClassTest
 * All Right Reserved by liuyang.
 **/

public class HowtoInstantsAClass {
    /**
     * 这里提供了一种不基于new的新的创建对象的方式，基于加载class字节码文件，
     * 然后使用newInstance()进行加载的新的创建方式。 使用类加载机制进行的加载
     * 使用newInstance 必须低效率 弱类型， 只能调用无参构造方法
     * 使用new创建对象 相对高效，能调用任何public构造函数
     * @param args
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static void main(String args[]) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class clazz = Class.forName("cn.liuyangjob.StringTest.TestStringMethod");
        TestStringMethod instance = (TestStringMethod) clazz.newInstance();
        instance.testSpringSpilte2();
    }
}
