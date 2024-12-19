package com.barisozkan.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.barisozkan.entity.User;
import com.barisozkan.services.UserService;

@Configuration // bunun bir konfigürasyon sınıfı oldugunu belirtiyoruz bu yapıyla.Springin
				// kendi yapısı bu


/* bu yonteme bazen ihtiyacımız olacakmıs surekli boyle yapılmayacak
 * RestController anatasyonu, Repository anatasyonu, Service anatasyonu vb. anatasyonları 
 * kullanarak da spring contexte beanlari olusturacagız yeri gelidiginde asagida ki sekilde gordugumuz gibii
 * @bean kullanarak da olusturacagız.
 * ve ihtiyacımız olan yerlerde cekip kullanacagız.
*/
public class AppConfig {

	@Bean  //bu bean yapısı sayesinde spring context(IoC container veya Spring Container diger adi) 
		   //olusturuyor ve artık her seferinde buradan bir sey cekmek istersen spring contexten cekiyoruz.
	public UserService UserService() {
		UserService userService = new UserService();
		List<User> userList = new ArrayList<>();
		userList.add(new User("Baris"));
		userList.add(new User("Barkin"));

		userService.setUserList(userList);
		return userService;
	}
}
