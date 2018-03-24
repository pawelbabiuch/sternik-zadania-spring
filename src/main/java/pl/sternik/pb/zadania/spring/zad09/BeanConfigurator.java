package pl.sternik.pb.zadania.spring.zad09;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import pl.sternik.pb.zadania.spring.zad01.MyFirstBean;
import pl.sternik.pb.zadania.spring.zad02.MySecondBean;
import pl.sternik.pb.zadania.spring.zad03.MyThirdBean;

@Configuration
public class BeanConfigurator {
	
	
	@Bean
	@Lazy
	public MySecondBean myDrugi() {
		return new MySecondBean("Nazwa myDrugi");
	}

	@Bean
	@Lazy
	public MySecondBean myDrugiNazwany() {
		MySecondBean t = new MySecondBean();
		t.setName("Tralal ala");
		return t;
	}
	
	@Bean
	@Lazy
	public MyThirdBean mySkomplikowany() {
        MyThirdBean mtb = new MyThirdBean("skomplikowany");
        mtb.setBean(getMyFirst());
        return mtb;
	}
	
	@Bean
	public MyFirstBean getMyFirst() {
		return new MyFirstBean("Pierwszy!");
	}
}
