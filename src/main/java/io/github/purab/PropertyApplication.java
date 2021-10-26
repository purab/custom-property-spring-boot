package io.github.purab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
//@EnableConfigurationProperties(SimpleProperties.class)
@ConfigurationPropertiesScan
public class PropertyApplication {

	@Autowired
	private SimpleProperties simpleProperties;

	@Autowired
	private ImmutableProperties immutableProperties;

	@Autowired
	private NestedProperties nestedProperties;

	@Autowired
	private ConvertedProperties convertedProperties;

	@Autowired
	private BeanProperties beanProperties;

	public static void main(String[] args) {
		SpringApplication.run(PropertyApplication.class, args);
	}

	@PostConstruct
	private void postInit(){
//		System.out.println("simple properties info...");
//		System.out.println(simpleProperties);

//		System.out.println("Immutable properties info...");
//		System.out.println(immutableProperties);

		/*System.out.println("Nested properties info...");
		System.out.println(nestedProperties);*/

		/*System.out.println("Converted properties info...");
		System.out.println(convertedProperties.getDuration().toNanos()+" ns");
		System.out.println(convertedProperties.getPeriod().getYears()+" years. "+ convertedProperties.getPeriod().getDays()+" days");
		System.out.println(convertedProperties.getDataSize().toBytes()+ " Bytes");
		System.out.println(convertedProperties.getCustomProperty().getName());
		System.out.println(convertedProperties.getCustomProperty().isImmutable());*/

		System.out.println("Bean properties info...");
		System.out.println(beanProperties.getName());
	}

	@ConfigurationProperties(prefix = "bean")
	@Bean
	BeanProperties beanProperties() {
		return new BeanProperties();
	}

}
