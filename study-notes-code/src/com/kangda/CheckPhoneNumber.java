package com.kangda;

import java.util.regex.Pattern;

/*********************************
 * <p> 文件名称: CheckPhoneNumber
 * <p> 系统名称：
 * <p> 模块名称：com.kangda
 * <p> 功能说明: 校验手机号码格式
 * <p> 开发人员：kangda28028
 * <p> 开发时间：2019/8/19 14:53
 * <p> 修改记录：程序版本   修改日期   修改人员   修改单号   修改说明
 **********************************/
public class CheckPhoneNumber {
    public static boolean isPhoneNumber(String phoneNumber) {
        boolean flag = false;
        if (phoneNumber.length() == 0) {
            return false;
        }
        //length==1
        String[] mobiles = phoneNumber.split(",");
        int len = mobiles.length;
        if (len == 1) {
            return Pattern.matches("^1\\d{10}$", phoneNumber);
        }
        return flag;
    }

    public static void main(String[] args) {
        String number ="15279612663";
        Boolean result =  CheckPhoneNumber.isPhoneNumber(number);
        System.out.println(result);
    }
}
