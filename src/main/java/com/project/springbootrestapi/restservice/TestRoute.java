package com.project.springbootrestapi.restservice;

public class TestRoute {

	private final long id;
	private final String content;

	public TestRoute(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}