package JUnitLocked;

public class InfiniteLoop {
	public static int loop (int one){
		while (one==1){
			one = 1;
		}
		return 2;
	}
}
