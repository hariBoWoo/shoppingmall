package com.study.orders;
 
 
public class OrdersDTO {
  private int   orderno              ;
  private int   cartno               ;
  private int   contentsno           ;
  private String odate               ;
  private int   quantity             ;
  private int   total                ;
  private String payment             ;
  private String id                  ;
  private String mname               ;
  private String pname               ;
  
public int getOrderno() {
	return orderno;
}
public void setOrderno(int orderno) {
	this.orderno = orderno;
}
public int getCartno() {
	return cartno;
}
public void setCartno(int cartno) {
	this.cartno = cartno;
}
public int getContentsno() {
	return contentsno;
}
public void setContentsno(int contentsno) {
	this.contentsno = contentsno;
}
public String getOdate() {
	return odate;
}
public void setOdate(String odate) {
	this.odate = odate;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public String getPayment() {
	return payment;
}
public void setPayment(String payment) {
	this.payment = payment;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
  
  
  
}