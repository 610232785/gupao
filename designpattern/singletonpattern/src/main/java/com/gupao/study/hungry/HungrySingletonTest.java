package com.gupao.study.hungry;

/**
 * 饿汉单例测试类
 * @author rainly
 */
public class HungrySingletonTest {
    HungrySingleton hungrySingleton = HungrySingleton.getInstance();

    HungryStaticSingleton hungryStaticSingleton = HungryStaticSingleton.getInstance();
}
