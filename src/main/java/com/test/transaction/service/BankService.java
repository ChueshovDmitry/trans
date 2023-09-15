package com.test.transaction.service;


import com.test.transaction.CustomEx;
import com.test.transaction.dao.BankAccount;
import com.test.transaction.dao.BankRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class BankService implements AbstractBankService {
    private final BankRepository bankRepository;

    @Override
    @Transactional
    public void saveBank (BankAccount bankAccount) throws CustomEx {
        if (bankAccount.getSum() == 0) {
            throw new CustomEx("ggg");
        }else {
            bankRepository.save(bankAccount);
        }
    }
}
