package pl.sternik.pb.zadania.spring.zad12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import pl.sternik.pb.zadania.spring.zad11.Connection;
import pl.sternik.pb.zadania.spring.zad11.DbBeanConfigurator;

public class RunIt {

	@Autowired
	MyProfilowyBean bean;
	
	@Autowired
	Environment environment;
	
	   public void getActiveProfiles() {
	        for (final String profileName : environment.getActiveProfiles()) {
	            System.out.println("Currently active profile - " + profileName);
	        }   
	    }
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext  ctx = new AnnotationConfigApplicationContext(DbBeanConfigurator.class);
		ctx.getEnvironment().setActiveProfiles("AAA");
		ctx.refresh();
		
		RunIt obj = (RunIt)ctx.getBean("runIt");
		System.out.println(obj.bean.getName());
		obj.getActiveProfiles();
		
		ctx.close();
	}
}
