package java_swing_coffee.dao;

import java.util.ArrayList;
import java.util.List;

import java_swing_coffee.dto.Beverage;
import java_swing_coffee.dto.Coffee;
import java_swing_coffee.dto.Product;

public class ProductDaoImplArrayList implements ProductDao {
	
	private List<Product> datas;
	
	
	public ProductDaoImplArrayList() {
		datas = new ArrayList<>();
		
		datas.add(new Coffee("A001","아메리카노",4100,20,20));
		datas.add(new Coffee("A002","카푸치노",4600,10,30));
		datas.add(new Coffee("A003","헤이즐넛",4600,10,30));
		datas.add(new Coffee("A004","에스프레소",3600,10,20));
		
		datas.add(new Beverage("B001", "딸기쉐이크", 5000, 5, 30));
		datas.add(new Beverage("B002", "후르츠와인", 5000, 5, 20));
		datas.add(new Beverage("B003", "팥빙수", 9000, 5, 40));
		datas.add(new Beverage("B004", "아이스초코", 5300, 5, 30));
	}

	@Override
	public void prnProductList() {
		for(Product p : datas) {
			System.out.println(p);
		}
	}

	@Override
	public boolean addProduct(Product p) {
		if(datas.contains(p)) {
			return false;
		}
		return datas.add(p);
	}

	@Override
	public boolean delProduct(Product p) {
		if(!datas.contains(p)) {
			return false;
		}
		return datas.remove(p);
	}

	@Override
	public boolean updateProduct(Product p) {
		if(!datas.contains(p)) {
			return false;
		}
		return datas.set(datas.indexOf(p), p)==null?false:true;
	}

	@Override
	public Product searchProduct(Product p) {
		return datas.get(datas.indexOf(p));
	}

	@Override
	public List<Product> getListProducts() {
		// TODO Auto-generated method stub
		return datas;
	}

}
