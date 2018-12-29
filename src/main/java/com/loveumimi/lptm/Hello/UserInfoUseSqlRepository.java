package com.loveumimi.lptm.Hello;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserInfoUseSqlRepository extends JpaRepository<UserInfo, Long> {
    @Query(value = "select * from UserInfo", nativeQuery = true)
    List<UserInfo> findByTaskName();
}
