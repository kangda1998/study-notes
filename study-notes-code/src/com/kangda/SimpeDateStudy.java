package com.kangda;

import java.text.SimpleDateFormat;
import java.util.Date;

/*********************************
 * <p> 文件名称: SimpeDateStudy
 * <p> 系统名称：
 * <p> 模块名称：com.kangda
 * <p> 功能说明: 
 * <p> 开发人员：kangda
 * <p> 开发时间：2019/8/22 10:57
 * <p> 修改记录：程序版本   修改日期   修改人员   修改单号   修改说明
 **********************************/
public class SimpeDateStudy {
    public static String getTimeStr6() {
        String str = "";
        SimpleDateFormat df = new SimpleDateFormat("yy-MM-dd-HH:mm:ss");
        str = df.format(new Date());
        return str;
    }

    public static void main(String[] args) {
        String date =   SimpeDateStudy.getTimeStr6();
        System.out.println(date);
    }
}
