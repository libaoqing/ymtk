/**
 * Title:		tianpingpai
 * Copyright:	Copyright(c) 2014-2016,tianpingpai. All rights reserved.
 */
package com.ymtk.ai.zhxs.query;

/**
 * 基础查询
 * @since luoka @ 2015年10月29日 下午4:14:50
 *
 */
public abstract class BaseQuery {

	private Integer pageSize = 10;//每页数据条数，默认10

	private Integer pageNo = 1;//当前页码，默认1

	private int start = 0; //

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		if(pageSize == null || pageSize <= 0){
			return;
		}
		this.pageSize = pageSize;
	}

	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		if (pageNo == null || pageNo <= 0) {
			return;
		}
		this.pageNo = pageNo;
	}

	public Integer getStart(){
		if(pageSize == null || pageSize <0 || pageNo == null || pageNo < 0){
			return 0;
		}
		start = (pageNo -1) * pageSize;
		return start;
	}
	
	/** 
	 * 添加查询条件入口
	 * @since luoka @ 2016年2月18日 上午9:03:01
	*/
	public abstract void addConditions();	

}
