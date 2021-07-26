package ioc_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("samsungTV")
public class SamsungTV implements TV {

	@Autowired //Injection : 자동 불러오기
	private AppleSpeaker speaker;
	@Value("400000")
	private int price; //value 값이 price로 들어간다. 원래라면 setter, getter 써야하는데 이렇게 간단히 써준거다!
	
	public SamsungTV() {
        System.out.println(">>>>>>> SamsungTV 객체 생성");
	}
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV...전원 켠다.(가격:"+price+")");
	}

	@Override
	public void powerOff() {
		 System.out.println("SamsungTV...전원 끈다.");
	}

	@Override
	public void volumeUp() {
		 speaker.volumUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumDown();
	}

}
