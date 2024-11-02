package unioeste.br.cavalga_medicine.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import unioeste.br.cavalga_medicine.views.AppView;

@Controller
@AllArgsConstructor
public class AppController {
    @Autowired
    private AppView appView;

    @Autowired
    private PatientController patientController;


    public void start(){
        appView.showMenu();

        int option = appView.input("Escolha uma das opções: ", Integer::parseInt);

        switch (option){
            case 0 -> System.exit(0);
            case 1 -> patientController.handleGetPatientById();
            default -> start();
        }

        start();
    }
}
