package com.kytc.database.dao;

import java.util.List;

import com.kytc.database.dto.ViewsDTO;

public interface ViewsDao {
	/**
	 * @author fisher 
	 * @date 2018年5月13日下午6:56:15
	 * @description 根据数据库获取全部的视图
	 * @param database
	 * @return List<String>
	 */
	List<String> list(String database);
	/**
	 * @author fisher 
	 * @date 2018年5月13日下午7:03:02
	 * @description 获取视图详情
	 * @param database
	 * @param viewName
	 * @return ViewsDTO
	 */
	ViewsDTO detail(String database,String viewName);
}
