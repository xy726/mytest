package cn.itcast.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.core.mapper.UserMapper;
import cn.itcast.core.po.User;
import cn.itcast.core.service.UserService;

/**
 * @ClassName: UserServiceImpl 
 * @Description: 用户service接口实现
 * @author xy
 *
 */
@Service
public class UserServiceImpl implements UserService{
	
	//注入用户mapper
	@Autowired
	private UserMapper userMapper;

	//查询用户列表
	public List<User> findUserList() {
		List<User> list = userMapper.queryUser();
		return list;
	}


	//将表单中输入的数据保存数据库
	
}
