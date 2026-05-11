package edu.icet.ecom.repositary;

import edu.icet.ecom.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepositary extends JpaRepository<Trainer, Long> {
}
