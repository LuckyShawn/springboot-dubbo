package com.shawn.malluserserviceprovider.service.impl;



import com.shawn.bean.UserAddress;
import com.shawn.service.UserService;

import java.util.Arrays;
import java.util.List;


public class UserServiceImpl2 implements UserService {

	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("UserServiceImpl.....new...");
		// TODO Auto-generated method stub
		UserAddress address1 = new UserAddress(1, "深圳市龙岗区", "1", "shawn", "888888", "Y");
		UserAddress address2 = new UserAddress(2, "深圳市宝安区", "1", "jack", "999999", "N");

		return Arrays.asList(address1,address2);
	}

}
