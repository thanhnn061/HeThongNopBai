package spring.java.HeThongNopBai.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import spring.java.HeThongNopBai.dao.GiangVienDao;
import spring.java.HeThongNopBai.dao.LopHocPhanDao;
import spring.java.HeThongNopBai.dao.MonHocDao;
import spring.java.HeThongNopBai.dao.SinhVienDao;
import spring.java.HeThongNopBai.dao.TaiKhoanDao;
import spring.java.HeThongNopBai.dao.impl.GiangVienDaoImpl;
import spring.java.HeThongNopBai.dao.impl.LopHocPhanDaoImpl;
import spring.java.HeThongNopBai.dao.impl.MonHocDaoImpl;
import spring.java.HeThongNopBai.dao.impl.SinhVienDaoImpl;
import spring.java.HeThongNopBai.dao.impl.TaiKhoanDaoImpl;

@Configuration
@ComponentScan("spring.java.HeThongNopBai.*")
@EnableTransactionManagement
//Load to Environment.
@PropertySource("classpath:ds-hibernate-cfg.properties")
public class ApplicationContextConfig {
	@Bean(name = "viewResolver")
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	@Bean(name = "multipartResolver")
	public MultipartResolver getMultipartResolver() {
		CommonsMultipartResolver resover = new CommonsMultipartResolver();
		// 30MB
		resover.setMaxUploadSize(30 * 1024 * 1024);

		return resover;
	}

	@Autowired
	private Environment env;

	@Bean(name = "dataSource")
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName(env.getProperty("ds.database-driver"));
		dataSource.setUrl(env.getProperty("ds.url"));
		dataSource.setUsername(env.getProperty("ds.username"));
		dataSource.setPassword(env.getProperty("ds.password"));

		return dataSource;
	}

	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) throws Exception {
		Properties properties = new Properties();

		// Xem: ds-hibernate-cfg.properties
		properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
		properties.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
		properties.put("current_session_context_class", env.getProperty("current_session_context_class"));

		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setPackagesToScan(new String[] { "spring.java.HeThongNopBai.entity" }); ////
		factoryBean.setDataSource(dataSource);
		factoryBean.setHibernateProperties(properties);
		factoryBean.afterPropertiesSet();
		//
		SessionFactory sf = factoryBean.getObject();
		return sf;
	}

	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);

		return transactionManager;
	}

	// Load property in message/validator.properties
	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource rb = new ResourceBundleMessageSource();
		// Load property in message/validator.properties
		rb.setBasenames(new String[] { "messages/validator" });
		return rb;
	}

	@Bean(name = "login")
	public TaiKhoanDao check() {
		return new TaiKhoanDaoImpl();
	}

	@Bean(name = "monhoc")
	public MonHocDao XemMonHoc() {
		return new MonHocDaoImpl();
	}

	@Bean(name = "giangvien")
	public GiangVienDao xemGiangVien() {
		return new GiangVienDaoImpl();
	}

	@Bean(name = "lophocphan")
	public LopHocPhanDao xemLopHocPhan() {
		return new LopHocPhanDaoImpl();
	}

	@Bean(name = "sinhvien")
	public SinhVienDao xemSinhVien() {
		return new SinhVienDaoImpl();
	
	}
}