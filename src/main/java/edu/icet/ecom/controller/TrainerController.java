package edu.icet.ecom.controller;

import edu.icet.ecom.dto.TrainerDto;
import edu.icet.ecom.service.TrainerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TrainerController {

    private final TrainerService trainerService;

    @PostMapping("/add-trainer")
    TrainerDto addTrainer(TrainerDto trainerDto){
        return trainerService.addTrainer(trainerDto);
    }

    @PatchMapping("/update-trainer/{id}")
    ResponseEntity<TrainerDto> updateTrainer(@PathVariable Long id,@RequestBody TrainerDto trainerDto) {

        TrainerDto updatedTrainer = trainerService.updateTrainer(id, trainerDto);
        return ResponseEntity.ok(updatedTrainer);
    }

    @DeleteMapping("/delete-trainer")
    void deleteTrainer(Long id){
        trainerService.deleteTrainer(id);
    }

    @GetMapping("/get-trainer-by-id/{id}")
    ResponseEntity<TrainerDto> getTrainerById(@PathVariable Long id){
        return ResponseEntity.ok(trainerService.getTrainerById(id));
    }

    @GetMapping("/get-All")
    List<TrainerDto> getAllTrainers(){
        return trainerService.getAllTrainers();
    }
}
