package com.trainingkaryawan.repository;

import com.trainingkaryawan.entity.KaryawanTrainingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KaryawanTrainingRepository extends JpaRepository<KaryawanTrainingEntity, Long> {

}
