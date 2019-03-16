package com.gupao.study.hungry;

/**
 * 饿汉静态代码块单例
 * @author rainly
 * 和饿汉单例类似
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungrySingleton;

    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){

    }

    public static HungryStaticSingleton getInstance(){
        return hungrySingleton;
    }
}
