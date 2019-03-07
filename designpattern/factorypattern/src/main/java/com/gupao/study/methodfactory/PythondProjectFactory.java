package com.gupao.study.methodfactory;

import com.gupao.study.interfaces.Project;
import com.gupao.study.model.PythonProject;

/**
 * python工程工厂
 * @author rainly
 */
public class PythondProjectFactory implements ProjectFactory {
    /**
     * 建立Python项目
     * @return PythonProject
     */
    @Override
    public Project createProject() {
        return new PythonProject();
    }
}
