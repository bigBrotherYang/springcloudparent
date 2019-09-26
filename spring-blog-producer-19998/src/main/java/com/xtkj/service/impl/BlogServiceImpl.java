package com.xtkj.service.impl;

import com.xtkj.dao.BlogMapper;
import com.xtkj.pojo.Blog;
import com.xtkj.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private BlogMapper blogMapper;

    @Override
    public Blog get(Integer id) {
        return blogMapper.selectByPrimaryKey(new BigDecimal(id));
    }

    @Override
    public List<Blog> list() {
        return blogMapper.findBlogs();
    }

    @Override
    public int put(Blog blog) {
        return blogMapper.insertSelective(blog);
    }

    @Override
    public int delete(Integer id) {
        return blogMapper.deleteByPrimaryKey(new BigDecimal(id));
    }
}
