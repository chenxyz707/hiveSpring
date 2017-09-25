package com.demo;

import org.apache.hadoop.hive.ql.exec.UDAFEvaluator;
import org.apache.hadoop.hive.ql.udf.generic.AbstractGenericUDAFResolver;

/**
 * hadoop udf demo
 * this function is used for checking whether a string is palindrome
 * @author chenxyz
 * @version 1.0
 * @date 2017-06-13
 * Copyright
 */
public class FnMax extends AbstractGenericUDAFResolver {

    public static class ExampleUDAFEvaluator implements UDAFEvaluator {

        @Override
        public void init() {

        }
    }
}
