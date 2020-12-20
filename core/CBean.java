package com.company;

import main.java.com.company.ABean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CBean {
    private final ABean aBean;
    public CBean(ABean aBean) {
        this.aBean = aBean;
    }

    public ABean getaBean() {
        return aBean;
    }
}
