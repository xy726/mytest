package cn.itcast.core.mapper;

import java.util.List;

import cn.itcast.core.po.User;

public interface UserMapper {

	
	/**
	 * 查询所有用户
	 * @return
	 */
	List<User> queryUser();
	
	/**
	 * 添加用户 
	 * @param user
	 */

}