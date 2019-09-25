package cafeservlet;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CafeDAO;
import vo.CafeVO;
import cafesproject.map;
import cafesproject.map_raw;
import cafesproject.theme;
import cafesproject.thememap;
import cafesproject.thememapsearch;
import cafesproject.thememapsearch1;
import cafesproject.thememapsearch2;
import cafesproject.thememapsearch3;

@WebServlet("/CafeServlet")
public class CafeServlet extends HttpServlet {
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String zone = request.getParameter("zone");
	   String theme = request.getParameter("theme");
	   String search = request.getParameter("search");
	   String pagenum = request.getParameter("pagenum");
	   if(zone==null) {
		   zone="Seoul";
	   }
	   if(theme==null) {
		   theme="Whole";
	   }
	   if(search==null) {
		   search="검색";
	   }
	   if(pagenum==null){
			pagenum="1";
		}
	   String jsp ="";
	   CafeDAO dao = new CafeDAO();
	   ArrayList<CafeVO> cafelist = new ArrayList<CafeVO>();
	       
	   jsp = "start.jsp";
	   cafelist = dao.tripleSelect(theme, zone, search);
	   
   if(zone.equals("Seoul") && theme.equals("Whole") && search.equals("검색")) {
	   System.out.println("전체");
	   map_raw rc = new map_raw();      
	   String real_path = request.getSession().getServletContext().getRealPath("/");
	   System.out.println(real_path);
	    real_path = real_path.replace("\\", "/");
	    System.out.println(real_path);      
	   File f = new File(real_path+"/map_raw");
	   if(!f.exists()) f.mkdir();
	   String result = rc.returnSeoul(real_path+"/map_raw");
	   request.setAttribute("thememap", "http://70.12.111.114:8081/cafeproject/map_raw/"+result);  
    
      } 
   else if(zone.equals("Seoul") && theme.equals("Whole") && !(search.equals("검색"))) {
	   System.out.println("테마");
       thememapsearch1 rc = new thememapsearch1();      
       String real_path = request.getSession().getServletContext().getRealPath("/");
       System.out.println(real_path);
       real_path = real_path.replace("\\", "/");
       File f = new File(real_path+"/thememapsearch1");
       if(!f.exists()) f.mkdir();
       String result = rc.returnThemeMapSearch(real_path+"/thememapsearch1",search);
       request.setAttribute("thememap", "http://70.12.111.114:8081/cafeproject/thememapsearch1/"+result);  
       }
   else if(zone.equals("Seoul") && !(theme.equals("Whole")) && search.equals("검색")) {
	   System.out.println("테마");
       theme rc = new theme();      
       String real_path = request.getSession().getServletContext().getRealPath("/");
       System.out.println(real_path);
       real_path = real_path.replace("\\", "/");
       File f = new File(real_path+"/theme");
       if(!f.exists()) f.mkdir();
       String result = rc.returnTheme(real_path+"/theme",theme);
       request.setAttribute("thememap", "http://70.12.111.114:8081/cafeproject/theme/"+result);  
          }
   else if(zone.equals("Seoul") && !(theme.equals("Whole")) && !(search.equals("검색"))) {
	   System.out.println("전체");
		   thememapsearch2 rc = new thememapsearch2();      
		   String real_path = request.getSession().getServletContext().getRealPath("/");
		   System.out.println(real_path);
		    real_path = real_path.replace("\\", "/");
		    System.out.println(real_path);      
		   File f = new File(real_path+"/thememapsearch2");
		   if(!f.exists()) f.mkdir();
		   String result = rc.returnThemeMapSearch(real_path+"/thememapsearch2", theme, search);
		   request.setAttribute("thememap", "http://70.12.111.114:8081/cafeproject/thememapsearch2/"+result);   
   }
   else if(!(zone.equals("Seoul")) && theme.equals("Whole") && search.equals("검색")) {
	   System.out.println("존");
	   map rc = new map();      
      String real_path = request.getSession().getServletContext().getRealPath("/");
      System.out.println(real_path);
      System.out.println(real_path);
       real_path = real_path.replace("\\", "/");
       System.out.println(real_path);      
      File f = new File(real_path+"/zone");
      if(!f.exists()) f.mkdir();
      String result = rc.returnMap(real_path+"/zone",zone);
      request.setAttribute("thememap", "http://70.12.111.114:8081/cafeproject/zone/"+result);     
   }
   else if(!(zone.equals("Seoul")) && theme.equals("Whole") && !(search.equals("검색"))) {
	   System.out.println("전체");
		   thememapsearch3 rc = new thememapsearch3();      
		   String real_path = request.getSession().getServletContext().getRealPath("/");
		   System.out.println(real_path);
		    real_path = real_path.replace("\\", "/");
		    System.out.println(real_path);      
		   File f = new File(real_path+"/thememapsearch3");
		   if(!f.exists()) f.mkdir();
		   String result = rc.returnThemeMapSearch(real_path+"/thememapsearch3", zone, search);
		   request.setAttribute("thememap", "http://70.12.111.114:8081/cafeproject/thememapsearch3/"+result);   
   }
   else if(!(zone.equals("Seoul")) && !(theme.equals("Whole")) && search.equals("검색")) {
	   System.out.println("테마맵");
          thememap rc = new thememap();      
          String real_path = request.getSession().getServletContext().getRealPath("/");
          System.out.println(real_path);
          real_path = real_path.replace("\\", "/");
          File f = new File(real_path+"/thememap");
          if(!f.exists()) f.mkdir();
          String result = rc.returnThemeMap(real_path+"/thememap",zone,theme);
          request.setAttribute("thememap", "http://70.12.111.114:8081/cafeproject/thememap/"+result);    
   }
   else{
	   System.out.println("전체");
		   thememapsearch rc = new thememapsearch();      
		   String real_path = request.getSession().getServletContext().getRealPath("/");
		   System.out.println(real_path);
		    real_path = real_path.replace("\\", "/");
		    System.out.println(real_path);      
		   File f = new File(real_path+"/thememapsearch");
		   if(!f.exists()) f.mkdir();
		   String result = rc.returnThemeMapSearch(real_path+"/thememapsearch", zone, theme, search);
		   request.setAttribute("thememap", "http://70.12.111.114:8081/cafeproject/thememapsearch/"+result);   
   }

     request.setAttribute("cafelist", cafelist);
     System.out.println("11111111111111111111111 : " + cafelist.size());
     RequestDispatcher rd = request.getRequestDispatcher(jsp);
     rd.forward(request, response);
   
   
   
   
   }
      
}