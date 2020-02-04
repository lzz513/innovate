package mju.lzz;

import lombok.extern.slf4j.Slf4j;
import mju.lzz.controller.IndexController;
import mju.lzz.manager.UserManager;
import mju.lzz.mapper.UserDOMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

/**
 * @program: innovate
 * @description:
 * @author: linzhizhu
 * @create: 2020-02-02 20:52
 **/
@Slf4j
public class ControllerTest {



	@Test
	public void loginTest() throws NoSuchMethodException {
		long time = new Date().getTime();
		System.out.println(new Date().getTime());
	}

	@Test
	public void appTest() {
		ApplicationContext app = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		UserManager userDOMapper = app.getBean(UserManager.class);
		System.out.println(userDOMapper.queryById(1));
		log.info("end...");
	}

}
