package unioeste.br.cavalga_medicine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import unioeste.br.cavalga_medicine.controllers.AppController;

@SpringBootApplication
public class CavalgaMedicineApplication implements CommandLineRunner {

	@Autowired
	private AppController appController;

	public static void main(String[] args) {
		SpringApplication.run(CavalgaMedicineApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		appController.start();
	}
}
