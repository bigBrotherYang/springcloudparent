package com.xtkj.api;

import com.xtkj.api.fuse.BlogServiceFallBack;
import com.xtkj.pojo.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@FeignClient(value = "BLOG-PRODUCER",fallbackFactory = BlogServiceFallBack.class)
public interface IBlogService {

    @GetMapping("blog/list")
    public List<Blog> getBLogs();
    @GetMapping("blog/{id}")
    public Blog getBLogById(@PathVariable("id")Integer id);

    @PutMapping("blog/put")
    public int addBlog(@RequestBody Blog blog);
    @DeleteMapping("blog/{id}")
    public int deleteBlog(@PathVariable("id")Integer id);

}
