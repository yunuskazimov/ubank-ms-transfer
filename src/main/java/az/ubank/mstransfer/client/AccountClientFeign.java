package az.ubank.mstransfer.client;

import az.ubank.mstransfer.client.dto.AccountDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ms-account-client", url = "${client.users.int.url}")
public interface AccountClientFeign {

    @GetMapping("{uuid}/id/")
    AccountDto getById(@PathVariable String uuid);

    @PostMapping()
    AccountDto updateAccountBalance(@RequestBody() AccountDto accountDto);


//    public AccountDto getById(String id) {
////        log.info("client service getById started Account ID: {}", id);
//        String url = String.format("%s/%s/%s", apiUrl, "id", id);
//        return restTemplate.getForObject(url, AccountDto.class);
//    }

//    public AccountDto updateAccountBalance(AccountDto accountDto) {
//        log.info("client service updateAccountBalance started Account ID: {}", accountDto.getAccountId());
//        return restTemplate.postForObject(apiUrl, accountDto, AccountDto.class);
//    }

}
