package cn.theo.gmall.usermanage.service.impl;

import cn.theo.gmall.bean.UserAddress;
import cn.theo.gmall.bean.UserInfo;
import cn.theo.gmall.usermanage.mapper.UserAddressMapper;
import cn.theo.gmall.usermanage.mapper.UserInfoMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements cn.theo.gmall.service.UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserAddress> findUserAddressByUserId(String id) {
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(1);
        return userAddressMapper.select(userAddress);
    }
}
