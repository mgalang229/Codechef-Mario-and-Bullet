import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int x = fs.nextInt(), y = fs.nextInt(), z = fs.nextInt();
			System.out.println(Math.max(0, z - (y / x)));
		}
		fs.close();
	}
}
