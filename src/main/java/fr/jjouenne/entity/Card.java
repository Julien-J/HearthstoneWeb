package fr.jjouenne.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="card")
public class Card {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="wording")
	private String wording;
	
	@Column(name="description")
	private String description;
	
	@Column(name="rarity")
	private int rarity;
	
	@Column(name="dust_cost")
	private int dust_cost;
	
	@Column(name="dust_value")
	private int dust_value;
	
	@Column(name="extension")
	private int extension;
	
	@Column(name="picture")
	private String picture;
	
	@Column(name="mana_cost")
	private int mana_cost;
	
	@Column(name="classe")
	private int classe;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWording() {
		return wording;
	}

	public void setWording(String wording) {
		this.wording = wording;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRarity() {
		return rarity;
	}

	public void setRarity(int rarity) {
		this.rarity = rarity;
	}

	public int getDust_cost() {
		return dust_cost;
	}

	public void setDust_cost(int dust_cost) {
		this.dust_cost = dust_cost;
	}

	public int getDust_value() {
		return dust_value;
	}

	public void setDust_value(int dust_value) {
		this.dust_value = dust_value;
	}

	public int getExtension() {
		return extension;
	}

	public void setExtension(int extension) {
		this.extension = extension;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public int getMana_cost() {
		return mana_cost;
	}

	public void setMana_cost(int mana_cost) {
		this.mana_cost = mana_cost;
	}

	public int getClasse() {
		return classe;
	}

	public void setClasse(int classe) {
		this.classe = classe;
	} 
	
	
	
	
	
}
