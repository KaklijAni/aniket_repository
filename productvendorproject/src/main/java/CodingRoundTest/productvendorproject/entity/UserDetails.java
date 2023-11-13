package CodingRoundTest.productvendorproject.entity;

import java.sql.Timestamp;
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
@Table(name="users")
public class UserDetails {
    
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int userId;
	
	@Column(name="full_name")
	public String fullName;
	
	public String username;
	public String password;
	public String email;
   
	@Column(name="created_at")
	public Timestamp createdAt;
	
	@Column(name="country_code")
    public int CountryCode;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId", referencedColumnName = "user_id")
	public List<OrderDetails> orderlist= new ArrayList<OrderDetails>();
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId", referencedColumnName = "admin_id")
	public List<OrderDetails> adminList= new ArrayList<OrderDetails>();
	
	
}