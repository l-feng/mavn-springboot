package com.lunatic.manager;



import javax.sql.DataSource;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;



@SpringBootApplication
public class App {
	private static Logger logger = LoggerFactory.getLogger(App.class);

//	@Bean
//	@ConfigurationProperties(prefix = "spring.datasource")
//	public DataSource dataSource() {
//		return DruidDataSourceBuilder.create().build();
//	}

//	@Bean
//	public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
//
//		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//		sqlSessionFactoryBean.setDataSource(dataSource());
//
//		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//
//		sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/com/*.xml"));
//
//		return sqlSessionFactoryBean.getObject();
//	}

//	@Bean
//	public PlatformTransactionManager transactionManager() {
//		return new DataSourceTransactionManager(dataSource());
//	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		logger.info("SpringBoot Start Success");
	}
    
}

