package cn.liuyangjob.Reference;

import java.lang.ref.SoftReference;

/**
 * Created by  liuyang
 * 2019/7/30    18:05
 * cn.liuyangjob.Reference
 * All Right Reserved by liuyang.
 **/

public class ReferenceTest {
    public static void main(String args[]) {
        String str=new String("abc");                                     // 强引用
        SoftReference<String> softRef=new SoftReference<String>(str);

    }
}
