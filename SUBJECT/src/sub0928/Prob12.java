package sub0928;

public class Prob12 {

	public static void main(String[] args) {
		String url1 = "http://localhost/order?prodId=RPOD-001&prodName=갤럭시3&price=980000";
		String prodName = getParameter(url1, "prodName");
		System.out.println("제품 이름 : "+ prodName);
		
		String url2 = "http://localhost/registUser?userId=USER-001&userName=홍길동&address=서울시 강남구&userAge=26";
		String userAddress = getParameter(url2, "address");
		System.out.println("회원 주소 : "+userAddress);
	}
	
	private static String getParameter(String url, String paramName) {
		url += '&';
		return (url.substring(url.indexOf(paramName)+paramName.length()+1)).
				substring(0, (url.substring(url.indexOf(paramName)+paramName.length()+1)).indexOf('&'));
	}
}