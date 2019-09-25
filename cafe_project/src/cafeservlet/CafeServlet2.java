package cafeservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CafeDAO;
import vo.CafeVO;

@WebServlet("/CafeServlet2")

public class CafeServlet2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 상세화면넘어가기	
		int no = Integer.parseInt(request.getParameter("no"));
		
		CafeDAO dao = new CafeDAO();
		CafeVO cafeinfo = new CafeVO();
		
		cafeinfo = dao.viewDetail(no);
		
		HttpSession session = request.getSession();
		
		session.setAttribute("cafeinfo", cafeinfo);
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/detail.jsp");
		rd.forward(request, response);
		
		
	}


}
