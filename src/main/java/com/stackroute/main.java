package com.stackroute;
import com.stackroute.domain.*;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

class Main {
    public static void main( String[] args )
    {
        ApplicationContext factory = new AnnotationConfigApplicationContext(Config.class);
        Movie movie1 = factory.getBean(Movie.class);
        movie1.getActor().setName("Deepika");
        movie1.getActor().setGender("Female");
        movie1.getActor().setAge(29);
        movie1.print();
    }
}