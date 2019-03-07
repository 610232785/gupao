package com.gupao.study.model;

import com.gupao.study.interfaces.Project;

/**
 * react项目
 * @author rainly
 */
public class ReactProject  implements Project {

    /**
     * 生产内容
     */
    @Override
    public void output(){
        System.out.println("生产react项目");
    }
}
