package com.gupao.study.enums;

/**
 * 枚举单例
 * @author rainly
 * <p>优点:</p>
 * <p>1、线程安全</p>
 * <p>通过类加载机制保证</p>
 * <p>2、不会因为序列化而产生新实例</p>
 * <p>当前类自己实现了readResolve()方法</p>
 * <p>3、防止反射攻击</p>
 * <p>因为单例类的修饰是abstract的，所以没法实例化。</p>
 */
public enum EnumSingleton {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }


}
