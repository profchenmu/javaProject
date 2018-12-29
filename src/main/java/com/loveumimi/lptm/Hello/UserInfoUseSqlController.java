package com.loveumimi.lptm.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/userInfoUseSql")
public class UserInfoUseSqlController {
    @Autowired
    private UserInfoUseSqlRepository userInfoRepository;
    @GetMapping(path = "/alla")
    public @ResponseBody List<UserInfo> getAllUsers() {
        UserInfoUseSqlList userInfolist = new UserInfoUseSqlList();
        return userInfolist.userInfoToList(userInfoRepository);
    }
   // public @ResponseBody
   // List getAllUserInfo() {
   //     return userInfoRepository.findByTaskName();
   // }
}
