package com.lou;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * servlet启动类
 *
 * @author loufeng
 * @date 2018/9/6 下午3:23
 */
public class SpringBootApplicationStarter extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里一定要指向原先用main方法执行的Application启动类
        return builder.sources(Application.class);
    }
}
