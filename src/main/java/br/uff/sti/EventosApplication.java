package br.uff.sti;

import br.uff.sti.model.services.ConsultasService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EventosApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cc = SpringApplication.run(EventosApplication.class, args);
              ConsultasService cs =   cc.getBean("consultasService", ConsultasService.class);
//              cs.eventos2016();
//              cs.eventosMedicina2016();
//              cs.periodoInscricao2016();
//              cs.periodoInscricao2016SQL();
                cs.eventosParalelosSemanaAcademica();
        }
}
