package az.ubank.mstransfer.service;

import az.ubank.mstransfer.client.dto.AccountDto;

public interface AccountService {

    AccountDto getById(String uuid);

    AccountDto updateAccountBalance(AccountDto accountDto);
}
