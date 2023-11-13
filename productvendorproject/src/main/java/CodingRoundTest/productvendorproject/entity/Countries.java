package CodingRoundTest.productvendorproject.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="countries")
public class Countries {

	@Column(name="code")
	public int countryCode;
	
	@Column(name="name")
	public String countryName;
	
	@Column(name="continent_name")
	public String continentName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "countryCode", referencedColumnName = "country_code")
	public List<UserDetails> orderList= new ArrayList<>();
}
