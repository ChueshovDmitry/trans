package com.test.transaction.service;

import com.test.transaction.CustomEx;
import com.test.transaction.dao.BankAccount;

import javax.transaction.Transactional;

public interface AbstractBankService {
    @Transactional
    void saveBank (BankAccount bankAccount) throws CustomEx;
}
