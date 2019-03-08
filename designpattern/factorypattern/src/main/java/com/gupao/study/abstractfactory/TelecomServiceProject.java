package com.gupao.study.abstractfactory;

import com.gupao.study.abstracts.AbstractServiceProject;
import com.gupao.study.interfaces.Project;

/**
 * 产品实现类 电信服务项目
 */
public class TelecomServiceProject extends AbstractServiceProject implements Project {
    @Override
    public void output() {
        System.out.println("电信维护项目");
    }
}
