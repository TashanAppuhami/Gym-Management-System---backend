package edu.icet.ecom.service;

import edu.icet.ecom.dto.TrainerDto;

import java.util.List;

public interface TrainerService {

    TrainerDto addTrainer(TrainerDto trainerDto);

    TrainerDto updateTrainer( Long id, TrainerDto trainerDto);

    void deleteTrainer(Long id);

    TrainerDto getTrainerById(Long id);

    List<TrainerDto> getAllTrainers();
}
