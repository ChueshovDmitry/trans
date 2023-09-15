package com.test.transaction.service;


import com.test.transaction.CustomEx;
import com.test.transaction.dao.BankAccount;
import com.test.transaction.dao.Human;
import com.test.transaction.dao.HumanRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class HumanService implements AbstractHumanService {
    private final HumanRepository humanRepository;
    private final AbstractBankService abstractBankService;


    @Override
    @Transactional
    public void saveHuman (){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setSum(0L);
        try {
            abstractBankService.saveBank(bankAccount);
        } catch (CustomEx e) {
            System.out.println(e);
        }

        Human human = new Human();
        human.setSurname("Dmitry");
        humanRepository.save(human);



    }
}
