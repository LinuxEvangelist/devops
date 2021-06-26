package com.rllontop.devops.web.controller;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DevopsInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String theMethod = request.getMethod();

        if (HttpMethod.POST.matches(theMethod)) {
            return true;
        }
        else {
            response.getWriter().write("ERROR");
            response.setStatus(400);
            return false;
        }
    }
}
