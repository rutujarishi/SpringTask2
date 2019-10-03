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
        Movie movie2 = factory.getBean(Movie.class);
        if(movie1==movie2)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        movie1.print();
    }
}