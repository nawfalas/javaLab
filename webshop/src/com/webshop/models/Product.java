package com.webshop.models;
import java.util.ArrayList;

public class Product {

	private int articleId;
	private String description;
	private int price;
	private ArrayList<Integer> productNrs;

	public Product(int articleId, String description, int price){
		this.articleId = articleId;
		this.description = description;
		this.price = price;
		this.productNrs = new ArrayList<>();
	}

	public Product(int articleId, String description, int price, ArrayList<Integer> productNrs){
		this.articleId = articleId;
		this.description = description;
		this.price = price;
		this.productNrs = productNrs;new ArrayList<>();
	}


	public int getAmount(){
		return productNrs.size();
	}

	public boolean doesProductNrExist(int productNr){
		for(int i=0;i<productNrs.size();i++){
			if(productNrs.get(i).equals(productNrs)){
				return true;
			}
		}
		return false;
	}

	private void setProductNrs(ArrayList<Integer> productNrs){
		this.productNrs = productNrs;
	}

	private ArrayList<Integer> getCloneOfProductNrs(){
		return (ArrayList<Integer>) productNrs.clone();
	}

	public void addProductNr(int productNr){
		productNrs.add(productNr);
	}

	public int getAndRemoveFirstProductNr() throws Exception{
		if(productNrs.size()>0){
			return productNrs.remove(0);
		}else{
			throw new Exception("no products");
		}
	}

	public int getFirstProductNr() throws Exception{
		if(productNrs.size()>0){
			return productNrs.get(0);
		}else{
			throw new Exception("no products");
		}
	}

	public boolean removeProductNrByNr(int productNr) throws Exception{
		if(productNrs.size()>0){
			for(int i=0;i<productNrs.size();i++){
				if(productNrs.get(i).equals(productNr)){
					productNrs.remove(i);
					return true;
				}
			}
		}
		return false;
	}

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
