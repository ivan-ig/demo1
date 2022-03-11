package com.example.demo.pack;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
@AllArgsConstructor
@Slf4j
public class MyController {

    private AccountRepository accountRepository;

    @GetMapping(path = "all", produces = "application/json")
    public Account getAccount(){
        log.info("Controller has been started...........");
        Account account = accountRepository.findById(1L).orElseThrow(() -> new RuntimeException("There isn't such Account"));
        log.info(account.toString());
        return account;
    }
}
