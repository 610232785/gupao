package com.gupao.study.abstractfactory;

import com.gupao.study.abstracts.AbstractServiceProject;
import com.gupao.study.interfaces.Project;

/**
 * 产品实现类 移动服务项目
 */
public class CmccServiceProject extends AbstractServiceProject implements Project {
    @Override
    public void output() {
        System.out.println("移动维护项目");
    }
}
