package cn.com.ice.mongodbtest.result;

import java.io.Serializable;

/**
 * @Author: Hamsun
 * @Date: 2020/8/5 11:04
 */
public interface IResultCode extends Serializable {

    String getMessage();

    int getCode();
}
