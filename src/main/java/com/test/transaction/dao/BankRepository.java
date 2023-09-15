package com.test.transaction.dao;


import org.springframework.data.repository.CrudRepository;

public interface BankRepository extends CrudRepository<BankAccount,Long> {
}
