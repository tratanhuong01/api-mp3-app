package com.apimp3app.Mp3App.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
@CrossOrigin("*")

public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping("")
    public List<Account> getAccountByUsernameAndPassword(@RequestParam String username,
                                                         @RequestParam String password){
        return accountService.getAccountByUsernameAndPassword(username, password);
    }

}
