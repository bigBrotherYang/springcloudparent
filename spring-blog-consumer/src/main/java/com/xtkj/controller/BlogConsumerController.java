package com.xtkj.controller;

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
public class BlogConsumerController {

    @LoadBalanced
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("consumner/blog/{id}")
    public Blog getBlog(@PathVariable("id") Integer id) {
        ServiceInstance choose = loadBalancerClient.choose("blog-producer");
//        String url = "http://" + choose.getHost() + ":" + choose.getPort() + "/blog/" + id;
        String url = "http://BLOG-PRODUCER/blog/" + id;
        System.out.println(url);
        return restTemplate.getForObject(url, Blog.class);
    }
}
