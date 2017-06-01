package cn.cl.dubbo.biz.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by chenlang on 2017/5/27.
 */
public class DubboServiceMain {

    public static void main(String[] args) throws IOException{
        long begin = System.currentTimeMillis();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"spring/applicationContext.xml"});
        context.start();
        System.out.println("dubbo service started in " + (System.currentTimeMillis() - begin) / 1000 +" seconds! Press any key to exit");
        System.in.read();
    }

}
