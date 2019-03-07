package com.gupao.study.model;

import com.gupao.study.interfaces.Project;

/**
 * java项目
 * @author rainly
 */
public class JavaProject implements Project {

    /**
     * 生产内容
     */
    @Override
    public void output(){
        System.out.println("生产java项目");
    }
}
