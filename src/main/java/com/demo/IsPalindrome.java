package com.demo;

import org.apache.hadoop.hive.ql.exec.UDF;

/**
 * hadoop udf demo
 * this function is used for checking whether a string is palindrome
 * @author chenxyz
 * @version 1.0
 * @date 2017-06-13
 * Copyright
 */
public class IsPalindrome extends UDF {

    public String evaluate(String str) {
        if(str != null) {
            String reverse = new StringBuilder(str).reverse().toString();
            if (str.equals(reverse)) {
                return "1";
            }
        }
        return "0";
    }

}
