package com.apimp3app.Mp3App.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public List<Account> getAccountByUsernameAndPassword(String username,String password) {
        return accountRepository.getAccountByUsernameAndPassword(username, password);
    }

}
