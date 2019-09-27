package com.xtkj.controller;

import com.xtkj.api.IBlogService;
import com.xtkj.pojo.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BlogConsumerFeignController {
    @Autowired
    private IBlogService iBlogService;

    @GetMapping("consumner/blog/{id}")
    public Blog getBlog(@PathVariable("id") Integer id) {

        return iBlogService.getBLogById(id);
    }
}
