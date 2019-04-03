package org.yys.springmvc.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.yys.springmvc.model.User;

/**
 * 这些@Controller称之为注解，需要在
 * @author honey
 *
 */
@Controller
public class UserController {
	Map<String,User> users = new HashMap<String,User>();
	public UserController(){
		System.out.println("----------此刻我们开始使用类的构造函数初始化数据了----start------");
		User liu = new User("liu","123","刘二狗","liudehua@qq.com");
		User ma = new User("ma","321","马德华","madehua@qq.com");
		User zhang = new User("zhang","123","张晓山","zhangxiaoshan@qq.com");
		User li = new User("li","12306","linzhiying","linzhiying@qq.com");
		users.put("user", liu);
		users.put("ma", ma);
		users.put("zhang", zhang);
		users.put("li", li);
		System.out.println("----------此刻我们已经完成使用类的构造函数初始化数据了----end------");
	}
	@RequestMapping(value="hello")
	public String hello(){
		System.out.println("Hello!");
		return "hello";
	}
	
	@RequestMapping(value="userlist")
	public String list(Model model){
		model.addAttribute("userlist", users);
		return "user/list";
	}
	
	/**
	 * 如果需要路径传值就要加上这个注释@PathVariable
	 * @param username
	 * @param model
	 * @return
	 */
	@RequestMapping(value="user/{username}",method=RequestMethod.GET)
	public String show(@PathVariable String username, Model model){
		model.addAttribute("user", users.get(username));
		return "user/detail";
	}
	
	/**
	 * 这种restful风格写法很方便  --- value="{username}/{methodType}"
	 * @param username
	 * @param methodType
	 * @param model
	 * @return
	 */
	@RequestMapping(value="{username}/{methodType}",method=RequestMethod.GET)
	public String toedit(@PathVariable String username,@PathVariable String methodType, Model model){
		User user = new User();
		if("add".equals(methodType)){
			model.addAttribute(user);
			model.addAttribute("methodtype",methodType);
		}else if("update".equals(methodType)){
			model.addAttribute(users.get(username));
		}
		return "user/edit";
	}
	
	@RequestMapping(value="{username}/{methodType}",method=RequestMethod.POST)
	public String edit(@PathVariable String username,@PathVariable String methodType,User user, Model model){
		if("add".equals(methodType)){
			users.put(user.getUsername(), user);
		}else if("update".equals(methodType)){
			users.remove(user.getUsername());
			users.put(user.getUsername(), user);
		}
		return "redirect:/userlist";
	}
	
}




























