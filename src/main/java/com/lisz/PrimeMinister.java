package com.lisz;

import java.util.ArrayList;
import java.util.List;

public class PrimeMinister {
	private static List<Official> list = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("乾隆下江南!");
		list.add(new HeibeiOfficial());
		list.add(new JinanOfficial());
		list.add(new ShandongOfficial());
		list.add(new JiangsuOfficial());
		list.add(new ZhejiangOfficial());
		Emperor emperor = Emperor.getInstance();
		start(list, emperor);
	}

	private static void start(List<Official> officials, Emperor emperor) {
		for (Official o : officials) {
			o.serve(emperor);
		}
	}
}
