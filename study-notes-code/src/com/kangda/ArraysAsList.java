package com.kangda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*********************************
 * <p> 文件名称: ArraysAsList
 * <p> 系统名称：
 * <p> 模块名称：com.kangda
 * <p> 功能说明: 
 * <p> 开发人员：kangda
 * <p> 开发时间：2019/8/16 14:51
 * <p> 修改记录：程序版本   修改日期   修改人员   修改单号   修改说明
 **********************************/
public class ArraysAsList {
    public static void main(String[] args) {
        String[] a = {"1","2","h"};
       int[] i ={2,3,4};

//        ArrayList arrayList = new ArrayList(Arrays.asList(a));
      List list = Arrays.asList(i);
        System.out.println(list.size()); //当为基本数据类型size=1，而传入包装类，Arrays.asList()为3

    }
}
