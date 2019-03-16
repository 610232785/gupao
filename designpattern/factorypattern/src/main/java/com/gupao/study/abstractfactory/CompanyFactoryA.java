package com.gupao.study.abstractfactory;

import com.gupao.study.abstracts.AbstractCompanyFactory;
import com.gupao.study.interfaces.Company;
import com.gupao.study.interfaces.Project;

/**
 * 工厂A
 *
 * @author rainly
 */
public class CompanyFactoryA extends AbstractCompanyFactory implements Company {
    /**
     * 生产移动服务项目
     *
     * @return
     */
    @Override
    public Project createServiceProject() {
        return new CmccServiceProject();
    }

    /**
     * 生产移动开发项目
     *
     * @return
     */
    @Override
    public Project createDevelopmentProject() {
        return new CmccDevelopmentProject();
    }
}
