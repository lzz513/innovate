package mju.lzz.manager.impl;

import mju.lzz.beans.User;
import mju.lzz.manager.UserManager;
import mju.lzz.mapper.UserDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: innovate
 * @description:
 * @author: linzhizhu
 * @create: 2020-02-04 14:14
 **/
@Service
public class UserManagerImpl implements UserManager {

	@Autowired
	private UserDOMapper userMapper;

	public User queryById(Integer id) {
		return userMapper.queryById(id);
	}

}
