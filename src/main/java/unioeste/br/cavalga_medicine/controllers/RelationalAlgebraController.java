package unioeste.br.cavalga_medicine.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unioeste.br.cavalga_medicine.service.RelationalAlgebraService;
import unioeste.br.cavalga_medicine.views.*;

        import java.util.List;

@RestController
@RequestMapping("/relational-algebra")
@AllArgsConstructor
public class RelationalAlgebraController {

    private final RelationalAlgebraService relationalAlgebraService;

    @Autowired
    private RelationalAlgebraView relationalAlgebraView;

    public void handlePatientAndMedicalExamsCartesianProduct(){
        List<Object[]> cartesianProduct = relationalAlgebraService.getPatientAndMedicalExamCartesianProduct();

        relationalAlgebraView.showPatientsAndMedicalExamsCartesianProduct(cartesianProduct);
    }

    public void handlePatientsFromAppointmentsAndExams() {
        List<Long> ids = relationalAlgebraService.getPatientsFromAppointmentsAndExams();

        relationalAlgebraView.showPatientsFromAppointmentsAndExams(ids);
    }

    public void handlePatientsFromAppointmentsAndNotExams() {
        List<Long> ids = relationalAlgebraService.getPatientsFromAppointmentsAndNotExams();

        relationalAlgebraView.showPatientsFromAppointmentsAndNotExams(ids);
    }

    public void handlePatientsAndMedicalExams(){
        List<Object[]> cartesianProduct = relationalAlgebraService.getPatientsAndMedicalExams();

        relationalAlgebraView.showPatientsAndMedicalExams(cartesianProduct);
    }

}

