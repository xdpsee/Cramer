package com.cw.cramer.common.constant;

import java.util.concurrent.ConcurrentLinkedQueue;

import com.cw.cramer.sys.entity.SysOperateLog;
import com.cw.cramer.sys.thread.OperateLogThread;
import com.cw.cramer.sys.thread.runnable.OperateLogRunnable;

/**
 * 通用常量
 * @author wicks
 */
public class CommonConstant {
	
	/**
	 * 日志记录线程
	 */
	public static OperateLogThread logThread;
	
	//启动日志线程
	static{
		logThread = new OperateLogThread(new OperateLogRunnable());
		logThread.start();
	}
	
	/**
	 * 升序排序
	 */
	public static String SORT_ASC = "asc";
	
	/**
	 * 降序排序
	 */
	public static String SORT_DESC = "desc";
	
	/**
	 * 日志队列
	 */
	public static ConcurrentLinkedQueue<SysOperateLog> logQueue;
	
	/**
	 * 日志周期
	 */
	public static long LOG_TIME = 1000*60*1;
	
	/**
	 * 日志队列最大长度
	 */
	public static long LOGQUEUE_SIZE = 100;

}
