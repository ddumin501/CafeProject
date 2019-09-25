package cafesproject;

import org.rosuda.REngine.Rserve.RConnection;

public class thememap {
   public String returnThemeMap(String path, String zone, String theme) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("whole <- subset(Seoul,Seoul$zone=='"+zone+"'&Seoul$cate=='"+theme+"')");
         r.eval("msg <- paste0('<a href=http://70.12.111.114:8081/cafeproject/CafeServlet2?no=',whole$no,' target=\"_blank\">',whole$name,'</a>'"+",'<hr> 주소 : ',whole$addr)");
         r.eval("thememap <-leaflet(whole) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addMarkers(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(thememap,'"+fileName+"', libdir='"+libPath+"')");           
         String s = r.eval("'index.html'").asString();
         return s;
      } catch (Exception e) {
         System.out.println(e);
         e.printStackTrace();
      } finally {
         r.close();
      }
      return retStr;
   }
   
   
   
}
