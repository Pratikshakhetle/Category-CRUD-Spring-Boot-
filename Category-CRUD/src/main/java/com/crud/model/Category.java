package com.crud.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Category")
public class Category {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
 private int id;
@Column(name="name")
 private String name;

@OneToMany(mappedBy="category", cascade=CascadeType.ALL)
private List <Product> products;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Category(int id, String name) {
	this.id = id;
	this.name = name;
}
public Category() {
}
@Override
public String toString() {
	return "Category [id=" + id + ", name=" + name + "]";
}

}