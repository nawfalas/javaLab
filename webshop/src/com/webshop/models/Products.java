package com.webshop.models;
import java.util.ArrayList;

public class Products {
	private ArrayList<Product> products;

	public Products() {
		this.products = new ArrayList<>();
	}

	public Products(ArrayList<Product> products) {
		this.products = products;
	}

	public void addProduct(Product product){
		this.products.add(product);
	}

	public void addProduct(int articleId, String description, int price){
		this.products.add(new Product(articleId, description, price));
	}

	public void addProduct(int articleId,String description,int price,ArrayList<Integer> productNrs){
		this.products.add(new Product(articleId, description, price, productNrs));
	}

	public boolean doesThisProductNrExist(int productNr){
		for(int i=0;i<products.size();i++){
			if(products.get(i).doesProductNrExist(productNr)){
				return true;
			}
		}
		return false;
	}


	public boolean addProductNrById(int productNr, int articleId){
		Product product = this.getProductById(articleId);
		if(product!=null){
			product.addProductNr(productNr);
			return true;
		}
		return false;
	}

	public Product getProductById(int articletId){
		for(int i=0;i<products.size();i++){
			if(products.get(i).getArticleId()==articletId){
				return products.get(i);
			}
		}
		return null;
	}

	public Product getAndRemoveProductById(int articletId){
		for(int i=0;i<products.size();i++){
			if(products.get(i).getArticleId()==articletId){
				return products.remove(i);
			}
		}
		return null;
	}

	public void setProducts(ArrayList<Product> products){
		this.products = products;
	}

	public ArrayList<Product> getCloneOfProducts(){
		return (ArrayList<Product>) products.clone();
	}
}
