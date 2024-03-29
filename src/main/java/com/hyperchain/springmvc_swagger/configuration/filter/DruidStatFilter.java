package com.hyperchain.springmvc_swagger.configuration.filter;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * 配置druid监控统计功能
 * Druid过滤器
 */
/*@WebFilter(filterName = "druidWebStatFilter",urlPatterns = "/*",
        initParams = {
            @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")// 忽略资源
        }
)*/
//public class DruidStatFilter extends WebStatFilter {
//}
