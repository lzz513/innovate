package mju.lzz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: innovate
 * @description: user
 * @author: linzhizhu
 * @create: 2020-02-01 21:39
 **/
@Controller
public class UserController {

	@RequestMapping("findUser")
	public String findUser() {
		return "login.html";
	}

	@ResponseBody
	@RequestMapping("findAll")
	public String findAll() {
		return "login.html";
	}
}
