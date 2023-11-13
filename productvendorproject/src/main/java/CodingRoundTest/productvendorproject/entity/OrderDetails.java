package CodingRoundTest.productvendorproject.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="orders")
public class OrderDetails {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int ProductId;
	
	@Column(name="userid")
	public int userId;
	
	@Column(name="status")
	public String status;
	
	@Column(name="created_at")
	public String createdAt;
	
	@Column(name="total_amount")
	public double amount;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ProductId", referencedColumnName = "order_id")
	public List<OrderItems> orderList= new ArrayList<>();
}
