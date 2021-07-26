package model;
import java.util.Date; 

public class CommandService{ 

    /** 
     * 기본 생성자 
     */ 
    public CommandService() { 
        super(); 
    } 

    public StringBuffer getHello(){ 
        StringBuffer sb = new StringBuffer(); 
        sb.append("<li> 안녕하세요..MVC 입니다.<br>"); 
        sb.append("<li> Template Page<br>"); 
        sb.append("<li> URI Command Pattern<br>"); 
        sb.append("<li> Properties 파일을 이용한 처리입니다.<br>"); 
         
        return sb; 

    } 

    public String getDate(){ 
        Date dt = new Date(); 
        String str = dt.toLocaleString();  
         
        return str; 
    }

	public StringBuffer myinfo() {
		StringBuffer sb= new StringBuffer();
		sb.append("이름 : 홍길동 <br>");
		sb.append("전화번호 : 010-1111-1111 <br>");
		sb.append("주소 : 수내동 <br>");
		
		return sb;
	} 

} 