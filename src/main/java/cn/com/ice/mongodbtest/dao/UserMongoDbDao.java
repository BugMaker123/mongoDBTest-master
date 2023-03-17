package cn.com.ice.mongodbtest.dao;

import cn.com.ice.mongodbtest.dao.base.MongoDbDao;
import cn.com.ice.mongodbtest.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserMongoDbDao extends MongoDbDao<User> {
    @Override
    protected Class<User> getEntityClass() {
        return User.class;
    }
}
