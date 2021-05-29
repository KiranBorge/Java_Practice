import java.util.concurrent.locks.*;
class ReentrantDemo
{
	public static void main(String[] args)
	{
		ReentrantLock l = new ReentrantLock(); //create lock
		l.lock();// acquire lock
		l.lock();// acquire lock again
		System.out.println(l.isLocked());// checked Thread has locked or not - True
		System.out.println(l.isHeldByCurrentThread()); // checked current thread holds lock or not - True
		System.out.println(l.getQueueLength());// checked how many Threads are in waiting in Queue - 0
		l.unlock(); // unlock the lock
		System.out.println(l.getHoldCount()); // count the lock holder threads - 1
		System.out.println(l.isLocked()); // As we can see in this program we have acquire 2 locks in the starting of program so and just 1 lock is unlocked so still 1 lock is remaining
		
		l.unlock();// unlock the lock again
		System.out.println(l.isLocked());//checked Thread has locked or not - False
		System.out.println(l.isFair());// checked is there fair policy is assigned or not - False
		
	}
}

/* OUTPUT : 
true
true
0
1
true
false
false

*/
