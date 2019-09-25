package vo;

public class CafeVO {

	int no;
	String name; // 카페이름
	String zone; //구역
	String addr;
	String url; // 상세페이지 urlcode
	//float lon;//경도
	//float lat;//위도
	String cate; //중분류
	String theme; // 소분류
	String tel; // 전화번호
	String opentime; //오픈시간
	String menu; //판매메뉴
	String link_page; //블로그,페이지 링크
	String link_insta; //인스타 링크
	String style;//분위기
	String topic;//인기토픽
	String purpose;//방문목적
	String options; //단체석,예약,주차 등등
	String intro;//소개	
	int rview; //예약자 리뷰 
	int bview; //블로그 리뷰 갯수
	String tv; //tv출연정보
	

	@Override
	public String toString() {
		return "CafeVO [no=" + no + ", name=" + name + ", zone =" + zone + ",addr =" + addr + ",url=" + url + ", theme=" + theme + ", tel=" + tel
				+ ", opentime=" + opentime + ", menu=" + menu + ", link_page=" + link_page + ", link_insta="
				+ link_insta + ", style=" + style + ", topic=" + topic + ", purpose=" + purpose + ", options=" + options
				+ ", intro=" + intro + ", rview=" + rview + ", bview=" + bview + ", tv=" + tv + "]";
	}
	
	public String getCate() {
		return cate;
	}

	public int getNo() {
		return no;
	}
	

	public String getName() {
		return name;
	}
	
	public String getZone() {
		return zone;
	}
	public String getAddr() {
		return addr;
	}

	public String getUrl() {
		return url;
	}

	public String getTheme() {
		return theme;
	}

	public String getTel() {
		return tel;
	}

	public String getOpentime() {
		return opentime;
	}

	public String getMenu() {
		return menu;
	}

	public String getLink_page() {
		return link_page;
	}

	public String getLink_insta() {
		return link_insta;
	}

	public String getStyle() {
		return style;
	}

	public String getTopic() {
		return topic;
	}

	public String getPurpose() {
		return purpose;
	}

	public String getOptions() {
		return options;
	}

	public String getIntro() {
		return intro;
	}

	public int getRview() {
		return rview;
	}

	public int getBview() {
		return bview;
	}

	public String getTv() {
		return tv;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
	public void setCate(String cate) {
		this.cate = cate;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setZone(String zone) {
		this.zone = zone;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public void setLink_page(String link_page) {
		this.link_page = link_page;
	}

	public void setLink_insta(String link_insta) {
		this.link_insta = link_insta;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public void setRview(int rview) {
		this.rview = rview;
	}

	public void setBview(int bview) {
		this.bview = bview;
	}

	public void setTv(String tv) {
		this.tv = tv;
	}

	
	

}
