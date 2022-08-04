package com.iknow.stocktrackingbe.payload.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.iknow.stocktrackingbe.model.PrescriptionProduct;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PrescriptionDTO {
    @JsonProperty("id")
    private String id;
    @JsonProperty("prescription_version")
    private String prescriptionVersion;
    @JsonProperty("start_date")
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate startDate;
    @JsonFormat(pattern="dd-MM-yyyy")
    @JsonProperty("end_date")
    private LocalDate endDate;
    @JsonProperty("created")
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date created;
    @JsonProperty("draft")
    private boolean draft;
    @JsonProperty("approved")
    private boolean approved;
    @JsonProperty("prescription_products")
    private List<PrescriptionProduct> prescriptionProducts;
}
