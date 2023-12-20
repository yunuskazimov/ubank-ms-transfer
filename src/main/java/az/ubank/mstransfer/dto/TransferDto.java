package az.ubank.mstransfer.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TransferDto {
    private String senderAccountId;
    private String receiverAccountId;
    private BigDecimal transferAmount;
}
