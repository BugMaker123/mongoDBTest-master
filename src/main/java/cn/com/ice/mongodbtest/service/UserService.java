package cn.com.ice.mongodbtest.service;

import cn.com.ice.mongodbtest.entity.User;

public interface UserService {

    void add(User user);

    User findData(User user);
}
