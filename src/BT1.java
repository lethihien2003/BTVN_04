import java.util.Scanner;

public class BT1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap vao 1 chuoi so: ");
		String str = sc.nextLine();
		
		int a = Integer.parseInt(str);
		System.out.println("Chuoi sau khi da chuyen doi: "+chuyenDoiSo(str));
		
	}

	public static String chuyenDoiSo( String str) {
		int str1 = str.length();
		String dem = " ";
		
		for(int i=0; i<str1; i++) {
			char a = str.charAt(i);
			dem+=a;
			
			if((str1-i-1)%3 == 0 && i!=str1-1){
				dem +=",";
			}
		}
		return dem;
			
	}
}
