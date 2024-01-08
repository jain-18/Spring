package com.springcore.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spelconfig.xml");
        Demo d1 = (Demo) context.getBean("demo");
        System.out.println(d1);

//        not widely used
//        SpelExpressionParser temp = new SpelExpressionParser();
//        Expression expression = temp.parseExpression("22+44");
//        System.out.println(expression.getValue());
    }
}
