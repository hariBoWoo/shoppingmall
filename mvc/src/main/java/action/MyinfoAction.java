package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CommandService;

public class MyinfoAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		CommandService service = new CommandService();
		StringBuffer sb = service.myinfo();
		//모델 사용
		
		request.setAttribute("myinfo", sb);// 액션이 하는일
		return "/view/myinfo.jsp";// 뷰 페이지 리턴
		
	}

}
