package com.lisz;

import lombok.Data;

@Data
public abstract class Official {
	protected String title;

	protected abstract void serve(Emperor emperor);

	@Override
	public String toString() {
		return title;
	}
}
