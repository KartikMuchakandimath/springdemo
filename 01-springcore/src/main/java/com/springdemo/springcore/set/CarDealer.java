package com.springdemo.springcore.set;

import java.util.Set;

public class CarDealer {
public Set<String> getName() {
		return name;
	}

	public void setName(Set<String> name) {
		this.name = name;
	}

private Set<String> name;

@Override
public String toString() {
	return "CarDealer [name=" + name + "]";
}

}
