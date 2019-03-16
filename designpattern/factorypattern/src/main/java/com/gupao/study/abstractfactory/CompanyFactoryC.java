package com.gupao.study.abstractfactory;

import com.gupao.study.abstracts.AbstractCompanyFactory;
import com.gupao.study.interfaces.Company;
import com.gupao.study.interfaces.Project;

/**
 * 工厂C
 *
 * @author rainly
 */
public class CompanyFactoryC extends AbstractCompanyFactory implements Company {
    /**
     * 生产电信服务项目
     *
     * @return
     */
    @Override
    public Project createServiceProject() {
        return new TelecomServiceProject();
    }

    /**
     * 生产电信开发项目
     *
     * @return
     */
    @Override
    public Project createDevelopmentProject() {
        return new TelecomDevelopmentProject();
    }
}
