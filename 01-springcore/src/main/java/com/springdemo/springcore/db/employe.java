package com.springdemo.springcore.db;

public class employe {
  private int id;
  private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "employe [id=" + id + ", name=" + name + "]";
} 
}
