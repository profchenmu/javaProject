package com.loveumimi.lptm.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.loveumimi.lptm.Hello.Successful;
@Controller
@RequestMapping(path = "/userInfo")
public class UserInfoController {
    @Autowired
    private UserInfoRepository userInfoRepository;
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<UserInfo> getAllUsers() {
        return userInfoRepository.findAll();
    }
    @GetMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody Successful addNewUserInfo (
            @RequestParam String nickName,
            @RequestParam String avatar,
            @RequestParam String userId) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        UserInfo n = new UserInfo();
        n.setNickName(nickName);
        n.setAvatar(avatar);
        n.setUserId(userId);
        userInfoRepository.save(n);
        return new Successful(1, "successful");
    }
}
