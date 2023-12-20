package az.ubank.mstransfer.controller;

import az.ubank.mstransfer.dto.TransferDto;
import az.ubank.mstransfer.service.TransferService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transfer")
@Slf4j
@RequiredArgsConstructor
public class TransferController {
    private final TransferService service;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String makeTransfer(@RequestHeader(name = "Customer-Pin") String customerPin,
                               @RequestBody TransferDto transferDto) {
        return service.makeTransfer(customerPin, transferDto);
    }
}
