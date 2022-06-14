package com.kayak.ssm.bean;


import org.springframework.stereotype.Component;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ProjectName: ssm
 * @Package: com.kayak.ssm.bean
 * @Description: java类作用描述
 * @Author: yangshuai
 * @CreateDate: 2022/6/13 17:01
 * @Version 1.0
 */
@Component
@Table(name="t_category")
public class Category {
    @Id
    private String cid;
    private String cname;

    public Category() {
    }

    public Category(String cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Category{" +
                "cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                '}';
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
