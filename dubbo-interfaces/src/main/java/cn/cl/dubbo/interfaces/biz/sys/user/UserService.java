package cn.cl.dubbo.interfaces.biz.sys.user;

import cn.cl.dubbo.dto.biz.sys.ResultDto;

/**
 * Created by chenlang on 2017/5/25.
 */
public interface UserService {

    ResultDto getLoginUserByUserName(String userName) ;
}
