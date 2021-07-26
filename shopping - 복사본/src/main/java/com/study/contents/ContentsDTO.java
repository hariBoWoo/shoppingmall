package com.study.contents;
 
import java.util.Objects;

import org.springframework.web.multipart.MultipartFile;
 
public class ContentsDTO {
 
  private int contentsno                  ;
  private int cateno                      ;
  private String pname                    ;
  private int price                       ;
  private String filename                 ;
  private MultipartFile filenameMF        ;
  private String detail                   ;
  private String rdate                    ;
  private int stock                       ;
public int getContentsno() {
	return contentsno;
}
public void setContentsno(int contentsno) {
	this.contentsno = contentsno;
}
public int getCateno() {
	return cateno;
}
public void setCateno(int cateno) {
	this.cateno = cateno;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getFilename() {
	return filename;
}
public void setFilename(String filename) {
	this.filename = filename;
}
public MultipartFile getFilenameMF() {
	return filenameMF;
}
public void setFilenameMF(MultipartFile filenameMF) {
	this.filenameMF = filenameMF;
}
public String getDetail() {
	return detail;
}
public void setDetail(String detail) {
	this.detail = detail;
}
public String getRdate() {
	return rdate;
}
public void setRdate(String rdate) {
	this.rdate = rdate;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
@Override
public String toString() {
	return "ContentsDTO [contentsno=" + contentsno + ", cateno=" + cateno + ", pname=" + pname + ", price=" + price
			+ ", filename=" + filename + ", filenameMF=" + filenameMF + ", detail=" + detail + ", rdate=" + rdate
			+ ", stock=" + stock + "]";
}
public ContentsDTO(int contentsno, int cateno, String pname, int price, String filename, MultipartFile filenameMF,
		String detail, String rdate, int stock) {
	super();
	this.contentsno = contentsno;
	this.cateno = cateno;
	this.pname = pname;
	this.price = price;
	this.filename = filename;
	this.filenameMF = filenameMF;
	this.detail = detail;
	this.rdate = rdate;
	this.stock = stock;
}
public ContentsDTO() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public int hashCode() {
	return Objects.hash(cateno, contentsno, detail, filename, filenameMF, pname, price, rdate, stock);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	ContentsDTO other = (ContentsDTO) obj;
	return cateno == other.cateno && contentsno == other.contentsno && Objects.equals(detail, other.detail)
			&& Objects.equals(filename, other.filename) && Objects.equals(filenameMF, other.filenameMF)
			&& Objects.equals(pname, other.pname) && price == other.price && Objects.equals(rdate, other.rdate)
			&& stock == other.stock;
}
  
}