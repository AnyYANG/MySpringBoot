package cn.liuyangjob.ClassTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by  liuyang
 * 2019/9/3    10:04
 * cn.liuyangjob.ClassTest
 * All Right Reserved by liuyang.
 **/

public class Fanxing {
    class a {
    }

    class b extends a {
    }

    class c extends b {
    }

    public void test() {
        List<a> aList = new ArrayList<a>();
        List<b> bList = new ArrayList<b>();
        List<c> cList = new ArrayList<c>();
        // 错误点对点直接赋值  aList =bList; bList =cList;
        //  点对点的赋值如果类型不匹配必须是错误

        List<? extends a> listbase;    //是指小于等于a的子类  就是继承自a的子类 包括a本身
        //继承a的子类必须要
        // 目标类型<=a
        listbase = aList;
        listbase = bList;
        listbase = cList;

        //要求必须大于c的父类，包含c
        //  目标类型>= c
        List<? super c> listextend;
        listextend = aList;
        listextend = bList;
        listextend = cList;

        //List既是点也是范围，当表示范围时，表示最大范围。
        // 等价于 List<?>.
        List list = aList;
        list = bList;

        //List<Object> list 是点 所以 不能对点。
        //List<Object> listobject = aList;


    }
}
