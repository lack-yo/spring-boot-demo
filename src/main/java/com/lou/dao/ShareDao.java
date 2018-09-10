package com.lou.dao;

import com.lou.model.ShareDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author loufeng
 * @date 2018/9/7 下午2:45
 */
@Mapper
public interface ShareDao {
    /**
     * 根据id查找
     *
     * @param id id
     * @return share
     */
    ShareDO selectById(int id);
}
