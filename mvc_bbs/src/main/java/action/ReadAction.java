package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BbsDAO;
import model.BbsDTO;

public class ReadAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		// TODO Auto-generated method stub
		
		int bbsno = Integer.parseInt(request.getParameter("bbsno"));
		
		BbsDAO dao = new BbsDAO();
		dao.upViewcnt(0);
		BbsDTO dto = dao.read(bbsno);
		
		String content= dto.getContent().replaceAll("\r\n", "<br>");
		
		dto.setContent(content);
		request.setAttribute("dto", dto);
		
		
		return "/view/read.jsp";
		
		// bbsno 만 액션에서 받고 나머지 파람들은 read.jsp 에서 받는다! 가능한 이유가 redirect였기 때문
	}

}
