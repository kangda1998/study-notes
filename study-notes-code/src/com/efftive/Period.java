package com.efftive;

import java.util.Date;

public final class Period {
    private  final Date start;
    private  final Date end;

    public Period(Date start, Date end) throws IllegalAccessException {
        if (start.compareTo(end)>0){
            throw  new IllegalAccessException(start+"after"+end);
        }
        /**
         * 不安全
         */
//        this.start = start;
//        this.end = end;
        /**
         * 可以防御由date可变引起的问题
         */
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

    }

    /**
     * 安全，内部访问改变date也可以防御
     * @return
     */
    public Date getStart() {
        return new Date(start.getTime());
    }

    public Date getEnd() {
        return new Date(end.getTime());
    }

    /**
     * 不安全，内部调用提供访问仍然可以改变
     * @return
     */
//    public Date getStart() {
//        return start;
//    }
//
//    public Date getEnd() {
//        return end;
//    }

    @Override
    public String toString() {
        return "Period{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
