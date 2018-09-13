package com.lou.dao;

import com.lou.model.WxUserDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author loufeng
 * @date 2018/9/7 下午2:45
 */
@Mapper
public interface WxUserDao {
    /**
     * 根据id查找
     *
     * @param openId 用户id
     * @return 用户信息
     */
    WxUserDO selectById(String openId);

    /**
     * 录入用户数据
     *
     * @param userDO 用户数据
     */
    void insert(WxUserDO userDO);
}
