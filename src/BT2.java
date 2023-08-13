import java.util.Scanner;

public class BT2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nCHUONG TRINH DAO NGUOC TRAT TU CAC KY TU TRONG TUNG TU CUA MOT XAU!");
		System.out.print("\nNhap vao mot xau: ");
		String str = sc.nextLine();
	
		System.out.print("Xau da dao la: "+daoXau(str));
	}
	
	 public static String daoXau(String str) {        
	        String[] str1 = str.split(" ");
	        StringBuilder daoTu = new StringBuilder();
	        
	        for (String str2 : str1) {
	            StringBuilder daoKiTu = new StringBuilder();
	            for (int i = str2.length() - 1; i >= 0; i--) {
	            	daoKiTu.append(str2.charAt(i));
	            }
	            
	            daoTu.append(daoKiTu).append(" ");
	        }
	        
	        return daoTu.toString().trim();
	    }
}
