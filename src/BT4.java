import java.util.Scanner;

public class BT4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CHUONG TRINH CHUAN HOA CHUOI NHAP VAO!");
		System.out.print("Nhap vao chuoi: ");
		String str = sc.nextLine();

		System.out.println("Chuỗi đã chuẩn hóa: " + chuanHoaChuoi(str));
		
	}

	public static String chuanHoaChuoi(String str) {
		String str1 = str.trim();

		// Viet hoa chu cai dau
		StringBuilder str2 = new StringBuilder();
		String[] str3 = str1.split("\\s+");
		
		for (String str4 : str3) {
			str2.append(Character.toUpperCase(str4.charAt(0))).append(str4.substring(1)).append(" ");
		}

		// Ket thuc chuoi bang dau cham
		str2.setLength(str2.length() - 1);
		str2.append(".");

		return str2.toString();
	}
}
