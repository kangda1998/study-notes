package com.kangda;

/*********************************
 * <p> 文件名称: SplitStudy
 * <p> 系统名称：
 * <p> 模块名称：com.kangda
 * <p> 功能说明: 
 * <p> 开发人员：kangda
 * <p> 开发时间：2019/8/22 10:49
 * <p> 修改记录：程序版本   修改日期   修改人员   修改单号   修改说明
 **********************************/
public class SplitStudy {
    public static void main(String[] args) {
        String name = "kangda-kk";
        String[] names = name.split("-");//names[0]=kangda,name[1]=kk
        System.out.println(
                names[1]
        );

    }
}
