package com.example.mesnage_coanet;

public class Product {
	 private String name;
	 private String date;
	 public static String url= "https://mysterious-journey-1753.herokuapp.com/products.json";
	
	 public void setName(String name) {
	  this.name = name;
	 }

	 public String getName() {
	  return name;
	 }

	 public void setDate(String date) {
	  this.date = date;
	 }

	 public String getDate() {
	  return date;
	 }
}
