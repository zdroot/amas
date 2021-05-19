package com.filter;

import org.springframework.mock.web.MockHttpServletResponse;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//过滤器
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter.init");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
       //找Servlet 方法继续执行
        System.out.println("doFilter...");
       filterChain.doFilter(req,resp);
//     HttpServletResponse re = (HttpS  ervletResponse) resp;
//     re.sendRedirect("index.jsp");

    }

    @Override
    public void destroy() {
        System.out.println("destory");
    }
}
