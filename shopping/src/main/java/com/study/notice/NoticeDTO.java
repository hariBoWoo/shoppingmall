package com.study.notice;

public class NoticeDTO {

	private int noticeno;
	private String title;
	private String content;
	//private String wname;
	//private String passwd;
	private int cnt;
	private String nodate;
	
	
	public int getNoticeno() {
		return noticeno;
	}
	public void setNoticeno(int noticeno) {
		this.noticeno = noticeno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getNodate() {
		return nodate;
	}
	public void setNodate(String nodate) {
		this.nodate = nodate;
	}
	@Override
	public String toString() {
		return "NoticeDTO [noticeno=" + noticeno + ", title=" + title + ", content=" + content + ", cnt=" + cnt
				+ ", nodate=" + nodate + "]";
	}
	public NoticeDTO(int noticeno, String title, String content, int cnt, String nodate) {
		super();
		this.noticeno = noticeno;
		this.title = title;
		this.content = content;
		this.cnt = cnt;
		this.nodate = nodate;
	}

	
}