package com.huiztech.muyq.dubbo.provider.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author [muyuanqiang]
 * @version [1.0.0]
 * @date: [2019/11/11 22:37]
 * @description []
 */
@Configuration
public class MyBatisConfig {
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        /**
         *  设置请求的页面大于最大页后操作， true调回到首页，false 继续请求  默认false
         */
        paginationInterceptor.setOverflow(false);
        /**
         * 设置最大单页限制数量，默认 500 条，-1 不受限制
         */
        paginationInterceptor.setLimit(500);
        return paginationInterceptor;
    }
}
