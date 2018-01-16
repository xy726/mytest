package cn.itcast.core.service;

import java.util.List;

import cn.itcast.core.po.User;

/**
 * @ClassName: UserService 
 * @Description: 用户service接口
 * @author xy
 *
 */
public interface UserService {

	//查询用户列表
	List<User> findUserList();
	
	//将表单中输入的数据保存数据库
	
}
