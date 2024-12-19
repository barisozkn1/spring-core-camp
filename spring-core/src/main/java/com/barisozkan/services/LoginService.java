package com.barisozkan.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.barisozkan.config.AppConfig;

public class LoginService {

	public void Login() {
		//user listesine ihtiyacım var bunu almam lazım
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); //
		UserService userService = context.getBean(UserService.class);
		/*bu main classında da yaptıgımız mantıkla olusturdugumuz spring contexten verileri yine cekebildik
		 *yani bir defa newledik ve bundan sonra hangi classta  ihtiyacımız olursa oradan 
		 * bu mantıkla cekebiliyoruz bu sayede deger kaybı yasamamısta oluruz.
		 * Hatırlatma: Bu sadece yontemlerden biri cekebilmemizi saglayan baska yontemlerde mevcut
		*/
	}
}
