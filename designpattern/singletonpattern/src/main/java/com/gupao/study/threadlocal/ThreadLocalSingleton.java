package com.gupao.study.threadlocal;

/**
 * 线程本地单例
 * ThreadLocal，很多地方叫做线程本地变量，也有些地方叫做线程本地存储
 * <p>优点：</p>
 * <p>在一个线程内多次初始化都是同一个对象</p>
 * <p>缺点：</p>
 * <p>并不是真正的线程安全，在不同的线程的初始化对象是不一样的</p>
 */
public class ThreadLocalSingleton {

    private ThreadLocalSingleton() {

    }

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>() {
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }
}
