package com.gupao.study.model;

import com.gupao.study.interfaces.Project;

/**
 * vue项目
 * @author rainly
 */
public class VueProject  implements Project {

    /**
     * 生产内容
     */
    @Override
    public void output(){
        System.out.println("生产vue项目");
    }
}
