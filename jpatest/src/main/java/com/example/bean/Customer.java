package com.example.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author qianhao
 * @create 2020/5/4-22:54
 */
@Entity
@Table(name = "cst_customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cust_id")
    private Long custId;

    @Column(name = "cust_name")
    private String custName;

    @Column(name = "cust_source")
    private String custSource;

    @Column(name = "cust_level")
    private String custLevel;

    @Column(name = "cust_industry")
    private String custIndustry;

    @Column(name = "cust_phone")
    private String custPhone;

    @Column(name = "cust_address")
    private String custAddress;

    public Customer() {
    }

    public Customer(Long custId, String custName, String custSource, String custLevel, String custIndustry, String custPhone, String custAddress) {
        this.custId = custId;
        this.custName = custName;
        this.custSource = custSource;
        this.custLevel = custLevel;
        this.custIndustry = custIndustry;
        this.custPhone = custPhone;
        this.custAddress = custAddress;
    }

    public Long getCustId() {
        return custId;
    }

    public Customer setCustId(Long custId) {
        this.custId = custId;
        return this;
    }

    public String getCustName() {
        return custName;
    }

    public Customer setCustName(String custName) {
        this.custName = custName;
        return this;
    }

    public String getCustSource() {
        return custSource;
    }

    public Customer setCustSource(String custSource) {
        this.custSource = custSource;
        return this;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public Customer setCustLevel(String custLevel) {
        this.custLevel = custLevel;
        return this;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public Customer setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
        return this;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public Customer setCustPhone(String custPhone) {
        this.custPhone = custPhone;
        return this;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public Customer setCustAddress(String custAddress) {
        this.custAddress = custAddress;
        return this;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", custSource='" + custSource + '\'' +
                ", custLevel='" + custLevel + '\'' +
                ", custIndustry='" + custIndustry + '\'' +
                ", custPhone='" + custPhone + '\'' +
                ", custAddress='" + custAddress + '\'' +
                '}';
    }
}
