package io.renren.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 配置多数据源
 * @author jingke
 * @email
 * @date 2017/8/19 0:41
 */
@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource firstDataSource(){
        return DruidDataSourceBuilder.create().build();
    }

}
