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

import java.net.SocketException;

public class ExceptionDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ExceptionDemo exceptionDemo = new ExceptionDemo();
        Class mongoExceptionClass = null;
        Class mysqlExceptionClass = null;
        boolean mongoExceptionFlag = false;
        boolean mysqlExceptionFlag = false;
        try {
            getException();
        } catch (Throwable throwable) {
            mysqlExceptionClass = Class.forName("java.sql.SQLException");
            mongoExceptionClass = Class.forName("com.mongodb.MongoException");
            mongoExceptionFlag = mongoExceptionClass.isInstance(throwable);
            mysqlExceptionFlag = mysqlExceptionClass.isInstance(throwable);
            System.out.println("mongoExceptionFlag:" + mongoExceptionFlag + ";   mysqlExceptionFlag:" + mysqlExceptionFlag);
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
//        throw new MongoSocketReadException("mogno", null, null);
    }

    private Class getClzss(String className) {
        ClassLoader classLoader = this.getClass().getClassLoader();
        try {
            return classLoader.loadClass(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
