package com.furkankara.app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.furkankara.model.Personel;

public class Merkez {

	public static void main(String[] args) {
	
		
		ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		
		Personel personel1 = appCtx.getBean("beanPersonel1",Personel.class);
		

		try {
			personel1.adiSoyadiKontrolEt();
			personel1.selamlama("MERHABA ",5);
			personel1.personelBilgiVer();
		}catch(Exception e) {
			System.out.println("ISTISNA :"+e);
			
		}

		appCtx.close();
		
	}

}
