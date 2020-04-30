package be.iccbxl.poo.App3tierGit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.iccbxl.poo.App3tierGit.ui.IUi;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner
{
	private static IUi ui;

	public static void main( String[] args )
    {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		
		ui = (IUi) ctx.getBean("uiConsole");
		
        //Avant lancement du programme
		System.out.println( "Bonjour et bienvenue!" );
        
        //Lancement du programme
        ui.run();
        
        //Après la fin du programme
        System.out.println("Merci d'avoir utilisé ce programme.");
    }

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
