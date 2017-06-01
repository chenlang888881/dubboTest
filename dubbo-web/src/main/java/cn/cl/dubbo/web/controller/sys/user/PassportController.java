package cn.cl.dubbo.web.controller.sys.user;

import cn.cl.dubbo.dto.biz.sys.ResultDto;
import cn.cl.dubbo.dto.biz.sys.user.userinfo.UsrUser;
import cn.cl.dubbo.interfaces.biz.sys.user.UserService;
import com.alibaba.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by chenlang on 2017/5/26.
 */
@Controller
@RequestMapping("/hello")
public class PassportController {

    @DubboReference
    private UserService userService;

    @RequestMapping(value = "/first", method = RequestMethod.GET)
    public String first(UsrUser usrUser, Map map){
        System.out.println(usrUser.getUsername() + " "+ usrUser.getPassword());

        ResultDto resultDto = userService.getLoginUserByUserName(usrUser.getUsername());
        map.put("result", resultDto);
        return "/hello";
    }
}
