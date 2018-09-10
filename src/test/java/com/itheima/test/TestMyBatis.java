package com.itheima.test;


import com.itheima.utils.MyBatisUtils;

/****
 * @author:shenkunlin
 * @projectName:taotao-reversal
 * @date:2017/12/24 8:13
 * @package:com.taotao
 * @description:
 **/
public class TestMyBatis {

    public static void main(String[] args) throws Exception {
        try {
            MyBatisUtils generatorSqlmap = new MyBatisUtils();
            generatorSqlmap.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
