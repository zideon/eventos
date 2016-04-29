package br.uff.sti;

import br.uff.sti.model.domain.Evento;
import br.uff.sti.model.services.ConsultasService;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EventosApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext cc = SpringApplication.run(EventosApplication.class, args);
        List<Evento> list;
        ConsultasService cs = cc.getBean("consultasService", ConsultasService.class);
        
        Logger logger = Logger.getLogger("eventos");
        logger.info("iniciando aplicação");
        list = cs.eventos2016();
        logger.info("numero de eventos de 2016 encontrados : "+list.size());
        for (Evento evento : list) {
            logger.info(evento);
        }
        logger.info("terminando aplicação");
//        cs.eventosMedicina2016();
//        cs.periodoInscricao2016();
//        cs.periodoInscricao2016SQL();
//        cs.eventosParalelosSemanaAcademica();
    }
}
