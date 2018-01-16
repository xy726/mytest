package cn.itcast.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.core.po.User;
import cn.itcast.core.service.UserService;

/**
 * @ClassName: UserController 
 * @Description: 用户控制器
 * @author xy
 *
 */
@Controller
public class UserController {
	
	//注入用户service
	@Autowired
	private UserService userService;
	
	//1.查询用户列表}
	@RequestMapping("/list")
	public String list(Model model){
		//查询数据库中的商品
		List<User> userList = this.userService.findUserList();
		
		model.addAttribute("userList", userList);
		return "list";
	}
	
}
