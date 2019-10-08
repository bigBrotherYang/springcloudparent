package com.xtkj.zuulFilter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
@Component
public class BlogzuulFilter extends ZuulFilter {
    @Override
    public String filterType() {
        /**
         *  pre：可以在请求被路由之前调用
         *  route：在路由请求时候被调用
         *  post：在route和error过滤器之后被调用
         *  error：处理请求时发生错误时被调用
         */
        return "pre"; //拦截的生命周期
    }

    @Override
    public int filterOrder() {
        return 0; //加载的顺序
    }

    @Override
    public boolean shouldFilter() {
        return true;//是否启动拦截器
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String accessToken = request.getParameter("accessToken");
        if (StringUtils.isEmpty(accessToken)){
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(401);
            currentContext.setResponseBody("访问没有携带相应信息===>AccessToken");
            System.out.println("访问没有携带相应信息===>AccessToken");
            return null;
        }

        return null;
    }
}
