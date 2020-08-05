package exam2019;

import java.util.Scanner;

public class Article {
	private int numArticle;
	private String libelle;
	private double prix;
	private static int count = 0; 
	
	Article(int numArticle,String libelle,double prix){
		this.numArticle = numArticle;
		this.libelle = libelle;
		this.prix = prix;
		count += 1;
	}
	public String getLibelle() { 
		return this.libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public double getPrix() {
		return this.prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public void SaisirArticle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner le libelle : ");
		String libelle = sc.nextLine();
		this.libelle = libelle;
		System.out.println("Donner sont prix  ");
		double prix = sc.nextDouble();
		this.prix = prix;
		count += 1;
	}
}
