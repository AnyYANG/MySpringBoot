package cn.liuyangjob.InnerClass;

/**
 * Created by  liuyang
 * 2019/8/6    13:24
 * cn.liuyangjob.InnerClass
 * All Right Reserved by liuyang.
 * 在外部怎样去实例花一个新的内部类
 **/

import cn.liuyangjob.InnerClass.OuterClass.InnerClass;
//内部类，可以直接当作类型进行导入
public class GetInnerClassInstants {
    public static void main(String args[]) {
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass innerClass = oc.new InnerClass();
        InnerClass innerClass1= oc.new InnerClass();
    }
}

class OuterClass {
    class InnerClass {

    }
}