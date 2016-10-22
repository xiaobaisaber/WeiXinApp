package com.cn.hnust.pojo;

/**
 * Created by baiyang
 * Email: 1419408386@qq.com
 * Creation time : 2016/10/19
 */
public class UserPojo {
    private String username;
    private String password;
    private String companyname;
    private Integer id;
    //微信身份唯一标识 入库
    private String openid;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserPojo{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", companyname='" + companyname + '\'' +
                ", id=" + id +
                '}';
    }
}
