package com.furkankara.services.aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
@Aspect
public class AopGorevleri {
	
	
	@Around("execution(* com.furkankara.model.Personel.*(..))")
	public void sarGorev(ProceedingJoinPoint joinPoint) throws Throwable{		
		
		System.out.println("*****KUSAT SARMALA ONCESII*******\n\n"+Arrays.toString(joinPoint.getArgs()));
		
		joinPoint.proceed();// ustte adi gecen method cagrilir.
	 
		//ProceedingJoinPoint bir islemi ekstradan sectirip kullandirabiliyoruz.
		
		System.out.println("*****KUSAT SARMALA SONRASII*******\n\n");

	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	@Before("execution(* com.furkankara.model.Personel.adiSoyadiKontrolEt(..))")
	public void ilkGorev(JoinPoint joinPoint) throws Throwable{		
	
		System.out.println("\n\n*****ONCE*******" );
		
	}
	
	@AfterReturning("execution(* com.furkankara.model.Personel.adiSoyadiKontrolEt(..))")
	public void geriDonusGorev(JoinPoint joinPoint) throws Throwable{		
	
		System.out.println("*****GERI DONUS DEGERINDEN SONRA*******\n\n");
		
	}
	
	@AfterThrowing("execution(* com.furkankara.model.Personel.adiSoyadiKontrolEt(..))")
	public void istisnaGorev(JoinPoint joinPoint) throws Throwable{		
	
		System.out.println("*****ISTISNA MEYDANA GELDIKTEN SONRA *******\n\n");
		
	}
	

	@After("execution(* com.furkankara.model.Personel.adiSoyadiKontrolEt(..))")
	public void sonGorev1(JoinPoint joinPoint) throws Throwable{		
	
		System.out.println("*****SONRA*******\n\n");
		
	}
	
	@Around("execution(* com.furkankara.model.Personel.adiSoyadiKontrolEt(..))")
	public void sarGorev(JoinPoint joinPoint) throws Throwable{		
	
		System.out.println("*****KUSAT SARMALA*******\n\n");
		
	}
	*/
	
	
	/*
	 * @Before("execution(* com.furkankara.model.Personel.adiSoyadiKontrolEt(..))")
	 * public void ilkGorev2(JoinPoint joinPoint) throws Throwable{
	 * 
	 * System.out.println("\n\n*****GERI DONUS DEGERIDEN ONCE*******");
	 * 
	 * }
	 */
	
}
