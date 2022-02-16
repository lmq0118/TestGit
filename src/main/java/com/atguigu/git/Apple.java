package com.atguigu.git;

public class Apple {
	
	private String name;
	private Integer size;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Apple [name=" + name + ", size=" + size + "]";
	}
	
	

}
