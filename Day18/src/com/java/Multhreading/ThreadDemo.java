package com.java.Multhreading;
class MusicPlay1 extends Thread
{
	public void run()
	{
		
		System.out.println("MusicPlay Thread Name is " +Thread.currentThread().getName());
		System.out.println("MusicPlay id "+Thread.currentThread().getId());
	}
}
class VideoVoice1 extends Thread 
{
	public void run()
	{
		System.out.println("VideoVoice Thread Name is " +Thread.currentThread().getName());
		System.out.println("VideoVoice id "+Thread.currentThread().getId());
	}
}
class VideoTimer1 extends Thread
{
	public void run()
	{
		System.out.println("VideoTimer Thread Name is " +Thread.currentThread().getName());
		System.out.println("VideoTimer id "+Thread.currentThread().getId());
	}
}
public class ThreadDemo 
{

	public static void main(String[] args)
	{
		MusicPlay1 M1 = new MusicPlay1();
		M1.start();
		VideoVoice1 V1 = new VideoVoice1();
		V1.start();
		VideoTimer1 T1 = new VideoTimer1();
		T1.start();
		

	}

}
