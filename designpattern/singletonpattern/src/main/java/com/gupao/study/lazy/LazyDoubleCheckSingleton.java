package com.gupao.study.lazy;

/**
 * 懒汉双重检查锁单例
 * @author rainly
 * <p>懒汉单例的优化</p>
 * <p>优点:</p>
 * <p>保证线程安全</p>
 * <p>缺点:</p>
 * <p>加上了锁，效率低</p>
 */
public class LazyDoubleCheckSingleton {

    /**
     * volatile
     * 再类加载时，会发生重排序，也就是下面的2，3顺序调转
     * 1.分配内存给这个对象
     * 2.初始化对象
     * 3.设置lazy指向刚分配的内存地址
     * 4.初次访问对象
     */
    private static volatile LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton(){

    }

    /**
     * 双重检查锁
     * @return
     */
    public static final LazyDoubleCheckSingleton getInstance(){
        if (lazyDoubleCheckSingleton == null){
            //同步块，只运行一个线程执行
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
