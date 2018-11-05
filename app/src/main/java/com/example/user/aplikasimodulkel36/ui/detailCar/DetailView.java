package com.example.user.aplikasimodulkel36.ui.detailCar;


import com.example.user.aplikasimodulkel36.data.model.DataCar;
import java.util.List;

public interface DetailView {
    void showErrorCarById(String message);

    void showSuccessCarById(List<DataCar> dataCar);
}
