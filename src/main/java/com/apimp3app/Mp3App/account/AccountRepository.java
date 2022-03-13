package com.apimp3app.Mp3App.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface AccountRepository extends JpaRepository<Account,Long> {

    @Query(value = "SELECT * FROM account WHERE username = ?1 AND password = ?2 ",
            nativeQuery = true)
    List<Account> getAccountByUsernameAndPassword(String username,String password);

}
