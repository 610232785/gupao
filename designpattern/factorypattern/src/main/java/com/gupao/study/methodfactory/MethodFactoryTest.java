package com.gupao.study.methodfactory;

import com.gupao.study.interfaces.Project;
import com.gupao.study.interfaces.ProjectFactory;

/**
 * 方法工厂测试
 *
 * @author rainly
 */
public class MethodFactoryTest {
    public static void main(String[] args) {
        ProjectFactory projectFactory = new JavaProjectFactory();
        Project project = projectFactory.createProject();
        project.output();
    }
}
