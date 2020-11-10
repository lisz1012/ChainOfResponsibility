package com.lisz;

public class ShandongOfficial extends Official{

	public ShandongOfficial() {
		title = "山东巡抚";
	}

	@Override
	protected void serve(Emperor emperor) {
		emperor.play(this, "曲阜孔庙");
	}
}
