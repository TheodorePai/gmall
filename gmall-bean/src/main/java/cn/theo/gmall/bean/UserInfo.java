package cn.theo.gmall.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * user_info
 * 用户表
 * @author Theodore 2020-04-24 23:08:12
 * @version 1.0

user_info(用户表)
------------------------------------------
id(编号)                  PKInteger   //<<自增长>>
login_name(用户名称)      String(200)
nick_name(用户昵称)       String(200)
passwd(用户密码)          String(200)
name(用户姓名)            String(200)
phone_num(手机号)         String(200)
email(邮箱)               String(200)
head_img(头像)            String(200)
user_level(用户级别)      String(200)
 */
public class UserInfo implements Serializable {
    /**
     * 编号
     */
    @Id
    @Column
    private Integer id;
    /**
     * 用户名称
     */
    @Column
    private String loginName;
    /**
     * 用户昵称
     */
    @Column
    private String nickName;
    /**
     * 用户密码
     */
    @Column
    private String passwd;
    /**
     * 用户姓名
     */
    @Column
    private String name;
    /**
     * 手机号
     */
    @Column
    private String phoneNum;
    /**
     * 邮箱
     */
    @Column
    private String email;
    /**
     * 头像
     */
    @Column
    private String headImg;
    /**
     * 用户级别
     */
    @Column
    private String userLevel;

    public UserInfo() {
    }

    public UserInfo(Integer id, String loginName, String nickName, String passwd, String name, String phoneNum, String email, String headImg, String userLevel) {
        this.id = id;
        this.loginName = loginName;
        this.nickName = nickName;
        this.passwd = passwd;
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
        this.headImg = headImg;
        this.userLevel = userLevel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", passwd='" + passwd + '\'' +
                ", name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                ", headImg='" + headImg + '\'' +
                ", userLevel='" + userLevel + '\'' +
                '}';
    }
}
