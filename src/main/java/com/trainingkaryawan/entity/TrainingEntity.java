package com.trainingkaryawan.entity;

import com.trainingkaryawan.model.request.training.TrainingSaveRequest;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "training")
public class TrainingEntity extends BaseEntity{
    private String pengajar;
    private String tema;

    //todo remove bidirectional association, reason when do delete data not deleted
//    @JsonIgnore
//    @OneToMany(mappedBy = "training", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
//    private List<KaryawanTrainingEntity> karyawanTraining;

    public TrainingEntity(TrainingSaveRequest data) {
        this.pengajar = data.getPengajar();
        this.tema = data.getTema();
    }
}
