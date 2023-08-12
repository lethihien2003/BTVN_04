import java.util.Scanner;

public class BT2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CHUONG TRINH DAO NGUOC TRAT TU CAC KY TU TRONG TUNG TU CUA MOT XAU!");
		System.out.println("Nhap vao mot xau: ");
		String str = sc.nextLine();
		
		//Su dung String
		System.out.println("kq: "+string(str));
		
	}
	public static String string(String str) {
		//loai bo khoang trang
		String[] str1 = str.split("\\s+");
		String str2 =" ";
		
		for(int i=0; i<str1.length; i++) {
			String str3 = str1[i];
			
		}
		return str ;
		
	}
}
