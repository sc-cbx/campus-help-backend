package k.m.demo.service;

import javax.servlet.http.HttpSession;

import k.m.demo.model.User;

public interface MessageService {
	public int message(User user,HttpSession session);

	

}