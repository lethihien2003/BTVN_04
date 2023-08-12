import java.util.Scanner;

public class BT6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CHUONG TRINH IN RA KI TU DAU VA KY TU CUOI TRONG CHUOI!");
		System.out.print("Nhap vao 1 chuoi: ");
		String str = sc.nextLine();
		
		if(str.length()>0) {
			char kyTuDau = str.charAt(0);
			char kyTuCuoi = str.charAt(str.length() - 1);
			
			System.out.println("Ky tu dau tien trong chuoi la: "+kyTuDau);
			System.out.println("Ky tu cuoi cung trong chuoi la: "+kyTuCuoi);
		}else System.out.println("Chuoi da nhap khong co ki tu!");
		
	}
}
