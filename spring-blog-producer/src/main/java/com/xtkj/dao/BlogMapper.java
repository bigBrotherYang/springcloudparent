package com.xtkj.dao;

import com.xtkj.pojo.Blog;
import java.math.BigDecimal;
import java.util.List;

public interface BlogMapper {
    int deleteByPrimaryKey(BigDecimal bId);

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(BigDecimal bId);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKey(Blog record);

    List<Blog> findBlogs();
}