package com.gupao.study.abstractfactory;

import com.gupao.study.interfaces.Company;

/**
 * @author rainly
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        Company companyFactoryA = new CompanyFactoryA();
        companyFactoryA.createDevelopmentProject().output();
        companyFactoryA.createServiceProject().output();

        Company companyFactoryB = new CompanyFactoryB();
        companyFactoryB.createDevelopmentProject().output();
        companyFactoryB.createServiceProject().output();

        Company companyFactoryC = new CompanyFactoryC();
        companyFactoryC.createDevelopmentProject().output();
        companyFactoryC.createServiceProject().output();
    }
}
