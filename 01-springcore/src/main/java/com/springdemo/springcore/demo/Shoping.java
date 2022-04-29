package com.springdemo.springcore.demo;

class Shoping {
private Item items;
private String custname;
public Item getItem() {
	return items;
}
public void setItem(Item item) {
	this.items = item;
}
public String getCustname() {
	return custname;
}
public void setCustname(String custname) {
	this.custname = custname;
}
@Override
public String toString() {
	return "Shoping [item=" + items + ", custname=" + custname + "]";
}

}
