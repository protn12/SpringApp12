package com.walid.mobi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.walid.mobi.dao.ArticleRepository;
import com.walid.mobi.dao.ClientRepository;
import com.walid.mobi.dao.CommandeRepository;
import com.walid.mobi.dao.ReglementRepository;
import com.walid.mobi.dao.UserRepository;
import com.walid.mobi.entities.Article;
import com.walid.mobi.entities.Carte;
import com.walid.mobi.entities.Cle;
import com.walid.mobi.entities.Ligne_Telep;
import com.walid.mobi.entities.Operateur;
import com.walid.mobi.entities.TelphoneMobile;
import com.walid.mobi.entities.Type_Carte;

@SpringBootApplication
public class MobiApplication implements CommandLineRunner{

	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private ArticleRepository articleRepository;
	@Autowired
	private CommandeRepository commandeRepository;
	@Autowired
	private ReglementRepository reglementRepository;
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MobiApplication.class, args);
		
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		Article p1=articleRepository.save(
				new Carte(5500, 5, 6, 100, Type_Carte.GSM, Operateur.ooredoo));
		Article p2=articleRepository.save(
				new Carte(5500, 5, 6, 100, Type_Carte.GSM, Operateur.ooredoo));
		Article p3=articleRepository.save(
				new Carte(5500, 5, 6, 100, Type_Carte.GSM, Operateur.ooredoo));
		Article p4=articleRepository.save(
				new Ligne_Telep(2, 10, 21956814, Operateur.ooredoo));
		Article p5=articleRepository.save(
				new TelphoneMobile(650, 4, "Sumsung", "255fgr478"));
		Article p6=articleRepository.save(
				new Cle(45, 10,"cle25487ml","4MB", "30Gb",Operateur.ooredoo ));
		
		
	}
}
