package cn.com.ice.mongodbtest.service.impl;

import cn.com.ice.mongodbtest.dao.UserMongoDbDao;
import cn.com.ice.mongodbtest.entity.User;
import cn.com.ice.mongodbtest.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMongoDbDao userMongoDbDao;

    @Override
    public void add(User user) {
        log.info("add data start -======");
        userMongoDbDao.save(user);
        log.info("add data success -======end");
    }

    @Override
    public User findData(User user) {
        return userMongoDbDao.queryOne(user);
    }


    public User queryByChildField(User user){
        return null;
    }
}
