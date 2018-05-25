package com.niu.enumtype;

/**
 * Description:
 *
 * @author Niu Haoxuan
 * @date Created on 2018/5/25.
 */
public class TrafficLight {

    public void change(){
        Weekday.getDaydes(1);
    }

    public static void main(String[] args) {
        TrafficLight  trafficLight = new TrafficLight();
        trafficLight.change();
    }


}
