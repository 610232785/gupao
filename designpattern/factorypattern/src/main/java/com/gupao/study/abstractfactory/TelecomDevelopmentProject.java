package com.gupao.study.abstractfactory;

import com.gupao.study.abstracts.AbstractDevelopmentProject;
import com.gupao.study.interfaces.Project;

/**
 * 产品实现类 电信开发项目
 */
public class TelecomDevelopmentProject extends AbstractDevelopmentProject implements Project {
    @Override
    public void output() {
        System.out.println("电信开发项目");
    }
}
