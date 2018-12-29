package com.loveumimi.lptm.Hello;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.lang.Object;
public class UserInfoUseSqlList {
    public List<UserInfo> userInfoToList(UserInfoUseSqlRepository userInfoRepository) {
        List<UserInfo> result = userInfoRepository.findByTaskName();
        System.out.println(result);
       // List<UserInfo> list = null;
       // for (Object row : result) {
       //     Object[] rowArray = (Object[]) row;
       //     Map<String, Object> mapArr = new HashMap<String, Object>();
       //     mapArr.put("userid", rowArray[1]);
       //     mapArr.put("avatar", rowArray[2]);
       //     mapArr.put("nickname", rowArray[3]);
       //     list.add((UserInfo) mapArr);
       // }
       // System.out.println(list);
        return result;

    }
}
