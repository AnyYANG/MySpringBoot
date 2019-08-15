package cn.liuyangjob.StringTest;

/**
 * Created by  liuyang
 * 2019/7/13    12:29
 * cn.liuyangjob.StringTest
 * All Right Reserved by liuyang.
 **/

public class TestStringMethod {
    public static void main(String args[]) {

        testSpringSpilte();
    }

    /**
     * String split 这个方法默认返回一个数组，
     * 如果没有找到分隔符，
     * 会把整个字符串当成一个字符串数组
     * 返回到结果， 所以此处结果就是1
     */
    private static void testSpringSpilte(){
        String str = "12,3";
        String str2 = "123";
        System.out.print(str.split(",").length);
        System.out.print(str2.split(",").length);
    }
    /**
     * String split 这个方法默认返回一个数组，
     * 如果没有找到分隔符，
     * 会把整个字符串当成一个字符串数组
     * 返回到结果， 所以此处结果就是1
     */
    public  void testSpringSpilte2(){
        String str = "12,3";
        String str2 = "123";
        System.out.print(str.split(",").length);
        System.out.print(str2.split(",").length);
    }
}
