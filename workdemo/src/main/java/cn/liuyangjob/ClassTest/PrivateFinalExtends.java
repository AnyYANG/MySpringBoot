package cn.liuyangjob.ClassTest;

/**
 * Created by  liuyang
 * 2019/8/12    11:57
 * cn.liuyangjob.ClassTest
 * All Right Reserved by liuyang.
 **/

/**
 * 1,private 方法只能在，本实例内部使用，所以，不会报错。 但是如果在其他类中new就会报错
 * 2，方法的重写是看方法修饰权限的，private的方法是不能被重写的。
 */
public class PrivateFinalExtends {
    public static void main(String[] args) {
        //   new  Car().run();
    }
}

class Car extends Vehicle {
    public void test(String arg) {
        new Car().run();
    }

    private final void run() {
        System.out.println("Car");
    }
}

class Vehicle {
    private final void run() {
        System.out.println("Vehicle");
    }
}