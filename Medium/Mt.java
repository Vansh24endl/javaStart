class Mt extends Thread
{
	@Override 
	public void run()
	{
		for(int i = 0; i<10; i++)
		{
			System.out.println("I am listing the song ");
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException ie) 
			{
                System.out.println(ie.getMessage());
			}
		}
	}
}
	
class Mt2 extends Thread
{
	@Override 
	public void run()
	{
		for(int i = 0; i<10; i++)
		{
			System.out.println("I am downloading the songs");
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException ie) 
			{
	           System.out.println(ie.getMessage());
			}
		}
	}	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Mt t1 = new Mt();
		Mt2 t2 = new Mt2();
		t1.start();
		t2.start();	
	}
}
