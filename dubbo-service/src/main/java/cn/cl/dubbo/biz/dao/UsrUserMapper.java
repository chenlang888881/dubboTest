package cn.cl.dubbo.biz.dao;

import cn.cl.dubbo.dto.biz.sys.user.userinfo.UsrUser;

import java.util.List;

public interface UsrUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UsrUser record);

    int insertSelective(UsrUser record);

    UsrUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UsrUser record);

    int updateByPrimaryKey(UsrUser record);

    UsrUser getLoginUserByUserName(String username);

    List<UsrUser> getAllUserList();
}