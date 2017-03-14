package com.sabre.base.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
public class DataSourcePrimaryConfig {

	private static final String DATABASE_DRIVER = "primary.datasource.driverClassName";
	private static final String DATABASE_URL = "primary.datasource.url";
	private static final String DATABASE_USER = "primary.datasource.username";
	private static final String DATABASE_PASSWORD = "primary.datasource.password";
	private static final String INITIALSIZE = "primary.datasource.initialSize";
	private static final String MINIDLE= "primary.datasource.minIdle";
	private static final String MAXACTIVE= "primary.datasource.maxActive";
	
	@Resource
	private Environment env;
	
	@Bean(name = "primaryDS")
	@Qualifier("primaryDS")
	@Primary
	public DataSource primaryDataSource() {
		DruidDataSource source = new DruidDataSource();
		source.setDriverClassName(env.getRequiredProperty(DATABASE_DRIVER));
		source.setUrl(env.getRequiredProperty(DATABASE_URL));
		source.setUsername(env.getRequiredProperty(DATABASE_USER));
		source.setPassword(env.getRequiredProperty(DATABASE_PASSWORD));
		
		source.setInitialSize(Integer.valueOf(env.getRequiredProperty(INITIALSIZE)));
		source.setMinIdle(Integer.valueOf(env.getRequiredProperty(MINIDLE)));
		source.setMaxActive(Integer.valueOf(env.getRequiredProperty(MAXACTIVE)));
		
		return source;
	}


}
