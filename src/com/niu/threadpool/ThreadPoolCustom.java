package com.niu.threadpool;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Description:线程池代码实例
 *
 * @author Niu Haoxuan
 * @date Created on 2018/5/25.
 */
public class ThreadPoolCustom {

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 10, 200, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());

        for (int i = 0; i<1000; i++){
            MyTask myTask = new MyTask(i);
            executor.execute(myTask);
            System.out.println("线程池中线程数目："+executor.getPoolSize()+"，队列中等待执行的任务数目："+
                    executor.getQueue().size()+"，已执行玩别的任务数目："+executor.getCompletedTaskCount());
        }
        executor.shutdown();
    }

}

class MyTask implements Runnable{

    private int taskNum;

    public MyTask(int num){
        this.taskNum = num;
    }

    @Override
    public void run() {
        System.out.println("正在执行task"+taskNum);
        System.out.println("task "+taskNum+"执行完毕");
    }
}