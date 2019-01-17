/*
package com.hyperchain.springmvc_swagger.configuration.config;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.google.common.collect.Lists;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;


*/
/**
 * druid连接池的配置，配置如何处理慢sql
 */

/*@Configuration
public class DruidConfig {
    //这个注解读取配置文件前缀为prefix的配置，
    @ConfigurationProperties(prefix = "spring.datasource.druid")
    //容器的开启与关闭
    @Bean(initMethod = "init",destroyMethod = "close")
    public DruidDataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setProxyFilters(Lists.newArrayList(statFilter()));
        return dataSource;
    }

    //bean注解，成为spring的bean,利用filter将慢sql的日志打印出来
    @Bean
    public Filter statFilter(){
        StatFilter statFilter = new StatFilter();
        //多长时间定义为慢sql,这里定义为5s
        statFilter.setSlowSqlMillis(5000);
        //是否打印出慢日志
        statFilter.setLogSlowSql(true);
        //是否将日志合并起来
        statFilter.setMergeSql(true);
        return statFilter;
    }

    //这是配置druid的监控
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(new StatViewServlet());
        servletRegistrationBean.addUrlMappings("/druid/*");
        Map<String,String> initParameter = new HashMap<>();
        initParameter.put("resetEnable","false");////禁用HTML页面上的“Rest All”功能
        initParameter.put("allow","");//ip白名单（没有配置或者为空，则允许所有访问）
        initParameter.put("loginUsername","admin");//++监控页面登录用户名
        initParameter.put("loginPassword","123.admin");//++监控页面登录用户密码
        initParameter.put("deny","");//ip黑名单 //如果某个ip同时存在，deny优先于allow
        servletRegistrationBean.setInitParameters(initParameter);
        return servletRegistrationBean;
    }
}*/

