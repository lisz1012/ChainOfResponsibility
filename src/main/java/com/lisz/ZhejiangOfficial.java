package com.lisz;

public class ZhejiangOfficial extends Official{

	public ZhejiangOfficial() {
		title = "杭州知州";
	}

	@Override
	protected void serve(Emperor emperor) {
		emperor.play(this, "西湖苏堤");
	}
}
