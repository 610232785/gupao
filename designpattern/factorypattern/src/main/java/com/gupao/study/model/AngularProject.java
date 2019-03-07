package com.gupao.study.model;

import com.gupao.study.interfaces.Project;

/**
 * angular项目
 * @author rainly
 */
public class AngularProject implements Project {

    /**
     * 生产内容
     */
    @Override
    public void output(){
        System.out.println("生产angular项目");
    }
}
