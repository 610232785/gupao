package com.gupao.study.simplefactory;

import com.gupao.study.enums.ProjectType;
import com.gupao.study.interfaces.Project;
import com.gupao.study.model.*;

/**
 * 简单工厂
 *
 * @author rainly
 */
public class SimpleFactory {

    /**
     * 通过类名建立项目
     *
     * @param name
     * @return
     */
    public Project createByName(String name) {
        switch (name) {
            case "JavaProject":
                return new JavaProject();
            case "PythonProject":
                return new PythonProject();
            case "ReactProject":
                return new ReactProject();
            case "AngularProject":
                return new AngularProject();
            case "VueProject":
                return new VueProject();
            default:
                return null;
        }
    }

    /**
     * 根据项目枚举创建项目
     *
     * @param type
     * @return
     */
    public Project createByEnum(ProjectType type) {
        switch (type) {
            case JavaProject:
                return new JavaProject();
            case PythonProject:
                return new PythonProject();
            case ReactProject:
                return new ReactProject();
            case AngularProject:
                return new AngularProject();
            case VueProject:
                return new VueProject();
            default:
                return null;
        }
    }

    /**
     * 通过类名建立对象
     *
     * @param clzz
     * @return
     */
    public Project creatByClzz(Class<? extends Project> clzz) {
        if (null != clzz) {
            try {
                return clzz.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
