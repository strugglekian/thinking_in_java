/**
 * @Author kkf7688
 * @Data 2019/4/15
 * @Version 1.0
 */

package com.thinking.exception;


import com.mongodb.MongoException;
import com.mongodb.MongoSocketOpenException;
import com.mongodb.MongoSocketReadException;
import com.mongodb.ServerAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.Launcher;

import java.net.SocketException;

public class ExceptionDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ExceptionDemo exceptionDemo = new ExceptionDemo();
        exceptionDemo.getClzss();
        Class<?> mongoExceptionClass;
        Class mysqlExceptionClass;
        boolean mongoExceptionFlag;
        boolean mysqlExceptionFlag;
        try {
            getException();
        } catch (Throwable throwable) {
            System.out.println("throwable:"+throwable.getClass().getClassLoader().toString());
            ClassLoader classLoader = Launcher.getLauncher().getClassLoader();
            mysqlExceptionClass = Class.forName("java.sql.SQLException");
            mongoExceptionClass = Class.forName("com.mongodb.MongoException");
            mongoExceptionFlag = mongoExceptionClass.isInstance(throwable);
            mysqlExceptionFlag = mysqlExceptionClass.isInstance(throwable);
//            ClassLoader.getSystemClassLoader().loadClass("");
            System.out.println("mongoExceptionFlag:" + mongoExceptionFlag + ";   mysqlExceptionFlag:" + mysqlExceptionFlag);
            System.out.println(mongoExceptionClass.getClassLoader().toString());

            if (mongoExceptionClass != null && mongoExceptionFlag) {
                System.out.println("mongoError");
            } else if (mysqlExceptionClass != null && mysqlExceptionFlag) {
                System.out.println("mysql Error");
            } else {
                System.out.println("unknown Error");
            }
        }
    }

    private static void getException() {
        throw new MongoException("sdf");
    }

    private void getClzss( ) {
        ClassLoader classLoader = this.getClass().getClassLoader();
        System.out.println(classLoader.toString());
    }
}
