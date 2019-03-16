package com.gupao.study.model;

import com.gupao.study.interfaces.Project;

/**
 * python项目
 *
 * @author rainly
 */
public class PythonProject implements Project {

    /**
     * 生产内容
     */
    @Override
    public void output() {
        System.out.println("生产python项目");
    }
}
