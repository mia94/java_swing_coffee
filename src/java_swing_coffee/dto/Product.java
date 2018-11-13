package java_swing_coffee.dto;

public class Product {
	private String code;//제품코드
	private String name;//제품이름
	private int price;//제품가격
	private int sales;//판매수량
	private int margin;//마진율(정수로 표현)
	//생성자
	public Product() {
	}
	//코드만 받기
	public Product(String code) {
		this.code = code;
	}
	//전부받기
	public Product(String code, String name, int price, int sales, int margin) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.sales = sales;
		this.margin = margin;
	}
	//코드, 가격, 판매수량, 마진율 받기
	public Product(String code, int price, int sales, int margin) {
		super();
		this.code = code;
		this.price = price;
		this.sales = sales;
		this.margin = margin;
	}
	//get set
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public int getMargin() {
		return margin;
	}
	public void setMargin(int margin) {
		this.margin = margin;
	}
	//toString
	@Override
	public String toString() {
		return "Product [code, name, price, sales, margin]";
	}
	//코드로 비교
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}
	
	
	
	
}
