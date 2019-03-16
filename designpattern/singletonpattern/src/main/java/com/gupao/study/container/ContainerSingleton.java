package com.gupao.study.container;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器单例（注册式单例）
 * 将多种单例类型注入到一个统一的管理类，在使用时根据key获取对象对应类型的对象
 * <p>优点：</p>
 *
 */
public class ContainerSingleton {

    private ContainerSingleton() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getInstance(String className) {
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            } else {
                return ioc.get(className);
            }
        }
    }
}
