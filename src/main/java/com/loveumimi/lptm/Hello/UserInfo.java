package com.loveumimi.lptm.Hello;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
public class UserInfo {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String nickname;
    private String userid;
    private String avatar;
    public String getNickName(){
        return nickname;
    }
    public void setNickName(String nickname){
        this.nickname = nickname;
    }
    public String getAvatar(){
        return avatar;
    }
    public void setAvatar(String avatar){
        this.avatar = avatar;
    }
    public String getUserId(){
        return userid;
    }
    public void setUserId(String userid){
        this.userid = userid;
    }
}
