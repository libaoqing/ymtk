package com.ymtk.ai.zhxs.mapper;

import java.util.List;

import com.ymtk.ai.zhxs.entity.YmtkUser;
import com.ymtk.ai.zhxs.query.BaseUserQuery;

public interface YmtkUserMapper extends SqlMapper{
    
	
    int add(YmtkUser record);

    YmtkUser get(Integer id);

    int update(YmtkUser record);

    YmtkUser getUserByName(String loginName);

	/** 
	 * TODO
	 * @param uq
	 * @return
	 * @since libq @ 2016年4月3日 下午7:55:26
	*/
	public List<YmtkUser> queryUsers(BaseUserQuery uq);

	/** 
	 * TODO
	 * @param i
	 * @return
	 * @since libq @ 2016年4月3日 下午7:58:25
	*/
	YmtkUser select(int i);
}