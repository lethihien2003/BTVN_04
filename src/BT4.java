import java.util.Scanner;

public class BT4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CHUONG TRINH CHUAN HOA CHUOI NHAP VAO!");
		System.out.print("Nhap vao chuoi: ");
		String str = sc.nextLine();
		
		//loai bo khoang trang
		String str1 = str.trim().replaceAll("\\s+"," ");
		
		//chuyen sang ki tu thuong
		String str2 = str1.toLowerCase();
		
		//viet hoa ki tu dau 
		System.out.print("Chuoi: "+str2);
	}
}
