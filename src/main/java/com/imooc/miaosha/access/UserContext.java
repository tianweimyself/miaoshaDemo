package com.imooc.miaosha.access;

import com.imooc.miaosha.domain.MiaoshaUser;

public class UserContext {
	
	private static ThreadLocal<MiaoshaUser> userHolder = new ThreadLocal<MiaoshaUser>(); //ThreadLocal与当前线程绑定，当前线程放当前user
	
	public static void setUser(MiaoshaUser user) {
		userHolder.set(user);
	}
	
	public static MiaoshaUser getUser() {
		return userHolder.get();
	}

}
