package com.xtkj.api.fuse;

import com.xtkj.api.IBlogService;
import com.xtkj.pojo.Blog;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class BlogServiceFallBack implements FallbackFactory<IBlogService> {
    @Override
    public IBlogService create(Throwable throwable) {
        return new IBlogService() {
            @Override
            public List<Blog> getBLogs() {
                List<Blog> list = new ArrayList<>();
                Blog b = new Blog();
                b.setbContext("请求BLog集合超时");
                list.add(b);
                return list;
            }

            @Override
            public Blog getBLogById(Integer id) {
                Blog blog = new Blog();
                blog.setbId(new BigDecimal(id));
                blog.setbContext("暂停服务");
                return blog;
            }

            @Override
            public int addBlog(Blog blog) {
                return 0;
            }

            @Override
            public int deleteBlog(Integer id) {
                return 0;
            }
        };
    }
}
