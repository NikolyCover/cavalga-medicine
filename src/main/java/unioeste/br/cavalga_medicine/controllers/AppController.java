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

    @Autowired
    private RelationalAlgebraController relationalAlgebraController;

    public void start(){
        appView.showMenu();

        int option = appView.input("Escolha uma das opções: ", Integer::parseInt);

        switch (option){
            case 0 -> System.exit(0);
            case 1 -> patientController.handleGetPatientById();
            case 2 -> relationalAlgebraController.handlePatientAndMedicalExamsCartesianProduct();
            case 3 -> relationalAlgebraController.handlePatientsFromAppointmentsAndExams();
            case 4 -> relationalAlgebraController.handlePatientsFromAppointmentsAndNotExams();
            case 5 -> relationalAlgebraController.handlePatientsAndMedicalExams();
            default -> start();
        }

        start();
    }
}
