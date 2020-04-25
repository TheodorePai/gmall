package cn.theo.gmall.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * user_address
 * 用户地址表
 * @author Theodore 2020-04-25 9:42:05
 * @version 1.0

user_address(用户地址表)
---------------------------------------------
id(编号)                     PKInteger   //<<自增长>>
user_address(用户地址)       String(500)
user_id(用户id)              Integer
consignee(收件人)            String(40)
phone_num(联系方式)          String(40)
is_default(是否是默认)       String(1)


 */
public class UserAddress implements Serializable {
    /**
     * 编号
     */
    @Id
    @Column
    private Integer id;
    /**
     * 用户地址
     */
    @Column
    private String userAddress;
    /**
     * 用户id
     */
    @Column
    private Integer userId;
    /**
     * 收件人
     */
    @Column
    private String consignee;
    /**
     * 联系方式
     */
    @Column
    private String phoneNum;
    /**
     * 是否是默认
     */
    @Column
    private String isDefault;

    public UserAddress() {
    }

    public UserAddress(Integer id, String userAddress, Integer userId, String consignee, String phoneNum, String isDefault) {
        this.id = id;
        this.userAddress = userAddress;
        this.userId = userId;
        this.consignee = consignee;
        this.phoneNum = phoneNum;
        this.isDefault = isDefault;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "id=" + id +
                ", userAddress='" + userAddress + '\'' +
                ", userId=" + userId +
                ", consignee='" + consignee + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", isDefault='" + isDefault + '\'' +
                '}';
    }
}
