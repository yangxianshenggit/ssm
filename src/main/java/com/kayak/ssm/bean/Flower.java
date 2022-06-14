package com.kayak.ssm.bean;

import org.springframework.stereotype.Component;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ProjectName: ssm
 * @Package: com.kayak.ssm.bean
 * @Description: java类作用描述
 * @Author: yangshuai
 * @CreateDate: 2022/6/13 17:02
 * @Version 1.0
 */
@Component
@Table(name = "t_flower")
public class Flower {
    @Id
    private String fid;
    private String fname;
    private String price;
    private String cid;

    public Flower() {
    }

    public Flower(String fid, String fname, String price, String cid) {
        this.fid = fid;
        this.fname = fname;
        this.price = price;
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "fid='" + fid + '\'' +
                ", fname='" + fname + '\'' +
                ", price='" + price + '\'' +
                ", cid='" + cid + '\'' +
                '}';
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
}
