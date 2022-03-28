package org.learning.model;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;


@Entity
@Table(name = "books")
@EntityListeners(AuditingEntityListener.class)
public class BookModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "name", nullable = true)
	private String name;
	@Column(name = "author", nullable = true)
	private String author;
	@Column(name = "category", nullable = true)
	private String category;
	@Column(name = "price", nullable = true)
	private float price;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "published_date", nullable = true)
	private String publishedDate;

	 
	public BookModel(String name, String author, String category, float price, String publishedDate) {
		super();
		this.name = name;
		this.author = author;
		this.category = category;
		this.price = price;
		this.publishedDate = publishedDate;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * @return the publishedDate
	 */
	public String getPublishedDate() {
		return publishedDate;
	}

	/**
	 * @param publishedDate the publishedDate to set
	 */
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}

	@Override
	public String toString() {
		return "BookModel [name=" + name + ", author=" + author + ", category=" + category + ", price=" + price
				+ ", publishedDate=" + publishedDate + "]";
	}

}
