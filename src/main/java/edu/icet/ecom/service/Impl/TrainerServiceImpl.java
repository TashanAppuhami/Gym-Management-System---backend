package edu.icet.ecom.service.Impl;

import edu.icet.ecom.dto.TrainerDto;
import edu.icet.ecom.entity.Trainer;
import edu.icet.ecom.repositary.TrainerRepositary;
import edu.icet.ecom.service.TrainerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TrainerServiceImpl implements TrainerService {

    private final TrainerRepositary trainerRepositary;
    private final ModelMapper modelMapper;

    @Override
    public TrainerDto addTrainer(TrainerDto trainerDto) {

        Trainer trainer = modelMapper.map(trainerDto, Trainer.class);

        trainerRepositary.save(trainer);

        return modelMapper.map(trainerDto, TrainerDto.class);
    }

    @Override
    public TrainerDto updateTrainer(Long id, TrainerDto trainerDto) {

        Trainer existingTrainer = trainerRepositary.findById(trainerDto.getId())
                .orElseThrow(() ->
                        new RuntimeException("Trainer not found"));

        modelMapper.map(trainerDto, existingTrainer);

        Trainer updatedTrainer = trainerRepositary.save(existingTrainer);

        return modelMapper.map(updatedTrainer, TrainerDto.class);
    }

    @Override
    public void deleteTrainer(Long id) {
        trainerRepositary.deleteById(id);
    }

    @Override
    public TrainerDto getTrainerById(Long id) {
        Trainer trainer = trainerRepositary.getReferenceById(id);

        return modelMapper.map(trainer, TrainerDto.class);
    }

    @Override
    public List<TrainerDto> getAllTrainers() {
        return Collections.singletonList(modelMapper.map(trainerRepositary.findAll(), TrainerDto.class));
    }
}
