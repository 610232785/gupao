package com.gupao.study.abstractfactory;

import com.gupao.study.abstracts.AbstractServiceProject;
import com.gupao.study.interfaces.Project;

/**
 * 产品实现类 联通服务项目
 */
public class UnicomServiceProject extends AbstractServiceProject implements Project {
    @Override
    public void output() {
        System.out.println("联通维护项目");
    }
}
