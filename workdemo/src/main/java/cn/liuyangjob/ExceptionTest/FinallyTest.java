package cn.liuyangjob.ExceptionTest;

/**
 * Created by  liuyang
 * 2019/7/23    15:32
 * cn.liuyangjob.ExceptionTest
 * All Right Reserved by liuyang.
 **/

/**
 * 测试finally 的返回值
 */
public class FinallyTest {
    public static void main(String args[]) {
        System.out.println(methoda());
    }

    /**
     * 直接返回hello  finally代码块无法更改变量I的值
     * *************************************************************
     * 本类型变量而言，若i为引用类型，则在finally块中改变i的内部状态,,*
     * 则返回值依然会发生变化。**************************************
     * *************************************************************
     * @return
     */
    public static String methoda() {
        String i = "Hello";
        try {
            return i;
        } finally {
            i = "nmb";
        }
    }

    /**
     *  输出结果nmb
     *  不要在finally代码块出现return语句。
     * @return
     */
    public static String methodB() {
        String i = "Hello";
        try {
            return i;
        } finally {
            i = "nmb";
            return i;
        }
    }
}
