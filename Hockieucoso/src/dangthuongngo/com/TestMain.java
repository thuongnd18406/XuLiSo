package dangthuongngo.com;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Khả năng lưu trữ tối đa của int = "+Integer.MAX_VALUE);
		System.out.println("Khả năng lưu trữ tối thiểu của long = "+Long.MAX_VALUE);
		//Tất cả dữ liệu nhập vào từ bàn phím đều là chuỗi hết, do đó phải dùng Wrapper class để đưa về số
		//Lớ Scanner đã làm giùm cho ta
		//Nhưng giả sử không có Scanner để gọi nextInt(), nextDouble()...?
		double x =Double.parseDouble("5.5");
		System.out.println("x="+x);
		//byte -> short -> int -> long-> float ->double
		
		double d=5.0;
		//chương trình sẽ báo lỗi khi kiểu dữ liệu lớn hơn 
		//kiểu dữ liệu của biến
		//sai: float f=d; vì f>d
		//==> ta cần ép giá trị gán cho f về kiểu dữ liệu float hoặc nhỏ hơn float
		float f=(float)d;
		
		//ép kiểu rộng: thực ra ta ít khi ép vì nó tự ép 
		//chỉ 1 vài trường hợp, liên quan đến phép chiata phải ép rộng
		//sai:double y=1/2; => kết quả y=0.0
		double y=1.0/2; 
		//hoặc double y=(double)1/2; 
		System.out.println("y="+y);
		
		int x1=5;
		int x2=3;
		double x3=(double)x1/x2;
		//hoặc double x3=x1*1.0/x2;
		System.out.println("x3="+x3);
		
		//khai báo
		double diemTrungBinh1;
		double diemTrungBinh2=0.0;
		//khai baos hanwgf số
		final double VAT=10;
		//VAT=11; =>báo lỗi
		
		//toán tử + - * / %
		int x5=5;
		System.out.println("kq1="+x5/2);	
		System.out.println("kq1="+x5%2);
		
		//prefix ++x
		//postfix x++
		
	}

}
