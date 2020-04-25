package cn.theo.gmall.order.controller;

import cn.theo.gmall.bean.UserAddress;
import cn.theo.gmall.service.UserInfoService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

//    @Autowired
    @Reference
    private UserInfoService userInfoService;

    @RequestMapping("trade")
    @ResponseBody
    public List<UserAddress> trade(String userId){
        return userInfoService.findUserAddressByUserId(userId);
    }
}
