package k.m.demo.service;

import java.util.List;

import k.m.demo.model.SysUser;
import k.m.demo.model.cohelpUser;
import k.m.demo.model.waterUser;

public interface UserService {
	public List<SysUser> getAllUsers();
	public int courier_help(cohelpUser user);
	public int online_buy_water(waterUser user);
}
