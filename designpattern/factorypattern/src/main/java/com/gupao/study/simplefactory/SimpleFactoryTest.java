package com.gupao.study.simplefactory;

import com.gupao.study.enums.ProjectType;
import com.gupao.study.interfaces.Project;
import com.gupao.study.model.JavaProject;

/**
 * 简单工厂测试
 * @author rainly
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory0 = new SimpleFactory();
        Project project0 = simpleFactory0.createByName("JavaProject");
        project0.output();

        SimpleFactory simpleFactory1 = new SimpleFactory();
        Project project1 = simpleFactory1.createByEnum(ProjectType.JavaProject);
        project1.output();

        SimpleFactory simpleFactory2 = new SimpleFactory();
        Project project2 = simpleFactory2.creatByClzz(JavaProject.class);
        project2.output();
    }
}
