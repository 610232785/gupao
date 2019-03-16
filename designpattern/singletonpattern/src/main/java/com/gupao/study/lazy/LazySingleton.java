package com.gupao.study.lazy;

/**
 * 懒汉式单例
 * @author rainly
 * 被外部调用时再实例化对象
 * <p>优点：</p>
 * <p>减少内存开销</p>
 * <p>缺点：</p>
 * <p>在多线程状态下，无法保持同一个对象</p>
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
            return lazySingleton;
        }
        return lazySingleton;
    }


}
