package pl.sternik.pb.zadania.spring.zad12;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("QA-env")
public class BeanP2 implements MyProfilowyBean{

	@Override
	public String getName() {
		return "Bean Profil QA";
	}

}
