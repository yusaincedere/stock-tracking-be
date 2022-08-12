package com.iknow.stocktrackingbe.model;
import com.iknow.stocktrackingbe.idGenerator.idGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
@Entity
public class PurchaseOrderDetail extends idGenerator implements Serializable {

    @ManyToOne
    private PurchaseOrder purchaseOrder;

    @ManyToOne
    private Product product;

    private Long amount;

}
