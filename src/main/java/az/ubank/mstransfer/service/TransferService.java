package az.ubank.mstransfer.service;

import az.ubank.mstransfer.dto.TransferDto;

public interface TransferService {
    String makeTransfer(String senderCustomerPin, TransferDto dto);
}
