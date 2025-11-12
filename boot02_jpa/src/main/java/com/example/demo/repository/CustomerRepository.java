package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	// 이름으로 조회
	List<Customer> findByName(String name);
	
	// 이름으로 LIKE 조회
	List<Customer> findByNameLike(String name);
	
	// 이메일 contain 조회 => parameter가 알아서 % 랩핑
	List<Customer> findByEmailContaining(String email);
	
	// 이름 OR 이메일 조회
	List<Customer> findByNameOrEmail(String name, String email);
	
	// 아래는 인덱스 순으로
//	@Query(value="SELECT * FROM customer WHERE phone = ?1 OR name = ?2", nativeQuery = true)
	// 아래는 @Param 값으로
	@Query(value="SELECT * FROM customer WHERE phone = :phone OR name = :name", nativeQuery = true)
	List<Object[]> findAllNative(@Param("phone") String phone, @Param("name") String name);
	
	@Query(value="SELECT * FROM customer WHERE phone = :phone OR name = :name", nativeQuery = true)
	List<CustomerNative> findAllNativeVO(@Param("phone") String phone, @Param("name") String name);
	
	// JPQL
	@Query(value="SELECT c FROM Customer c ORDER BY id DESC")
	List<Customer> findAllQuery();
	
}// end interface
