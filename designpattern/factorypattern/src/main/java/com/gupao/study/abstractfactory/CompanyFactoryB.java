package com.gupao.study.abstractfactory;

import com.gupao.study.abstracts.AbstractCompanyFactory;
import com.gupao.study.interfaces.Company;
import com.gupao.study.interfaces.Project;

/**
 * 工厂B
 *
 * @author rainly
 */
public class CompanyFactoryB extends AbstractCompanyFactory implements Company {
    /**
     * 生产联通服务项目
     *
     * @return
     */
    @Override
    public Project createServiceProject() {
        return new UnicomServiceProject();
    }

    /**
     * 生产联通开发项目
     *
     * @return
     */
    @Override
    public Project createDevelopmentProject() {
        return new UnicomDevelopmentProject();
    }
}
