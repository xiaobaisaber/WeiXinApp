package com.cn.hnust.dao;

import com.cn.hnust.pojo.UserPojo;

/**
 * Created by baiyang
 * Email: 1419408386@qq.com
 * Creation time : 2016/10/19
 */
public interface IUserPojoDao {
    public int insertUser(UserPojo userPojo);
    public UserPojo selectUserMessage(String openid);

}
