package com.lisz;

public class HeibeiOfficial extends Official {

	public HeibeiOfficial() {
		this.title = "直隶总督";
	}

	@Override
	protected void serve(Emperor emperor) {
		emperor.play(this, "避暑山庄");
	}
}
