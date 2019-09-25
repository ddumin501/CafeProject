package cafesproject;

import org.rosuda.REngine.Rserve.RConnection;

public class map_raw {
   public String returnSeoul(String path) {
      RConnection r = null;
      String retStr = "";
      System.out.println("seoul"+path);
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("msg <- paste0('<a href=http://70.12.111.114:8081/cafeproject/CafeServlet2?no=',Seoul$no,' target=\"_blank\">',Seoul$name,'</a>'"+",'<hr> 주소 : ',Seoul$addr)");
         r.eval("Seoul<-leaflet(Seoul) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addMarkers(lng = ~lon, lat=~lat, popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Seoul,'"+fileName+"', libdir='"+libPath+"')");           
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
   
   public String returnGangdong(String path) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("Gangdong <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("Gangdonggu <- subset(Seoul,Seoul$zone=='강동구')");
         r.eval("msg <- paste0(Gangdonggu$name,'<hr> 주소 : ',Gangdonggu$addr)");
         r.eval("Gangdong<-leaflet(Gangdonggu) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addMarkers(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Gangdong,'"+fileName+"', libdir='"+libPath+"')");           
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
   
   
   public String returnGangnam(String path) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("Gangnam <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("Gangnamgu <- subset(Seoul,Seoul$zone=='강남구')");
         r.eval("msg <- paste0(Gangnamgu$name,'<hr> 주소 : ',Gangnamgu$addr)");
         r.eval("Gangnam<-leaflet(Gangnamgu) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Gangnam,'"+fileName+"', libdir='"+libPath+"')");           
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
   
   
   
   public String returnJonglang(String path) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("Jonglang <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("Jonglanggu <- subset(Seoul,Seoul$zone=='중랑구')");
         r.eval("msg <- paste0(Jonglanggu$name,'<hr> 주소 : ',Jonglanggu$addr)");
         r.eval("Jonglang<-leaflet(Jonglanggu) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Jonglang,'"+fileName+"', libdir='"+libPath+"')");           
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
   
   
   
   public String returnJongno(String path) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("Jongno <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("Jongnogu <- subset(Seoul,Seoul$zone=='종로구')");
         r.eval("msg <- paste0(Jongnogu$name,'<hr> 주소 : ',Jongnogu$addr)");
         r.eval("Jongno<-leaflet(Jongnogu) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Jongnogu,'"+fileName+"', libdir='"+libPath+"')");           
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
   
   
   
   public String returnJunggu(String path) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("Jung <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("Junggu <- subset(Seoul,Seoul$zone=='중구')");
         r.eval("msg <- paste0(Junggu$name,'<hr> 주소 : ',Junggu$addr)");
         r.eval("Jung <-leaflet(Junggu) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Jung,'"+fileName+"', libdir='"+libPath+"')");           
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
   
   
   public String returnSeocho(String path) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("JSeocho <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("Seochogu <- subset(Seoul,Seoul$zone=='서초구')");
         r.eval("msg <- paste0(Seochogu$name,'<hr> 주소 : ',Seochogu$addr)");
         r.eval("Seocho <-leaflet(Seochogu) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Seocho,'"+fileName+"', libdir='"+libPath+"')");           
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
   
   
   

   public String returnSongpa(String path) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("Songpa <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("Songpagu <- subset(Seoul,Seoul$zone=='송파구')");
         r.eval("msg <- paste0(Songpagu$name,'<hr> 주소 : ',Songpagu$addr)");
         r.eval("Songpa <-leaflet(Songpagu) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Songpa,'"+fileName+"', libdir='"+libPath+"')");           
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
   
   
   

   public String returnSungbuk(String path) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("Sungbuk <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("Sungbukgu <- subset(Seoul,Seoul$zone=='성북구')");
         r.eval("msg <- paste0(Sungbukgu$name,'<hr> 주소 : ',Sungbukgu$addr)");
         r.eval("Sungbuk <-leaflet(Sungbukgu) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Sungbuk,'"+fileName+"', libdir='"+libPath+"')");           
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
   

   public String returnYongsan(String path) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("Yongsan <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("Yongsangu <- subset(Seoul,Seoul$zone=='용산구')");
         r.eval("msg <- paste0(Yongsangu$name,'<hr> 주소 : ',Yongsangu$addr)");
         r.eval("Yongsan <-leaflet(Yongsangu) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Yongsan,'"+fileName+"', libdir='"+libPath+"')");           
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
   
   


   public String returnDobong(String path) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("Dobong <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("Dobonggu <- subset(Seoul,Seoul$zone=='도봉구')");
         r.eval("msg <- paste0(Dobonggu$name,'<hr> 주소 : ',Dobonggu$addr)");
         r.eval("Dobong <-leaflet(Dobonggu) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Dobong,'"+fileName+"', libdir='"+libPath+"')");           
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
   
   
   
   public String returnYoungdeungpo(String path) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("Youngdeungpo <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("Youngdeungpogu <- subset(Seoul,Seoul$zone=='영등포구')");
         r.eval("msg <- paste0(Youngdeungpogu$name,'<hr> 주소 : ',Youngdeungpogu$addr)");
         r.eval("Youngdeungpo <-leaflet(Youngdeungpogu) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Youngdeungpo,'"+fileName+"', libdir='"+libPath+"')");           
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
   
   
   public String returnGuro(String path) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("Guro <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("Gurogu <- subset(Seoul,Seoul$zone=='구로구')");
         r.eval("msg <- paste0(Gurogu$name,'<hr> 주소 : ',Gurogu$addr)");
         r.eval("Guro <-leaflet(Gurogu) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Guro,'"+fileName+"', libdir='"+libPath+"')");           
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
   
   
   
   public String returnGangbuk(String path) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("Gangbuk <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("Gangbukgu <- subset(Seoul,Seoul$zone=='강북구')");
         r.eval("msg <- paste0(Gangbukgu$name,'<hr> 주소 : ',Gangbukgu$addr)");
         r.eval("Gangbuk <-leaflet(Gangbukgu) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Gangbuk,'"+fileName+"', libdir='"+libPath+"')");           
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
   
   
   
   public String returnGwanak(String path) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("Gwanak <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("Gwanakgu <- subset(Seoul,Seoul$zone=='관악구')");
         r.eval("msg <- paste0(Gwanakgu$name,'<hr> 주소 : ',Gwanakgu$addr)");
         r.eval("Gwanak <-leaflet(Gwanakgu) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Gwanak,'"+fileName+"', libdir='"+libPath+"')");           
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
   
   
   
   
   public String returnSeodaemoon(String path) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("Seodaemoon <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("Seodaemoongu <- subset(Seoul,Seoul$zone=='서대문구')");
         r.eval("msg <- paste0(Seodaemoongu$name,'<hr> 주소 : ',Seodaemoongu$addr)");
         r.eval("Seodaemoon <-leaflet(Seodaemoongu) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Seodaemoon,'"+fileName+"', libdir='"+libPath+"')");           
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
   
   

   public String returnYangcheon(String path) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("Yangcheon <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("Yangcheongu <- subset(Seoul,Seoul$zone=='양천구')");
         r.eval("msg <- paste0(Yangcheongu$name,'<hr> 주소 : ',Yangcheongu$addr)");
         r.eval("Yangcheon <-leaflet(Yangcheongu) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Yangcheon,'"+fileName+"', libdir='"+libPath+"')");           
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
   
   
   public String returnNowon(String path) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("Nowon <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("Nowongu <- subset(Seoul,Seoul$zone=='노원구')");
         r.eval("msg <- paste0(Nowongu$name,'<hr> 주소 : ',Nowongu$addr)");
         r.eval("Nowon <-leaflet(Nowongu) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Yangcheon,'"+fileName+"', libdir='"+libPath+"')");           
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
   
   

   public String returnDongjak(String path) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("Dongjak <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("Dongjakgu <- subset(Seoul,Seoul$zone=='동작구')");
         r.eval("msg <- paste0(Dongjakgu$name,'<hr> 주소 : ',Dongjakgu$addr)");
         r.eval("Dongjak <-leaflet(Dongjakgu) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Dongjak,'"+fileName+"', libdir='"+libPath+"')");           
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
   
   

   public String returnEunpyoung(String path) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("Eunpyoung <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("Eunpyounggu <- subset(Seoul,Seoul$zone=='은평구')");
         r.eval("msg <- paste0(Eunpyounggu$name,'<hr> 주소 : ',Eunpyounggu$addr)");
         r.eval("Eunpyoung <-leaflet(Eunpyounggu) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Eunpyoung,'"+fileName+"', libdir='"+libPath+"')");           
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
   
   

   public String returnGangseo(String path) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("Gangseo <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("Gangseogu <- subset(Seoul,Seoul$zone=='강서구')");
         r.eval("msg <- paste0(Gangseogu$name,'<hr> 주소 : ',Gangseogu$addr)");
         r.eval("Gangseo <-leaflet(Gangseogu) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Gangseo,'"+fileName+"', libdir='"+libPath+"')");           
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
   
   

   public String returnGeumchun(String path) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("Geumchun<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("Gangseogu <- subset(Seoul,Seoul$zone=='금천구')");
         r.eval("msg <- paste0(Geumchungu$name,'<hr> 주소 : ',Geumchungu$addr)");
         r.eval("Geumchun <-leaflet(Geumchungu) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Geumchun,'"+fileName+"', libdir='"+libPath+"')");           
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
   
   

   public String returnMapo(String path) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("Mapo <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("Mapogu <- subset(Seoul,Seoul$zone=='마포구')");
         r.eval("msg <- paste0(Mapogu$name,'<hr> 주소 : ',Mapogu$addr)");
         r.eval("Mapo <-leaflet(Mapogu) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Mapo,'"+fileName+"', libdir='"+libPath+"')");           
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
   
   

   public String returnDongdaemoon(String path) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("Dongdaemoon <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("Dongdaemoongu <- subset(Seoul,Seoul$zone=='동대문구')");
         r.eval("msg <- paste0(Dongdaemoongu$name,'<hr> 주소 : ',Dongdaemoongu$addr)");
         r.eval("Dongdaemoon <-leaflet(Dongdaemoongu) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Dongdaemoon,'"+fileName+"', libdir='"+libPath+"')");           
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
   
   
   public String returnSungdong(String path) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("Sungdong <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("Sungdonggu <- subset(Seoul,Seoul$zone=='성동구')");
         r.eval("msg <- paste0(Sungdonggu$name,'<hr> 주소 : ',Sungdonggu$addr)");
         r.eval("Sungdong <-leaflet(Sungdonggu) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Sungdong,'"+fileName+"', libdir='"+libPath+"')");           
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
   

   public String returnGwangjin(String path) {
      RConnection r = null;
      String retStr = "";
      try {
         r = new RConnection();
         r.eval("library(leaflet)");
         r.eval("library(dplyr)");
         r.eval("library(htmltools)");
         r.eval("Seoul<- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("Gwangjin <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
         r.eval("seoul_lonlat <- c(126.97797,37.56654)");
         r.eval("Gwangjingu <- subset(Seoul,Seoul$zone=='광진구')");
         r.eval("msg <- paste0(Gwangjingu$name,'<hr> 주소 : ',Gwangjingu$addr)");
         r.eval("Gwangjin <-leaflet(Gwangjingu) %>%" + 
               "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
               "  addTiles() %>% " + 
               "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
          String fileName = path +"/index.html";
           String libPath = path + "/lib";
           
           
         r.eval("save_html(Gwangjin,'"+fileName+"', libdir='"+libPath+"')");           
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