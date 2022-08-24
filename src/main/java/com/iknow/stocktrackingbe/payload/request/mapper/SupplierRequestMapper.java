package com.iknow.stocktrackingbe.payload.request.mapper;
import com.iknow.stocktrackingbe.model.suplier.Supplier;
import com.iknow.stocktrackingbe.payload.request.SupplierRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SupplierRequestMapper {
    private final AddressRequestMapper addressRequestMapper;
    public Supplier mapToModel(SupplierRequest supplierRequest) {
        return new Supplier().toBuilder()
                .supplierCode(supplierRequest.getSupplierCode())
                .address(addressRequestMapper.mapToModel(supplierRequest.getAddressRequest()))
                .supplierName(supplierRequest.getSupplierName())
                .supplierType(supplierRequest.getSupplierType())
                .email(supplierRequest.getEmail())
                .telNo(supplierRequest.getTelNo())
                .build();
    }
}
