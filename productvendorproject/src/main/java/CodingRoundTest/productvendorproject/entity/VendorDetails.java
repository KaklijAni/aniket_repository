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
@Table(name="vendors")
public class VendorDetails {
	
	@Id
	@Column(name="vendor_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int vendorId;
	
	@Column(name="country_code")
	public int countryCode;
	
	@Column(name="vendor_name")
	public String vendorName;
	
	@Column(name="created_at")
	public String creatdAt;

	@Column(name="admin_id")
	public int adminId;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "vendorId", referencedColumnName = "vendor_id")
	public List<Products> orderList= new ArrayList<>();
	
}
