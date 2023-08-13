import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class BT5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CHUONG TRINH TACH HO, TEN DEM VA TEN CUA MOT CHUOI!");
		System.out.print("Nhap vao mot chuoi ho ten: ");
		String str = sc.nextLine();
		
		String ho = " ";
		String tendem = " ";
		String ten = " ";
		
		int str1 = str.indexOf(" ");
		int str2 = 0;
		
		if(str1 == -1) {
			System.out.print("\nNhap day du ho va ten dem!");
			return;
		}
		
		ho = str.substring(str2,str1);
		str2 = str1+1;
		str1 = str.indexOf(" ",str2);
		
		if(str1!=-1) {
			tendem = str.substring(str2,str1);
			str2=str1+1;
		}
		
		ten = str.substring(str2);
		System.out.println("\t\nHo: "+ho+"\t\nDem: "+tendem+"\t\nTen: "+ten);
		
	}
}
