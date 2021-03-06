package com.study.service;

import com.study.pojo.BasePageResult;
import com.study.pojo.Windowdata;

/**
 * 服务接口
 * 
 * @author 51988
 *
 */
public interface Lier88Service {
	/**
	 * 添加数据
	 * @param windowdata	数据的对象
	 */
	public void add(Windowdata windowdata);
	/**
	 * 条件+分页查询
	 * @param brand	查询条件
	 * @param pageNum	分页后显示第几页
	 * @param pageSize	每页多少条数据
	 * @return
	 */
	public BasePageResult findPage(Windowdata windowdata, int pageNum, int pageSize);
	
}
