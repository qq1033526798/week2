package com.zhaozekun.senior2.week2.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Goods implements Serializable{
	
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: 商品类序列化
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private BigDecimal price;
	private Double baifen;
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", price=" + price + ", baifen=" + baifen + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Double getBaifen() {
		return baifen;
	}
	public void setBaifen(Double baifen) {
		this.baifen = baifen;
	}
	public Goods(Integer id, String name, BigDecimal price, Double baifen) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.baifen = baifen;
	}
	public Goods() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((baifen == null) ? 0 : baifen.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
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
		Goods other = (Goods) obj;
		if (baifen == null) {
			if (other.baifen != null)
				return false;
		} else if (!baifen.equals(other.baifen))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}
	
	
	
}
