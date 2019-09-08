package cn.liuyangjob.ClassTest;

/**
 * Created by  liuyang
 * 2019/8/27    16:01
 * cn.liuyangjob.ClassTest
 * All Right Reserved by liuyang.
 **/

/**
 * 继承中一定要看是谁实现的子类，就会调用谁的方法。
 *
 *   本例中子类没有显式调用父类构造方式（在sub构造方法中使用super()）
 *   默认会调用无参的构造方法
 *           Sub(int i) {
               // super(); 再次隐式调用了父类的无参构造方法。
               若父类没有无参构造方法，程序就会报错。
               flag = i;
               System.out.println("Sub.Sub()flag=" + flag);
 *            }
 *   父类静态代码-》子类静态代码-》（父类非静态代码块，父类非静态变量）-》父类构造函数-》（子类非静态代码，子类变量）-》子类构造函数
 *         在执行父类构造函数的时候， 调用的test方法，已经被子类重写
 *         故会调用子类的构造函数
 */
public class BaseClassCalled {
    class Super {
        int flag = 1;

        Super() {
            test();
        }

        void test() {
            System.out.println("Super.test() flag=" + flag);
        }
    }

    class Sub extends Super {
        Sub(int i) {
            flag = i;
            System.out.println("Sub.Sub()flag=" + flag);
        }

        @Override
        void test() {
            System.out.println("Sub.test()flag=" + flag);
        }
    }

    public static void main(String[] args) {
        new BaseClassCalled().new Sub(5);
    }
}
