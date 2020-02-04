package mju.lzz.controller;

import mju.lzz.manager.UserManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: innovate
 * @description: index
 * @author: linzhizhu
 * @create: 2020-01-31 16:33
 **/
@Slf4j
@Controller
public class IndexController {

	@Autowired
	public UserManager userManager;

	@ResponseBody
	@RequestMapping("index")
	public String index() {
		log.info("welcome");
		return userManager.queryById(1).toString();
	}

	@RequestMapping("login")
	@ResponseBody
	public String isLogin() {
		return "pelease login";
	}

}
