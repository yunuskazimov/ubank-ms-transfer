package az.ubank.mstransfer.service.impl;

import az.ubank.mstransfer.client.AccountClientFeign;
import az.ubank.mstransfer.client.dto.AccountDto;
import az.ubank.mstransfer.service.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AccountServiceImpl implements AccountService {
    private final AccountClientFeign accountClientFeign;

    @Override
    public AccountDto getById(String uuid) {
        log.info("client service getById started Account ID: {}", uuid);
        return accountClientFeign.getById(uuid);
    }

    @Override
    public AccountDto updateAccountBalance(AccountDto accountDto) {
        log.info("client service updateAccountBalance started Account ID: {}", accountDto.getAccountId());
        return accountClientFeign.updateAccountBalance(accountDto);
    }
}
