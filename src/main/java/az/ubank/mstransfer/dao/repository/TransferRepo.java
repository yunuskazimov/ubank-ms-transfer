package az.ubank.mstransfer.dao.repository;

import az.ubank.mstransfer.dao.entity.TransferEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferRepo extends JpaRepository<TransferEntity, Long> {
}
