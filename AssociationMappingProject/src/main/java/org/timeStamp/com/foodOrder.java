package org.timeStamp.com;

import java.time.LocalDateTime;
import javax.persistence.*;
import javax.persistence.Entity;
import org.hibernate.annotations.*;

@Entity
public class foodOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String food_item;
	private int cost;
	
	private LocalDateTime deliverytime;

	@CreationTimestamp
	private LocalDateTime orderedtime;
	
	@CreationTimestamp
	private LocalDateTime orderedUpdatetime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFood_item() {
		return food_item;
	}

	public void setFood_item(String food_item) {
		this.food_item = food_item;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public LocalDateTime getDeliverytime() {
		return deliverytime;
	}

	public void setDeliverytime(LocalDateTime deliverytime) {
		this.deliverytime = deliverytime;
	}

	public LocalDateTime getOrderedtime() {
		return orderedtime;
	}

	public void setOrderedtime(LocalDateTime orderedtime) {
		this.orderedtime = orderedtime;
	}

	public LocalDateTime getOrderedUpdatetime() {
		return orderedUpdatetime;
	}

	public void setOrderedUpdatetime(LocalDateTime orderedUpdatetime) {
		this.orderedUpdatetime = orderedUpdatetime;
	}

	@Override
	public String toString() {
		return "foodOrder [id=" + id + ", food_item=" + food_item + ", cost=" + cost + ", deliverytime=" + deliverytime
				+ ", orderedtime=" + orderedtime + ", orderedUpdatetime=" + orderedUpdatetime + "]";
	}
}
