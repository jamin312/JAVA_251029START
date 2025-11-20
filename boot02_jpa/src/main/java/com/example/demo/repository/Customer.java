package com.example.demo.repository;

//import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;

import com.example.demo.common.BaseTimeEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/* ORM 
 * */
//toString
//@DynamicUpdate
@NoArgsConstructor
@Getter
@Entity
public class Customer extends BaseTimeEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@Column(length = 20, nullable = false)
	String name;
	
	String phone;
	
	String email;
	
//	@Temporal(TemporalType.TIMESTAMP)
//	LocalDateTime regdate;
	
	@OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
	List<Address> address = new ArrayList<Address>();
	
	// 생성자
	@Builder
	public Customer(String name, String phone, String email, Address address) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address.add(address);
	}
	
	// 메소드
	public void updateNameAndEmail(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
} // end class
