package com.github.bishnusubedi.main;

import com.github.bishnusubedi.dateconverter.converter.DateConverter;
import com.github.bishnusubedi.dateconverter.utils.DateBS;

import java.util.Date;

/**
 * Created by bishnusubedi
 * Created on 18/06/25
 */
public class Main {
    /**
     * main method
     * @param args string args
     */
    public static void main(String[] args){
        DateBS dateBS = new DateBS();
        Date date = DateConverter.convertBSToAD(dateBS);
        System.out.println(date);
    }
}
