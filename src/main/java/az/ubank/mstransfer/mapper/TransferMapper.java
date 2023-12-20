package az.ubank.mstransfer.mapper;

import az.ubank.mstransfer.dao.entity.TransferEntity;
import az.ubank.mstransfer.dto.TransferDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TransferMapper {
    TransferMapper INSTANCE = Mappers.getMapper(TransferMapper.class);

    TransferEntity toEntity(TransferDto dto);
}
