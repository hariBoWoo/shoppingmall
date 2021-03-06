package com.study.notice;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

//@JsonInclude(Include.NON_NULL)
public class NoticeDTO {

	private int noticeno;
	private String title;
	private String content;
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

	
}
