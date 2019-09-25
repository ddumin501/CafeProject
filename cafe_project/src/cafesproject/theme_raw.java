package cafesproject;

import org.rosuda.REngine.Rserve.RConnection;

public class theme_raw {
      public String returnGallery(String path) {
            RConnection r = null;
            String retStr = "";
            try {
               r = new RConnection();
               r.eval("library(leaflet)");
               r.eval("library(dplyr)");
               r.eval("library(htmltools)");
               r.eval("Seoul <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
               r.eval("갤러리 <- subset(Seoul, Seoul$cate == '갤러리'");
               r.eval("seoul_lonlat <- c(126.97797,37.56654)");
               r.eval("msg <- paste0(갤러리$name,'<hr> 주소 : ',갤러리$addr)");
               r.eval("갤러리<-leaflet(갤러리) %>%" + 
                     "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
                     "  addTiles() %>% " + 
                     "  addMarkers(lng = ~lon, lat=~lat,popup = msg)");
                String fileName = path +"/index.html";
                 String libPath = path + "/lib";
                 
                 
               r.eval("save_html(갤러리,'"+fileName+"', libdir='"+libPath+"')");           
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
      public String returnGongbang(String path) {
            RConnection r = null;
            String retStr = "";
            try {
               r = new RConnection();
               r.eval("library(leaflet)");
               r.eval("library(dplyr)");
               r.eval("library(htmltools)");
               r.eval("Seoul <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
               r.eval("공방 <- subset(Seoul, Seoul$cate == '공방'");
               r.eval("seoul_lonlat <- c(126.97797,37.56654)");
               r.eval("msg <- paste0(공방$name,'<hr> 주소 : ',공방$addr)");
               r.eval("공방 <-leaflet(공방) %>%" + 
                     "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
                     "  addTiles() %>% " + 
                     "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
                String fileName = path +"/index.html";
                 String libPath = path + "/lib";
                 
                 
               r.eval("save_html(공방,'"+fileName+"', libdir='"+libPath+"')");           
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
      public String returnanimal(String path) {
            RConnection r = null;
            String retStr = "";
            try {
               r = new RConnection();
               r.eval("library(leaflet)");
               r.eval("library(dplyr)");
               r.eval("library(htmltools)");
               r.eval("Seoul <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
               r.eval("동물 <- subset(Seoul, Seoul$cate == '동물'");
               r.eval("seoul_lonlat <- c(126.97797,37.56654)");
               r.eval("msg <- paste0(동물$name,'<hr> 주소 : ',동물$addr)");
               r.eval("동물 <-leaflet(동물) %>%" + 
                     "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
                     "  addTiles() %>% " + 
                     "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
                String fileName = path +"/index.html";
                 String libPath = path + "/lib";
                 
                 
               r.eval("save_html(동물,'"+fileName+"', libdir='"+libPath+"')");           
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
      public String returncartoon(String path) {
            RConnection r = null;
            String retStr = "";
            try {
               r = new RConnection();
               r.eval("library(leaflet)");
               r.eval("library(dplyr)");
               r.eval("library(htmltools)");
               r.eval("Seoul <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
               r.eval("만화 <- subset(Seoul, Seoul$cate == '만화방'");
               r.eval("seoul_lonlat <- c(126.97797,37.56654)");
               r.eval("msg <- paste0(만화$name,'<hr> 주소 : ',만화$addr)");
               r.eval("만화 <-leaflet(만화) %>%" + 
                     "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
                     "  addTiles() %>% " + 
                     "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
                String fileName = path +"/index.html";
                 String libPath = path + "/lib";
                 
                 
               r.eval("save_html(만화,'"+fileName+"', libdir='"+libPath+"')");           
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
      public String returnsajoo(String path) {
            RConnection r = null;
            String retStr = "";
            try {
               r = new RConnection();
               r.eval("library(leaflet)");
               r.eval("library(dplyr)");
               r.eval("library(htmltools)");
               r.eval("Seoul <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
               r.eval("사주 <- subset(Seoul, Seoul$cate == '사주'");
               r.eval("seoul_lonlat <- c(126.97797,37.56654)");
               r.eval("msg <- paste0(만화$name,'<hr> 주소 : ',만화$addr)");
               r.eval("사주 <-leaflet(사주) %>%" + 
                     "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
                     "  addTiles() %>% " + 
                     "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
                String fileName = path +"/index.html";
                 String libPath = path + "/lib";
                 
                 
               r.eval("save_html(사주,'"+fileName+"', libdir='"+libPath+"')");           
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
      public String returnpicture(String path) {
            RConnection r = null;
            String retStr = "";
            try {
               r = new RConnection();
               r.eval("library(leaflet)");
               r.eval("library(dplyr)");
               r.eval("library(htmltools)");
               r.eval("Seoul <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
               r.eval("사진 <- subset(Seoul, Seoul$cate == '사진'");
               r.eval("seoul_lonlat <- c(126.97797,37.56654)");
               r.eval("msg <- paste0(사진$name,'<hr> 주소 : ',사진$addr)");
               r.eval("사진 <-leaflet(사진) %>%" + 
                     "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
                     "  addTiles() %>% " + 
                     "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
                String fileName = path +"/index.html";
                 String libPath = path + "/lib";
                 
                 
               r.eval("save_html(사진,'"+fileName+"', libdir='"+libPath+"')");           
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
      public String returnstudy(String path) {
            RConnection r = null;
            String retStr = "";
            try {
               r = new RConnection();
               r.eval("library(leaflet)");
               r.eval("library(dplyr)");
               r.eval("library(htmltools)");
               r.eval("Seoul <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
               r.eval("스터디 <- subset(Seoul, Seoul$cate == '스터디'");
               r.eval("seoul_lonlat <- c(126.97797,37.56654)");
               r.eval("msg <- paste0(스터디$name,'<hr> 주소 : ',스터디$addr)");
               r.eval("스터디 <-leaflet(스터디) %>%" + 
                     "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
                     "  addTiles() %>% " + 
                     "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
                String fileName = path +"/index.html";
                 String libPath = path + "/lib";
                 
                 
               r.eval("save_html(스터디,'"+fileName+"', libdir='"+libPath+"')");           
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
      public String returnslime(String path) {
            RConnection r = null;
            String retStr = "";
            try {
               r = new RConnection();
               r.eval("library(leaflet)");
               r.eval("library(dplyr)");
               r.eval("library(htmltools)");
               r.eval("Seoul <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
               r.eval("슬라임 <- subset(Seoul, Seoul$cate == '슬라임'");
               r.eval("seoul_lonlat <- c(126.97797,37.56654)");
               r.eval("msg <- paste0(슬라임$name,'<hr> 주소 : ',슬라임$addr)");
               r.eval("슬라임 <-leaflet(슬라임) %>%" + 
                     "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
                     "  addTiles() %>% " + 
                     "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
                String fileName = path +"/index.html";
                 String libPath = path + "/lib";
                 
                 
               r.eval("save_html(슬라임,'"+fileName+"', libdir='"+libPath+"')");           
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
      public String returnacade(String path) {
            RConnection r = null;
            String retStr = "";
            try {
               r = new RConnection();
               r.eval("library(leaflet)");
               r.eval("library(dplyr)");
               r.eval("library(htmltools)");
               r.eval("Seoul <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
               r.eval("아케이드 <- subset(Seoul, Seoul$cate == '아케이드'");
               r.eval("seoul_lonlat <- c(126.97797,37.56654)");
               r.eval("msg <- paste0(아케이드$name,'<hr> 주소 : ',아케이드$addr)");
               r.eval("아케이드 <-leaflet(아케이드) %>%" + 
                     "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
                     "  addTiles() %>% " + 
                     "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
                String fileName = path +"/index.html";
                 String libPath = path + "/lib";
                 
                 
               r.eval("save_html(아케이드,'"+fileName+"', libdir='"+libPath+"')");           
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
      
      public String returnmusic(String path) {
            RConnection r = null;
            String retStr = "";
            try {
               r = new RConnection();
               r.eval("library(leaflet)");
               r.eval("library(dplyr)");
               r.eval("library(htmltools)");
               r.eval("Seoul <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
               r.eval("음악 <- subset(Seoul, Seoul$cate == '음악'");
               r.eval("seoul_lonlat <- c(126.97797,37.56654)");
               r.eval("msg <- paste0(음악$name,'<hr> 주소 : ',음악$addr)");
               r.eval("음악 <-leaflet(음악) %>%" + 
                     "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
                     "  addTiles() %>% " + 
                     "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
                String fileName = path +"/index.html";
                 String libPath = path + "/lib";
                 
                 
               r.eval("save_html(음악,'"+fileName+"', libdir='"+libPath+"')");           
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
      public String returnevent(String path) {
            RConnection r = null;
            String retStr = "";
            try {
               r = new RConnection();
               r.eval("library(leaflet)");
               r.eval("library(dplyr)");
               r.eval("library(htmltools)");
               r.eval("Seoul <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
               r.eval("이벤트 <- subset(Seoul, Seoul$cate == '이벤트'");
               r.eval("seoul_lonlat <- c(126.97797,37.56654)");
               r.eval("msg <- paste0(이벤트$name,'<hr> 주소 : ',이벤트$addr)");
               r.eval("이벤트 <-leaflet(이벤트) %>%" + 
                     "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
                     "  addTiles() %>% " + 
                     "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
                String fileName = path +"/index.html";
                 String libPath = path + "/lib";
                 
                 
               r.eval("save_html(이벤트,'"+fileName+"', libdir='"+libPath+"')");           
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
      public String returndifferent(String path) {
            RConnection r = null;
            String retStr = "";
            try {
               r = new RConnection();
               r.eval("library(leaflet)");
               r.eval("library(dplyr)");
               r.eval("library(htmltools)");
               r.eval("Seoul <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
               r.eval("이색 <- subset(Seoul, Seoul$cate == '이색'");
               r.eval("seoul_lonlat <- c(126.97797,37.56654)");
               r.eval("msg <- paste0(이색$name,'<hr> 주소 : ',이색$addr)");
               r.eval("이색 <-leaflet(이색) %>%" + 
                     "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
                     "  addTiles() %>% " + 
                     "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
                String fileName = path +"/index.html";
                 String libPath = path + "/lib";
                 
                 
               r.eval("save_html(이색,'"+fileName+"', libdir='"+libPath+"')");           
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
      public String returnbook(String path) {
            RConnection r = null;
            String retStr = "";
            try {
               r = new RConnection();
               r.eval("library(leaflet)");
               r.eval("library(dplyr)");
               r.eval("library(htmltools)");
               r.eval("Seoul <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
               r.eval("이색 <- subset(Seoul, Seoul$cate == '이색'");
               r.eval("seoul_lonlat <- c(126.97797,37.56654)");
               r.eval("msg <- paste0(이색$name,'<hr> 주소 : ',이색$addr)");
               r.eval("이색 <-leaflet(이색) %>%" + 
                     "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
                     "  addTiles() %>% " + 
                     "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
                String fileName = path +"/index.html";
                 String libPath = path + "/lib";
                 
                 
               r.eval("save_html(이색,'"+fileName+"', libdir='"+libPath+"')");           
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
      public String returnkiz(String path) {
            RConnection r = null;
            String retStr = "";
            try {
               r = new RConnection();
               r.eval("library(leaflet)");
               r.eval("library(dplyr)");
               r.eval("library(htmltools)");
               r.eval("Seoul <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
               r.eval("키즈 <- subset(Seoul, Seoul$cate == '키즈'");
               r.eval("seoul_lonlat <- c(126.97797,37.56654)");
               r.eval("msg <- paste0(키즈$name,'<hr> 주소 : ',키즈$addr)");
               r.eval("키즈 <-leaflet(키즈) %>%" + 
                     "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
                     "  addTiles() %>% " + 
                     "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
                String fileName = path +"/index.html";
                 String libPath = path + "/lib";
                 
                 
               r.eval("save_html(키즈,'"+fileName+"', libdir='"+libPath+"')");           
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
      public String returntheme(String path) {
               RConnection r = null;
               String retStr = "";
               try {
                  r = new RConnection();
                  r.eval("library(leaflet)");
                  r.eval("library(dplyr)");
                  r.eval("library(htmltools)");
                  r.eval("Seoul <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
                  r.eval("테마 <- subset(Seoul, Seoul$cate == '테마'");
                  r.eval("seoul_lonlat <- c(126.97797,37.56654)");
                  r.eval("msg <- paste0(테마$name,'<hr> 주소 : ',테마$addr)");
                  r.eval("테마 <-leaflet(테마) %>%" + 
                        "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
                        "  addTiles() %>% " + 
                        "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
                   String fileName = path +"/index.html";
                    String libPath = path + "/lib";
                    
                    
                  r.eval("save_html(테마,'"+fileName+"', libdir='"+libPath+"')");           
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
      public String returnflower(String path) {
            RConnection r = null;
            String retStr = "";
            try {
               r = new RConnection();
               r.eval("library(leaflet)");
               r.eval("library(dplyr)");
               r.eval("library(htmltools)");
               r.eval("Seoul <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
               r.eval("플라워 <- subset(Seoul, Seoul$cate == '플라워'");
               r.eval("seoul_lonlat <- c(126.97797,37.56654)");
               r.eval("msg <- paste0(플라워$name,'<hr> 주소 : ',플라워$addr)");
               r.eval("플라워 <-leaflet(플라워) %>%" + 
                     "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
                     "  addTiles() %>% " + 
                     "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
                String fileName = path +"/index.html";
                 String libPath = path + "/lib";
                 
                 
               r.eval("save_html(플라워,'"+fileName+"', libdir='"+libPath+"')");           
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
      public String returnhealing(String path) {
            RConnection r = null;
            String retStr = "";
            try {
               r = new RConnection();
               r.eval("library(leaflet)");
               r.eval("library(dplyr)");
               r.eval("library(htmltools)");
               r.eval("Seoul <- read.csv('c:/cafe/Rstudy/crawling/Seoul.csv', stringsAsFactors = FALSE)");
               r.eval("힐링 <- subset(Seoul, Seoul$cate == '힐링'");
               r.eval("seoul_lonlat <- c(126.97797,37.56654)");
               r.eval("msg <- paste0(힐링$name,'<hr> 주소 : ',힐링$addr)");
               r.eval("힐링 <-leaflet(힐링) %>%" + 
                     "  setView(lng = seoul_lonlat[1], lat = seoul_lonlat[2], zoom = 11) %>%" + 
                     "  addTiles() %>% " + 
                     "  addCircles(lng = ~lon, lat=~lat,popup = msg)");
                String fileName = path +"/index.html";
                 String libPath = path + "/lib";
                 
                 
               r.eval("save_html(힐링,'"+fileName+"', libdir='"+libPath+"')");           
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