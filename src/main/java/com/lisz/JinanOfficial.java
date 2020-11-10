package com.lisz;

public class JinanOfficial extends Official{

	public JinanOfficial() {
		title = "济南知府";
	}

	@Override
	protected void serve(Emperor emperor) {
		emperor.play(this, "大明湖畔");
	}
}
