package cn.nlr.service;

import cn.nlr.model.User;

public interface UserService {
	public void saveUser(User user);
	public User getUserInfo(String name);
	public User findUser(String name);
	public void update(int id,String name);
	public User findUserById(int id);
}
