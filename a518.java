import java.util.Scanner;
public class a518 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(a == -1 && b == -1) {
				break;
			}
			int c = Math.abs(b - a) % 99;
			int d = 99 - b + a + 1;
			int e = 99 - a + b + 1;
			if(c == 0 && a != b) {
				c++;
			}
			if(c < d && c < e) {
				System.out.println(c);
			}
			else if(c >= d && e > d) {
				System.out.println(d);
			}
			else if(c >= e && d >= e) {
				System.out.println(e);
			}
		}

	}

}
