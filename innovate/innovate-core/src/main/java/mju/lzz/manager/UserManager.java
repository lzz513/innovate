package mju.lzz.manager;

import mju.lzz.beans.User;

/**
 * @program: innovate
 * @description: user service
 * @author: linzhizhu
 * @create: 2020-01-31 16:35
 **/

public interface UserManager {
	User queryById(Integer id);
}