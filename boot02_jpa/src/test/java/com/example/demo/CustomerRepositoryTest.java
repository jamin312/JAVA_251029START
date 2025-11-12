package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.repository.Address;
import com.example.demo.repository.AddressRepository;
import com.example.demo.repository.Customer;
import com.example.demo.repository.CustomerNative;
import com.example.demo.repository.CustomerRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class CustomerRepositoryTest {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	AddressRepository addressRepository;

	@Disabled
	@Test
	public void 고객_조회() {
		// given
		String name = "홍길동";
		String phone = "011";
		Customer customer = Customer.builder().name(name).phone(phone).build();
		customerRepository.save(customer);

		// when
		List<Customer> customerList = (List<Customer>) customerRepository.findAll();

		// then
		assertEquals(customerList.get(0).getName(), name);
		log.info("조회된	고객	이름: {}", customerList.get(0).getName());

	} // end 고객_조회

	@Disabled
	@Test
	public void 고객_수정() {
		// given - 초기 데이터 저장
		String name = "홍길동";
		String phone = "011";
		Customer saved = customerRepository.save(Customer.builder().name(name).phone(phone).build());

		// when - 고객 정보 수정
		Customer customer = customerRepository.findById(saved.getId()).orElse(new Customer());
		customer.updateNameAndEmail("둘리", "");
		Customer updated = customerRepository.save(customer);

		customer.updateNameAndEmail("둘리", "a@a.a");
		updated = customerRepository.save(customer);

		// then
		assertEquals(updated.getName(), customer.getName());
		log.info("수정된	고객	이름: {}", updated.getName());

	}// end 고객_수정

	@Disabled
	@Test
	public void 이름_조회() {
		// given
		String name = "둘리";

		// when
		List<Customer> list = customerRepository.findByName(name);
		List<Customer> list2 = customerRepository.findByNameLike("%동%");
		list2.stream().forEach(cust -> System.out.println(cust.getName()));

		// then
		assertEquals(list.get(0).getName(), name);
	} // end test

	@Disabled
	@Test
	public void 이메일_조회() {
		// given
		String email = "@";

		// when
		List<Customer> list = customerRepository.findByEmailContaining(email);

		// thend
		list.stream().forEach(e -> System.out.println(e.getEmail()));
		assertThat(list).extracting(Customer::getEmail).allMatch(e -> e.contains(email));
	} // end test

	@Disabled
	@Test
	public void 이메일or이름_조회() {
		// given
		String name = "홍길동";
		String email = "";

		// when
		List<Customer> list = customerRepository.findByNameOrEmail(name, email);

		// then
		list.stream().forEach(e -> {
			System.out.println(e.getName());
			System.out.println(e.getEmail());
		});

		assertThat(list).allSatisfy(c -> assertThat(c.getName().equals(name) || c.getEmail().equals(email)).isTrue());
	} // end test

	@Disabled
	@Test
	public void 네이티브_쿼리_전체조회() {
		// given
		String phone = "010";
		String name = "홍길동";

		// when
		List<Object[]> list = customerRepository.findAllNative(phone, name);

		List<CustomerNative> list2 = customerRepository.findAllNativeVO(phone, name);

		// then
		list.stream().forEach(x -> {
			for (Object l : x) {
				System.out.print(l + "\t");
			}
			System.out.println();
		}); // end list

		list2.stream().forEach(y -> {
			System.out.println(y.getid() + y.getEmail());
		});

	} // end test

	@Disabled
	@Test
	public void jpql_test() {
		List<Customer> list = customerRepository.findAllQuery();

		list.stream().forEach(e -> {
			System.out.println(e.getId() + ":" + e.getEmail());
		});
	} // end test

	@Test
	public void 일대다() {
		// given(준비)
		Customer customerentity = Customer.builder()
									.name("길동").phone("019")
									.email("c@c.c").build();
		
		Customer saved = customerRepository.save(customerentity);

		// 주소 등록		
		addressRepository.save(Address.builder()
				.zipcode("01000").address("서울")
				.customer(customerentity).build());
		
		addressRepository.save(Address.builder()
							.zipcode("04411").address("대구")
							.customer(customerentity).build());

		// when(실행)
		// Optional => .get()
		Customer customer = customerRepository.findById(saved.getId()).get();
		customer.getAddress().forEach(e -> {
			System.out.println(e.getZipcode() + ":" + e.getAddress());
			});
		log.info(customer.getName() + ":" + customer.getAddress());

		// then(검증)
		assertEquals("04411", customer.getAddress().get(1).getZipcode());

	} // end 일대다()

}// end class
