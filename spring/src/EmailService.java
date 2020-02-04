import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cts.training.spring.IFortuneService;
import com.cts.training.spring.IMessageService;

@Component("msgService")
public class EmailService implements IMessageService{

	// dependency over Fortune Service
	/*************** Field/Property Based DI ***********/
	// @Autowired	
	// @Qualifier("personalFortune")
	private IFortuneService fortuneService;

	/*************** Constructer Based DI ***********/
	// will auto going to search for an implementation of type IFortuneService
	// if found injected auto
	/* @Autowired
	public EmailService(@Qualifier("personalFortune")IFortuneService fortuneService) {
		// TODO Auto-generated constructor stub
		this.fortuneService = fortuneService;
	}*/

	/*************** Setter Based DI ***********/
	@Autowired
	@Qualifier("personalFortune") // which implementation of IFortuneService to inject
	public void xyz(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	@Override
	public String sendMessage(String to, String message) {
		return "Email sent to : " + to + "[ * " + message + " * ]"
				+ "\n" + this.fortuneService.dailyFortune();

	}

}
