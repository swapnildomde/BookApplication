package com.techwalnut.book.vo;

import java.util.UUID;

public class Author {
	private UUID authorId;
	private String name;
	private String phone;
	private String address;

	public Author(UUID authorId, String name, String phone, String address) {
		super();
		this.authorId = authorId;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	public UUID getAuthorId() {
		return authorId;
	}
	public void setAuthorId(UUID authorId) {
		this.authorId = authorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
