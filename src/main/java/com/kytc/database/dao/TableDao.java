package com.kytc.database.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.kytc.database.dto.TableDTO;
import com.kytc.database.vo.TableVO;

public interface TableDao {
	/**
	 * @author fisher 
	 * @date 2018年5月13日下午5:00:03
	 * @description 
	 * @param database 数据库名称
	 * @return List<String>
	 */
	List<String> list(String database);
	/**
	 * @author fisher 
	 * @date 2018年5月13日下午5:33:28
	 * @description 获取表的详细信息
	 * @param database
	 * @param tableName
	 * @return TableDTO
	 */
	TableDTO detail(@Param("database")String database,@Param("tableName")String tableName);
	/**
	 * @author fisher 
	 * @date 2018年5月20日上午9:33:39
	 * @description 获取表的数据集
	 * @param vo
	 * @return List<Map<String,Object>>
	 */
	List<Map<String, Object>> dataList(TableVO vo);
	/**
	 * @author fisher 
	 * @date 2018年5月20日上午9:34:13
	 * @description 获取表的数据总数
	 * @param vo
	 * @return Long
	 */
	Long dataCount(TableVO vo);
}