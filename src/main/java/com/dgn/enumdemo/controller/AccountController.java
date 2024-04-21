package com.dgn.enumdemo.controller;

import com.dgn.enumdemo.enums.Gender;
import com.dgn.enumdemo.model.Account;
import com.dgn.enumdemo.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }
    @PostMapping("/addAccount")
    public ResponseEntity<Account> addAccount(@RequestBody Account account){
        return new ResponseEntity<>(accountService.addAccount(account), HttpStatus.CREATED);
    }

    @GetMapping("/getAllAccount")
    public ResponseEntity<List<Account>> getAllAccount(){
        return new ResponseEntity<>(accountService.getAllAccount(),HttpStatus.OK);
    }
    @GetMapping("/getEnumContentByGender")
    public ResponseEntity<List<Gender>> getEnumContentByGender(){
        return new ResponseEntity<>(accountService.getEnumContentByGender(),HttpStatus.OK);
    }
    @GetMapping("/getAccountByStatusId")
    public ResponseEntity<List<Account>> getAccountByStatusId(@RequestBody List<Integer> statusId){
        return new ResponseEntity<>(accountService.getAccountByStatusId(statusId),HttpStatus.OK);
    }
}
