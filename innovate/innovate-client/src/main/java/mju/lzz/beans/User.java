package mju.lzz.beans;

import lombok.Data;

/**
 * @program: innovate
 * @description: user
 * @author: linzhizhu
 * @create: 2020-01-31 19:11
 **/
@Data
public class User {
	private Integer id;
	private String username;
	private String password;
	private String headPath;
}
