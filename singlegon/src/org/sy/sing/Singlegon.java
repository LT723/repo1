package org.sy.sing;
/**
 * 典型的单例模式,懒汉模式
 * @author 李帅
 *
 */
public class Singlegon {
	//volatile作用:防止其他线程在进来的时候经过instance赋值在第一重判断的时候就可以直接
	//  返回值不用阻塞
	private static volatile Singlegon instance;
	
	public Singlegon() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singlegon getInstance() {
		// 第一重判断 
		if (instance == null) {
			// 同步代码块.创建实例
			synchronized (Singlegon.class) {
				// 第二重判断
				if (instance == null) {
					instance = new Singlegon();
				}
			}
		}
		return instance;
	}
}
