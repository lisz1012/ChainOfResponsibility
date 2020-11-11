package com.lisz;

import java.util.ArrayList;
import java.util.List;

public class PrimeMinister {
	private static List<Official> list = new ArrayList<>();

	public static void main(String[] args) {
		// 下令各省官员准备好
		list.add(new HebeiOfficial());
		list.add(new JinanOfficial());
		list.add(new ShandongOfficial());
		list.add(new JiangsuOfficial());
		list.add(new ZhejiangOfficial());
		// 请出皇上
		Emperor emperor = Emperor.getInstance();
		// 昭告天下：万岁爷起驾，下江南！沿途各省依次伺候圣上
		System.out.println("乾隆下江南!");
		start(list, emperor);
	}

	private static void start(List<Official> officials, Emperor emperor) {
		for (Official o : officials) {
			o.serve(emperor);
		}
	}
}
