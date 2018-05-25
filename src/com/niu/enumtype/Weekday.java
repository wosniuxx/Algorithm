package com.niu.enumtype;

/**
 * Description:
 *
 * @author Niu Haoxuan
 * @date Created on 2018/5/25.
 */
public enum Weekday {

    Monday(1,"周一"), Tuesday(2,"周二"), Wednesday(3,"周三"), Thursday(4,"周四"), Friday(5,"周五"), Saturday(6,"周六"), Sunday(7,"周日");

    private int index;

    private String daydes;

    Weekday(int index, String daydes) {
        this.index = index;
        this.daydes = daydes;
    }

    public static String getDaydes(int index){
        for (Weekday weekday : Weekday.values()){
            if (weekday.getIndex() == index){
                System.out.println(weekday.daydes);
                return weekday.daydes;
            }
        }
        return null;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getDaydes() {
        return daydes;
    }

    public void setDaydes(String daydes) {
        this.daydes = daydes;
    }
}
