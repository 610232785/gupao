package com.gupao.study.hungry;

/**
 * 饿汉单例
 * @author rainly
 * <p>在类加载时就初始化对象，未被线程调用就已实例化对象，所以线程安全</p>
 * <p>优点：线程安全、无锁，已经已经实例化，不需要调用时再初始化，执行效率高</p>
 * <p>缺点：占据内存，若对象不被使用则浪费内存空间</p>
 * <p>编写流程：</p>
 * <p>(1)先静态再动态</p>
 * <p>(2)先属性后方法</p>
 * <p>(3)执行顺序从上往下</p>
 */
public class HungrySingleton {

    private static final HungrySingleton hungry = new HungrySingleton();

    /**
     * 构造方法私有
     */
    private HungrySingleton(){

    }

    /**
     * 提供实例对象的返回方法
     * @return
     */
    public static HungrySingleton getInstance(){
        return hungry;
    }
}
