package com.barisozkan.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.barisozkan.config.AppConfig;
import com.barisozkan.entity.User;
import com.barisozkan.services.LoginService;
import com.barisozkan.services.UserService;

public class MainClass {

	public static void main(String[] args) {

		//bu ilk satırdaki yapıda @ configuration anatasyonu ile isaretlemis oldugumuz classın ismini ister.
		//tabi bu sadece tek yöntemi degil bu yontemlerden biri
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); //
		UserService userService = context.getBean(UserService.class);
		//bu yukarıdaki 2 satırda AppConfig de olusturdugumuz Spring Context yapısını context fieldı ile çektik
		//ve bu contextin icinde yer alan bean yani olusturudugumuz UserService beani get yani al dedik.
		
		//System.out.println(userService.getUserList());
		
		// ya da
		
		for (User user : userService.getUserList()) {
			System.out.println(user);
		}
		
		LoginService loginService = new LoginService();
		loginService.Login();
	}

}
