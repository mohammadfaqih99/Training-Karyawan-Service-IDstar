package com.trainingkaryawan.entity;

import com.trainingkaryawan.model.request.karyawan.DetailKaryawanSaveRequest;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "detail_karyawan")
public class DetailKaryawanEntity extends BaseEntity{
    private String nik;
    private String npwp;
    //todo remove bidirectional association, reason when do delete data not deleted
//    @JsonIgnore
//    @OneToOne(mappedBy = "detailKaryawan", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
//    private KaryawanEntity karyawan;

    public DetailKaryawanEntity(DetailKaryawanSaveRequest data) {
        this.nik = data.getNik();
        this.npwp = data.getNpwp();
    }

    @Override
    public String toString() {
        return "DetailKaryawanEntity{" +
                "nik='" + nik + '\'' +
                ", npwp='" + npwp + '\'' +
                '}';
    }
}
