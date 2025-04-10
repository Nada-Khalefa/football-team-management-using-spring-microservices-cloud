/*
package com.spring.zuul.config;
import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
//import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class ZuulGateway extends ZuulFilter {
// you may have more than Filter

    @Override
    public String filterType() {
        return "pre"; // pre post error
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    // processing {business logic}
    @Override
    public Object run() throws ZuulException {
        HttpServletRequest httpServletRequest=
                RequestContext.getCurrentContext().getRequest();
        System.out.println("---> request from "+ httpServletRequest.getRequestURI());

        return null;
    }
}

*/