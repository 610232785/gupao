package com.gupao.study.lazy;

/**
 * 懒汉内部类单例
 * <p>懒汉双重检查锁单例的优化</p>
 * <p>优点:</p>
 * <p>规避了synchronized性能问题以及饿汉单例的资源浪费问题</p>\
 * <p>执行顺序</p>
 * <p>1、LazyInnerClassSingleton被调用时，内部类LazyInnerClassSingleton不会被调用</p>
 * <p>2、当调用getInstance方法时，会先调用内部类InnerClass</p>
 * <p>3、内部类InnerClas初始化属性也就是初始化LazyInnerClassSingleton对象</p>
 * <p>4、getInstance方法再返回值，也就是LazyInnerClassSingleton对象</p>
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){

    }

    private static class InnerClass{
        private static final LazyInnerClassSingleton lazyInnerClassSingleton = new LazyInnerClassSingleton();
    }

    //static 是为了使单例的空间共享
    //final 保证这个方法不会被重写，重载
    public static final LazyInnerClassSingleton getInstance(){
        //在返回结果以前，一定会先加载内部类
        return InnerClass.lazyInnerClassSingleton;
    }
}
