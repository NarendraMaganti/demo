
public class Loop {
	public static void main(String[] args) {
		int i = 0;
		for (;; i++) {
			System.out.println(i);
			if (i == 10) {
				break;
			}
		}
	}
}
