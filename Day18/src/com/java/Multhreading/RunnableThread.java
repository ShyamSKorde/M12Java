package com.java.Multhreading;
class MusicPlay implements Runnable
{
	public void run()
	{
		
		System.out.println("MusicPlay Thread Name is " +Thread.currentThread().getName());
		System.out.println("MusicPlay id "+Thread.currentThread().getId());
	}
}
class VideoVoice implements Runnable 
{
	public void run()
	{
		System.out.println("VideoVoice Thread Name is " +Thread.currentThread().getName());
		System.out.println("VideoVoice id "+Thread.currentThread().getId());
	}
}
class VideoTimer implements Runnable
{
	public void run()
	{
		System.out.println("VideoTimer Thread Name is " +Thread.currentThread().getName());
		System.out.println("VideoTimer id "+Thread.currentThread().getId());
	}
}
public class RunnableThread {

	public static void main(String[] args)
	{
		System.out.println(" Main Thread is running........." + Thread.currentThread().getName());
		MusicPlay M1 = new MusicPlay();
		Thread T1 = new Thread(M1);
		//System.out.println("Thread Name is " +T1.getName());
		//System.out.println("MusicPlay id "+T1.getId());
		T1.start();
		VideoVoice V1 = new VideoVoice();
		Thread T2 = new Thread(V1);
		T2.start();
		VideoTimer VT1 = new VideoTimer();
		Thread T3 = new Thread(VT1);
		T3.start();
		// TODO Auto-generated method stub

	}

}
/* getId() :- the getid() method is used to return the thread identifier its unique possite no which was generated at the time of thread creatation 
              the thread is remain unchanged during its lifetime when the thread is terminated the id of thread creatation */