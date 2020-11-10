package com.lisz;

public class JiangsuOfficial extends Official{

	public JiangsuOfficial() {
		title = "苏州织造";
	}

	@Override
	protected void serve(Emperor emperor) {
		emperor.play(this, "苏州园林");
	}
}
