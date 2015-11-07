package fr.jjouenne.config;

import java.io.IOException;
import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("fr.jjouenne.repository")
public class PersistenceContext {

	
	@Bean(destroyMethod = "close")
	DataSource dataSource(Environment env) {
		HikariConfig hc = new HikariConfig();
//		hc.setDriverClassName(env.getRequiredProperty("db.driver"));
//		hc.setJdbcUrl(env.getRequiredProperty("db.url"));
//		hc.setUsername(env.getRequiredProperty("db.username"));
//		hc.setPassword(env.getRequiredProperty("db.password"));
		Properties prop = new Properties();
		try {
			prop.load(this.getClass().getClassLoader().getResourceAsStream("application.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		hc.setDriverClassName(prop.getProperty("db.driver"));
		hc.setJdbcUrl(prop.getProperty("db.url"));
		hc.setUsername(prop.getProperty("db.username"));
		hc.setPassword(prop.getProperty("db.password"));
		return new HikariDataSource(hc);
	}

	@Bean
	LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource, Environment env) {
		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		entityManagerFactoryBean.setDataSource(dataSource);
		entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		entityManagerFactoryBean.setPackagesToScan("net.petrikainulainen.springdata.jpa.todo");

		Properties jpaProperties = new Properties();
		try {
			jpaProperties.load(this.getClass().getClassLoader().getResourceAsStream("application.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//jpaProperties.put("hibernate.dialect", env.getRequiredProperty("hibernate.dialect"));

//		jpaProperties.put("hibernate.hbm2ddl.auto", env.getRequiredProperty("hibernate.hbm2ddl.auto"));
//		jpaProperties.put("hibernate.ejb.naming_strategy", env.getRequiredProperty("hibernate.ejb.naming_strategy"));
//		jpaProperties.put("hibernate.show_sql", env.getRequiredProperty("hibernate.show_sql"));
//
//		jpaProperties.put("hibernate.format_sql", env.getRequiredProperty("hibernate.format_sql"));
		
		entityManagerFactoryBean.setJpaProperties(jpaProperties);
		return entityManagerFactoryBean;
	}

	@Bean
	JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		return transactionManager;
	}
}
