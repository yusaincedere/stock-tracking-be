package com.iknow.stocktrackingbe.model.prescription;
import com.iknow.stocktrackingbe.idGenerator.idGenerator;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Prescription extends idGenerator implements Serializable {

    private String prescriptionVersion;

    private LocalDate startDate;
    private LocalDate endDate;



    @CreatedDate
    private Date created = new Date();

    private boolean draft = false;

    private boolean approved = false;

    @ManyToMany
    private Set<PrescriptionProduct> prescriptionProducts;
}
