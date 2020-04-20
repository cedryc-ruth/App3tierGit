package be.iccbxl.poo.App3tierGit;

import be.iccbxl.poo.App3tierGit.ui.IUi;
import be.iccbxl.poo.App3tierGit.ui.UiConsole;

/**
 * Hello world!
 *
 */
public class App 
{
	private static IUi ui;
	
    public App() {
		ui = new UiConsole();
	}

	public static void main( String[] args )
    {
        //Avant lancement du programme
		System.out.println( "Bonjour et bienvenue!" );
        new App();
        
        //Lancement du programme
        ui.run();
        
        //Après la fin du programme
        System.out.println("Merci d'avoir utilisé ce programme.");
    }
}
