package com.niu.threadpool;

import java.util.concurrent.*;

/**
 * Description:四种线程池
 * CachedThreadPool();
 * FixedThreadPool();
 * ScheduledThreadPool();
 * SingleThreadExecutor();
 *
 * @author Niu Haoxuan
 * @date Created on 2018/5/25.
 */
public class ThreadPool {


    public static ExecutorService newCachedThreadPool(){

        /**
         * CachedThreadPool();
         *
         * 可缓存线程池：
         * 1、线程数无限制；
         * 2、有空闲线程则复用空闲线程，若无空闲线程则新建线程；
         * 3、一定程序减少频繁创建/销毁线程，减少系统开销；
         */
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        /**
         * FixedThreadPool();
         *
         * 定长线程池：
         * 1、可控制最大线程并发数
         * 2、超出的线程会在队列中等待
         */
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(100);

        /**
         * ScheduledThreadPool();
         *
         * 定时线程池:
         * 1、支持定时及周期性执行任务
         */
        ExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(10);

        /**
         * singleThreadExecutor();
         *
         * 单线程化的线程池：
         * 1、有且仅有一个工作线程执行任务；
         * 2、所有任务按照指定顺序执行，遵循队列规则；
         */
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        ThreadPoolExecutor cusThreadPool = new ThreadPoolExecutor(100, Integer.MAX_VALUE, 100, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
        return null;
    }



}
