package cn.theo.gmall.service;

import cn.theo.gmall.bean.UserAddress;
import cn.theo.gmall.bean.UserInfo;

import java.util.List;

public interface UserInfoService {

    /*查询所有用户数据*/
    List<UserInfo> findAll();

    /*根据用户id查询用户地址*/
    List<UserAddress> findUserAddressByUserId(String id);
}
