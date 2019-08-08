package cn.liuyangjob.ObjectTest;

/**
 * Created by  liuyang
 * 2019/8/8    16:49
 * cn.liuyangjob
 * All Right Reserved by liuyang.
 **/

/**
 * instanceof是Java中的二元运算符，左边是对象，
 * 右边是类；当对象是右边类或子类所创建对象时，
 * 返回true；否则，返回false。
 *
 */
public class ClassInstanceOf {
    public static void main(String args[]) {
        A a = new C();
        System.out.println(a instanceof A);
        System.out.println(a instanceof B);
        System.out.println(a instanceof C);
        System.out.println(a instanceof D);
        System.out.println("aa" instanceof  String);//aa是String 类型对象
        System.out.println(null instanceof  A);// null和任何值 instanceof都是False

    }
}

/**
 *     同一继承树上 instanceof 才能返回true
 *     A
 *     \
 *     B
 *    / \
 *   C   D
 */
class A {

}

class B extends A {

}

class C extends B {

}
class D extends B{

}