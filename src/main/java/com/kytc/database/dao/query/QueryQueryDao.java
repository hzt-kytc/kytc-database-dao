package com.kytc.database.dao.query;

import java.util.List;

import com.kytc.database.po.QueryPO;
import com.kytc.database.vo.QueryVO;
import com.kytc.dto.DropDTO;

public interface QueryQueryDao {
	/**
	 * @author fisher 
	 * @date 2018年06月17日 16:35:37
	 * @description 添加数据 
	 * @param po 
	 * @return Boolean true 添加成功,false 添加失败 
	**/
	Boolean add(QueryPO po);
	/**
	 * @author fisher 
	 * @date 2018年06月17日 16:35:37
	 * @description 修改数据 
	 * @param po 
	 * @return Boolean true 修改成功,false 修改失败 
	**/
	Boolean update(QueryPO po);
	/**
	 * @author fisher 
	 * @date 2018年06月17日 16:35:37
	 * @description 删除数据 
	 * @param id 真删除 
	 * @return Boolean true 修改成功,false 修改失败 
	**/
	Boolean delete(Integer id);
	/**
	 * @author fisher 
	 * @date 2018年06月17日 16:35:37
	 * @description 根据id获取数据详情 
	 * @param id 
	 * @return QueryPO 
	**/
	QueryPO detail(Integer id);
	/**
	 * @author fisher 
	 * @date 2018年06月17日 16:35:37
	 * @description 获取分页数据源 
	 * @param vo 
	 * @return List<QueryPO> 
	**/
	List<QueryPO> list(QueryVO vo);
	/**
	 * @author fisher 
	 * @date 2018年06月17日 16:35:37
	 * @description 获取数据源总条数 
	 * @param vo 
	 * @return Long 
	**/
	Long count(QueryVO vo);
	/**
	 * @author fisher
	 * @description 获取数据源
	 * @date 2018年6月17日下午5:02:42
	 * @param 
	 * @return
	 */
	List<DropDTO> drop();
}