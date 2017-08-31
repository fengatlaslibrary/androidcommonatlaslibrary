package com.open.android.bean;

import com.open.android.bean.db.OpenDBBean;

import java.util.List;

public class OpenDBListBean extends CommonBean {
	private List<OpenDBBean> list;

	public List<OpenDBBean> getList() {
		return list;
	}

	public void setList(List<OpenDBBean> list) {
		this.list = list;
	}

}
