package dao;
//Data access object 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import vo.CafeVO;

public class CafeDAO {

	// 카테고리 + 지역별 조회
	public ArrayList<CafeVO> tripleSelect(String theme, String zone, String search) {
		ArrayList<CafeVO> list = new ArrayList<CafeVO>();
		try {
			// 0.JDBC DRIVER 호출
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 1.DB 연결
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@70.12.111.114:1521:xe", "javatest", "javatest");
			System.out.println("연결 성공");
			// 2.SQL 전송
			String sql;
			System.out.println(zone + " " + theme + " " + search);
			if(theme.equals("Whole") && zone.equals("Seoul") && search.equals("검색")) {
				sql = "select * from coffee";
			} else if(theme.equals("Whole") && zone.equals("Seoul") && !(search.equals("검색"))) {
				System.out.println("aaaaaaaaaaaaaaaaa");
				sql = "select * from coffee where name like ? or cate like ? or theme like ?";
			} else if(theme.equals("Whole") && !(zone.equals("Seoul")) && search.equals("검색")) {
				sql = "select * from coffee where zone = ? ";
			} else if(theme.equals("Whole") && !(zone.equals("Seoul")) && !(search.equals("검색"))) {
				sql = "select * from coffee where zone = ? and (name like ? or cate like ? or theme like ?)";
			} else if(!(theme.equals("Whole")) && zone.equals("Seoul") && search.equals("검색")) {
				sql = "select * from coffee where cate = ?";
			} else if(!(theme.equals("Whole")) && zone.equals("Seoul") && !(search.equals("검색"))) {
				sql = "select * from coffee where cate = ? and (name like ? or cate like ? or theme like ?)";
			} else if(!(theme.equals("Whole")) && !(zone.equals("Seoul")) && search.equals("검색")) {
				sql = "select * from coffee where cate = ? and zone = ?";
				System.out.println("comehere");
			} else  {
				sql = "select * from coffee where zone = ? and cate = ? and (name like ? or cate like ? or theme like ?)";
			}
			// sql 저장 실행 객체 생성
			PreparedStatement pt = con.prepareStatement(sql);
			if(theme.equals("Whole") && zone.equals("Seoul") && search.equals("검색")) {

			} else if(theme.equals("Whole") && zone.equals("Seoul") && !(search.equals("검색"))) {
				pt.setString(1, "%"+search+"%");
				pt.setString(2, "%"+search+"%");
				pt.setString(3, "%"+search+"%");
				System.out.println("bbbbbbbbbbbbbbbbbb");
			} else if(theme.equals("Whole") && !(zone.equals("Seoul")) && search.equals("검색")) {
				pt.setString(1, zone);
			} else if(theme.equals("Whole") && !(zone.equals("Seoul")) && !(search.equals("검색"))) {
				pt.setString(1, zone);
				pt.setString(2, "%"+search+"%");
				pt.setString(3, "%"+search+"%");
				pt.setString(4, "%"+search+"%");
			} else if(!(theme.equals("Whole")) && zone.equals("Seoul") && search.equals("검색")) {
				pt.setString(1, theme);
			} else if(!(theme.equals("Whole")) && zone.equals("Seoul") && !(search.equals("검색"))) {
				pt.setString(1, theme);
				pt.setString(2, "%"+search+"%");
				pt.setString(3, "%"+search+"%");
				pt.setString(4, "%"+search+"%");
			} else if(!(theme.equals("Whole")) && !(zone.equals("Seoul")) && search.equals("검색")) {
				pt.setString(1, theme);
				pt.setString(2, zone);
			} else {
				pt.setString(1, theme);
				pt.setString(2, zone);
				pt.setString(3, "%"+search+"%");
				pt.setString(4, "%"+search+"%");
				pt.setString(5, "%"+search+"%");
			}
			
			ResultSet rs = pt.executeQuery();

			int num = 0;

			while (rs.next()) {
				num++;
				int no = rs.getInt("no");
				theme = rs.getString("theme");
				String name = rs.getString("name"); // 카페이름
				String url = rs.getString("url"); // 상세페이지 url
				String tel = rs.getString("tel"); // 전화번호
				String addr = rs.getString("addr");
				String opentime = rs.getString("opentime"); // 오픈시간
				String menu = rs.getString("menu"); // 판매메뉴
				String link_page = rs.getString("link_page"); // 블로그,페이지 링크
				String link_insta = rs.getString("link_insta"); // 인스타 링크
				String style = rs.getString("style");// 분위기
				String topic = rs.getString("topic");// 인기토픽
				String purpose = rs.getString("purpose");// 방문목적
				String options = rs.getString("options"); // 단체석,예약,주차 등등
				String intro = rs.getString("intro");
				int rview = rs.getInt("rview"); // 예약자 리뷰
				int bview = rs.getInt("bview"); // 블로그 리뷰 갯수
				String tv = rs.getString("tv"); // tv출연정보

				CafeVO vo = new CafeVO();
				vo.setBview(bview);
				vo.setTheme(theme);
				vo.setIntro(intro);
				vo.setAddr(addr);
				vo.setLink_insta(link_insta);
				vo.setLink_page(link_page);
				vo.setMenu(menu);
				vo.setName(name);
				vo.setOpentime(opentime);
				vo.setOptions(options);
				vo.setNo(no);
				vo.setPurpose(purpose);
				vo.setRview(rview);
				vo.setStyle(style);
				vo.setTel(tel);
				vo.setTopic(topic);
				vo.setTv(tv);
				vo.setUrl(url);
				vo.setZone(zone);

				list.add(vo);

			}
			con.close();
			System.out.println("연결 해제");
			System.out.println("0000000000000000 : " + list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	// 상세페이지 조회
	public CafeVO viewDetail(int no) {
		CafeVO vo = new CafeVO();
		try {
			// 0.JDBC DRIVER 호출
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 1.DB 연결
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@70.12.111.114:1521:xe", "javatest", "javatest");
			System.out.println("연결 성공");
			// 2.SQL 전송
			String sql = "select * from coffee where no=?";
			// sql 저장 실행 객체 생성
			PreparedStatement pt = con.prepareStatement(sql);

			pt.setInt(1, no);

			ResultSet rs = pt.executeQuery();
			rs.next();
			String cate = rs.getString("cate"); // 카페이름
			String name = rs.getString("name"); // 카페이름
			String url = rs.getString("url"); // 상세페이지 url
			String zone = rs.getString("zone");// 구 이름
			String addr = rs.getString("addr");// 주소
			String tel = rs.getString("tel"); // 전화번호
			String opentime = rs.getString("opentime"); // 오픈시간
			String menu = rs.getString("menu"); // 판매메뉴
			String link_page = rs.getString("link_page"); // 블로그,페이지 링크
			String link_insta = rs.getString("link_insta"); // 인스타 링크
			String style = rs.getString("style");// 분위기
			String topic = rs.getString("topic");// 인기토픽
			String purpose = rs.getString("purpose");// 방문목적
			String options = rs.getString("options"); // 단체석,예약,주차 등등
			String intro = rs.getString("intro");
			int rview = rs.getInt("rview"); // 예약자 리뷰
			int bview = rs.getInt("bview"); // 블로그 리뷰 갯수
			String tv = rs.getString("tv"); // tv출연정보
			String theme = rs.getString("theme");

			vo.setCate(cate);
			vo.setBview(bview);
			vo.setZone(zone);
			vo.setIntro(intro);
			vo.setAddr(addr);
			vo.setLink_insta(link_insta);
			vo.setLink_page(link_page);
			vo.setMenu(menu);
			vo.setName(name);
			vo.setOpentime(opentime);
			vo.setOptions(options);
			vo.setNo(no);
			vo.setPurpose(purpose);
			vo.setRview(rview);
			vo.setStyle(style);
			vo.setTel(tel);
			vo.setTopic(topic);
			vo.setTv(tv);
			vo.setUrl(url);
			vo.setTheme(theme);

			con.close();
			System.out.println("연결 해제");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}

}
