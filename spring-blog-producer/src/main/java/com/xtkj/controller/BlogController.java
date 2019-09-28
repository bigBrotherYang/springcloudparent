package com.xtkj.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.xtkj.pojo.Blog;
import com.xtkj.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @GetMapping("blog/list")
    public List<Blog> getBLogs(){
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return blogService.list();
    }
    @GetMapping("blog/{id}")
    public Blog getBLogById(@PathVariable("id")Integer id){
        System.out.println("9998生产者被调用");
        return blogService.get(id);
    }

    @PutMapping("blog/put")
    public int addBlog(@RequestBody Blog blog){

        return blogService.put(blog);
    }
    @DeleteMapping("blog/{id}")
    public int deleteBlog(@PathVariable("id")Integer id){
        return blogService.delete(id);
    }

}
