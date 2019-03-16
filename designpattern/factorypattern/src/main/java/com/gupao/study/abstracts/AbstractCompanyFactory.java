package com.gupao.study.abstracts;

import com.gupao.study.interfaces.Project;

/**
 * 抽象超级工厂
 *
 * @author rainly
 */
abstract public class AbstractCompanyFactory {
    /**
     * 创建维护项目
     *
     * @return
     */
    public abstract Project createServiceProject();

    /**
     * 创建开发项目
     *
     * @return
     */
    public abstract Project createDevelopmentProject();
}
