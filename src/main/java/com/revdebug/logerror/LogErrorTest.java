package com.revdebug.logerror;

import org.apache.log4j.Logger;

import java.io.*;

public class LogErrorTest {
    static Logger log = Logger.getLogger(LogErrorTest.class.getName());

    public static void main(String[] args){
        logStringExample();
        logStringExceptionExample();
    }

    private static void logStringExample() {
        try
        {
            File file=new File("totallyNonExistantFile");
            FileInputStream fis=new FileInputStream(file);
        }
        catch(FileNotFoundException e)
        {
            log.error("The file does not exist");
        }
    }

    private static void logStringExceptionExample() {
        try
        {
            File file=new File("totallyNonExistantFile");
            FileInputStream fis=new FileInputStream(file);
        }
        catch(FileNotFoundException e)
        {
            log.error("The file does not exist", e);
        }
    }
}
