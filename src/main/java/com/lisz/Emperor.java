package com.lisz;

public class Emperor {
	private static final Emperor INSTANCE = new Emperor("乾隆");
	private final String name;

	private Emperor(String name) {
		this.name = name;
	}

	public static Emperor getInstance() {
		return INSTANCE;
	}

	public void play(Official official, String place){
		System.out.println(official.getTitle() + " 安排 " + name + "皇帝游览了: " + place);
	}
}
