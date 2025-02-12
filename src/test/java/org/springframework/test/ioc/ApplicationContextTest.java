package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.ioc.bean.Person;

public class ApplicationContextTest {


    @Test
    public void testApplicationContext() {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:mspring-bean.xml");

        Person person = context.getBean("person", Person.class);
        System.out.println(person);


    }

}
