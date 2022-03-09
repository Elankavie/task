package Onlineshoping;

import java.util.ArrayList;

public class Order {
	ArrayList<Cart> CartList = new ArrayList<>();
	public Order() {
		super();
	}
	public ArrayList<Cart> getCartList() {
		return CartList;
	}
	public void setCartList(ArrayList<Cart> cartList) {
		CartList = cartList;
	}
	public Order(ArrayList<Cart> cartList) {
		super();
		CartList = cartList;
	}
	

}
