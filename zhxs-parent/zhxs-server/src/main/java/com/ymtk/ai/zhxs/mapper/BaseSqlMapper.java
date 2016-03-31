package com.ymtk.ai.zhxs.mapper;



import java.util.List;

import org.springframework.dao.DataAccessException;

public interface BaseSqlMapper<T> extends SqlMapper {
    
    public int add(T entity) throws DataAccessException;
    
    public int edit(T entity) throws DataAccessException;
    
    public int remove(T entity) throws DataAccessException;
    
    public T get(T entity) throws DataAccessException;
    
    public List<T> getList(T entity) throws DataAccessException;
}

