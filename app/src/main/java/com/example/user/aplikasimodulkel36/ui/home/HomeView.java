package com.example.user.aplikasimodulkel36.ui.home;

import com.example.user.aplikasimodulkel36.data.model.DataCar;
import java.util.List;

public interface HomeView {
    void successShowCar(List<DataCar> dataCars);
    void failedShowCar(String message);

}
