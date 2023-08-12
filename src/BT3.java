import java.util.Scanner;

public class BT3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("CHUUONG TRINH KIEM TRA CHUOI CO PHAI LA PALIMDROME HAY KHONG?");
		System.out.println("Nhap vao chuoi can kiem tra: ");
		String str = sc.nextLine();
		
		if(kiemTra(str)) {
			System.out.println("Chuoi "+str+" la  palindrome.");
		}else System.out.println("Chuoi "+str+" khong phai la  palindrome.");
	}
	
	public static boolean kiemTra(String str) {
		int a = str.length();
		
		for(int i=0; i<a/2; i++) {
			if(str.charAt(i) == str.charAt(a-i-1)) {
				return true;
			}
		}
		return false;
		
	}
}
