package com.xtkj.service;

import com.xtkj.pojo.Blog;

import java.util.List;

public interface IBlogService {
    Blog get(Integer id);
    List<Blog> list();
    int put(Blog blog);
    int delete(Integer id);
}
