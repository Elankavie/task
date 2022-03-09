package Onlineshoping;

import java.util.ArrayList;

public class Cart {
	User Customer;
	ArrayList<Product> ProductList = new ArrayList<>();
	float total_amount;
	boolean Status, ConfirmOrder;

	public Cart() {
		super();
	}

	public Cart(User customer, ArrayList<Product> productList, float total_amount, boolean status,
			boolean confirmOrder) {
		super();
		Customer = customer;
		ProductList = productList;
		this.total_amount = total_amount;
		Status = status;
		ConfirmOrder = confirmOrder;
	}

	public User getCustomer() {
		return Customer;
	}

	public void setCustomer(User customer) {
		Customer = customer;
	}

	public ArrayList<Product> getProductList() {
		return ProductList;
	}

	public void setProductList(ArrayList<Product> productList) {
		ProductList = productList;
	}

	public float getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(float total_amount) {
		this.total_amount = total_amount;
	}

	public boolean getStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}

	public boolean isConfirmOrder() {
		return ConfirmOrder;
	}

	public void setConfirmOrder(boolean confirmOrder) {
		ConfirmOrder = confirmOrder;
	}
	

}
