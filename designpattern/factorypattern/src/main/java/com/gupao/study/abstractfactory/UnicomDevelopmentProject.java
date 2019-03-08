package com.gupao.study.abstractfactory;

import com.gupao.study.abstracts.AbstractDevelopmentProject;
import com.gupao.study.interfaces.Project;

/**
 * 产品实现类 联通开发项目
 */
public class UnicomDevelopmentProject extends AbstractDevelopmentProject implements Project {
    @Override
    public void output() {
        System.out.println("联通开发项目");
    }
}
