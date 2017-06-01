package cn.cl.dubbo.biz.service.sys.user;

import cn.cl.dubbo.biz.dao.UsrUserMapper;
import cn.cl.dubbo.common.utils.contants.ResultCode;
import cn.cl.dubbo.dto.biz.sys.ResultDto;
import cn.cl.dubbo.dto.biz.sys.user.userinfo.UsrUser;
import cn.cl.dubbo.interfaces.biz.sys.user.UserService;
import com.alibaba.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by chenlang on 2017/5/25.
 */
@DubboService
public class UserServiceImpl implements UserService{


    @Autowired
    private UsrUserMapper usrUserMapper;

    public ResultDto getLoginUserByUserName(String userName) {
        UsrUser user = usrUserMapper.getLoginUserByUserName(userName);
        return new ResultDto(ResultCode.SUCCESS, user);
    }
}
