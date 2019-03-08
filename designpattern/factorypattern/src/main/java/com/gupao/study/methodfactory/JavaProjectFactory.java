package com.gupao.study.methodfactory;

import com.gupao.study.interfaces.Project;
import com.gupao.study.interfaces.ProjectFactory;
import com.gupao.study.model.JavaProject;

/**
 * java工程工厂
 * @author rainly
 */
public class JavaProjectFactory implements ProjectFactory {
    /**
     * 建立java工程
     * @return JavaProject
     */
    @Override
    public Project createProject() {
        return new JavaProject();
    }
}
