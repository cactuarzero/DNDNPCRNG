import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Label;


public class App {

	protected Shell shlRandomNpcDesigner;
	protected Shell shlRandomNpcDesigner_Story;

	static Display display = new Display();
    static Shell shell = new Shell(display);
	
	String finalText = "";
	int randomInteger = 0;

	private Text textDash;
	
	private Text textFirstName;
	private Text textLastName;
	private Text textBuild;
	private Text textJob;
	private Text textRace;
	private Text textGender;
	private Text textClass;
	private Text textAc;
	private Text textInitiative;
	private Text textAlignment;
	private Text textLanguage;
	private Text textJobSpec;
	private Text textBonds;
	private Text textTraits;
	private Text textTrinkets;
	private Text textIdeals;
	private Text textFlaw;
	private Text textFears;
	private Text textAppearance;
	private Text textFlawsBonus;
	private Text textQuirks;
	private Text textPickpocket;
	private Text textStrength;
	private Text textDexterity;
	private Text textConstitution;
	private Text textIntelligence;
	private Text textWisdom;
	private Text textCharisma;
	private Text textProficiency;
	private Text textWalking;
	private Text txtStatus;
	private Text txtDefence;
	public Text textAcro;
	public Text textAnim;
	public Text textArca;
	public Text textAthl;
	public Text textDece;
	public Text textHist;
	public Text textInsi;
	public Text textInti;
	public Text textInve;
	public Text textMedi;
	public Text textNatu;
	public Text textPerc;
	public Text textPerf;
	public Text textPers;
	public Text textReli;
	public Text textSlei;
	public Text textStea;
	public Text textSurv;
	private Text textArmorType;
	private Text textAge;
	private Text textAgeType;
	private Text textNickname;
	private Text textNotes;
	private Text textInventory;
	private Text textWeapon;
	private Text textOffhand;
	private Text textCantrips;
	private Text textSpells;
	private Text textAbilities;
	private Text textArmor;
	private Text textStrBon;
	private Text textDexBonus;
	private Text textConBonus;
	private Text textIntBonus;
	private Text textWisBonus;
	private Text textCharBonus;
	private Text textWpnType;
	private Text textWpnOffType;
	private Text textLevel;
	private Text textWealth;
	  
private Text textHealth;
private Text textMaxHealth;

	int globalProficiency = 2;
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			App window = new App();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
        shell.setLayout(new GridLayout(1, false));

        Composite composite = new Composite(shell, SWT.NONE);
        composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        composite.setLayout(new GridLayout(1, false));
        
        shell.pack();
        shell.open();
        
        while (!shell.isDisposed()) 
        
        {
            if (!display.readAndDispatch())
            display.sleep();
        }
		
        
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlRandomNpcDesigner.open();
		shlRandomNpcDesigner.layout();
		
	      
	        
		while (!shlRandomNpcDesigner.isDisposed())
		{
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		
		
	}
	
	
	
	void saveToFile(String fileName, Text textField) throws Exception 
	{
		@SuppressWarnings("resource")
		FileOutputStream out = new FileOutputStream(fileName, true);
		out.write(textField.getText().getBytes());
	} 
	
	void printString(String str, char ch, int count) 
	{ 
		int occ = 0; 
		int i = 0;
		
		for (i = 0; i < str.length(); i++) 
		{ 
			if (str.charAt(i) == ch) 
			{
				occ++; 
			}
	
			if (occ == count) 
			{
				break;
			}
		} 
		if (i < str.length() -1) 	
		{ 
			finalText = str.substring(i + 1);
			finalText = finalText.split("-")[0];
		}
	}

	void printStringSL(String str, char ch, int count) 
	{ 
		int occ = 0; 
		int i = 0;
		
		for (i = 0; i < str.length(); i++) 
		{ 
			if (str.charAt(i) == ch) 
			{
				occ++; 
			}
	
			if (occ == count) 
			{
				break;
			}
		} 
		if (i < str.length() -1) 	
		{ 
			finalText = str.substring(i + 1);
			finalText = finalText.split("@")[0];
		}
	}
	/**
	 * Create contents of the window.
	 */
		protected void createContents() {
		shlRandomNpcDesigner = new Shell();
		shlRandomNpcDesigner.setSize(1310, 740);
		shlRandomNpcDesigner.setText("ranDomNpcDesigner");
		
		//DO NOT TOUCH. Sorts save/load data.
		textDash = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.READ_ONLY | SWT.CENTER);
		textDash.setEnabled(false);
		textDash.setText("@");
		textDash.setBounds(10, 808, 32, 29);
		//You may touch now.
		
		
		textJob = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textJob.setBounds(421, 80, 192, 29);
				
		textFirstName = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textFirstName.setBounds(109, 10, 124, 29);
		
		textLastName = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textLastName.setBounds(109, 45, 124, 29);
	
		textBonds = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		textBonds.setBounds(1159, 334, 130, 100);
		
		textTraits = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		textTraits.setBounds(1024, 334, 130, 100);
		
		textTrinkets = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		textTrinkets.setBounds(754, 185, 130, 100);
		
		textIdeals = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		textIdeals.setBounds(889, 334, 130, 100);
		
		textFlaw = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		textFlaw.setBounds(619, 334, 130, 100);
		
		textBuild = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textBuild.setBounds(330, 45, 184, 29);
	
		textRace = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textRace.setBounds(109, 115, 207, 29);
		
		textGender = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textGender.setBounds(330, 10, 85, 29);
		
		textClass = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textClass.setBounds(109, 150, 209, 29);
		
		textAc = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textAc.setText("0");
		textAc.setBounds(809, 45, 45, 29);
	
		textInitiative = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textInitiative.setText("0");
		textInitiative.setBounds(967, 45, 49, 29);
		
		textAlignment = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textAlignment.setBounds(520, 10, 235, 29);
		
		textLanguage = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		textLanguage.setBounds(619, 45, 136, 99);

		textJobSpec = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textJobSpec.setBounds(421, 115, 192, 29);
		//----------------------------------------------------------------------------------------	
		Menu menu = new Menu(shlRandomNpcDesigner, SWT.BAR);
		shlRandomNpcDesigner.setMenuBar(menu);
		//----------------------------------------------------------------------------------------	
		MenuItem mntmSave = new MenuItem(menu, SWT.NONE);
		mntmSave.setText("Save");
		mntmSave.addSelectionListener(new SelectionAdapter() 
		{
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				 	FileDialog fileSave = new FileDialog(shell, SWT.SAVE);
	                fileSave.setFilterNames(new String[] { "txt" });
	                fileSave.setFilterExtensions(new String[] { "*.txt" });
	                fileSave.setFilterPath("C:\\"); // Windows path
	                fileSave.setFileName("your_file_name.txt");
	                
	                String  open = fileSave.open();
	                
	                File file = new File(open);
	                
	                try
	                {
	                    file.createNewFile();
	                    
	                    String temp = fileSave.getFileName();
	                    
	                    System.out.println("File Saved as: " + file.getCanonicalPath());
	                    
	                    saveToFile(temp,textDash);
	                    saveToFile(temp,textFirstName);
	                    saveToFile(temp,textDash);
	                    saveToFile(temp,textLastName);
	                    saveToFile(temp,textDash);
	                      saveToFile(temp,textBuild);
	                      saveToFile(temp,textDash);
		                  saveToFile(temp,textJob);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textRace);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textGender);
	    				  saveToFile(temp,textDash);
		                  saveToFile(temp,textClass);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textAc);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textInitiative);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textAlignment);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textLanguage);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textJobSpec);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textBonds);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textTraits);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textTrinkets);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textIdeals);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textFlaw);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textFears);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textAppearance);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textFlawsBonus);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textQuirks);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textPickpocket);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textStrength);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textDexterity);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textConstitution);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textIntelligence);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textWisdom);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textCharisma);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textProficiency);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textWalking);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,txtStatus);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,txtDefence);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textAcro);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textAnim);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textArca);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textAthl);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textDece);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textHist);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textInsi);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textInti);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textInve);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textMedi);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textNatu);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textPerc);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textPerf);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textPers);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textReli);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textSlei);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textStea);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textSurv);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textArmorType);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textAge);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textAgeType);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textNickname);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textNotes);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textInventory);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textWeapon);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textOffhand);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textCantrips);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textSpells);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textAbilities);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textArmor);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textStrBon);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textDexBonus);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textConBonus);
		                  saveToFile(temp,textDash);
		                  saveToFile(temp,textIntBonus);
	    				saveToFile(temp,textDash);
	    				saveToFile(temp,textWisBonus);
	    				saveToFile(temp,textDash);
	    				saveToFile(temp,textCharBonus);
	    				saveToFile(temp,textDash);
	    				saveToFile(temp,textWpnType);
	    				saveToFile(temp,textDash);
	    				saveToFile(temp,textWpnOffType);
	    				saveToFile(temp,textDash);
	    				saveToFile(temp,textLevel);
	    				saveToFile(temp,textDash);
	    				saveToFile(temp,textWealth);
	    				saveToFile(temp,textDash);
	    				saveToFile(temp,textHealth);
	    				saveToFile(temp,textDash);
	    				saveToFile(temp,textMaxHealth);
	    				saveToFile(temp,textDash);
	                    
	                	
	                } 
	                catch (IOException e1) 
	                {
	                e1.printStackTrace();
	                } 
	                catch (Exception e1) 
	                {
					e1.printStackTrace();
					}
	            }
			
	    });
		//----------------------------------------------------------------------------------------		
		MenuItem mntmLoad = new MenuItem(menu, SWT.NONE);
		mntmLoad.setText("Load");
		

		textHealth = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textHealth.setText("0");
		textHealth.setBounds(1063, 10, 45, 29);
	
		
		//----------------------------------------------------------------------------------------	
		textMaxHealth = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textMaxHealth.setText("0");
		textMaxHealth.setBounds(1159, 10, 45, 29);
	
		
		//----------------------------------------------------------------------------------------	
		MenuItem mntmBlankSpace = new MenuItem(menu, SWT.NONE);
		mntmBlankSpace.setText("                             ");
		mntmBlankSpace.setEnabled(false);
		//----------------------------------------------------------------------------------------	
		MenuItem mntmExit = new MenuItem(menu, SWT.NONE);
		mntmExit.setText("Exit");
		mntmExit.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				display.close();
			}
		});
		mntmLoad.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(shell, SWT.OPEN);
				dialog.setFilterExtensions(new String [] {"*.txt"});
				dialog.setFilterPath("c:\\");
				dialog.open();
			
				System.out.println("File loaded");
				
				String text = "";
				textFirstName.setText("");
				textLastName.setText("");
				textBuild.setText("");
				  textFirstName.setText("");
				  textLastName.setText("");
				  textBuild.setText("");
				  textJob.setText("");
				  textRace.setText("");
				  textGender.setText("");
				  textClass.setText("");
				  textAc.setText("");
				  textInitiative.setText("");
				  textAlignment.setText("");
				  textLanguage.setText("");
				  textJobSpec.setText("");
				  textBonds.setText("");
				  textTraits.setText("");
				  textTrinkets.setText("");
				  textIdeals.setText("");
				  textFlaw.setText("");
				  textFears.setText("");
				  textAppearance.setText("");
				  textFlawsBonus.setText("");
				  textQuirks.setText("");
				  textPickpocket.setText("");
				  textStrength.setText("");
				  textDexterity.setText("");
				  textConstitution.setText("");
				  textIntelligence.setText("");
				  textWisdom.setText("");
				  textCharisma.setText("");
				  textProficiency.setText("");
				  textWalking.setText("");
				  txtStatus.setText("");
				  txtDefence.setText("");
				  textAcro.setText("");
				  textAnim.setText("");
				  textArca.setText("");
				  textAthl.setText("");
				  textDece.setText("");
				  textHist.setText("");
				  textInsi.setText("");
				  textInti.setText("");
				  textInve.setText("");
				  textMedi.setText("");
				  textNatu.setText("");
				  textPerc.setText("");
				  textPerf.setText("");
				  textPers.setText("");
				  textReli.setText("");
				  textSlei.setText("");
				  textStea.setText("");
				  textSurv.setText("");
				  textArmorType.setText("");
				  textAge.setText("");
				  textAgeType.setText("");
				  textNickname.setText("");
				  textNotes.setText("");
				  textInventory.setText("");
				  textWeapon.setText("");
				  textOffhand.setText("");
				  textCantrips.setText("");
				  textSpells.setText("");
				  textAbilities.setText("");
				  textArmor.setText("");
				  textStrBon.setText("");
				  textDexBonus.setText("");
				  textConBonus.setText("");
				textIntBonus.setText("");
				textWisBonus.setText("");
				textCharBonus.setText("");
				textWpnType.setText("");
				textWpnOffType.setText("");
				textLevel.setText("");
				textWealth.setText("");
				textHealth.setText("");
				textMaxHealth.setText("");
				
				finalText = "";
			    try 
			    {
			        BufferedReader in = new BufferedReader(new FileReader(new File(dialog.getFileName())));
			        String line;
			        try 
			        {
			            while((line = in.readLine())!= null)
			            {
			                text = text + line; 
			            }
			            
			            printStringSL(text,'@',1);
			            textFirstName.append(finalText);
			            printStringSL(text,'@',2);
			            textLastName.append(finalText);
			            printStringSL(text,'@',3);
			            textBuild.append(finalText);
			            printStringSL(text,'@',4);
						  textJob.append(finalText);
						  printStringSL(text,'@',5);
						  textRace.append(finalText);
						  printStringSL(text,'@',6);
						  textGender.append(finalText);
						  printStringSL(text,'@',7);
						  textClass.append(finalText);
						  printStringSL(text,'@',8);
						  textAc.append(finalText);
						  printStringSL(text,'@',9);
						  textInitiative.append(finalText);
						  printStringSL(text,'@',10);
						  textAlignment.append(finalText);
						  printStringSL(text,'@',11);
						  textLanguage.append(finalText);
						  printStringSL(text,'@',12);
						  textJobSpec.append(finalText);
						  printStringSL(text,'@',13);
						  textBonds.append(finalText);
						  printStringSL(text,'@',14);
						  textTraits.append(finalText);
						  printStringSL(text,'@',15);
						  textTrinkets.append(finalText);
						  printStringSL(text,'@',16);
						  textIdeals.append(finalText);
						  printStringSL(text,'@',17);
						  textFlaw.append(finalText);
						  printStringSL(text,'@',18);
						  textFears.append(finalText);
						  printStringSL(text,'@',19);
						  textAppearance.append(finalText);
						  printStringSL(text,'@',20);
						  textFlawsBonus.append(finalText);
						  printStringSL(text,'@',21);
						  textQuirks.append(finalText);
						  printStringSL(text,'@',22);
						  textPickpocket.append(finalText);
						  printStringSL(text,'@',23);
						  textStrength.append(finalText);
						  printStringSL(text,'@',24);
						  textDexterity.append(finalText);
						  printStringSL(text,'@',25);
						  textConstitution.append(finalText);
						  printStringSL(text,'@',26);
						  textIntelligence.append(finalText);
						  printStringSL(text,'@',27);
						  textWisdom.append(finalText);
						  printStringSL(text,'@',28);
						  textCharisma.append(finalText);
						  printStringSL(text,'@',29);
						  textProficiency.append(finalText);
						  printStringSL(text,'@',30);
						  textWalking.append(finalText);
						  printStringSL(text,'@',31);
						  txtStatus.append(finalText);
						  printStringSL(text,'@',32);
						  txtDefence.append(finalText);
						  printStringSL(text,'@',33);
						  textAcro.append(finalText);
						  printStringSL(text,'@',34);
						  textAnim.append(finalText);
						  printStringSL(text,'@',35);
						  textArca.append(finalText);
						  printStringSL(text,'@',36);
						  textAthl.append(finalText);
						  printStringSL(text,'@',37);
						  textDece.append(finalText);
						  printStringSL(text,'@',38);
						  textHist.append(finalText);
						  printStringSL(text,'@',39);
						  textInsi.append(finalText);
						  printStringSL(text,'@',40);
						  textInti.append(finalText);
						  printStringSL(text,'@',41);
						  textInve.append(finalText);
						  printStringSL(text,'@',42);
						  textMedi.append(finalText);
						  printStringSL(text,'@',43);
						  textNatu.append(finalText);
						  printStringSL(text,'@',44);
						  textPerc.append(finalText);
						  printStringSL(text,'@',45);
						  textPerf.append(finalText);
						  printStringSL(text,'@',46);
						  textPers.append(finalText);
						  printStringSL(text,'@',47);
						  textReli.append(finalText);
						  printStringSL(text,'@',48);
						  textSlei.append(finalText);
						  printStringSL(text,'@',49);
						  textStea.append(finalText);
						  printStringSL(text,'@',50);
						  textSurv.append(finalText);
						  printStringSL(text,'@',51);
						  textArmorType.append(finalText);
						  printStringSL(text,'@',52);
						  textAge.append(finalText);
						  printStringSL(text,'@',53);
						  textAgeType.append(finalText);
						  printStringSL(text,'@',54);
						  textNickname.append(finalText);
						  printStringSL(text,'@',55);
						  textNotes.append(finalText);
						  printStringSL(text,'@',56);
						  textInventory.append(finalText);
						  printStringSL(text,'@',57);
						  textWeapon.append(finalText);
						  printStringSL(text,'@',58);
						  textOffhand.append(finalText);
						  printStringSL(text,'@',59);
						  textCantrips.append(finalText);
						  printStringSL(text,'@',60);
						  textSpells.append(finalText);
						  printStringSL(text,'@',61);
						  textAbilities.append(finalText);
						  printStringSL(text,'@',62);
						  textArmor.append(finalText);
						  printStringSL(text,'@',63);
						  textStrBon.append(finalText);
						  printStringSL(text,'@',64);
						  textDexBonus.append(finalText);
						  printStringSL(text,'@',65);
						  textConBonus.append(finalText);
						  printStringSL(text,'@',66);
						  textIntBonus.append(finalText);
						  printStringSL(text,'@',67);
						  textWisBonus.append(finalText);
						  printStringSL(text,'@',68);
						  textCharBonus.append(finalText);
						  printStringSL(text,'@',69);
						  textWpnType.append(finalText);
						  printStringSL(text,'@',70);
						  textWpnOffType.append(finalText);
						  printStringSL(text,'@',71);
						  textLevel.append(finalText);
						  printStringSL(text,'@',72);
						  textWealth.append(finalText);
						  printStringSL(text,'@',73);
						  textHealth.append(finalText);
						  printStringSL(text,'@',74);
						  textMaxHealth.append(finalText);
						  
			            in.close();
			        	} 
			        	catch (IOException f) 
			        {
			            f.printStackTrace();
			        }
			    	} 
			    	catch (FileNotFoundException f)
			    	{
			    		f.printStackTrace();
			    	};
				
            }
				
		});
			
		Button btnHealth = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnHealth.setEnabled(false);
		btnHealth.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				String tempClass = "";
				String tempRace = "";
				
				int tempHealth = 0;
				String tempCon = textConBonus.getText();
				int result = Integer.valueOf(tempCon);
				
				tempClass = textClass.getText();
				tempRace = textRace.getText();
				
			
				if (tempClass.equals("Sorcerer"))
				{		
					tempHealth = 6;
					tempHealth = result + tempHealth;
					if (tempRace.equals("Hill Dwarf"))
					{
						tempHealth = tempHealth + 1;
					}
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
				}
				if (tempClass.equals("Wizard"))
				{
					tempHealth = 6;
					tempHealth = result + tempHealth;
					if (tempRace.equals("Hill Dwarf"))
					{
						tempHealth = tempHealth + 1;
					}
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
				}
				if (tempClass.equals("Bard"))
				{
					tempHealth = 8;
					tempHealth = result + tempHealth;
					if (tempRace.equals("Hill Dwarf"))
					{
						tempHealth = tempHealth + 1;
					}
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
				}
				if (tempClass.equals("Cleric"))
				{
					tempHealth = 8;
					tempHealth = result + tempHealth;
					if (tempRace.equals("Hill Dwarf"))
					{
						tempHealth = tempHealth + 1;
					}
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
				}
				if (tempClass.equals("Druid"))
				{
					tempHealth = 8;
					tempHealth = result + tempHealth;
					if (tempRace.equals("Hill Dwarf"))
					{
						tempHealth = tempHealth + 1;
					}
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
				}
				if (tempClass.equals("Monk"))
				{
					tempHealth = 8;
					tempHealth = result + tempHealth;
					if (tempRace.equals("Hill Dwarf"))
					{
						tempHealth = tempHealth + 1;
					}
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
				}
				if (tempClass.equals("Rogue"))
				{
					tempHealth = 8;
					tempHealth = result + tempHealth;
					if (tempRace.equals("Hill Dwarf"))
					{
						tempHealth = tempHealth + 1;
					}
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
				}
				if (tempClass.equals("Warlock"))
				{
					tempHealth = 8;
					tempHealth = result + tempHealth;
					if (tempRace.equals("Hill Dwarf"))
					{
						tempHealth = tempHealth + 1;
					}
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
				}
				if (tempClass.equals("Fighter"))
				{
					tempHealth = 10;
					tempHealth = result + tempHealth;
					if (tempRace.equals("Hill Dwarf"))
					{
						tempHealth = tempHealth + 1;
					}
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
				}
				if (tempClass.equals("Paladin"))
				{
					tempHealth = 10;
					tempHealth = result + tempHealth;
					if (tempRace.equals("Hill Dwarf"))
					{
						tempHealth = tempHealth + 1;
					}
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
				}
				if (tempClass.equals("Ranger"))
				{
					tempHealth = 10;
					tempHealth = result + tempHealth;
					if (tempRace.equals("Hill Dwarf"))
					{
						tempHealth = tempHealth + 1;
					}
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
				}
				if (tempClass.equals("Barbarian"))
				{
					tempHealth = 12;
					tempHealth = result + tempHealth;
					if (tempRace.equals("Hill Dwarf"))
					{
						tempHealth = tempHealth + 1;
					}
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
				}
				
			}
		});
		
		btnHealth.setBounds(943, 10, 114, 29);
		btnHealth.setText("HP / Max HP");
		
		//String Reading 
		   // InputStream is = getClass().getResourceAsStream("src/firstname.txt");
					//InputStreamReader fr = new InputStreamReader(is);
					//BufferedReader in = new BufferedReader(fr);
					
					//StringBuilder sb = new StringBuilder();
			
		
		//----------------------------------------------------------------------------------------DONE	
		Button btnFirstName = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnFirstName.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = "";
				textFirstName.setText("");
				finalText = "";
				
			    try 
			    {
			        BufferedReader in = new BufferedReader(new FileReader(new File("src/firstname.txt")));
			        String line;
			        try 
			        {
			            while((line = in.readLine())!= null)
			            {
			                text = text + line; 
			                
			                String someString = text;
						    char someChar = '-';
						    int count = 0;  
						    
						    for (int i = 0; i < someString.length(); i++) 
						    {		    	
						        if (someString.charAt(i) == someChar) 
						        {
						            count++;
						        }
						    }
						    
						    Random random = new Random();
						    randomInteger = random.nextInt(count);
						    
						    if (randomInteger == 0)
						    {
						    	randomInteger = 1;
						    }
			            }
			            
			            printString(text,'-',randomInteger);
			            textFirstName.append(finalText);
					   
			            in.close();
			        	} 
			        	catch (IOException f) 
			        {
			            f.printStackTrace();
			        }
			    	} 
			    	catch (FileNotFoundException f)
			    	{
			    		f.printStackTrace();
			    	}
			}
		});
		btnFirstName.setBounds(10, 10, 93, 29);
		btnFirstName.setText("First Name");
		//----------------------------------------------------------------------------------------DONE	
		Button btnLastName = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnLastName.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = "";
				textLastName.setText("");
				finalText = "";
				
			    try 
			    {
			        BufferedReader in = new BufferedReader(new FileReader(new File("src/lastname.txt")));
			        String line;
			        try 
			        {
			            while((line = in.readLine())!= null)
			            {
			                text = text + line; 
			                
			                String someString = text;
						    char someChar = '-';
						    int count = 0;  
						    
						    for (int i = 0; i < someString.length(); i++) 
						    {		    	
						        if (someString.charAt(i) == someChar) 
						        {
						            count++;
						        }
						    }
						    
						    Random random = new Random();
						    randomInteger = random.nextInt(count);
						    
						    if (randomInteger == 0)
						    {
						    	randomInteger = 1;
						    }
			            }
			            
			            printString(text,'-',randomInteger);
			            textLastName.append(finalText);
					   
			            in.close();
			        	} 
			        	catch (IOException f) 
			        {
			            f.printStackTrace();
			        }
			    	} 
			    	catch (FileNotFoundException f)
			    	{
			    		f.printStackTrace();
			    	}
			}
		});
		btnLastName.setBounds(10, 45, 93, 29);
		btnLastName.setText("Last Name");
		//----------------------------------------------------------------------------------------DONE	
		Button btnBuild = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnBuild.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				String text = "";
				finalText = "";
				
				textBuild.setText("");
				
				finalText = textRace.getText();
				
				int tempWeight = 0;
				int tempHeight = 0;
				
			    Random random = new Random();
			    
				//dragonborn height
				//172-208 h 81-166 w
            	if (finalText.equals("Dragonborn"))
	            {
            		
					randomInteger = random.nextInt(37);
					tempHeight = 172;
					tempHeight = tempHeight + randomInteger;
					text = Integer.toString(tempHeight);
					textBuild.append(text);
					textBuild.append("cm");
					textBuild.append(" ");
					
					randomInteger = random.nextInt(86);
					tempWeight = 81;
					tempWeight = tempWeight + randomInteger;
					text = Integer.toString(tempWeight);
					textBuild.append(text);
					textBuild.append("kg");
	            }   
            
            	//Hill dwarf
				//116-132 53-95
				
				//mdwarf
				//127-142 60-102
			
					if (finalText.equals("Hill Dwarf"))
		            {
						randomInteger = random.nextInt(16);
						tempHeight = 116;
						tempHeight = tempHeight + randomInteger;
						text = Integer.toString(tempHeight);
						textBuild.append(text);
						textBuild.append("cm");
						textBuild.append(" ");
						
						randomInteger = random.nextInt(42);
						tempWeight = 53;
						tempWeight = tempWeight + randomInteger;
						text = Integer.toString(tempWeight);
						textBuild.append(text);
						textBuild.append("kg");
		            }
					if (finalText.equals("Mountain Dwarf"))
		            {
						randomInteger = random.nextInt(15);
						tempHeight = 127;
						tempHeight = tempHeight + randomInteger;
						text = Integer.toString(tempHeight);
						textBuild.append(text);
						textBuild.append("cm");
						textBuild.append(" ");
						
						randomInteger = random.nextInt(42);
						tempWeight = 60;
						tempWeight = tempWeight + randomInteger;
						text = Integer.toString(tempWeight);
						textBuild.append(text);
						textBuild.append("kg");
		            }

					
					//Elf// wood elf
					//142-187 46-81
					
					//drow
					//139-165 34-66
					
					//high elf
					//142-187 41-77
					
				
					if (finalText.equals("Elf"))
		            {
						randomInteger = random.nextInt(45);
						tempHeight = 142;
						tempHeight = tempHeight + randomInteger;
						text = Integer.toString(tempHeight);
						textBuild.append(text);
						textBuild.append("cm");
						textBuild.append(" ");
						
						randomInteger = random.nextInt(35);
						tempWeight = 46;
						tempWeight = tempWeight + randomInteger;
						text = Integer.toString(tempWeight);
						textBuild.append(text);
						textBuild.append("kg");
		            }
					if (finalText.equals("Drow"))
		            {
						randomInteger = random.nextInt(26);
						tempHeight = 139;
						tempHeight = tempHeight + randomInteger;
						text = Integer.toString(tempHeight);
						textBuild.append(text);
						textBuild.append("cm");
						textBuild.append(" ");
						
						randomInteger = random.nextInt(32);
						tempWeight = 34;
						tempWeight = tempWeight + randomInteger;
						text = Integer.toString(tempWeight);
						textBuild.append(text);
						textBuild.append("kg");
		            }
					
					if (finalText.equals("High Elf"))
		            {
						randomInteger = random.nextInt(45);
						tempHeight = 142;
						tempHeight = tempHeight + randomInteger;
						text = Integer.toString(tempHeight);
						textBuild.append(text);
						textBuild.append("cm");
						textBuild.append(" ");
						
						randomInteger = random.nextInt(36);
						tempWeight = 41;
						tempWeight = tempWeight + randomInteger;
						text = Integer.toString(tempWeight);
						textBuild.append(text);
						textBuild.append("kg");
		            }
					if (finalText.equals("Wood Elf"))
		            {
						randomInteger = random.nextInt(45);
						tempHeight = 142;
						tempHeight = tempHeight + randomInteger;
						text = Integer.toString(tempHeight);
						textBuild.append(text);
						textBuild.append("cm");
						textBuild.append(" ");
						
						randomInteger = random.nextInt(35);
						tempWeight = 46;
						tempWeight = tempWeight + randomInteger;
						text = Integer.toString(tempWeight);
						textBuild.append(text);
						textBuild.append("kg");
		            }
					

					//half elf
					//149-185 51-107
					
					
					if (finalText.equals("Half Elf"))
		            {
						randomInteger = random.nextInt(36);
						tempHeight = 149;
						tempHeight = tempHeight + randomInteger;
						text = Integer.toString(tempHeight);
						textBuild.append(text);
						textBuild.append("cm");
						textBuild.append(" ");
						
						randomInteger = random.nextInt(56);
						tempWeight = 51;
						tempWeight = tempWeight + randomInteger;
						text = Integer.toString(tempWeight);
						textBuild.append(text);
						textBuild.append("kg");
		            }
					
					//gnome
					//93-109  16-19
					
					if (finalText.equals("Forest Gnome"))
		            {
						randomInteger = random.nextInt(16);
						tempHeight = 93;
						tempHeight = tempHeight + randomInteger;
						text = Integer.toString(tempHeight);
						textBuild.append(text);
						textBuild.append("cm");
						textBuild.append(" ");
						
						randomInteger = random.nextInt(3);
						tempWeight = 16;
						tempWeight = tempWeight + randomInteger;
						text = Integer.toString(tempWeight);
						textBuild.append(text);
						textBuild.append("kg");
		            }
					if (finalText.equals("Rock Gnome"))
		            {
						randomInteger = random.nextInt(16);
						tempHeight = 93;
						tempHeight = tempHeight + randomInteger;
						text = Integer.toString(tempHeight);
						textBuild.append(text);
						textBuild.append("cm");
						textBuild.append(" ");
						
						randomInteger = random.nextInt(3);
						tempWeight = 16;
						tempWeight = tempWeight + randomInteger;
						text = Integer.toString(tempWeight);
						textBuild.append(text);
						textBuild.append("kg");
		            }

					//halfling
					//83-99 16-19
					
					if (finalText.equals("Lightfoot Halfling"))
		            {
						randomInteger = random.nextInt(16);
						tempHeight = 83;
						tempHeight = tempHeight + randomInteger;
						text = Integer.toString(tempHeight);
						textBuild.append(text);
						textBuild.append("cm");
						textBuild.append(" ");
						
						randomInteger = random.nextInt(3);
						tempWeight = 16;
						tempWeight = tempWeight + randomInteger;
						text = Integer.toString(tempWeight);
						textBuild.append(text);
						textBuild.append("kg");
		            }
					
					if (finalText.equals("Stout Halfling"))
		            {
						randomInteger = random.nextInt(16);
						tempHeight = 83;
						tempHeight = tempHeight + randomInteger;
						text = Integer.toString(tempHeight);
						textBuild.append(text);
						textBuild.append("cm");
						textBuild.append(" ");
						
						randomInteger = random.nextInt(3);
						tempWeight = 16;
						tempWeight = tempWeight + randomInteger;
						text = Integer.toString(tempWeight);
						textBuild.append(text);
						textBuild.append("kg");
		            }


					//half orc
					//152-198 65-172
					
					if (finalText.equals("Half Orc"))
		            {
						randomInteger = random.nextInt(46);
						tempHeight = 152;
						tempHeight = tempHeight + randomInteger;
						text = Integer.toString(tempHeight);
						textBuild.append(text);
						textBuild.append("cm");
						textBuild.append(" ");
						
						randomInteger = random.nextInt(107);
						tempWeight = 65;
						tempWeight = tempWeight + randomInteger;
						text = Integer.toString(tempWeight);
						textBuild.append(text);
						textBuild.append("kg");
		            }

					//human
					//147-193 51-122
					
					if (finalText.equals("Human"))
		            {
						randomInteger = random.nextInt(46);
						tempHeight = 147;
						tempHeight = tempHeight + randomInteger;
						text = Integer.toString(tempHeight);
						textBuild.append(text);
						textBuild.append("cm");
						textBuild.append(" ");
						
						randomInteger = random.nextInt(71);
						tempWeight = 51;
						tempWeight = tempWeight + randomInteger;
						text = Integer.toString(tempWeight);
						textBuild.append(text);
						textBuild.append("kg");
		            }

					//teilfling
					//149-185 51-107
										
					if (finalText.equals("Tiefling"))
		            {
						randomInteger = random.nextInt(36);
						tempHeight = 149;
						tempHeight = tempHeight + randomInteger;
						text = Integer.toString(tempHeight);
						textBuild.append(text);
						textBuild.append("cm");
						textBuild.append(" ");
						
						randomInteger = random.nextInt(56);
						tempWeight = 51;
						tempWeight = tempWeight + randomInteger;
						text = Integer.toString(tempWeight);
						textBuild.append(text);
						textBuild.append("kg");
		            }
	            }
		
			
		});
		btnBuild.setBounds(239, 45, 85, 29);
		btnBuild.setText("Build");
		//----------------------------------------------------------------------------------------DONE	
		Button btnRace = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnRace.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = "";
				textRace.setText("");
				finalText = "";
				
			    try 
			    {
			        BufferedReader in = new BufferedReader(new FileReader(new File("src/race.txt")));
			        String line;
			        try 
			        {
			            while((line = in.readLine())!= null)
			            {
			                text = text + line; 
			                
			                String someString = text;
						    char someChar = '-';
						    int count = 0;  
						    
						    for (int i = 0; i < someString.length(); i++) 
						    {		    	
						        if (someString.charAt(i) == someChar) 
						        {
						            count++;
						        }
						    }
						    
						    Random random = new Random();
						    randomInteger = random.nextInt(count);
						    
						    if (randomInteger == 0)
						    {
						    	randomInteger = 1;
						    }
			            }
			            
			            printString(text,'-',randomInteger);
			            textRace.append(finalText);
					   
			            in.close();
			        	} 
			        	catch (IOException f) 
			        {
			            f.printStackTrace();
			        }
			    	} 
			    	catch (FileNotFoundException f)
			    	{
			    		f.printStackTrace();
			    	}
			}
		});
		btnRace.setBounds(10, 115, 93, 29);
		btnRace.setText("Race");
		//----------------------------------------------------------------------------------------DONE	
		Button btnGender = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnGender.addSelectionListener(new SelectionAdapter() 
		{
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				
				textGender.setText("");
				finalText = "";
				
				 	Random random = new Random();
				    randomInteger = random.nextInt(100);
				    
				    if (randomInteger <= 40)
				    {
				    	finalText = "Male";
				    }
				    if (randomInteger >= 41 && randomInteger <= 79)
				    {
				    	finalText = "Female";
				    }
				    if (randomInteger >= 80)
				    {
				    	finalText = "Unknown";
				    }
				    
				    textGender.append(finalText); 	    
	        }
		});
		btnGender.setBounds(239, 10, 85, 29);
		btnGender.setText("Gender");
		//----------------------------------------------------------------------------------------DONE	
		Button btnClass = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnClass.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = "";
				textClass.setText("");
				finalText = "";
				
			    try 
			    {
			        BufferedReader in = new BufferedReader(new FileReader(new File("src/class.txt")));
			        String line;
			        try 
			        {
			            while((line = in.readLine())!= null)
			            {
			                text = text + line; 
			                
			                String someString = text;
						    char someChar = '-';
						    int count = 0;  
						    
						    for (int i = 0; i < someString.length(); i++) 
						    {		    	
						        if (someString.charAt(i) == someChar) 
						        {
						            count++;
						        }
						    }
						    
						    Random random = new Random();
						    randomInteger = random.nextInt(count);
						    
						    if (randomInteger == 0)
						    {
						    	randomInteger = 1;
						    }
			            }
			            
			            printString(text,'-',randomInteger);
			            textClass.append(finalText);
					   
			            in.close();
			        	} 
			        	catch (IOException f) 
			        {
			            f.printStackTrace();
			        }
			    	} 
			    	catch (FileNotFoundException f)
			    	{
			    		f.printStackTrace();
			    	}
			}
		});
		btnClass.setBounds(10, 150, 93, 29);
		btnClass.setText("Class");
		//----------------------------------------------------------------------------------------	
		Button btnAc = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnAc.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			
				
				String armorClassText = "";
				String armorClassTypeText = "";

				textAc.setText("");
				textArmorType.setText("");
				
				String getTheClass = textClass.getText();
				String getTheArmor = textArmor.getText();
				finalText = "";

				String tempDex = textDexBonus.getText();
				String tempWis = textWisBonus.getText();
				String tempCon = textConBonus.getText();
			
				int tempAC = 0;
				int tempWisNum = 0;
				int tempDexNum = 0;
				int tempConNum = 0;
				
				tempWisNum = Integer.valueOf(tempWis);	
				tempDexNum = Integer.valueOf(tempDex);	
				tempConNum = Integer.valueOf(tempCon);	

				if (getTheArmor.equals("Unarmored Defence"))
				{	
					if (getTheClass.equals("Monk"))
					{
					tempAC = 10;
					armorClassTypeText = "Light";
					tempAC = tempAC + tempWisNum + tempDexNum;
					armorClassText = Integer.toString(tempAC);
					textAc.append(armorClassText);
					textArmorType.append(armorClassTypeText);
					}
				}
				

				if (getTheArmor.equals("Unarmored Defence"))
				{		
					if (getTheClass.equals("Barbarian"))
					{
					tempAC = 10;
					armorClassTypeText = "Light";
					tempAC = tempAC + tempConNum + tempDexNum;
					armorClassText = Integer.toString(tempAC);
					textAc.append(armorClassText);
					textArmorType.append(armorClassTypeText);
					}
				}
				
				if (getTheArmor.equals("Magic Robes") || getTheArmor.equals("Ragged Robes")|| getTheArmor.equals("Badass Robes"))
				{
						tempAC = 10;
						armorClassTypeText = "Light";
						tempAC = tempAC + tempDexNum;
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
				}
				
				
				if (getTheArmor.equals("Ring Mail"))
				{ 	    
					tempAC = 14;
					armorClassTypeText = "Heavy";
					armorClassText = Integer.toString(tempAC);
					textAc.append(armorClassText);
					textArmorType.append(armorClassTypeText);
				}
					if (getTheArmor.equals("Chain Mail"))
					{
						tempAC = 16;
						armorClassTypeText = "Heavy";
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
					}
					
					if (getTheArmor.equals("Splint"))
					{
						tempAC = 17;
						armorClassTypeText = "Heavy";
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
					}
					if (getTheArmor.equals("Plate"))
					{
						tempAC = 18;
						armorClassTypeText = "Heavy";
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
					}
				
			    
				
			if (getTheArmor.equals("Half Plate"))
			{
				tempAC = 15;
				armorClassTypeText = "Medium";
				if (tempDexNum > 1)
				{
					tempDexNum = 2;
				}
				tempAC = tempAC + tempDexNum;
				armorClassText = Integer.toString(tempAC);
				textAc.append(armorClassText);
				textArmorType.append(armorClassTypeText);
			}
			if (getTheArmor.equals("Breastplate"))
			{
						tempAC = 14;
						armorClassTypeText = "Medium";
						if (tempDexNum > 1)
						{
							tempDexNum = 2;
						}
						tempAC = tempAC + tempDexNum;
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
					}
			if (getTheArmor.equals("Scale Mail"))
			{
						tempAC = 14;
						armorClassTypeText = "Medium";
						if (tempDexNum > 1)
						{
							tempDexNum = 2;
						}
						tempAC = tempAC + tempDexNum;
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
					}
			if (getTheArmor.equals("Chain Shirt"))
			{
						tempAC = 13;
						armorClassTypeText = "Medium";
						if (tempDexNum > 1)
						{
							tempDexNum = 2;
						}
						tempAC = tempAC + tempDexNum;
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
					}
			if (getTheArmor.equals("Hide"))
			{
						tempAC = 12;
						armorClassTypeText = "Medium";
						if (tempDexNum > 1)
						{
							tempDexNum = 2;
						}
						tempAC = tempAC + tempDexNum;
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
					}
				
				
			if (getTheArmor.equals("Padded"))
			{
						tempAC = 11;
						armorClassTypeText = "Light";
						tempAC = tempAC + tempDexNum;
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
					}
			if (getTheArmor.equals("Leather"))
			{
						tempAC = 11;
						armorClassTypeText = "Light";
						tempAC = tempAC + tempDexNum;
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
					}
			if (getTheArmor.equals("Studded Leather"))
			{
						tempAC = 12;
						armorClassTypeText = "Light";
						tempAC = tempAC + tempDexNum;
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
					}
			}   
				

			
		});
		btnAc.setBounds(761, 45, 42, 29);
		btnAc.setText("AC");
		//----------------------------------------------------------------------------------------	
		Button btnInitiative = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnInitiative.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				textInitiative.setText("");
				String temp = textDexBonus.getText();
				textInitiative.append(temp);
			}
		});
		btnInitiative.setBounds(860, 45, 101, 29);
		btnInitiative.setText("Initiative");
		//----------------------------------------------------------------------------------------Done	
		Button btnAlignment = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnAlignment.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				textAlignment.setText("");
				finalText = "";
				
				 	Random random = new Random();
				    randomInteger = random.nextInt(9);
				    
				    if (randomInteger == 0)
				    {
				    	finalText = "Lawful Good";
				    }
				    if (randomInteger == 1)
				    {
				    	finalText = "Neutral Good";
				    }
				    if (randomInteger == 2)
				    {
				    	finalText = "Chaotic Good";
				    }
				    if (randomInteger == 3)
				    {
				    	finalText = "Lawful Neutral";
				    }
				    if (randomInteger == 4)
				    {
				    	finalText = "True Neutral";
				    }
				    if (randomInteger == 5)
				    {
				    	finalText = "Chaotic Neutral";
				    }
				    if (randomInteger == 6)
				    {
				    	finalText = "Lawful Evil";
				    }
				    if (randomInteger == 7)
				    {
				    	finalText = "Neutral Evil";
				    }
				    if (randomInteger == 8)
				    {
				    	finalText = "Chaotic Evil";
				    }
				    
				    textAlignment.append(finalText); 
			}
		});
		btnAlignment.setBounds(421, 10, 93, 29);
		btnAlignment.setText("Alignment");
		//----------------------------------------------------------------------------------------	
		Button btnLevel = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnLevel.setEnabled(false);
		btnLevel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
			}
		});
		btnLevel.setBounds(761, 10, 60, 29);
		btnLevel.setText("Level");
		//----------------------------------------------------------------------------------------	
		
		Button btnAge = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnAge.addSelectionListener(new SelectionAdapter() 
		{
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				String text = "";
				finalText = "";
				String howOld = "";
				textAge.setText("");
				textAgeType.setText("");
				
				finalText = textRace.getText();
				
				int tempAge = 0;
				
				Random random = new Random();
				randomInteger = random.nextInt(100);
				
				if(randomInteger <= 79)
            	{
            		 howOld = "Normal";
            		 textAgeType.append(howOld);
            	}
            	if(randomInteger >= 80 && randomInteger <= 90)
            	{
            		 howOld = "Old";
            		 textAgeType.append(howOld);
            	}
            	if(randomInteger >= 91)
            	{
            		 howOld = "Cripple";
            		 textAgeType.append(howOld);
            	}
            	
            	//dragonborn 15- 55, 56- 75, 76-90
            	if (finalText.equals("Dragonborn"))
	            {
					if (howOld.equals("Normal"))
					{
						randomInteger = random.nextInt(40);
						tempAge = 15;
						tempAge = tempAge + randomInteger;
						text = Integer.toString(tempAge);
						textAge.append(text);
					}
					if (howOld.equals("Old"))
					{
						randomInteger = random.nextInt(19);
						tempAge = 56;
						tempAge = tempAge + randomInteger;
						text = Integer.toString(tempAge);
						textAge.append(text);
					}
					if (howOld.equals("Cripple"))
					{
						randomInteger = random.nextInt(14);
						tempAge = 76;
						tempAge = tempAge + randomInteger;
						text = Integer.toString(tempAge);
						textAge.append(text);
					}
	            }   
            
            	//Dwarf 40-250, 251-350, 351-420. 
			
					if (finalText.equals("Hill Dwarf"))
		            {
						if (howOld.equals("Normal"))
						{
							randomInteger = random.nextInt(210);
							tempAge = 40;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Old"))
						{
							randomInteger = random.nextInt(99);
							tempAge = 251;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Cripple"))
						{
							randomInteger = random.nextInt(69);
							tempAge = 351;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
		            }
					if (finalText.equals("Mountain Dwarf"))
		            {
						if (howOld.equals("Normal"))
						{
							randomInteger = random.nextInt(210);
							tempAge = 40;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Old"))
						{
							randomInteger = random.nextInt(99);
							tempAge = 251;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Cripple"))
						{
							randomInteger = random.nextInt(69);
							tempAge = 351;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
		            }

					//elf 110- 300, 301-500, 501-750.
				
					if (finalText.equals("Elf"))
		            {
						if (howOld.equals("Normal"))
						{
							randomInteger = random.nextInt(190);
							tempAge = 110;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Old"))
						{
							randomInteger = random.nextInt(199);
							tempAge = 301;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Cripple"))
						{
							randomInteger = random.nextInt(249);
							tempAge = 501;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
		            }
					if (finalText.equals("Drow"))
		            {
						if (howOld.equals("Normal"))
						{
							randomInteger = random.nextInt(190);
							tempAge = 110;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Old"))
						{
							randomInteger = random.nextInt(199);
							tempAge = 301;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Cripple"))
						{
							randomInteger = random.nextInt(249);
							tempAge = 501;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
		            }
					
					if (finalText.equals("High Elf"))
		            {
						if (howOld.equals("Normal"))
						{
							randomInteger = random.nextInt(190);
							tempAge = 110;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Old"))
						{
							randomInteger = random.nextInt(199);
							tempAge = 301;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Cripple"))
						{
							randomInteger = random.nextInt(249);
							tempAge = 501;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
		            }
					if (finalText.equals("Wood Elf"))
		            {
						if (howOld.equals("Normal"))
						{
							randomInteger = random.nextInt(190);
							tempAge = 110;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Old"))
						{
							randomInteger = random.nextInt(199);
							tempAge = 301;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Cripple"))
						{
							randomInteger = random.nextInt(249);
							tempAge = 501;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
		            }
					

					//Half elf 15-65, 66-119, 120-180
					
					if (finalText.equals("Half Elf"))
		            {
						if (howOld.equals("Normal"))
						{
							randomInteger = random.nextInt(50);
							tempAge = 15;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Old"))
						{
							randomInteger = random.nextInt(53);
							tempAge = 66;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Cripple"))
						{
							randomInteger = random.nextInt(60);
							tempAge = 120;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
		            }

					//gnome 40- 150, 151 - 300, 301-500
					
					if (finalText.equals("Forest Gnome"))
		            {
						if (howOld.equals("Normal"))
						{
							randomInteger = random.nextInt(110);
							tempAge = 40;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Old"))
						{
							randomInteger = random.nextInt(149);
							tempAge = 151;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Cripple"))
						{
							randomInteger = random.nextInt(199);
							tempAge = 301;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
		            }
					if (finalText.equals("Rock Gnome"))
		            {
						if (howOld.equals("Normal"))
						{
							randomInteger = random.nextInt(110);
							tempAge = 40;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Old"))
						{
							randomInteger = random.nextInt(149);
							tempAge = 151;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Cripple"))
						{
							randomInteger = random.nextInt(199);
							tempAge = 301;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
		            }

					//halfing 20-55, 56 -75 76-100.
					
					if (finalText.equals("Lightfoot Halfling"))
		            {
						if (howOld.equals("Normal"))
						{
							randomInteger = random.nextInt(35);
							tempAge = 20;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Old"))
						{
							randomInteger = random.nextInt(19);
							tempAge = 56;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Cripple"))
						{
							randomInteger = random.nextInt(24);
							tempAge = 76;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
		            }
					
					if (finalText.equals("Stout Halfling"))
		            {
						if (howOld.equals("Normal"))
						{
							randomInteger = random.nextInt(35);
							tempAge = 20;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Old"))
						{
							randomInteger = random.nextInt(19);
							tempAge = 56;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Cripple"))
						{
							randomInteger = random.nextInt(24);
							tempAge = 76;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
		            }

					//orc 14-30, 31-60, 61-75
					
					if (finalText.equals("Half Orc"))
		            {
						if (howOld.equals("Normal"))
						{
							randomInteger = random.nextInt(16);
							tempAge = 14;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Old"))
						{
							randomInteger = random.nextInt(29);
							tempAge = 31;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Cripple"))
						{
							randomInteger = random.nextInt(14);
							tempAge = 61;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
		            }

					//Human 15-55, 56-75, 76-110
					
					if (finalText.equals("Human"))
		            {
						if (howOld.equals("Normal"))
						{
							randomInteger = random.nextInt(40);
							tempAge = 15;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Old"))
						{
							randomInteger = random.nextInt(19);
							tempAge = 56;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Cripple"))
						{
							randomInteger = random.nextInt(34);
							tempAge = 76;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
		            }

					//teifling 20- 50, 51- 85, 86-125
					
					if (finalText.equals("Tiefling"))
		            {
						if (howOld.equals("Normal"))
						{
							randomInteger = random.nextInt(30);
							tempAge = 20;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Old"))
						{
							randomInteger = random.nextInt(34);
							tempAge = 51;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
						if (howOld.equals("Cripple"))
						{
							randomInteger = random.nextInt(39);
							tempAge = 86;
							tempAge = tempAge + randomInteger;
							text = Integer.toString(tempAge);
							textAge.append(text);
						}
		            }
	            }
			
		});
		btnAge.setBounds(322, 150, 93, 29);
		btnAge.setText("Age");
		//----------------------------------------------------------------------------------------		
		Button btnLanguage = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnLanguage.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				String text = "";
				
				textLanguage.setText("");
				String langText = "";
				
				textLanguage.setText("");
				langText = textRace.getText();
				
				if (langText.equals("Dragonborn"))
				{
					textLanguage.append("Draconic");
					textLanguage.append("\n");
					textLanguage.append("Common");
				}
				if (langText.equals("Hill Dwarf") || langText.equals("Mountain Dwarf"))
				{
					textLanguage.append("Dwarvish");
					textLanguage.append("\n");
					textLanguage.append("Common");
				}
				
				if (langText.equals("Elf")|| langText.equals("Drow") || langText.equals("High Elf")|| langText.equals("Wood Elf"))
				{
					textLanguage.append("Elvish");
					textLanguage.append("\n");
					textLanguage.append("Common");
				}

				if (langText.equals("Lightfoot Halfling") || langText.equals("Stout Halfling"))
				{
					textLanguage.append("Halfling");
					textLanguage.append("\n");
					textLanguage.append("Common");
				}
				if (langText.equals("Rock Gnome") || langText.equals("Forest Gnome"))
				{
					textLanguage.append("Gnomish");
					textLanguage.append("\n");
					textLanguage.append("Common");
				}
				if (langText.equals("Half Orc"))
				{
					textLanguage.append("Orc");
					textLanguage.append("\n");
					textLanguage.append("Common");
				}
				if (langText.equals("Tiefling"))
				{
					textLanguage.append("Infernal");
					textLanguage.append("\n");
					textLanguage.append("Common");
				}
				 try 
				    {
				        BufferedReader in = new BufferedReader(new FileReader(new File("src/language.txt")));
				        String line;
				        try 
				        {
				            while((line = in.readLine())!= null)
				            {
				                text = text + line; 
				                
				                String someString = text;
							    char someChar = '-';
							    int count = 0;  
							    
							    for (int i = 0; i < someString.length(); i++) 
							    {		    	
							        if (someString.charAt(i) == someChar) 
							        {
							            count++;
							        }
							    }

							    Random random = new Random();
							    randomInteger = random.nextInt(count);
							    
							    if (randomInteger == 0)
							    {
							    	randomInteger = 1;
							    }
				            }
				            
				            printString(text,'-',randomInteger);
				            

							if (langText.equals("Human"))
							{
								textLanguage.append("Common");
								textLanguage.append("\n");
								textLanguage.append(finalText);
							}
							if (langText.equals("Half Elf"))
							{
								textLanguage.append("Common");
								textLanguage.append("\n");
								textLanguage.append("Elvish");
								textLanguage.append("\n");
								if (finalText.contentEquals("Elvish"))
								{
									finalText = "Dwarvish";
								}
								textLanguage.append(finalText);
							}
						   
				            in.close();
				        	} 
				        	catch (IOException f) 
				        {
				            f.printStackTrace();
				        }
				    	} 
				    	catch (FileNotFoundException f)
				    	{
				    		f.printStackTrace();
				    	}
			}
		});
		btnLanguage.setBounds(520, 45, 93, 29);
		btnLanguage.setText("Language");
		//----------------------------------------------------------------------------------------DONE		
		Button btnJob = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnJob.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = "";
				textJob.setText("");
				finalText = "";
			
			    try 
			    {
			        BufferedReader in = new BufferedReader(new FileReader(new File("src/job.txt")));
			        String line;
			        try 
			        {
			            while((line = in.readLine())!= null)
			            {
			                text = text + line; 
			                
			                String someString = text;
						    char someChar = '-';
						    int count = 0;  
						    
						    for (int i = 0; i < someString.length(); i++) 
						    {		    	
						        if (someString.charAt(i) == someChar) 
						        {
						            count++;
						        }
						    }
						    
						    Random random = new Random();
						    randomInteger = random.nextInt(count);
						    
						    if (randomInteger == 0)
						    {
						    	randomInteger = 1;
						    }
			            }
			            
			            printString(text,'-',randomInteger);
			            textJob.append(finalText);
					   
			            in.close();
			        	} 
			        	catch (IOException f) 
			        {
			            f.printStackTrace();
			        }
			    	} 
			    	catch (FileNotFoundException f)
			    	{
			    		f.printStackTrace();
			    	}
			}
		});
		btnJob.setBounds(322, 80, 93, 29);
		btnJob.setText("Job");
		//----------------------------------------------------------------------------------------DONE	
		Button btnJobSpec = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnJobSpec.addSelectionListener(new SelectionAdapter(){
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				textJobSpec.setText("");
				finalText = textJob.getText();
				
				if (finalText.equals("Criminal"))
	            {
	                Random random = new Random();
				    randomInteger = random.nextInt(8);
				 
				    
	            	if(randomInteger == 0)
	            	{
	            		 textJobSpec.append("Blackmailer");
	            	}
	            	if(randomInteger == 1)
	            	{
	            		 textJobSpec.append("Burglar");
	            	}
	            	if(randomInteger == 2)
	            	{
	            		 textJobSpec.append("Enforcer");
	            	}
	            	if(randomInteger == 3)
	            	{
	            		 textJobSpec.append("Fence");
	            	}
	            	if(randomInteger == 4)
	            	{
	            		 textJobSpec.append("Highway robber");
	            	}
	            	if(randomInteger == 5)
	            	{
	            		 textJobSpec.append("Hired killer");
	            	}
	            	if(randomInteger == 6)
	            	{
	            		 textJobSpec.append("Pickpocket");
	            	}
	            	if(randomInteger == 7)
	            	{
	            		 textJobSpec.append("Smuggler");
	            	}
	            	
	            }
	            
	            if (finalText.equals("Guild Merchant"))
	            {
	                Random random = new Random();
				    randomInteger = random.nextInt(20);
				   
	            	if(randomInteger == 0)
	            	{
	            		 textJobSpec.append("Alchemist");
	            	}
	            	if(randomInteger == 1)
	            	{
	            		 textJobSpec.append("Armorer");
	            	}
	            	if(randomInteger == 2)
	            	{
	            		 textJobSpec.append("Brewer");
	            	}
	            	if(randomInteger == 3)
	            	{
	            		 textJobSpec.append("Scribe");
	            	}
	            	if(randomInteger == 4)
	            	{
	            		 textJobSpec.append("Carpenter");
	            	}
	            	if(randomInteger == 5)
	            	{
	            		 textJobSpec.append("Cartographer");
	            	}
	            	if(randomInteger == 6)
	            	{
	            		 textJobSpec.append("Cobbler");
	            	}
	            	if(randomInteger == 7)
	            	{
	            		 textJobSpec.append("Cook");
	            	}
	            	if(randomInteger == 8)
	            	{
	            		 textJobSpec.append("Glassblower");
	            	}
	            	if(randomInteger == 9)
	            	{
	            		 textJobSpec.append("Leatherworker");
	            	}

	            	if(randomInteger == 10)
	            	{
	            		 textJobSpec.append("Jeweler");
	            	}
	            	if(randomInteger == 11)
	            	{
	            		 textJobSpec.append("Mason");
	            	}
	            	if(randomInteger == 12)
	            	{
	            		 textJobSpec.append("Painter");
	            	}
	            	if(randomInteger == 13)
	            	{
	            		 textJobSpec.append("Potter");
	            	}
	            	if(randomInteger == 14)
	            	{
	            		 textJobSpec.append("Shipwright");
	            	}
	            	if(randomInteger == 15)
	            	{
	            		 textJobSpec.append("Smith");
	            	}
	            	if(randomInteger == 16)
	            	{
	            		 textJobSpec.append("Tinker");
	            	}
	            	if(randomInteger == 17)
	            	{
	            		 textJobSpec.append("Wagon maker");
	            	}
	            	if(randomInteger == 18)
	            	{
	            		 textJobSpec.append("Weaver");
	            	}
	            	if(randomInteger == 19)
	            	{
	            		 textJobSpec.append("Woodcarver");
	            	}
	           
	            }
			   
	            if (finalText.equals("Entertainer"))
	            {
	                Random random = new Random();
				    randomInteger = random.nextInt(10);
				    
	            	if(randomInteger == 0)
	            	{
	            		 textJobSpec.append("Actor");
	            	}
	            	if(randomInteger == 1)
	            	{
	            		 textJobSpec.append("Dancer");
	            	}
	            	if(randomInteger == 2)
	            	{
	            		 textJobSpec.append("Fire-eater");
	            	}
	            	if(randomInteger == 3)
	            	{
	            		 textJobSpec.append("Jester");
	            	}
	            	if(randomInteger == 4)
	            	{
	            		 textJobSpec.append("Juggler");
	            	}
	            	if(randomInteger == 5)
	            	{
	            		 textJobSpec.append("Instrumentalist");
	            	}
	            	if(randomInteger == 6)
	            	{
	            		 textJobSpec.append("Poet");
	            	}
	            	if(randomInteger == 7)
	            	{
	            		 textJobSpec.append("Singer");
	            	}
	            	if(randomInteger == 8)
	            	{
	            		 textJobSpec.append("Storyteller");
	            	}
	            	if(randomInteger == 9)
	            	{
	            		 textJobSpec.append("Tumbler");
	            	}
	            	
	            }
			   
	            if (finalText.equals("Hermit"))
	            {
	            	Random random = new Random();
				    randomInteger = random.nextInt(8);
				    
	            	if(randomInteger == 0)
	            	{
	            		 textJobSpec.append("Spiritual Enlightenment");
	            	}
	            	if(randomInteger == 1)
	            	{
	            		 textJobSpec.append("Religious Order");
	            	}
	            	if(randomInteger == 2)
	            	{
	            		 textJobSpec.append("Wrongfully Exiled");
	            	}
	            	if(randomInteger == 3)
	            	{
	            		 textJobSpec.append("Hiding from Past");
	            	}
	            	if(randomInteger == 4)
	            	{
	            		 textJobSpec.append("Artist in Solitude");
	            	}
	            	if(randomInteger == 5)
	            	{
	            		 textJobSpec.append("Commune with Nature");
	            	}
	            	if(randomInteger == 6)
	            	{
	            		 textJobSpec.append("Caretaker of Relic");
	            	}
	            	if(randomInteger == 7)
	            	{
	            		 textJobSpec.append("Religious Pilgrim");
	            	}
	            	
	            }
			   
	            if (finalText.equals("Outlander"))
	            {
	            	Random random = new Random();
				    randomInteger = random.nextInt(10);
				    
	            	if(randomInteger == 0)
	            	{
	            		 textJobSpec.append("Forester");
	            	}
	            	if(randomInteger == 1)
	            	{
	            		 textJobSpec.append("Trapper");
	            	}
	            	if(randomInteger == 2)
	            	{
	            		 textJobSpec.append("Homesteader");
	            	}
	            	if(randomInteger == 3)
	            	{
	            		 textJobSpec.append("Guide");
	            	}
	            	if(randomInteger == 4)
	            	{
	            		 textJobSpec.append("Outcast");
	            	}
	            	if(randomInteger == 5)
	            	{
	            		 textJobSpec.append("Bounty Hunter");
	            	}
	            	if(randomInteger == 6)
	            	{
	            		 textJobSpec.append("Pilgrim");
	            	}
	            	if(randomInteger == 7)
	            	{
	            		 textJobSpec.append("Tribal Nomad");
	            	}
	            	if(randomInteger == 8)
	            	{
	            		 textJobSpec.append("Hunter Gatherer");
	            	}
	            	if(randomInteger == 9)
	            	{
	            		 textJobSpec.append("Tribal Marauder");
	            	}
	            	
	            }
			   
	            if (finalText.equals("Sage"))
	            {
	                Random random = new Random();
				    randomInteger = random.nextInt(8); 
				    
	            	if(randomInteger == 0)
	            	{
	            		 textJobSpec.append("Alchemist");
	            	}
	            	if(randomInteger == 1)
	            	{
	            		 textJobSpec.append("Astronomer");
	            	}
	            	if(randomInteger == 2)
	            	{
	            		 textJobSpec.append("Discredited Academic");
	            	}
	            	if(randomInteger == 3)
	            	{
	            		 textJobSpec.append("Librarian");
	            	}
	            	if(randomInteger == 4)
	            	{
	            		 textJobSpec.append("Professor");
	            	}
	            	if(randomInteger == 5)
	            	{
	            		 textJobSpec.append("Researcher");
	            	}
	            	if(randomInteger == 6)
	            	{
	            		 textJobSpec.append("Wizard’s Apprentice");
	            	}
	            	if(randomInteger == 7)
	            	{
	            		 textJobSpec.append("Scribe");
	            	}
	            	
	            }
			   
	            if (finalText.equals("Soldier"))
	            {
	                Random random = new Random();
				    randomInteger = random.nextInt(8);
				    
	            	if(randomInteger == 0)
	            	{
	            		 textJobSpec.append("Officer");
	            	}
	            	if(randomInteger == 1)
	            	{
	            		 textJobSpec.append("Scout");
	            	}
	            	if(randomInteger == 2)
	            	{
	            		 textJobSpec.append("Infantry");
	            	}
	            	if(randomInteger == 3)
	            	{
	            		 textJobSpec.append("Cavalry");
	            	}
	            	if(randomInteger == 4)
	            	{
	            		 textJobSpec.append("Healer");
	            	}
	            	if(randomInteger == 5)
	            	{
	            		 textJobSpec.append("Quartermaster");
	            	}
	            	if(randomInteger == 6)
	            	{
	            		 textJobSpec.append("Standard Bearer");
	            	}
	            	if(randomInteger == 7)
	            	{
	            		 textJobSpec.append("Support Staff");
	            	}
	            	
	            }
			   
	            if (finalText.equals("Sailor"))
	            {
	                Random random = new Random();
				    randomInteger = random.nextInt(6);
				    
	            	if(randomInteger == 0)
	            	{
	            		 textJobSpec.append("Deckhand");
	            	}
	            	if(randomInteger == 1)
	            	{
	            		 textJobSpec.append("Captain");
	            	}
	            	if(randomInteger == 2)
	            	{
	            		 textJobSpec.append("First Mate");
	            	}
	            	if(randomInteger == 3)
	            	{
	            		 textJobSpec.append("Ship Cook");
	            	}
	            	if(randomInteger == 4)
	            	{
	            		 textJobSpec.append("Pirate");
	            	}
	            	if(randomInteger == 5)
	            	{
	            		 textJobSpec.append("Pirate King");
	            	}
	            }			       
		    } 					    	
		});
		btnJobSpec.setBounds(322, 115, 93, 29);
		btnJobSpec.setText("JobSpec");
		//----------------------------------------------------------------------------------------DONE			
		Button btnIdeals = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnIdeals.addSelectionListener(new SelectionAdapter() 
		{
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				String text = "";
				textIdeals.setText("");
				finalText = "";
				
			    try 
			    {
			        BufferedReader in = new BufferedReader(new FileReader(new File("src/ideals.txt")));
			        String line;
			        try 
			        {
			            while((line = in.readLine())!= null)
			            {
			                text = text + line; 
			                
			                String someString = text;
						    char someChar = '-';
						    int count = 0;  
						    
						    for (int i = 0; i < someString.length(); i++) 
						    {		    	
						        if (someString.charAt(i) == someChar) 
						        {
						            count++;
						        }
						    }
						    
						    Random random = new Random();
						    randomInteger = random.nextInt(count);
						    
						    if (randomInteger == 0)
						    {
						    	randomInteger = 1;
						    }
			            }
			            
			            printString(text,'-',randomInteger);
			            textIdeals.append(finalText);
					   
			            in.close();
			        } 
			        	catch (IOException f) 
			        	{
			        		f.printStackTrace();
			        	}
			   } 
			    		catch (FileNotFoundException f)
			    		{
			    			f.printStackTrace();
			    		}
			}
		});
		btnIdeals.setBounds(889, 299, 130, 29);
		btnIdeals.setText("Ideals");
		//----------------------------------------------------------------------------------------DONE		
		Button btnFlaw = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnFlaw.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = "";
				textFlaw.setText("");
				finalText = "";
				
			    try 
			    {
			        BufferedReader in = new BufferedReader(new FileReader(new File("src/flaws.txt")));
			        String line;
			        try 
			        {
			            while((line = in.readLine())!= null)
			            {
			                text = text + line; 
			                
			                String someString = text;
						    char someChar = '-';
						    int count = 0;  
						    
						    for (int i = 0; i < someString.length(); i++) 
						    {		    	
						        if (someString.charAt(i) == someChar) 
						        {
						            count++;
						        }
						    }
						    
						    Random random = new Random();
						    randomInteger = random.nextInt(count);
						    
						    if (randomInteger == 0)
						    {
						    	randomInteger = 1;
						    }
			            }
			            
			            printString(text,'-',randomInteger);
			            textFlaw.append(finalText);
					   
			            in.close();
			        	} 
			        	catch (IOException f) 
			        {
			            f.printStackTrace();
			        }
			    	} 
			    	catch (FileNotFoundException f)
			    	{
			    		f.printStackTrace();
			    	}
			}
		});
		btnFlaw.setBounds(619, 299, 130, 29);
		btnFlaw.setText("Flaw");
		//----------------------------------------------------------------------------------------DONE			
		Button btnBonds = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnBonds.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = "";
				textBonds.setText("");
				finalText = "";
				
			    try 
			    {
			        BufferedReader in = new BufferedReader(new FileReader(new File("src/bonds.txt")));
			        String line;
			        try 
			        {
			            while((line = in.readLine())!= null)
			            {
			                text = text + line; 
			                
			                String someString = text;
						    char someChar = '-';
						    int count = 0;  
						    
						    for (int i = 0; i < someString.length(); i++) 
						    {		    	
						        if (someString.charAt(i) == someChar) 
						        {
						            count++;
						        }
						    }
						    
						    Random random = new Random();
						    randomInteger = random.nextInt(count);
						    
						    if (randomInteger == 0)
						    {
						    	randomInteger = 1;
						    }
			            }
			            
			            printString(text,'-',randomInteger);
			            textBonds.append(finalText);
					   
			            in.close();
			        	} 
			        	catch (IOException f) 
			        {
			            f.printStackTrace();
			        }
			    	} 
			    	catch (FileNotFoundException f)
			    	{
			    		f.printStackTrace();
			    	}
			}
		});
		btnBonds.setBounds(1159, 299, 130, 29);
		btnBonds.setText("Bonds");
		//----------------------------------------------------------------------------------------DONE		
		Button btnTraits = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnTraits.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = "";
				textTraits.setText("");
				finalText = "";
				
			    try 
			    {
			        BufferedReader in = new BufferedReader(new FileReader(new File("src/traits.txt")));
			        String line;
			        try 
			        {
			            while((line = in.readLine())!= null)
			            {
			                text = text + line; 
			                
			                String someString = text;
						    char someChar = '-';
						    int count = 0;  
						    
						    for (int i = 0; i < someString.length(); i++) 
						    {		    	
						        if (someString.charAt(i) == someChar) 
						        {
						            count++;
						        }
						    }
						    
						    Random random = new Random();
						    randomInteger = random.nextInt(count);
						    
						    if (randomInteger == 0)
						    {
						    	randomInteger = 1;
						    }
			            }
			            
			            printString(text,'-',randomInteger);
			            textTraits.append(finalText);
					   
			            in.close();
			        	} 
			        	catch (IOException f) 
			        {
			            f.printStackTrace();
			        }
			    	} 
			    	catch (FileNotFoundException f)
			    	{
			    		f.printStackTrace();
			    	}
			}
		});
		btnTraits.setBounds(1024, 299, 130, 29);
		btnTraits.setText("Traits");
		//----------------------------------------------------------------------------------------DONE		
		Button btnTrinkets = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnTrinkets.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = "";
				textTrinkets.setText("");
				finalText = "";
				
			    try 
			    {
			        BufferedReader in = new BufferedReader(new FileReader(new File("src/trinkets.txt")));
			        String line;
			        try 
			        {
			            while((line = in.readLine())!= null)
			            {
			                text = text + line; 
			                
			                String someString = text;
						    char someChar = '-';
						    int count = 0;  
						    
						    for (int i = 0; i < someString.length(); i++) 
						    {		    	
						        if (someString.charAt(i) == someChar) 
						        {
						            count++;
						        }
						    }
						    
						    Random random = new Random();
						    randomInteger = random.nextInt(count);
						    
						    if (randomInteger == 0)
						    {
						    	randomInteger = 1;
						    }
			            }
			            
			            printString(text,'-',randomInteger);
			            textTrinkets.append(finalText);
					   
			            in.close();
			        	} 
			        	catch (IOException f) 
			        {
			            f.printStackTrace();
			        }
			    	} 
			    	catch (FileNotFoundException f)
			    	{
			    		f.printStackTrace();
			    	}
			}});
		btnTrinkets.setBounds(754, 150, 130, 29);
		btnTrinkets.setText("Left Pocket");
		
		Button btnFears = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnFears.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = "";
				textFears.setText("");
				finalText = "";
				
			    try 
			    {
			        BufferedReader in = new BufferedReader(new FileReader(new File("src/fears.txt")));
			        String line;
			        try 
			        {
			            while((line = in.readLine())!= null)
			            {
			                text = text + line; 
			                
			                String someString = text;
						    char someChar = '-';
						    int count = 0;  
						    
						    for (int i = 0; i < someString.length(); i++) 
						    {		    	
						        if (someString.charAt(i) == someChar) 
						        {
						            count++;
						        }
						    }
						    
						    Random random = new Random();
						    randomInteger = random.nextInt(count);
						    
						    if (randomInteger == 0)
						    {
						    	randomInteger = 1;
						    }
			            }
			            
			            printString(text,'-',randomInteger);
			            textFears.append(finalText);
					   
			            in.close();
			        	} 
			        	catch (IOException f) 
			        {
			            f.printStackTrace();
			        }
			    	} 
			    	catch (FileNotFoundException f)
			    	{
			    		f.printStackTrace();
			    	}
			}
		});
		btnFears.setBounds(1159, 150, 130, 29);
		btnFears.setText("Fears");
		
		Button btnAppearance = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnAppearance.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = "";
				textAppearance.setText("");
				finalText = "";
				
			    try 
			    {
			        BufferedReader in = new BufferedReader(new FileReader(new File("src/appearance.txt")));
			        String line;
			        try 
			        {
			            while((line = in.readLine())!= null)
			            {
			                text = text + line; 
			                
			                String someString = text;
						    char someChar = '-';
						    int count = 0;  
						    
						    for (int i = 0; i < someString.length(); i++) 
						    {		    	
						        if (someString.charAt(i) == someChar) 
						        {
						            count++;
						        }
						    }
						    
						    Random random = new Random();
						    randomInteger = random.nextInt(count);
						    
						    if (randomInteger == 0)
						    {
						    	randomInteger = 1;
						    }
			            }
			            
			            printString(text,'-',randomInteger);
			            textAppearance.append(finalText);
					   
			            in.close();
			        	} 
			        	catch (IOException f) 
			        {
			            f.printStackTrace();
			        }
			    	} 
			    	catch (FileNotFoundException f)
			    	{
			    		f.printStackTrace();
			    	}
			}
		});
		btnAppearance.setBounds(1024, 150, 130, 29);
		btnAppearance.setText("Appearance");
		
		textFears = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		textFears.setBounds(1159, 185, 130, 100);
		
		textAppearance = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		textAppearance.setBounds(1024, 185, 130, 100);
		
		textFlawsBonus = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		textFlawsBonus.setBounds(754, 334, 130, 100);
		
		textQuirks = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		textQuirks.setBounds(619, 185, 130, 100);
		
		Button btnFlawsBonus = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnFlawsBonus.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = "";
				textFlawsBonus.setText("");
				finalText = "";
				
			    try 
			    {
			        BufferedReader in = new BufferedReader(new FileReader(new File("src/flawsbonus.txt")));
			        String line;
			        try 
			        {
			            while((line = in.readLine())!= null)
			            {
			                text = text + line; 
			                
			                String someString = text;
						    char someChar = '-';
						    int count = 0;  
						    
						    for (int i = 0; i < someString.length(); i++) 
						    {		    	
						        if (someString.charAt(i) == someChar) 
						        {
						            count++;
						        }
						    }
						    
						    Random random = new Random();
						    randomInteger = random.nextInt(count);
						    
						    if (randomInteger == 0)
						    {
						    	randomInteger = 1;
						    }
			            }
			            
			            printString(text,'-',randomInteger);
			            textFlawsBonus.append(finalText);
					   
			            in.close();
			        	} 
			        	catch (IOException f) 
			        {
			            f.printStackTrace();
			        }
			    	} 
			    	catch (FileNotFoundException f)
			    	{
			    		f.printStackTrace();
			    	}
			}
		});
		btnFlawsBonus.setBounds(754, 299, 130, 29);
		btnFlawsBonus.setText("Extra Flaw");
		
		Button btnQuirks = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnQuirks.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = "";
				textQuirks.setText("");
				finalText = "";
				
			    try 
			    {
			        BufferedReader in = new BufferedReader(new FileReader(new File("src/quirks.txt")));
			        String line;
			        try 
			        {
			            while((line = in.readLine())!= null)
			            {
			                text = text + line; 
			                
			                String someString = text;
						    char someChar = '-';
						    int count = 0;  
						    
						    for (int i = 0; i < someString.length(); i++) 
						    {		    	
						        if (someString.charAt(i) == someChar) 
						        {
						            count++;
						        }
						    }
						    
						    Random random = new Random();
						    randomInteger = random.nextInt(count);
						    
						    if (randomInteger == 0)
						    {
						    	randomInteger = 1;
						    }
			            }
			            
			            printString(text,'-',randomInteger);
			            textQuirks.append(finalText);
					   
			            in.close();
			        	} 
			        	catch (IOException f) 
			        {
			            f.printStackTrace();
			        }
			    	} 
			    	catch (FileNotFoundException f)
			    	{
			    		f.printStackTrace();
			    	}
			}
		});
		btnQuirks.setBounds(619, 150, 130, 29);
		btnQuirks.setText("Quirks");
		
		Button btnPickpocket = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnPickpocket.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = "";
				textPickpocket.setText("");
				finalText = "";
				
			    try 
			    {
			        BufferedReader in = new BufferedReader(new FileReader(new File("src/pickpocket.txt")));
			        String line;
			        try 
			        {
			            while((line = in.readLine())!= null)
			            {
			                text = text + line; 
			                
			                String someString = text;
						    char someChar = '-';
						    int count = 0;  
						    
						    for (int i = 0; i < someString.length(); i++) 
						    {		    	
						        if (someString.charAt(i) == someChar) 
						        {
						            count++;
						        }
						    }
						    
						    Random random = new Random();
						    randomInteger = random.nextInt(count);
						    
						    if (randomInteger == 0)
						    {
						    	randomInteger = 1;
						    }
			            }
			            
			            printString(text,'-',randomInteger);
			            textPickpocket.append(finalText);
					   
			            in.close();
			        	} 
			        	catch (IOException f) 
			        {
			            f.printStackTrace();
			        }
			    	} 
			    	catch (FileNotFoundException f)
			    	{
			    		f.printStackTrace();
			    	}
				
			}
		});
		btnPickpocket.setBounds(886, 150, 130, 29);
		btnPickpocket.setText("Right Pocket");
		
		textPickpocket = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		textPickpocket.setBounds(889, 185, 130, 100);
		
		Button btnDexterity = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnDexterity.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int total = 0;
				
				int dice1 = 0;
				int dice2 = 0;
				int dice3 = 0;
				int dice4 = 0;
				
					Random random = new Random();
					randomInteger = random.nextInt(7);
					
					while (randomInteger < 1)
					{
						randomInteger = random.nextInt(7);
					}
					dice1 = randomInteger;
					
					randomInteger = random.nextInt(7);
					while (randomInteger < 1)
					{
						randomInteger = random.nextInt(7);
					}
					dice2 = randomInteger;
					
					randomInteger = random.nextInt(7);
					while (randomInteger < 1)
					{
						randomInteger = random.nextInt(7);
					}
					dice3 = randomInteger;
					
					randomInteger = random.nextInt(7);
					while (randomInteger < 1)
					{
						randomInteger = random.nextInt(7);
					}
					dice4 = randomInteger;
					total= dice1+dice2+dice3+dice4;
					
					for (int i = 0; i < 1; i++) 
					{ 
					if (dice1 <= dice2 && dice1 <=dice3 && dice1 <= dice4)
					{
						dice1=0;
						break;
					}
					if (dice2 <= dice1 && dice2 <=dice3 && dice2 <= dice4)
					{
						dice2=0;
						break;
					}
				
					if (dice3 <= dice1 && dice3 <=dice2 && dice3 <= dice4)
					{
						dice3=0;
						break;
					}
					if (dice4 <= dice1 && dice4 <=dice2 && dice4 <= dice3)
					{
						dice4=0;
						break;
					}
					}
				
					total = dice1+dice2+dice3+dice4;

					String tempRace = "";
					tempRace = textRace.getText();

					if (tempRace.contentEquals("Elf"))
					{
						total = total +2;
					}
					if (tempRace.contentEquals("High Elf"))
					{
						total = total +2;
					}
					if (tempRace.contentEquals("Drow"))
					{
						total = total +2;
					}
					if (tempRace.contentEquals("Wood Elf"))
					{
						total = total +2;
					}
					if (tempRace.contentEquals("Lightfoot Halfling"))
					{
						total = total +2;
					}
					if (tempRace.contentEquals("Stout Halfling"))
					{
						total = total +2;
					}
					if (tempRace.contentEquals("Forest Gnome"))
					{
						total = total +1;
					}
					if (tempRace.contentEquals("Human"))
					{
						total = total +1;
					}
					//random +1
					if (tempRace.contentEquals("Half Elf"))
					{
						total = total +1;
					}

					textDexterity.setText(String.valueOf(total));
					
					int tempBonus = 0;
					textDexBonus.setText("");
					
					if (total == 1)
					{
						tempBonus = -5;
						textDexBonus.setText(String.valueOf(tempBonus));
					}
					if (total >= 2 && total <= 3)
					{
						tempBonus = -4;
						textDexBonus.setText(String.valueOf(tempBonus));
					}
					if (total >= 4 && total <= 5)
					{
						tempBonus = -3;
						textDexBonus.setText(String.valueOf(tempBonus));
					}
					if (total >= 6 && total <= 7)
					{
						tempBonus = -2;
						textDexBonus.setText(String.valueOf(tempBonus));
					}
					if (total >= 8 && total <= 9)
					{
						tempBonus = -1;
						textDexBonus.setText(String.valueOf(tempBonus));
					}
					if (total >= 10 && total <= 11)
					{
						tempBonus = 0;
						textDexBonus.setText(String.valueOf(tempBonus));
					}
				
					if (total >= 12 && total <= 13)
					{
						tempBonus = 1;
						textDexBonus.append("+");
						textDexBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 14 && total <= 15)
					{
						tempBonus = 2;
						textDexBonus.append("+");
						textDexBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 16 && total <= 17)
					{
						tempBonus = 3;
						textDexBonus.append("+");
						textDexBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 18 && total <= 19)
					{
						tempBonus = 4;
						textDexBonus.append("+");
						textDexBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 20 && total <= 21)
					{
						tempBonus = 5;
						textDexBonus.append("+");
						textDexBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 22 && total <= 23)
					{
						tempBonus = 6;
						textDexBonus.append("+");
						textDexBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 24 && total <= 25)
					{
						tempBonus = 7;
						textDexBonus.append("+");
						textDexBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 26 && total <= 27)
					{
						tempBonus = 8;
						textDexBonus.append("+");
						textDexBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 28 && total <= 29)
					{
						tempBonus = 9;
						textDexBonus.append("+");
						textDexBonus.append(String.valueOf(tempBonus));
					}
					if (total == 30)
					{
						tempBonus = 10;
						textDexBonus.append("+");
						textDexBonus.append(String.valueOf(tempBonus));
					}
					btnInitiative.notifyListeners(SWT.Selection, new Event());
			}
		});
		btnDexterity.setBounds(109, 185, 93, 29);
		btnDexterity.setText("Dexterity");
		
		Button btnStrength = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnStrength.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int total = 0;
				
				int dice1 = 0;
				int dice2 = 0;
				int dice3 = 0;
				int dice4 = 0;
				
					Random random = new Random();
					randomInteger = random.nextInt(7);
					
					while (randomInteger < 1)
					{
						randomInteger = random.nextInt(7);
					}
					dice1 = randomInteger;
					
					randomInteger = random.nextInt(7);
					while (randomInteger < 1)
					{
						randomInteger = random.nextInt(7);
					}
					dice2 = randomInteger;
					
					randomInteger = random.nextInt(7);
					while (randomInteger < 1)
					{
						randomInteger = random.nextInt(7);
					}
					dice3 = randomInteger;
					
					randomInteger = random.nextInt(7);
					while (randomInteger < 1)
					{
						randomInteger = random.nextInt(7);
					}
					dice4 = randomInteger;
					total= dice1+dice2+dice3+dice4;
					
					for (int i = 0; i < 1; i++) 
					{ 
					if (dice1 <= dice2 && dice1 <=dice3 && dice1 <= dice4)
					{
						dice1=0;
						break;
					}
					if (dice2 <= dice1 && dice2 <=dice3 && dice2 <= dice4)
					{
						dice2=0;
						break;
					}
				
					if (dice3 <= dice1 && dice3 <=dice2 && dice3 <= dice4)
					{
						dice3=0;
						break;
					}
					if (dice4 <= dice1 && dice4 <=dice2 && dice4 <= dice3)
					{
						dice4=0;
						break;
					}
					}
				
					total = dice1+dice2+dice3+dice4;
					String tempRace = "";
					tempRace = textRace.getText();
					
					if (tempRace.contentEquals("Mountain Dwarf"))
					{
						total = total +2;
					}
					if (tempRace.contentEquals("Dragonborn"))
					{
						total = total +2;
					}
					if (tempRace.contentEquals("Half Orc"))
					{
						total = total +1;
					}
					if (tempRace.contentEquals("Human"))
					{
						total = total +1;
					}
					textStrength.setText(String.valueOf(total));
					
					int tempBonus = 0;
					textStrBon.setText("");
					if (total == 1)
					{
						tempBonus = -5;
						textStrBon.setText(String.valueOf(tempBonus));
					}
					if (total >= 2 && total <= 3)
					{
						tempBonus = -4;
						textStrBon.setText(String.valueOf(tempBonus));
					}
					if (total >= 4 && total <= 5)
					{
						tempBonus = -3;
						textStrBon.setText(String.valueOf(tempBonus));
					}
					if (total >= 6 && total <= 7)
					{
						tempBonus = -2;
						textStrBon.setText(String.valueOf(tempBonus));
					}
					if (total >= 8 && total <= 9)
					{
						tempBonus = -1;
						textStrBon.setText(String.valueOf(tempBonus));
					}
					if (total >= 10 && total <= 11)
					{
						tempBonus = 0;
						textStrBon.setText(String.valueOf(tempBonus));
					}
				
					if (total >= 12 && total <= 13)
					{
						tempBonus = 1;
						textStrBon.append("+");
						textStrBon.append(String.valueOf(tempBonus));
					}
					if (total >= 14 && total <= 15)
					{
						tempBonus = 2;
						textStrBon.append("+");
						textStrBon.append(String.valueOf(tempBonus));
					}
					if (total >= 16 && total <= 17)
					{
						tempBonus = 3;
						textStrBon.append("+");
						textStrBon.append(String.valueOf(tempBonus));
					}
					if (total >= 18 && total <= 19)
					{
						tempBonus = 4;
						textStrBon.append("+");
						textStrBon.append(String.valueOf(tempBonus));
					}
					if (total >= 20 && total <= 21)
					{
						tempBonus = 5;
						textStrBon.append("+");
						textStrBon.append(String.valueOf(tempBonus));
					}
					if (total >= 22 && total <= 23)
					{
						tempBonus = 6;
						textStrBon.append("+");
						textStrBon.append(String.valueOf(tempBonus));
					}
					if (total >= 24 && total <= 25)
					{
						tempBonus = 7;
						textStrBon.append("+");
						textStrBon.append(String.valueOf(tempBonus));
					}
					if (total >= 26 && total <= 27)
					{
						tempBonus = 8;
						textStrBon.append("+");
						textStrBon.append(String.valueOf(tempBonus));
					}
					if (total >= 28 && total <= 29)
					{
						tempBonus = 9;
						textStrBon.append("+");
						textStrBon.append(String.valueOf(tempBonus));
					}
					if (total == 30)
					{
						tempBonus = 10;
						textStrBon.append("+");
						textStrBon.append(String.valueOf(tempBonus));
					}
				
					
			}
		});
		btnStrength.setBounds(10, 185, 93, 29);
		btnStrength.setText("Strength");
		
		Button btnConstitution = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnConstitution.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int total = 0;
				
				int dice1 = 0;
				int dice2 = 0;
				int dice3 = 0;
				int dice4 = 0;
				
					Random random = new Random();
					randomInteger = random.nextInt(7);
					
					while (randomInteger < 1)
					{
						randomInteger = random.nextInt(7);
					}
					dice1 = randomInteger;
					
					randomInteger = random.nextInt(7);
					while (randomInteger < 1)
					{
						randomInteger = random.nextInt(7);
					}
					dice2 = randomInteger;
					
					randomInteger = random.nextInt(7);
					while (randomInteger < 1)
					{
						randomInteger = random.nextInt(7);
					}
					dice3 = randomInteger;
					
					randomInteger = random.nextInt(7);
					while (randomInteger < 1)
					{
						randomInteger = random.nextInt(7);
					}
					dice4 = randomInteger;
					
					total= dice1+dice2+dice3+dice4;
					
					for (int i = 0; i < 1; i++) 
					{ 
					if (dice1 <= dice2 && dice1 <=dice3 && dice1 <= dice4)
					{
						dice1=0;
						break;
					}
					if (dice2 <= dice1 && dice2 <=dice3 && dice2 <= dice4)
					{
						dice2=0;
						break;
					}
				
					if (dice3 <= dice1 && dice3 <=dice2 && dice3 <= dice4)
					{
						dice3=0;
						break;
					}
					if (dice4 <= dice1 && dice4 <=dice2 && dice4 <= dice3)
					{
						dice4=0;
						break;
					}
					}
				
					total = dice1+dice2+dice3+dice4;
			
					String tempRace = "";
					tempRace = textRace.getText();
					
					if (tempRace.contentEquals("Mountain Dwarf"))
					{
						total = total +2;
					}
					if (tempRace.contentEquals("Hill Dwarf"))
					{
						total = total +2;
					}
					if (tempRace.contentEquals("Stout Halfling"))
					{
						total = total +1;
					}
					if (tempRace.contentEquals("Rock Gnome"))
					{
						total = total +1;
					}
					if (tempRace.contentEquals("Half Orc"))
					{
						total = total +1;
					}
					if (tempRace.contentEquals("Human"))
					{
						total = total +1;
					}
					//random +1
					if (tempRace.contentEquals("Half Elf"))
					{
						total = total +1;
					}

					textConstitution.setText(String.valueOf(total));
					
					int tempBonus = 0;
					textConBonus.setText("");
					if (total == 1)
					{
						tempBonus = -5;
						textConBonus.setText(String.valueOf(tempBonus));
					}
					if (total >= 2 && total <= 3)
					{
						tempBonus = -4;
						textConBonus.setText(String.valueOf(tempBonus));
					}
					if (total >= 4 && total <= 5)
					{
						tempBonus = -3;
						textConBonus.setText(String.valueOf(tempBonus));
					}
					if (total >= 6 && total <= 7)
					{
						tempBonus = -2;
						textConBonus.setText(String.valueOf(tempBonus));
					}
					if (total >= 8 && total <= 9)
					{
						tempBonus = -1;
						textConBonus.setText(String.valueOf(tempBonus));
					}
					if (total >= 10 && total <= 11)
					{
						tempBonus = 0;
						textConBonus.setText(String.valueOf(tempBonus));
					}
				
					if (total >= 12 && total <= 13)
					{
						tempBonus = 1;
						textConBonus.append("+");
						textConBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 14 && total <= 15)
					{
						tempBonus = 2;
						textConBonus.append("+");
						textConBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 16 && total <= 17)
					{
						tempBonus = 3;
						textConBonus.append("+");
						textConBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 18 && total <= 19)
					{
						tempBonus = 4;
						textConBonus.append("+");
						textConBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 20 && total <= 21)
					{
						tempBonus = 5;
						textConBonus.append("+");
						textConBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 22 && total <= 23)
					{
						tempBonus = 6;
						textConBonus.append("+");
						textConBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 24 && total <= 25)
					{
						tempBonus = 7;
						textConBonus.append("+");
						textConBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 26 && total <= 27)
					{
						tempBonus = 8;
						textConBonus.append("+");
						textConBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 28 && total <= 29)
					{
						tempBonus = 9;
						textConBonus.append("+");
						textConBonus.append(String.valueOf(tempBonus));
					}
					if (total == 30)
					{
						tempBonus = 10;
						textConBonus.append("+");
						textConBonus.append(String.valueOf(tempBonus));
					}
			}
		});
		btnConstitution.setBounds(208, 185, 98, 29);
		btnConstitution.setText("Constitution");
		
		Button btnIntelligence = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnIntelligence.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int total = 0;
				
				int dice1 = 0;
				int dice2 = 0;
				int dice3 = 0;
				int dice4 = 0;
				
					Random random = new Random();
					randomInteger = random.nextInt(7);
					
					while (randomInteger < 1)
					{
						randomInteger = random.nextInt(7);
					}
					dice1 = randomInteger;
					
					randomInteger = random.nextInt(7);
					while (randomInteger < 1)
					{
						randomInteger = random.nextInt(7);
					}
					dice2 = randomInteger;
					
					randomInteger = random.nextInt(7);
					while (randomInteger < 1)
					{
						randomInteger = random.nextInt(7);
					}
					dice3 = randomInteger;
					
					randomInteger = random.nextInt(7);
					while (randomInteger < 1)
					{
						randomInteger = random.nextInt(7);
					}
					dice4 = randomInteger;
					total= dice1+dice2+dice3+dice4;
					
					for (int i = 0; i < 1; i++) 
					{ 
					if (dice1 <= dice2 && dice1 <=dice3 && dice1 <= dice4)
					{
						dice1=0;
						break;
					}
					if (dice2 <= dice1 && dice2 <=dice3 && dice2 <= dice4)
					{
						dice2=0;
						break;
					}
				
					if (dice3 <= dice1 && dice3 <=dice2 && dice3 <= dice4)
					{
						dice3=0;
						break;
					}
					if (dice4 <= dice1 && dice4 <=dice2 && dice4 <= dice3)
					{
						dice4=0;
						break;
					}
					}
				
					total = dice1+dice2+dice3+dice4;

					String tempRace = "";
					tempRace = textRace.getText();
					
					if (tempRace.contentEquals("High Elf"))
					{
						total = total +1;
					}
					if (tempRace.contentEquals("Human"))
					{
						total = total +1;
					}
					if (tempRace.contentEquals("Rock Gnome"))
					{
						total = total +2;
					}
					if (tempRace.contentEquals("Forest Gnome"))
					{
						total = total +2;
					}

					textIntelligence.setText(String.valueOf(total));
					
					int tempBonus = 0;
					textIntBonus.setText("");
					if (total == 1)
					{
						tempBonus = -5;
						textIntBonus.setText(String.valueOf(tempBonus));
					}
					if (total >= 2 && total <= 3)
					{
						tempBonus = -4;
						textIntBonus.setText(String.valueOf(tempBonus));
					}
					if (total >= 4 && total <= 5)
					{
						tempBonus = -3;
						textIntBonus.setText(String.valueOf(tempBonus));
					}
					if (total >= 6 && total <= 7)
					{
						tempBonus = -2;
						textIntBonus.setText(String.valueOf(tempBonus));
					}
					if (total >= 8 && total <= 9)
					{
						tempBonus = -1;
						textIntBonus.setText(String.valueOf(tempBonus));
					}
					if (total >= 10 && total <= 11)
					{
						tempBonus = 0;
						textIntBonus.setText(String.valueOf(tempBonus));
					}
				
					if (total >= 12 && total <= 13)
					{
						tempBonus = 1;
						textIntBonus.append("+");
						textIntBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 14 && total <= 15)
					{
						tempBonus = 2;
						textIntBonus.append("+");
						textIntBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 16 && total <= 17)
					{
						tempBonus = 3;
						textIntBonus.append("+");
						textIntBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 18 && total <= 19)
					{
						tempBonus = 4;
						textIntBonus.append("+");
						textIntBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 20 && total <= 21)
					{
						tempBonus = 5;
						textIntBonus.append("+");
						textIntBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 22 && total <= 23)
					{
						tempBonus = 6;
						textIntBonus.append("+");
						textIntBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 24 && total <= 25)
					{
						tempBonus = 7;
						textIntBonus.append("+");
						textIntBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 26 && total <= 27)
					{
						tempBonus = 8;
						textIntBonus.append("+");
						textIntBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 28 && total <= 29)
					{
						tempBonus = 9;
						textIntBonus.append("+");
						textIntBonus.append(String.valueOf(tempBonus));
					}
					if (total == 30)
					{
						tempBonus = 10;
						textIntBonus.append("+");
						textIntBonus.append(String.valueOf(tempBonus));
					}
			}
		});
		btnIntelligence.setBounds(10, 255, 93, 29);
		btnIntelligence.setText("Intelligence");
		
		Button btnWisdom = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnWisdom.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int total = 0;
				
				int dice1 = 0;
				int dice2 = 0;
				int dice3 = 0;
				int dice4 = 0;
				
					Random random = new Random();
					randomInteger = random.nextInt(7);
					
					while (randomInteger < 1)
					{
						randomInteger = random.nextInt(7);
					}
					dice1 = randomInteger;
					
					randomInteger = random.nextInt(7);
					while (randomInteger < 1)
					{
						randomInteger = random.nextInt(7);
					}
					dice2 = randomInteger;
					
					randomInteger = random.nextInt(7);
					while (randomInteger < 1)
					{
						randomInteger = random.nextInt(7);
					}
					dice3 = randomInteger;
					
					randomInteger = random.nextInt(7);
					while (randomInteger < 1)
					{
						randomInteger = random.nextInt(7);
					}
					dice4 = randomInteger;
					total= dice1+dice2+dice3+dice4;
					
					for (int i = 0; i < 1; i++) 
					{ 
					if (dice1 <= dice2 && dice1 <=dice3 && dice1 <= dice4)
					{
						dice1=0;
						break;
					}
					if (dice2 <= dice1 && dice2 <=dice3 && dice2 <= dice4)
					{
						dice2=0;
						break;
					}
				
					if (dice3 <= dice1 && dice3 <=dice2 && dice3 <= dice4)
					{
						dice3=0;
						break;
					}
					if (dice4 <= dice1 && dice4 <=dice2 && dice4 <= dice3)
					{
						dice4=0;
						break;
					}
					}
				
					total = dice1+dice2+dice3+dice4;
					
					String tempRace = "";
					tempRace = textRace.getText();

					if (tempRace.contentEquals("Hill Dwarf"))
					{
						total = total +1;
					}
					if (tempRace.contentEquals("Wood Elf"))
					{
						total = total +1;
					}
					if (tempRace.contentEquals("Human"))
					{
						total = total +1;
					}
				

					textWisdom.setText(String.valueOf(total));
					
					int tempBonus = 0;
					textWisBonus.setText("");
					if (total == 1)
					{
						tempBonus = -5;
						textWisBonus.setText(String.valueOf(tempBonus));
					}
					if (total >= 2 && total <= 3)
					{
						tempBonus = -4;
						textWisBonus.setText(String.valueOf(tempBonus));
					}
					if (total >= 4 && total <= 5)
					{
						tempBonus = -3;
						textWisBonus.setText(String.valueOf(tempBonus));
					}
					if (total >= 6 && total <= 7)
					{
						tempBonus = -2;
						textWisBonus.setText(String.valueOf(tempBonus));
					}
					if (total >= 8 && total <= 9)
					{
						tempBonus = -1;
						textWisBonus.setText(String.valueOf(tempBonus));
					}
					if (total >= 10 && total <= 11)
					{
						tempBonus = 0;
						textWisBonus.setText(String.valueOf(tempBonus));
					}
				
					if (total >= 12 && total <= 13)
					{
						tempBonus = 1;
						textWisBonus.append("+");
						textWisBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 14 && total <= 15)
					{
						tempBonus = 2;
						textWisBonus.append("+");
						textWisBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 16 && total <= 17)
					{
						tempBonus = 3;
						textWisBonus.append("+");
						textWisBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 18 && total <= 19)
					{
						tempBonus = 4;
						textWisBonus.append("+");
						textWisBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 20 && total <= 21)
					{
						tempBonus = 5;
						textWisBonus.append("+");
						textWisBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 22 && total <= 23)
					{
						tempBonus = 6;
						textWisBonus.append("+");
						textWisBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 24 && total <= 25)
					{
						tempBonus = 7;
						textWisBonus.append("+");
						textWisBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 26 && total <= 27)
					{
						tempBonus = 8;
						textWisBonus.append("+");
						textWisBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 28 && total <= 29)
					{
						tempBonus = 9;
						textWisBonus.append("+");
						textWisBonus.append(String.valueOf(tempBonus));
					}
					if (total == 30)
					{
						tempBonus = 10;
						textWisBonus.append("+");
						textWisBonus.append(String.valueOf(tempBonus));
					}
			}
		});
		btnWisdom.setBounds(109, 256, 93, 29);
		btnWisdom.setText("Wisdom");
		
		Button btnCharisma = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnCharisma.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int total = 0;
				
				int dice1 = 0;
				int dice2 = 0;
				int dice3 = 0;
				int dice4 = 0;
				
					Random random = new Random();
					randomInteger = random.nextInt(7);
					
					while (randomInteger < 1)
					{
						randomInteger = random.nextInt(7);
					}
					dice1 = randomInteger;
					
					randomInteger = random.nextInt(7);
					while (randomInteger < 1)
					{
						randomInteger = random.nextInt(7);
					}
					dice2 = randomInteger;
					
					randomInteger = random.nextInt(7);
					while (randomInteger < 1)
					{
						randomInteger = random.nextInt(7);
					}
					dice3 = randomInteger;
					
					randomInteger = random.nextInt(7);
					while (randomInteger < 1)
					{
						randomInteger = random.nextInt(7);
					}
					dice4 = randomInteger;
					total= dice1+dice2+dice3+dice4;
					
					for (int i = 0; i < 1; i++) 
					{ 
					if (dice1 <= dice2 && dice1 <=dice3 && dice1 <= dice4)
					{
						dice1=0;
						break;
					}
					if (dice2 <= dice1 && dice2 <=dice3 && dice2 <= dice4)
					{
						dice2=0;
						break;
					}
				
					if (dice3 <= dice1 && dice3 <=dice2 && dice3 <= dice4)
					{
						dice3=0;
						break;
					}
					if (dice4 <= dice1 && dice4 <=dice2 && dice4 <= dice3)
					{
						dice4=0;
						break;
					}
					}
				
					total = dice1+dice2+dice3+dice4;
					
					String tempRace = "";

					tempRace = textRace.getText();
					
					if (tempRace.contentEquals("Drow"))
					{
						total = total +1;
					}
					if (tempRace.contentEquals("Dragonborn"))
					{
						total = total +1;
					}
					if (tempRace.contentEquals("Half Elf"))
					{
						total = total +2;
					}
					if (tempRace.contentEquals("Lightfoot Halfling"))
					{
						total = total +1;
					}
					if (tempRace.contentEquals("Human"))
					{
						total = total +1;
					}
					if (tempRace.contentEquals("Tiefling"))
					{
						total = total +2;
					}
					

					textCharisma.setText(String.valueOf(total));
					
					int tempBonus = 0;
					textCharBonus.setText("");
					if (total == 1)
					{
						tempBonus = -5;
						textCharBonus.setText(String.valueOf(tempBonus));
					}
					if (total >= 2 && total <= 3)
					{
						tempBonus = -4;
						textCharBonus.setText(String.valueOf(tempBonus));
					}
					if (total >= 4 && total <= 5)
					{
						tempBonus = -3;
						textCharBonus.setText(String.valueOf(tempBonus));
					}
					if (total >= 6 && total <= 7)
					{
						tempBonus = -2;
						textCharBonus.setText(String.valueOf(tempBonus));
					}
					if (total >= 8 && total <= 9)
					{
						tempBonus = -1;
						textCharBonus.setText(String.valueOf(tempBonus));
					}
					if (total >= 10 && total <= 11)
					{
						tempBonus = 0;
						textCharBonus.setText(String.valueOf(tempBonus));
					}
				
					if (total >= 12 && total <= 13)
					{
						tempBonus = 1;
						textCharBonus.append("+");
						textCharBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 14 && total <= 15)
					{
						tempBonus = 2;
						textCharBonus.append("+");
						textCharBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 16 && total <= 17)
					{
						tempBonus = 3;
						textCharBonus.append("+");
						textCharBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 18 && total <= 19)
					{
						tempBonus = 4;
						textCharBonus.append("+");
						textCharBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 20 && total <= 21)
					{
						tempBonus = 5;
						textCharBonus.append("+");
						textCharBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 22 && total <= 23)
					{
						tempBonus = 6;
						textCharBonus.append("+");
						textCharBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 24 && total <= 25)
					{
						tempBonus = 7;
						textCharBonus.append("+");
						textCharBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 26 && total <= 27)
					{
						tempBonus = 8;
						textCharBonus.append("+");
						textCharBonus.append(String.valueOf(tempBonus));
					}
					if (total >= 28 && total <= 29)
					{
						tempBonus = 9;
						textCharBonus.append("+");
						textCharBonus.append(String.valueOf(tempBonus));
					}
					if (total == 30)
					{
						tempBonus = 10;
						textCharBonus.append("+");
						textCharBonus.append(String.valueOf(tempBonus));
					}
			}
		});
		btnCharisma.setBounds(208, 256, 98, 29);
		btnCharisma.setText("Charisma");
		
		textStrength = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.CENTER);
		textStrength.setBounds(10, 220, 45, 29);
		
		textDexterity = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.CENTER);
		textDexterity.setBounds(109, 220, 45, 29);
		
		textConstitution = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.CENTER);
		textConstitution.setBounds(208, 221, 45, 29);
		
		textIntelligence = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.CENTER);
		textIntelligence.setBounds(10, 290, 45, 29);
		
		textWisdom = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.CENTER);
		textWisdom.setBounds(109, 291, 45, 29);
		
		textCharisma = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.CENTER);
		textCharisma.setBounds(208, 291, 45, 29);
		
		Button btnProficiency = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnProficiency.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		btnProficiency.setEnabled(false);
		btnProficiency.setBounds(761, 80, 93, 29);
		btnProficiency.setText("Proficiency");
		
		textProficiency = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textProficiency.setText("+2");
		textProficiency.setBounds(859, 80, 60, 29);
		
		Button btnWalking = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnWalking.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				//dwarf 20 feet all time
				//gnome halfling 20 feet, med/heavy armor 15 feet
				//the rest 30 feet, 20 in med/heavy armor
				textWalking.setText("");
				
				if(textArmorType.getText().equals("Heavy") || (textArmorType.getText().equals("Medium")))
					{
					textWalking.append("20");
					}
				else 
					{
						textWalking.append("30");
					}	
			
				if (textRace.getText().equals("Hill Dwarf") || textRace.getText().equals("Mountain Dwarf"))
						{
							textWalking.setText("");
							textWalking.append("20");
						}
				if (textRace.getText().equals("Rock Gnome") || textRace.getText().equals("Lightfoot Halfling") || textRace.getText().equals("Forest Gnome") || textRace.getText().equals("Stout Halfling"))
				{
					if(textArmorType.getText().equals("Heavy")|| (textArmorType.getText().equals("Medium")))
					{
						textWalking.setText("");
						textWalking.append("15");
					}
					else
						{
							textWalking.setText("");
							textWalking.append("20");
						}
				}
			}
			
		});
		btnWalking.setBounds(761, 115, 93, 29);
		btnWalking.setText("Walking");
		
		textWalking = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textWalking.setText("0");
		textWalking.setBounds(859, 115, 60, 29);
		
		Button btnStatus = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnStatus.setEnabled(false);
		btnStatus.setBounds(1159, 45, 130, 29);
		btnStatus.setText("Status");
		
		txtStatus = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		txtStatus.setText("None");
		txtStatus.setBounds(1159, 80, 130, 64);
		
		Button btnDefence = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnDefence.setEnabled(false);
		btnDefence.setBounds(1022, 45, 130, 29);
		btnDefence.setText("Defences");
		
		txtDefence = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		txtDefence.setText("None");
		txtDefence.setBounds(1022, 80, 130, 64);
		
		
		
		textAcro = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textAcro.setBounds(166, 370, 40, 29);
		
		textAnim = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textAnim.setBounds(166, 405, 40, 29);
		
		textArca = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textArca.setBounds(166, 440, 40, 29);
		
		textAthl = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textAthl.setBounds(166, 475, 40, 29);
		
		textDece = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textDece.setBounds(166, 510, 40, 29);
		
		textHist = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textHist.setBounds(166, 545, 40, 29);
		
		textInsi = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textInsi.setBounds(166, 580, 40, 29);
		
		textInti = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textInti.setBounds(166, 615, 40, 29);
		
		textInve = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textInve.setBounds(166, 650, 40, 29);
		
		Label lblNewLabel = new Label(shlRandomNpcDesigner, SWT.RIGHT);
		lblNewLabel.setBounds(10, 375, 150, 17);
		lblNewLabel.setText("Acrobatics (DEX)");
		
		Label lblNewLabel_1 = new Label(shlRandomNpcDesigner, SWT.RIGHT);
		lblNewLabel_1.setBounds(10, 410, 150, 17);
		lblNewLabel_1.setText("Animal Handling (WIS)");
		
		Label lblNewLabel_2 = new Label(shlRandomNpcDesigner, SWT.RIGHT);
		lblNewLabel_2.setBounds(10, 445, 150, 17);
		lblNewLabel_2.setText("Arcana (INT)");
		
		Label lblNewLabel_3 = new Label(shlRandomNpcDesigner, SWT.RIGHT);
		lblNewLabel_3.setBounds(10, 480, 150, 17);
		lblNewLabel_3.setText("Athletics (STR)");
		
		Label lblNewLabel_4 = new Label(shlRandomNpcDesigner, SWT.RIGHT);
		lblNewLabel_4.setBounds(10, 515, 150, 17);
		lblNewLabel_4.setText("Deception (CHA)");
		
		Label lblNewLabel_5 = new Label(shlRandomNpcDesigner, SWT.NONE);
		lblNewLabel_5.setAlignment(SWT.RIGHT);
		lblNewLabel_5.setBounds(10, 550, 150, 17);
		lblNewLabel_5.setText("History (INT)");
		
		Label lblNewLabel_6 = new Label(shlRandomNpcDesigner, SWT.NONE);
		lblNewLabel_6.setAlignment(SWT.RIGHT);
		lblNewLabel_6.setBounds(10, 585, 150, 17);
		lblNewLabel_6.setText("Insight (WIS)");
		
		Label lblNewLabel_7 = new Label(shlRandomNpcDesigner, SWT.NONE);
		lblNewLabel_7.setAlignment(SWT.RIGHT);
		lblNewLabel_7.setBounds(10, 620, 150, 17);
		lblNewLabel_7.setText("Intimidation (CHA)");
		
		Label lblNewLabel_8 = new Label(shlRandomNpcDesigner, SWT.NONE);
		lblNewLabel_8.setAlignment(SWT.RIGHT);
		lblNewLabel_8.setBounds(10, 655, 150, 17);
		lblNewLabel_8.setText("Investigation (INT)");
		
		Label lblNewLabel_9 = new Label(shlRandomNpcDesigner, SWT.NONE);
		lblNewLabel_9.setAlignment(SWT.RIGHT);
		lblNewLabel_9.setBounds(230, 375, 150, 17);
		lblNewLabel_9.setText("Medicine (WIS)");
		
		textMedi = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textMedi.setBounds(385, 370, 40, 29);
		
		Label lblNewLabel_10 = new Label(shlRandomNpcDesigner, SWT.NONE);
		lblNewLabel_10.setAlignment(SWT.RIGHT);
		lblNewLabel_10.setBounds(230, 410, 150, 17);
		lblNewLabel_10.setText("Nature (INT)");
		
		Label lblNewLabel_11 = new Label(shlRandomNpcDesigner, SWT.NONE);
		lblNewLabel_11.setAlignment(SWT.RIGHT);
		lblNewLabel_11.setBounds(230, 445, 150, 17);
		lblNewLabel_11.setText("Perception (WIS)");
		
		Label lblNewLabel_12 = new Label(shlRandomNpcDesigner, SWT.NONE);
		lblNewLabel_12.setAlignment(SWT.RIGHT);
		lblNewLabel_12.setBounds(230, 480, 150, 17);
		lblNewLabel_12.setText("Performance (CHA)");
		
		Label lblNewLabel_13 = new Label(shlRandomNpcDesigner, SWT.NONE);
		lblNewLabel_13.setAlignment(SWT.RIGHT);
		lblNewLabel_13.setBounds(230, 515, 150, 17);
		lblNewLabel_13.setText("Persuasion (CHA)");
		
		Label lblNewLabel_14 = new Label(shlRandomNpcDesigner, SWT.NONE);
		lblNewLabel_14.setAlignment(SWT.RIGHT);
		lblNewLabel_14.setBounds(230, 550, 150, 17);
		lblNewLabel_14.setText("Religion (INT)");
		
		Label lblNewLabel_15 = new Label(shlRandomNpcDesigner, SWT.NONE);
		lblNewLabel_15.setAlignment(SWT.RIGHT);
		lblNewLabel_15.setBounds(230, 585, 150, 17);
		lblNewLabel_15.setText("Sleight of Hand (DEX)");
		
		Label lblNewLabel_16 = new Label(shlRandomNpcDesigner, SWT.NONE);
		lblNewLabel_16.setAlignment(SWT.RIGHT);
		lblNewLabel_16.setBounds(230, 620, 150, 17);
		lblNewLabel_16.setText("Stealth (DEX)");
		
		Label lblNewLabel_17 = new Label(shlRandomNpcDesigner, SWT.NONE);
		lblNewLabel_17.setAlignment(SWT.RIGHT);
		lblNewLabel_17.setBounds(230, 655, 150, 17);
		lblNewLabel_17.setText("Survival (WIS)");
		
		textNatu = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textNatu.setBounds(385, 405, 40, 29);
		
		textPerc = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textPerc.setBounds(385, 440, 40, 29);
		
		textPerf = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textPerf.setBounds(385, 475, 40, 29);
		
		textPers = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textPers.setBounds(385, 510, 40, 29);
		
		textReli = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textReli.setBounds(385, 545, 40, 29);
		
		textSlei = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textSlei.setBounds(385, 580, 40, 29);
		
		textStea = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textStea.setBounds(385, 615, 40, 29);
		
		textSurv = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textSurv.setBounds(385, 650, 40, 29);
		
		textArmorType = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textArmorType.setBounds(925, 115, 93, 29);
		
		Button btnArmorType = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnArmorType.setEnabled(false);
		btnArmorType.setBounds(925, 80, 93, 29);
		btnArmorType.setText("Armor Type");
		
		textAge = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textAge.setBounds(421, 150, 60, 29);
		
		textAgeType = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textAgeType.setBounds(487, 150, 126, 29);
		
		Button btnNickname = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnNickname.setEnabled(false);
		btnNickname.setBounds(10, 80, 93, 29);
		btnNickname.setText("Nickname");
		
		textNickname = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textNickname.setBounds(109, 80, 207, 29);
		
		textNotes = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		textNotes.setText("Notes about me...");
		textNotes.setBounds(324, 220, 289, 108);
		
		Button btnInventory = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnInventory.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = "";
				textInventory.setText("");
				finalText = "";
				for (int a = 0; a < 11; a++) 
				   {
			    try 
			    {
			        BufferedReader in = new BufferedReader(new FileReader(new File("src/inventory.txt")));
			        String line;
			        try 
			        {
			            while((line = in.readLine())!= null)
			            {
			                text = text + line; 
			                
			                String someString = text;
						    char someChar = '-';
						    int count = 0;  
						    
						    for (int i = 0; i < someString.length(); i++) 
						    {		    	
						        if (someString.charAt(i) == someChar) 
						        {
						            count++;
						        }
						    }
						    
						    Random random = new Random();
						    randomInteger = random.nextInt(count);
						    
						    if (randomInteger == 0)
						    {
						    	randomInteger = 1;
						    }
			            }
			            
			            printString(text,'-',randomInteger);
			            textInventory.append(finalText);
			            textInventory.append("\n");
			          
			            
			            in.close();
			        	} 
			        	catch (IOException f) 
			        {
			            f.printStackTrace();
			        }
			    	} 
			    	catch (FileNotFoundException f)
			    	{
			    		f.printStackTrace();
			    	}
				
				
				    }
				  	String wpnText = textWeapon.getText();
		            String wpnOffText = textOffhand.getText();
		            String wpnArmorText = textArmor.getText();
		            
		            textInventory.append(wpnText);
		            textInventory.append("\n");
		           
		            if (wpnOffText.equals("Shield (Add 2 AC manually)"))
		            {
		            	wpnOffText = "Shield";
		            }
		            if (!wpnOffText.equals("None"))
		            {
		            	 textInventory.append(wpnOffText);
						 textInventory.append("\n");
		            }
		            
		            if (!wpnArmorText.equals("Unarmored Defence"))
		            {
		            	textInventory.append(wpnArmorText);
				        textInventory.append("\n");
		            }
		           
		            String offText = textOffhand.getText();
		            
					if (offText.equals("Blowgun: (25/100) A, Load"))
					{
						textInventory.append("Blow Needles (50)");
			            textInventory.append("\n");     
					}

					if (offText.equals("Crossbow: (30/120) A, L, Load"))
					{
						textInventory.append("Crossbow Bolts (20)");
			            textInventory.append("\n");
					}
					if (offText.equals("H. Crossbow: (100/400) A, H, Load, 2H"))
					{
						textInventory.append("Crossbow Bolts (20)");
			            textInventory.append("\n");
					}
					if (offText.equals("Longbow: (150/600) A, H, 2H"))
					{
						textInventory.append("Arrows (20)");
			            textInventory.append("\n");
					}
					String wealthText = textWealth.getText();
					
					if (wealthText.equals("Wretched"))
					{
						textInventory.append("1 Copper");
			            textInventory.append("\n");
	
					}
					if (wealthText.equals("Squalid"))
					{
						textInventory.append("7 Silver");
			            textInventory.append("\n");
	
					}
					if (wealthText.equals("Poor"))
					{
						textInventory.append("14 Silver");
			            textInventory.append("\n");
	
					}
					if (wealthText.equals("Modest"))
					{
						textInventory.append("7 Gold");
			            textInventory.append("\n");
	
					}
					if (wealthText.equals("Comfortable"))
					{
						textInventory.append("14 Gold");
			            textInventory.append("\n");
	
					}
					if (wealthText.equals("Wealthy"))
					{
						textInventory.append("28 Gold");
			            textInventory.append("\n");
	
					}
					if (wealthText.equals("Aristocratic"))
					{
						textInventory.append("70 Gold");
			            textInventory.append("\n");
	
					}
			}
		});
		btnInventory.setBounds(442, 335, 85, 29);
		btnInventory.setText("Inventory");
		
		textInventory = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		textInventory.setBounds(442, 370, 170, 309);
		
		Button btnWeapon = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnWeapon.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = "";
				textWeapon.setText("");
				textWpnType.setText("");
				finalText = "";
				
			    try 
			    {
			        BufferedReader in = new BufferedReader(new FileReader(new File("src/w_melee.txt")));
			        String line;
			        try 
			        {
			            while((line = in.readLine())!= null)
			            {
			                text = text + line; 
			                
			                String someString = text;
						    char someChar = '-';
						    int count = 0;  
						    
						    for (int i = 0; i < someString.length(); i++) 
						    {		    	
						        if (someString.charAt(i) == someChar) 
						        {
						            count++;
						        }
						    }
						    
						    Random random = new Random();
						    randomInteger = random.nextInt(count);
						    
						    if (randomInteger == 0)
						    {
						    	randomInteger = 1;
						    }
			            }
			            
			            printString(text,'-',randomInteger);
			            textWeapon.append(finalText);
			            in.close();
			        	} 
			        	catch (IOException f) 
			        {
			            f.printStackTrace();
			        }
			    	} 
			    	catch (FileNotFoundException f)
			    	{
			    		f.printStackTrace();
			    	}
			    
			    String wpnTypeText = "";
			    
			    if(finalText.equals("Club; L"))
			    {
			    	wpnTypeText = "1d4 bludgeoning";	
			    }
			    if(finalText.equals("Dagger; Finesse, L, Thrown(20/60)"))
			    {
			    	wpnTypeText = "1d4 piercing";	
			    }
			    if(finalText.equals("Greatclub; 2H"))
			    {
			    	wpnTypeText = "1d8 bludgeoning";	
			    }
			    if(finalText.equals("Handaxe; L, Thrown(20/60)"))
			    {
			    	wpnTypeText = "1d6 slashing";	
			    } 

			    if(finalText.equals("Javelin; Thrown(30/120)"))
			    {
			    	wpnTypeText = "1d6 piercing";	
			    }
			    if(finalText.equals("Light Hammer; L, Thrown(20/60)"))
			    {
			    	wpnTypeText = "1d4 bludgeoning";	
			    }
			    if(finalText.equals("Mace"))
			    {
			    	wpnTypeText = "1d6 bludgeoning";	
			    }
			    if(finalText.equals("Quarterstaff; Versatile (1d8)"))
			    {
			    	wpnTypeText = "1d6 bludgeoning";	
			    }
			    if(finalText.equals("Sickle; L"))
			    {
			    	wpnTypeText = "1d4 slashing";	
			    }
			    if(finalText.equals("Spear; Thrown(20/60) Versatile(1d8)"))
			    {
			    	wpnTypeText = "1d6 piercing";	
			    }
			    if(finalText.equals("Battleaxe; Versatile(1d10)"))
			    {
			    	wpnTypeText = "1d8 slashing";	
			    }
			    if(finalText.equals("Flail"))
			    {
			    	wpnTypeText = "1d8 bludgeoning";	
			    }
			    if(finalText.equals("Glaive; H, Reach, 2H"))
			    {
			    	wpnTypeText = "1d10 slashing";
			    }
			    if(finalText.equals("Greataxe; H, 2H"))
			    {
			    	wpnTypeText = "1d12 slashing";
	
			    } 
			    if(finalText.equals("Greatsword; H, 2H"))
			    {
			    	wpnTypeText = "2d6 slashing";
			    }
			    if(finalText.equals("Halberd; H, Reach, 2H"))
			    {
			    	wpnTypeText = "1d10 slashing";
			    }
			    if(finalText.equals("Lance: Reach, Special"))
			    {
			    	wpnTypeText = "1d12 piercing";
			    }
			    if(finalText.equals("Longsword; Versatile(1d10)"))
			    {
			    	wpnTypeText = "1d8 slashing";
			    }
			    if(finalText.equals("Maul; H, 2H"))
			    {
			    	wpnTypeText = "2d6 bludgeoning";
	
			    }
			    if(finalText.equals("Morningstar"))
			    {
			    	wpnTypeText = "1d8 piercing";
	
			    }
			    if(finalText.equals("Pike; H, Reach, 2H"))
			    {
			    	wpnTypeText = "1d10 piercing";
			    }
			    if(finalText.equals("Rapier; Finesse"))
			    {
			    	wpnTypeText = "1d8 piercing";	
			    } 
			    if(finalText.equals("Scimitar; Finesse, L"))
			    {
			    	wpnTypeText = "1d6 slashing";

			    }
			    if(finalText.equals("Shortsword; Finesse, L"))
			    {
			    	wpnTypeText = "1d6 piercing";	
			    }
			    if(finalText.equals("Trident; Thrown(20/60), Versatile(1d8)"))
			    {
			    	wpnTypeText = "1d6 piercing";	
			    }
			    if(finalText.equals("War Pick"))
			    {
			    	wpnTypeText = "1d8 piercing";
			    }
			    if(finalText.equals("Warhammer; Versatile (1d10)"))
			    {
			    	wpnTypeText = "1d8 bludgeoning";	
			    }
			    if(finalText.equals("Whip; Finesse, Reach"))
			    {
			    	wpnTypeText = "1d4 slashing";	
			    }
			    textWpnType.setText(wpnTypeText);
			}
		});
		btnWeapon.setBounds(619, 440, 93, 29);
		btnWeapon.setText("Weapon");
		
		Button btnOffhand = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnOffhand.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				String text = textClass.getText();
				finalText = "";
				textOffhand.setText("");
				
				Random random = new Random();
				randomInteger = random.nextInt(6);
				
				if (randomInteger == 0)
				{
					finalText = "Blowgun: (25/100) A, Load";
					textOffhand.append(finalText);

				}
				if (randomInteger == 1)
				{
					finalText = "Crossbow: (30/120) A, L, Load";
					textOffhand.append(finalText);
				}
				if (randomInteger == 2)
				{
					finalText = "H. Crossbow: (100/400) A, H, Load, 2H";
					textOffhand.append(finalText);
				}
				if (randomInteger == 3)
				{
					finalText = "Longbow: (150/600) A, H, 2H";
					textOffhand.append(finalText);
				}
				if (randomInteger == 4)
				{
					finalText = "Shield (Add 2 AC manually)";
				
					textOffhand.append(finalText);
				}
				if (randomInteger == 5)
				{
					finalText = "None";
					textOffhand.append(finalText);
				}
				
				
				if ((text.equals("Wizard")) || text.equals("Warlock") || text.equals("Sorcerer"))
				{
					textOffhand.setText("");
					randomInteger = random.nextInt(5);
					
					if (randomInteger == 0)
					{
						finalText = "Crystal";
						textOffhand.append(finalText);
					}
					if (randomInteger == 1)
					{
						finalText = "Orb";
						textOffhand.append(finalText);
					}
					if (randomInteger == 2)
					{
						finalText = "Rod";
						textOffhand.append(finalText);
					}
					if (randomInteger == 3)
					{
						finalText = "Wand";
						textOffhand.append(finalText);
					}
					if (randomInteger == 4)
					{
						finalText = "Staff";
						textOffhand.append(finalText);
					}
				}
				if (text.equals("Druid"))
				{
					textOffhand.setText("");
					randomInteger = random.nextInt(4);
					
					if (randomInteger == 0)
					{
						finalText = "Sprig of Mistletoe";
						textOffhand.append(finalText);
					}
					if (randomInteger == 1)
					{
						finalText = "Totem";
						textOffhand.append(finalText);
					}
					if (randomInteger == 2)
					{
						finalText = "Wooden Staff";
						textOffhand.append(finalText);
					}
					if (randomInteger == 3)
					{
						finalText = "Yew Wand";
						textOffhand.append(finalText);
					}
				}
					if (text.equals("Priest"))
					{
						textOffhand.setText("");
						randomInteger = random.nextInt(3);

						if (randomInteger == 0)
						{
							finalText = "Amulet";
							textOffhand.append(finalText);
						}
						if (randomInteger == 1)
						{
							finalText = "Emblem";
							textOffhand.append(finalText);
						}
						if (randomInteger == 2)
						{
							finalText = "Reliquary";
							textOffhand.append(finalText);
						}		
					}
					
					
					
					
					String wpnTypeText = "";
				    
				    if(finalText.equals("Blowgun: (25/100) A, Load"))
				    {
				    	wpnTypeText = "1 piercing";	
				    }
				    if(finalText.equals("Longbow: (150/600) A, H, 2H"))
				    {
				    	wpnTypeText = "1d8 piercing";	
				    }
				    if(finalText.equals("Crossbow: (30/120) A, L, Load"))
				    {
				    	wpnTypeText = "1d6 piercing";	
				    }
				    if(finalText.equals("H. Crossbow: (100/400) A, H, Load, 2H"))
				    {
				    	wpnTypeText = "1d10 piercing";	
				    } 
				    
				   textWpnOffType.setText(wpnTypeText);

			}
		});
		btnOffhand.setBounds(619, 475, 93, 29);
		btnOffhand.setText("Offhand");
		
		Button btnCantrips = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnCantrips.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				//--
			}
		});
		btnCantrips.setBounds(957, 597, 93, 29);
		btnCantrips.setText("Cantrips");
		
		Button btnSpells = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnSpells.setBounds(957, 510, 93, 29);
		btnSpells.setText("Spells");
		
		Button btnArmor = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnArmor.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String armorClassText = "";
				String armorClassTypeText = "";
				textArmor.setText("");
				textAc.setText("");
				textArmorType.setText("");
				
				finalText = "";

				String tempClass = textClass.getText();
				String tempDex = textDexBonus.getText();
				String tempWis = textWisBonus.getText();
				String tempStr = textStrength.getText();
				String tempCon = textConBonus.getText();
			
				int tempAC = 0;
				int tempStrNum = 0;
				int tempWisNum = 0;
				int tempDexNum = 0;
				int tempConNum = 0;
				
				tempStrNum = Integer.valueOf(tempStr);	
				tempWisNum = Integer.valueOf(tempWis);	
				tempDexNum = Integer.valueOf(tempDex);	
				tempConNum = Integer.valueOf(tempCon);	

				if (tempClass.equals("Monk"))
				{		
					finalText = "Unarmored Defence";
					textArmor.append(finalText);
					tempAC = 10;
					armorClassTypeText = "Light";
					tempAC = tempAC + tempWisNum + tempDexNum;
					armorClassText = Integer.toString(tempAC);
					textAc.append(armorClassText);
					textArmorType.append(armorClassTypeText);
				}
				

				if (tempClass.equals("Barbarian"))
				{		
					finalText = "Unarmored Defence";
					textArmor.append(finalText);
					tempAC = 10;
					armorClassTypeText = "Light";
					tempAC = tempAC + tempConNum + tempDexNum;
					armorClassText = Integer.toString(tempAC);
					textAc.append(armorClassText);
					textArmorType.append(armorClassTypeText);
				}
				
				if (tempClass.equals("Wizard") || tempClass.equals("Sorcerer"))
				{
					Random random = new Random();
					randomInteger = random.nextInt(3);
					
					if (randomInteger == 0)
					{
						finalText = "Magic Robes";
						textArmor.append(finalText);
						tempAC = 10;
						armorClassTypeText = "Light";
						tempAC = tempAC + tempDexNum;
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
					}
					if (randomInteger == 1)
					{
						finalText = "Ragged Robes";
						textArmor.append(finalText);
						tempAC = 10;
						armorClassTypeText = "Light";
						tempAC = tempAC + tempDexNum;
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
					}
					if (randomInteger == 2)
					{
						finalText = "Badass Robes";
						textArmor.append(finalText);
						tempAC = 10;
						armorClassTypeText = "Light";
						tempAC = tempAC + tempDexNum;
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
					}
				}
				
				if (tempClass.equals("Paladin"))
				{ 	    
					Random random = new Random();
					randomInteger = random.nextInt(2);
					
					if (tempStrNum <= 12)
					{
						finalText = "Ring Mail";
						textArmor.append(finalText);
						tempAC = 14;
						armorClassTypeText = "Heavy";
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
					}
					if (tempStrNum == 13 || tempStrNum == 14)
					{
						finalText = "Chain Mail";
						textArmor.append(finalText);
						tempAC = 16;
						armorClassTypeText = "Heavy";
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
					}
					if (tempStrNum > 14 && randomInteger == 0)
					{
						finalText = "Splint";
						textArmor.append(finalText);
						tempAC = 17;
						armorClassTypeText = "Heavy";
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
					}
					if (tempStrNum > 14 && randomInteger == 1)
					{
						finalText = "Plate";
						textArmor.append(finalText);
						tempAC = 18;
						armorClassTypeText = "Heavy";
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
					}
				
			    }
				
				if (tempClass.equals("Cleric") || tempClass.equals("Warrior") || tempClass.equals("Fighter"))
				{

					Random random = new Random();
					randomInteger = random.nextInt(5);
					
					if (randomInteger == 0)
					{
						finalText = "Half Plate";
						textArmor.append(finalText);
						tempAC = 15;
						armorClassTypeText = "Medium";
						if (tempDexNum > 1)
						{
							tempDexNum = 2;
						}
						tempAC = tempAC + tempDexNum;
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
				
					}
					if (randomInteger == 1)
					{
						finalText = "Breastplate";
						textArmor.append(finalText);
						tempAC = 14;
						armorClassTypeText = "Medium";
						if (tempDexNum > 1)
						{
							tempDexNum = 2;
						}
						tempAC = tempAC + tempDexNum;
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
					}
					if (randomInteger== 2)
					{
						finalText = "Scale Mail";
						textArmor.append(finalText);
						tempAC = 14;
						armorClassTypeText = "Medium";
						if (tempDexNum > 1)
						{
							tempDexNum = 2;
						}
						tempAC = tempAC + tempDexNum;
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
					}
					if (randomInteger == 3)
					{
						finalText = "Chain Shirt";
						textArmor.append(finalText);
						tempAC = 13;
						armorClassTypeText = "Medium";
						if (tempDexNum > 1)
						{
							tempDexNum = 2;
						}
						tempAC = tempAC + tempDexNum;
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
					}
					if (randomInteger == 4)
					{
						finalText = "Hide";
						textArmor.append(finalText);
						tempAC = 12;
						armorClassTypeText = "Medium";
						if (tempDexNum > 1)
						{
							tempDexNum = 2;
						}
						tempAC = tempAC + tempDexNum;
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
					}
				}
				
				if (tempClass.equals("Bard") || tempClass.equals("Druid")|| tempClass.equals("Rogue")|| tempClass.equals("Warlock")|| tempClass.equals("Ranger"))
				{
					Random random = new Random();
					randomInteger = random.nextInt(3);
				
					if (randomInteger == 0 )
					{
						finalText = "Padded";
						textArmor.append(finalText);
						tempAC = 11;
						armorClassTypeText = "Light";
						tempAC = tempAC + tempDexNum;
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
					}
					if (randomInteger == 1)
					{
						finalText = "Leather";
						textArmor.append(finalText);
						tempAC = 11;
						armorClassTypeText = "Light";
						tempAC = tempAC + tempDexNum;
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
					}
					if (randomInteger ==2)				
					{
						finalText = "Studded Leather";
						textArmor.append(finalText);
						tempAC = 12;
						armorClassTypeText = "Light";
						tempAC = tempAC + tempDexNum;
						armorClassText = Integer.toString(tempAC);
						textAc.append(armorClassText);
						textArmorType.append(armorClassTypeText);
					}
				}   
				
				btnWalking.notifyListeners(SWT.Selection, new Event());
			}
		});
		btnArmor.setBounds(619, 510, 93, 29);
		btnArmor.setText("Armor");
		
		Button buttonAnim = new Button(shlRandomNpcDesigner, SWT.CHECK);
		buttonAnim.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (buttonAnim.getSelection())
				{
				String tempAnim = textAnim.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(tempAnim);	
				tempCon = tempCon + globalProficiency;
				tempAnim = Integer.toString(tempCon); 
				textAnim.setText("");
				if (tempCon < 1)
					{
						textAnim.append(tempAnim);
					}
				if (tempCon > 0)
					{
						textAnim.append("+");
						textAnim.append(tempAnim);
					}
				}
				
				if (!buttonAnim.getSelection())
				{
				String tempAnim = textAnim.getText();
				int tempConArco = 0;
				tempConArco =  Integer.valueOf(tempAnim);	
				tempConArco = tempConArco - globalProficiency;
				tempAnim = Integer.toString(tempConArco); 
				textAnim.setText("");
				if (tempConArco < 1)
					{
						textAnim.append(tempAnim);
					}
				if (tempConArco > 0)
					{
						textAnim.append("+");
						textAnim.append(tempAnim);
					}
				}
			}
		});
		buttonAnim.setBounds(200, 405, 20, 19);
		
		Button buttonAcro = new Button(shlRandomNpcDesigner, SWT.CHECK);
		buttonAcro.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				if (buttonAcro.getSelection())
				{
				String temp = textAcro.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon + globalProficiency;
				temp = Integer.toString(tempCon); 
				textAcro.setText("");
				if (tempCon< 1)
					{
						textAcro.append(temp);
					}
				if (tempCon > 0)
					{
						textAcro.append("+");
						textAcro.append(temp);
					}
				}
				
				if (!buttonAcro.getSelection())
				{
				String temp = textAcro.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon - globalProficiency;
				temp = Integer.toString(tempCon); 
				textAcro.setText("");
				if (tempCon < 1)
					{
						textAcro.append(temp);
					}
				if (tempCon > 0)
					{
						textAcro.append("+");
						textAcro.append(temp);
					}
				}
			}
		});
		buttonAcro.setBounds(200, 370, 20, 19);
		
		Button buttonArca = new Button(shlRandomNpcDesigner, SWT.CHECK);
		buttonArca.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (buttonArca.getSelection())
				{
				String temp = textArca.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon + globalProficiency;
				temp = Integer.toString(tempCon); 
				textArca.setText("");
				if (tempCon < 1)
					{
						textArca.append(temp);
					}
				if (tempCon > 0)
					{
						textArca.append("+");
						textArca.append(temp);
					}
				}
				
				if (!buttonArca.getSelection())
				{
				String temp = textArca.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon - globalProficiency;
				temp = Integer.toString(tempCon); 
				textArca.setText("");
				if (tempCon < 1)
					{
						textArca.append(temp);
					}
				if (tempCon > 0)
					{
						textArca.append("+");
						textArca.append(temp);
					}
				}
			}
		});
		buttonArca.setBounds(200, 440, 20, 19);
		
		Button buttonAthl = new Button(shlRandomNpcDesigner, SWT.CHECK);
		buttonAthl.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (buttonAthl.getSelection())
				{
				String temp = textAthl.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon + globalProficiency;
				temp = Integer.toString(tempCon); 
				textAthl.setText("");
				if (tempCon < 1)
					{
						textAthl.append(temp);
					}
				if (tempCon > 0)
					{
						textAthl.append("+");
						textAthl.append(temp);
					}
				}
				
				if (!buttonAthl.getSelection())
				{
				String temp = textAthl.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon - globalProficiency;
				temp = Integer.toString(tempCon); 
				textAthl.setText("");
				if (tempCon < 1)
					{
						textAthl.append(temp);
					}
				if (tempCon > 0)
					{
						textAthl.append("+");
						textAthl.append(temp);
					}
				}
			}
		});
		buttonAthl.setBounds(200, 475, 20, 19);
		
		Button buttonDece = new Button(shlRandomNpcDesigner, SWT.CHECK);
		buttonDece.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (buttonDece.getSelection())
				{
				String temp = textDece.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon + globalProficiency;
				temp = Integer.toString(tempCon); 
				textDece.setText("");
				if (tempCon < 1)
					{
						textDece.append(temp);
					}
				if (tempCon > 0)
					{
						textDece.append("+");
						textDece.append(temp);
					}
				}
				
				if (!buttonDece.getSelection())
				{
				String temp = textDece.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon - globalProficiency;
				temp = Integer.toString(tempCon); 
				textDece.setText("");
				if (tempCon < 1)
					{
						textDece.append(temp);
					}
				if (tempCon > 0)
					{
						textDece.append("+");
						textDece.append(temp);
					}
				}
			}
		});
		buttonDece.setBounds(200, 510, 20, 19);
		
		Button buttonHist = new Button(shlRandomNpcDesigner, SWT.CHECK);
		buttonHist.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (buttonHist.getSelection())
				{
				String temp = textHist.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon + globalProficiency;
				temp = Integer.toString(tempCon); 
				textHist.setText("");
				if (tempCon <1)
					{
						textHist.append(temp);
					}
				if (tempCon > 0)
					{
						textHist.append("+");
						textHist.append(temp);
					}
				}
				
				if (!buttonHist.getSelection())
				{
				String temp = textHist.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon - globalProficiency;
				temp = Integer.toString(tempCon); 
				textHist.setText("");
				if (tempCon < 1)
					{
						textHist.append(temp);
					}
				if (tempCon > 0)
					{
						textHist.append("+");
						textHist.append(temp);
					}
				}
			}
		});
		buttonHist.setBounds(200, 545, 20, 19);
		
		Button buttonInsi = new Button(shlRandomNpcDesigner, SWT.CHECK);
		buttonInsi.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (buttonInsi.getSelection())
				{
				String temp = textInsi.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon + globalProficiency;
				temp = Integer.toString(tempCon); 
				textInsi.setText("");
				if (tempCon < 1)
					{
						textInsi.append(temp);
					}
				if (tempCon > 0)
					{
						textInsi.append("+");
						textInsi.append(temp);
					}
				}
				
				if (!buttonInsi.getSelection())
				{
				String temp = textInsi.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon - globalProficiency;
				temp = Integer.toString(tempCon); 
				textInsi.setText("");
				if (tempCon < 1)
					{
						textInsi.append(temp);
					}
				if (tempCon > 0)
					{
						textInsi.append("+");
						textInsi.append(temp);
					}
				}
			}
		});
		buttonInsi.setBounds(200, 580, 20, 19);
		
		Button buttonInti = new Button(shlRandomNpcDesigner, SWT.CHECK);
		buttonInti.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (buttonInti.getSelection())
				{
				String temp = textInti.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon + globalProficiency;
				temp = Integer.toString(tempCon); 
				textInti.setText("");
				if (tempCon < 1)
					{
						textInti.append(temp);
					}
				if (tempCon > 0)
					{
						textInti.append("+");
						textInti.append(temp);
					}
				}
				
				if (!buttonInti.getSelection())
				{
				String temp = textInti.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon - globalProficiency;
				temp = Integer.toString(tempCon); 
				textInti.setText("");
				if (tempCon < 1)
					{
						textInti.append(temp);
					}
				if (tempCon > 0)
					{
						textInti.append("+");
						textInti.append(temp);
					}
				}
			}
		});
		buttonInti.setBounds(200, 615, 20, 19);
		
		Button buttonInve = new Button(shlRandomNpcDesigner, SWT.CHECK);
		buttonInve.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (buttonInve.getSelection())
				{
				String temp = textInve.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon + globalProficiency;
				temp = Integer.toString(tempCon); 
				textInve.setText("");
				if (tempCon < 1)
					{
						textInve.append(temp);
					}
				if (tempCon > 0)
					{
						textInve.append("+");
						textInve.append(temp);
					}
				}
				
				if (!buttonInve.getSelection())
				{
				String temp = textInve.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon - globalProficiency;
				temp = Integer.toString(tempCon); 
				textInve.setText("");
				if (tempCon < 1)
					{
						textInve.append(temp);
					}
				if (tempCon > 0)
					{
						textInve.append("+");
						textInve.append(temp);
					}
				}
			}
		});
		buttonInve.setBounds(200, 650, 20, 19);
		
		Button buttonMedi = new Button(shlRandomNpcDesigner, SWT.CHECK);
		buttonMedi.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (buttonMedi.getSelection())
				{
				String temp = textMedi.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon + globalProficiency;
				temp = Integer.toString(tempCon); 
				textMedi.setText("");
				if (tempCon < 1)
					{
						textMedi.append(temp);
					}
				if (tempCon > 0)
					{
						textMedi.append("+");
						textMedi.append(temp);
					}
				}
				
				if (!buttonMedi.getSelection())
				{
				String temp = textMedi.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon - globalProficiency;
				temp = Integer.toString(tempCon); 
				textMedi.setText("");
				if (tempCon < 1)
					{
						textMedi.append(temp);
					}
				if (tempCon > 0)
					{
						textMedi.append("+");
						textMedi.append(temp);
					}
				}
			}
		});
		buttonMedi.setBounds(419, 370, 20, 19);
		
		Button buttonNatu = new Button(shlRandomNpcDesigner, SWT.CHECK);
		buttonNatu.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (buttonNatu.getSelection())
				{
				String temp = textNatu.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon + globalProficiency;
				temp = Integer.toString(tempCon); 
				textNatu.setText("");
				if (tempCon < 1)
					{
						textNatu.append(temp);
					}
				if (tempCon > 0)
					{
						textNatu.append("+");
						textNatu.append(temp);
					}
				}
				
				if (!buttonNatu.getSelection())
				{
				String temp = textNatu.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon - globalProficiency;
				temp = Integer.toString(tempCon); 
				textNatu.setText("");
				if (tempCon < 1)
					{
						textNatu.append(temp);
					}
				if (tempCon > 0)
					{
						textNatu.append("+");
						textNatu.append(temp);
					}
				}
			}
		});
		buttonNatu.setBounds(419, 405, 20, 19);
		
		Button buttonPerc = new Button(shlRandomNpcDesigner, SWT.CHECK);
		buttonPerc.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (buttonPerc.getSelection())
				{
				String temp = textPerc.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon + globalProficiency;
				temp = Integer.toString(tempCon); 
				textPerc.setText("");
				if (tempCon < 1)
					{
						textPerc.append(temp);
					}
				if (tempCon > 0)
					{
						textPerc.append("+");
						textPerc.append(temp);
					}
				}
				
				if (!buttonPerc.getSelection())
				{
				String temp = textPerc.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon - globalProficiency;
				temp = Integer.toString(tempCon); 
				textPerc.setText("");
				if (tempCon < 1)
					{
						textPerc.append(temp);
					}
				if (tempCon > 0)
					{
						textPerc.append("+");
						textPerc.append(temp);
					}
				}
			}
		});
		buttonPerc.setBounds(419, 440, 20, 19);
		
		Button buttonPerf = new Button(shlRandomNpcDesigner, SWT.CHECK);
		buttonPerf.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (buttonPerf.getSelection())
				{
				String temp = textPerf.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon + globalProficiency;
				temp = Integer.toString(tempCon); 
				textPerf.setText("");
				if (tempCon < 1)
					{
					textPerf.append(temp);
					}
				if (tempCon > 0)
					{
					textPerf.append("+");
					textPerf.append(temp);
					}
				}
				
				if (!buttonPerf.getSelection())
				{
				String temp = textPerf.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon - globalProficiency;
				temp = Integer.toString(tempCon); 
				textPerf.setText("");
				if (tempCon < 1)
					{
					textPerf.append(temp);
					}
				if (tempCon > 0)
					{
					textPerf.append("+");
					textPerf.append(temp);
					}
				}
			}
		});
		buttonPerf.setBounds(419, 475, 20, 19);
		
		Button buttonPers = new Button(shlRandomNpcDesigner, SWT.CHECK);
		buttonPers.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (buttonPers.getSelection())
				{
				String temp = textPers.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon + globalProficiency;
				temp = Integer.toString(tempCon); 
				textPers.setText("");
				if (tempCon < 1)
					{
					textPers.append(temp);
					}
				if (tempCon > 0)
					{
					textPers.append("+");
					textPers.append(temp);
					}
				}
				
				if (!buttonPers.getSelection())
				{
				String temp = textPers.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon - globalProficiency;
				temp = Integer.toString(tempCon); 
				textPers.setText("");
				if (tempCon < 1)
					{
					textPers.append(temp);
					}
				if (tempCon > 0)
					{
					textPers.append("+");
					textPers.append(temp);
					}
				}
			}
		});
		buttonPers.setBounds(419, 510, 20, 19);
		
		Button buttonReli = new Button(shlRandomNpcDesigner, SWT.CHECK);
		buttonReli.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (buttonReli.getSelection())
				{
				String temp = textReli.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon + globalProficiency;
				temp = Integer.toString(tempCon); 
				textReli.setText("");
				if (tempCon < 1)
					{
					textReli.append(temp);
					}
				if (tempCon > 0)
					{
					textReli.append("+");
					textReli.append(temp);
					}
				}
				
				if (!buttonReli.getSelection())
				{
				String temp = textReli.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon - globalProficiency;
				temp = Integer.toString(tempCon); 
				textReli.setText("");
				if (tempCon < 1)
					{
					textReli.append(temp);
					}
				if (tempCon > 0)
					{
					textReli.append("+");
					textReli.append(temp);
					}
				}
			}
		});
		buttonReli.setBounds(419, 545, 20, 19);
		
		Button buttonSlei = new Button(shlRandomNpcDesigner, SWT.CHECK);
		buttonSlei.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (buttonSlei.getSelection())
				{
				String temp = textSlei.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon + globalProficiency;
				temp = Integer.toString(tempCon); 
				textSlei.setText("");
				if (tempCon < 1)
					{
						textSlei.append(temp);
					}
				if (tempCon > 0)
					{
						textSlei.append("+");
						textSlei.append(temp);
					}
				}
				
				if (!buttonSlei.getSelection())
				{
				String temp = textSlei.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon - globalProficiency;
				temp = Integer.toString(tempCon); 
				textSlei.setText("");
				if (tempCon < 1)
					{
					textSlei.append(temp);
					}
				if (tempCon > 0)
					{
						textSlei.append("+");
						textSlei.append(temp);
					}
				}
			}
		});
		buttonSlei.setBounds(419, 580, 20, 19);
		
		Button buttonStea = new Button(shlRandomNpcDesigner, SWT.CHECK);
		buttonStea.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (buttonStea.getSelection())
				{
				String temp = textStea.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon + globalProficiency;
				temp = Integer.toString(tempCon); 
				textStea.setText("");
				if (tempCon < 1)
					{
					textStea.append(temp);
					}
				if (tempCon > 0)
					{
						textStea.append("+");
						textStea.append(temp);
					}
				}
				
				if (!buttonStea.getSelection())
				{
				String temp = textStea.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon - globalProficiency;
				temp = Integer.toString(tempCon); 
				textStea.setText("");
				if (tempCon < 1)
					{
						textStea.append(temp);
					}
				if (tempCon > 0)
					{
						textStea.append("+");
						textStea.append(temp);
					}
				}
			}
		});
		buttonStea.setBounds(419, 615, 20, 19);
		
		Button buttonSurv = new Button(shlRandomNpcDesigner, SWT.CHECK);
		buttonSurv.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (buttonSurv.getSelection())
				{
				String temp = textSurv.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon + globalProficiency;
				temp = Integer.toString(tempCon); 
				textSurv.setText("");
				if (tempCon < 1)
					{
					textSurv.append(temp);
					}
				if (tempCon > 0)
					{
						textSurv.append("+");
						textSurv.append(temp);
					}
				}
				
				if (!buttonSurv.getSelection())
				{
				String temp = textSurv.getText();
				int tempCon = 0;
				tempCon =  Integer.valueOf(temp);	
				tempCon = tempCon - globalProficiency;
				temp = Integer.toString(tempCon); 
				textSurv.setText("");
				if (tempCon < 1)
					{
						textSurv.append(temp);
					}
				if (tempCon > 0)
					{
						textSurv.append("+");
						textSurv.append(temp);
					}
				}
			}
		});
		buttonSurv.setBounds(419, 650, 20, 19);
		
		Button btnAbilities = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnAbilities.setBounds(619, 545, 93, 29);
		btnAbilities.setText("Abilities");
		
		Spinner textSpellSlots = new Spinner(shlRandomNpcDesigner, SWT.BORDER);
		textSpellSlots.setBounds(1159, 475, 130, 29);
		
		Button btnSpellSlots = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnSpellSlots.setEnabled(false);
		btnSpellSlots.setBounds(1159, 440, 130, 29);
		btnSpellSlots.setText("Spell Slots");
		
		
				
				Button btnProficiencies = new Button(shlRandomNpcDesigner, SWT.NONE);
				btnProficiencies.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						textAcro.setText("");
						textAnim.setText("");
						textArca.setText("");
						textAthl.setText("");
						textDece.setText("");
						textHist.setText("");
						textInsi.setText("");
						textInti.setText("");
						textInve.setText("");
						textMedi.setText("");
						textNatu.setText("");
						textPerc.setText("");
						textReli.setText("");
						textSlei.setText("");
						textStea.setText("");
						textSurv.setText("");
						textPerf.setText("");
						textPers.setText("");
						
						buttonAcro.setSelection(false);
						buttonAnim.setSelection(false);
						buttonArca.setSelection(false);
						buttonAthl.setSelection(false);
						buttonDece.setSelection(false);
						buttonHist.setSelection(false);
						buttonInsi.setSelection(false);
						buttonInti.setSelection(false);
						buttonInve.setSelection(false);
						buttonMedi.setSelection(false);
						buttonNatu.setSelection(false);
						buttonPerc.setSelection(false);
						buttonPerf.setSelection(false);
						buttonReli.setSelection(false);
						buttonSlei.setSelection(false);
						buttonStea.setSelection(false);
						buttonSurv.setSelection(false);
						buttonPers.setSelection(false);
						
						
						String tempStr = textStrBon.getText();
						textAthl.setText(tempStr);
						
						String tempWis = textWisBonus.getText();
						textAnim.setText(tempWis);
						textInsi.setText(tempWis);
						textMedi.setText(tempWis);
						textPerc.setText(tempWis);
						textSurv.setText(tempWis);
						
						String tempInt = textIntBonus.getText();
						textArca.setText(tempInt);
						textHist.setText(tempInt);
						textInve.setText(tempInt);
						textNatu.setText(tempInt);
						textReli.setText(tempInt);	
						
						String tempDex = textDexBonus.getText();
						textAcro.setText(tempDex);
						textSlei.setText(tempDex);
						textStea.setText(tempDex);
					
						String tempCha = textCharBonus.getText();
						textDece.setText(tempCha);
						textInti.setText(tempCha);
						textPerf.setText(tempCha);
						textPers.setText(tempCha);
							
						Random random = new Random();
						int randomInteger1 = 0;
						int randomInteger2 = 0;
						int randomInteger3 = 0;
						
						randomInteger1 = random.nextInt(17);
						randomInteger2 = random.nextInt(17);
						randomInteger3 = random.nextInt(17);
							
						while ((randomInteger1 == randomInteger2) || (randomInteger1 == randomInteger3)  || (randomInteger2 == randomInteger3))
						{
							randomInteger1 = random.nextInt(17);
							randomInteger2 = random.nextInt(17);
							randomInteger3 = random.nextInt(17);
							
						}
						if ((randomInteger1 == 1) || (randomInteger2 == 1) || (randomInteger3 == 1))
						{
							buttonAcro.setSelection(true);
							buttonAcro.notifyListeners(SWT.Selection, new Event());
						}
						if ((randomInteger1 == 2) || (randomInteger2 == 2) || (randomInteger3 == 2))
						{
							buttonAnim.setSelection(true);
							buttonAnim.notifyListeners(SWT.Selection, new Event());
						}
						if ((randomInteger1 == 3) || (randomInteger2 == 3) || (randomInteger3 == 3))
						{
							buttonArca.setSelection(true);
							buttonArca.notifyListeners(SWT.Selection, new Event());
						}
						if ((randomInteger1 == 4) || (randomInteger2 == 4) || (randomInteger3 == 4))
						{
							buttonAthl.setSelection(true);
							buttonAthl.notifyListeners(SWT.Selection, new Event());
						}
						if ((randomInteger1 == 5) || (randomInteger2 == 5) || (randomInteger3 == 5))
						{
							buttonDece.setSelection(true);
							buttonDece.notifyListeners(SWT.Selection, new Event());
						}
						if ((randomInteger1 == 6) || (randomInteger2 == 6) || (randomInteger3 == 6))
						{
							buttonHist.setSelection(true);
							buttonHist.notifyListeners(SWT.Selection, new Event());
						}
						if ((randomInteger1 == 7) || (randomInteger2 == 7) || (randomInteger3 == 7))
						{
							buttonInti.setSelection(true);
							buttonInti.notifyListeners(SWT.Selection, new Event());
						}
						if ((randomInteger1 == 8) || (randomInteger2 == 8) || (randomInteger3 == 8))
						{
							buttonInve.setSelection(true);
							buttonInve.notifyListeners(SWT.Selection, new Event());
						}
						if ((randomInteger1 == 9) || (randomInteger2 == 9) || (randomInteger3 == 9))
						{
							buttonMedi.setSelection(true);
							buttonMedi.notifyListeners(SWT.Selection, new Event());
						}
						if ((randomInteger1 == 10) || (randomInteger2 == 10) || (randomInteger3 == 10))
						{
							buttonNatu.setSelection(true);
							buttonNatu.notifyListeners(SWT.Selection, new Event());
						}
						if ((randomInteger1 == 11) || (randomInteger2 == 11) || (randomInteger3 == 11))
						{
							buttonPerc.setSelection(true);
							buttonPerc.notifyListeners(SWT.Selection, new Event());
						}
						if ((randomInteger1 == 12) || (randomInteger2 == 12) || (randomInteger3 == 12))
						{
							buttonPerf.setSelection(true);
							buttonPerf.notifyListeners(SWT.Selection, new Event());
						}
						if ((randomInteger1 == 13) || (randomInteger2 == 13) || (randomInteger3 == 13))
						{
							buttonReli.setSelection(true);
							buttonReli.notifyListeners(SWT.Selection, new Event());
						}
						if ((randomInteger1 == 14) || (randomInteger2 == 14) || (randomInteger3 == 14))
						{
							buttonSlei.setSelection(true);
							buttonSlei.notifyListeners(SWT.Selection, new Event());
						}
						if ((randomInteger1 == 15) || (randomInteger2 == 15) || (randomInteger3 == 15))
						{
							buttonStea.setSelection(true);
							buttonStea.notifyListeners(SWT.Selection, new Event());
						}
						if ((randomInteger1 == 16) || (randomInteger2 == 16) || (randomInteger3 == 16))
						{
							buttonSurv.setSelection(true);
							buttonSurv.notifyListeners(SWT.Selection, new Event());
						}
						if ((randomInteger1 == 0) || (randomInteger2 == 0) || (randomInteger3 == 0))
						{
							buttonPers.setSelection(true);
							buttonPers.notifyListeners(SWT.Selection, new Event());
						}
					}
				});
				btnProficiencies.setBounds(10, 334, 100, 29);
				btnProficiencies.setText("Proficiencies");
				
		textWeapon = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textWeapon.setBounds(718, 440, 280, 29);
		
		textOffhand = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textOffhand.setBounds(718, 475, 280, 29);
		
		textCantrips = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		textCantrips.setBounds(1054, 597, 235, 85);
		
		textSpells = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		textSpells.setBounds(1054, 510, 235, 85);
		
		textAbilities = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		textAbilities.setBounds(718, 545, 235, 134);
		
		textArmor = new Text(shlRandomNpcDesigner, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		textArmor.setBounds(718, 510, 233, 29);
		
		textStrBon = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textStrBon.setBounds(58, 220, 45, 29);
		
		textDexBonus = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textDexBonus.setBounds(157, 220, 45, 29);
		
		textConBonus = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textConBonus.setBounds(261, 220, 45, 29);
		
		textIntBonus = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textIntBonus.setBounds(58, 290, 45, 29);
		
		textWisBonus = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textWisBonus.setBounds(157, 291, 45, 29);
		
		textCharBonus = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textCharBonus.setBounds(261, 291, 45, 29);
		
		textWpnType = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textWpnType.setBounds(1004, 440, 150, 29);
		
		textWpnOffType = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textWpnOffType.setBounds(1004, 475, 150, 29);
		
		Button btnMinus = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnMinus.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String tempStr = textStrBon.getText();
				String tempWis = textWisBonus.getText();
				String tempInt = textIntBonus.getText();
				String tempDex = textDexBonus.getText();
				String tempCha = textCharBonus.getText();
			
				String temp = textLevel.getText();
				String tempHP = textHealth.getText();
				
				textProficiency.setText("");
				
				//d4: 2.5 d6: 3.5 d8: 4.5 d10: 5.5 d12: 6.5 d20: 10.5
				String tempClass = "";

				//decrease number
				String levelUpString = textLevel.getText();
				int levelUp = Integer.valueOf(levelUpString);
				levelUp = levelUp - 1; 
				levelUpString = Integer.toString(levelUp); 
				textLevel.setText(levelUpString);
			
				int tempHealth = 0;
				
				int oldHealth = Integer.valueOf(tempHP);
				
				String tempCon = textConBonus.getText();
				int result = Integer.valueOf(tempCon);
			
				tempClass = textClass.getText();
			
				if (tempClass.equals("Sorcerer"))
				{
					tempHealth = 4;

					tempHealth = result + tempHealth;
					if (tempHealth < 1)
					{
						tempHealth = 1;
					}
				
					tempHealth = oldHealth - tempHealth;
					
					
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
					
				}
				if (tempClass.equals("Wizard"))
				{
					tempHealth = 4;

					tempHealth = result + tempHealth;
					if (tempHealth < 1)
					{
						tempHealth = 1;
					}
				
					tempHealth = oldHealth - tempHealth;
					
					
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
					
				}
				if (tempClass.equals("Bard"))
				{
					tempHealth = 5;

					tempHealth = result + tempHealth;
					if (tempHealth < 1)
					{
						tempHealth = 1;
					}
				
					tempHealth = oldHealth - tempHealth;
					
					
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
					
				}
				if (tempClass.equals("Cleric"))
				{
					tempHealth = 5;

					tempHealth = result + tempHealth;
					if (tempHealth < 1)
					{
						tempHealth = 1;
					}
				
					tempHealth = oldHealth - tempHealth;
					
					
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
					
				}
				if (tempClass.equals("Druid"))
				{
					tempHealth = 5;

					tempHealth = result + tempHealth;
					if (tempHealth < 1)
					{
						tempHealth = 1;
					}
				
					tempHealth = oldHealth - tempHealth;
					
					
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
					
				}
				if (tempClass.equals("Monk"))
				{
					tempHealth = 5;

					tempHealth = result + tempHealth;
					if (tempHealth < 1)
					{
						tempHealth = 1;
					}
				
					tempHealth = oldHealth - tempHealth;
					
					
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
					
				}
				if (tempClass.equals("Rogue"))
				{
					tempHealth = 5;

					tempHealth = result + tempHealth;
					if (tempHealth < 1)
					{
						tempHealth = 1;
					}
				
					tempHealth = oldHealth - tempHealth;
					
					
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
					
				}
				if (tempClass.equals("Warlock"))
				{
					tempHealth = 5;

					tempHealth = result + tempHealth;
					if (tempHealth < 1)
					{
						tempHealth = 1;
					}
				
					tempHealth = oldHealth - tempHealth;
					
					
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
					
				}
				if (tempClass.equals("Fighter"))
				{
					tempHealth = 6;

					tempHealth = result + tempHealth;
					if (tempHealth < 1)
					{
						tempHealth = 1;
					}
				
					tempHealth = oldHealth - tempHealth;
					
					
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
					
				}
				if (tempClass.equals("Paladin"))
				{
					tempHealth = 6;

					tempHealth = result + tempHealth;
					if (tempHealth < 1)
					{
						tempHealth = 1;
					}
				
					tempHealth = oldHealth - tempHealth;
					
					
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
					
				}
				if (tempClass.equals("Ranger"))
				{
					tempHealth = 6;

					tempHealth = result + tempHealth;
					if (tempHealth < 1)
					{
						tempHealth = 1;
					}
				
					tempHealth = oldHealth - tempHealth;
					
					
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
					
				}
				if (tempClass.equals("Barbarian"))
				{
					tempHealth = 7;

					tempHealth = result + tempHealth;
					if (tempHealth < 1)
					{
						tempHealth = 1;
					}
				
					tempHealth = oldHealth - tempHealth;
					
					
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
					
				}

				if (temp.equals("1")) 
				{ 	
					globalProficiency = 2;
					textProficiency.append("+2");
					
				}
				if (temp.equals("2")) 
				{
					globalProficiency = 2;
					textProficiency.append("+2");
				}
				if (temp.equals("3")) 
				{
					globalProficiency = 2;
					textProficiency.append("+2");
				}
				if (temp.equals("4")) 
				{
					globalProficiency = 2;
					textProficiency.append("+2");
				}
				if (temp.equals("5")) 
				{ 	
					globalProficiency = 3;
					textProficiency.append("+3");
				}
				if (temp.equals("6")) 
				{
					globalProficiency = 3;
					textProficiency.append("+3");
				}
				if (temp.equals("7")) 
				{
					globalProficiency = 3;
					textProficiency.append("+3");
				}
				if (temp.equals("8")) 
				{
					globalProficiency = 3;
					textProficiency.append("+3");
				}
				if (temp.equals("9")) 
				{ 	
					globalProficiency = 4;
					textProficiency.append("+4");
				}
				if (temp.equals("10")) 
				{
					globalProficiency = 4;
					textProficiency.append("+4");
				}
				if (temp.equals("11")) 
				{
					globalProficiency = 4;
					textProficiency.append("+4");
				}
				if (temp.equals("12")) 
				{
					globalProficiency = 4;
					textProficiency.append("+4");
				}
				if (temp.equals("13")) 
				{ 	
					globalProficiency = 5;
					textProficiency.append("+5");
				}
				if (temp.equals("14")) 
				{
					globalProficiency = 5;
					textProficiency.append("+5");
				}
				if (temp.equals("15")) 
				{
					globalProficiency = 5;
					textProficiency.append("+5");
				}
				if (temp.equals("16")) 
				{
					globalProficiency = 5;
					textProficiency.append("+5");
				}
				if (temp.equals("17")) 
				{ 	
					globalProficiency = 6;
					textProficiency.append("+6");
				}
				if (temp.equals("18")) 
				{
					globalProficiency = 6;
					textProficiency.append("+6");
				}
				if (temp.equals("19")) 
				{
					globalProficiency = 6;
					textProficiency.append("+6");
				}
				if (temp.equals("20")) 
				{
					globalProficiency = 6;
					textProficiency.append("+6");
				}

				
				if (buttonAcro.getSelection()) 
				{
					textAcro.setText(tempDex);
					buttonAcro.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonAnim.getSelection()) 
				{
					textAnim.setText(tempWis);
					buttonAnim.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonArca.getSelection()) 
				{
					textArca.setText(tempInt);
					buttonArca.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonAthl.getSelection()) 
				{
					textAthl.setText(tempStr);
					buttonAthl.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonDece.getSelection()) 
				{
					textDece.setText(tempCha);
					buttonDece.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonHist.getSelection()) 
				{
					textHist.setText(tempInt);
					buttonHist.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonInsi.getSelection()) 
				{
					textInsi.setText(tempWis);
					buttonInsi.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonInti.getSelection()) 
				{
					textInti.setText(tempCha);
					buttonInti.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonInve.getSelection()) 
				{
					textInve.setText(tempInt);
					buttonInve.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonMedi.getSelection()) 
				{
					textMedi.setText(tempWis);
					buttonMedi.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonNatu.getSelection()) 
				{
					textNatu.setText(tempInt);
					buttonNatu.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonPerc.getSelection()) 
				{
					textPerc.setText(tempWis);
					buttonPerc.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonPerf.getSelection()) 
				{
					textPerf.setText(tempCha);
					buttonPerf.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonReli.getSelection()) 
				{
					textReli.setText(tempInt);
					buttonReli.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonSlei.getSelection()) 
				{
					textSlei.setText(tempDex);
					buttonSlei.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonStea.getSelection()) 
				{
					textStea.setText(tempDex);
					buttonStea.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonSurv.getSelection()) 
				{
					textSurv.setText(tempWis);
					buttonSurv.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonPers.getSelection()) 
				{
					textPers.setText(tempCha);
					buttonPers.notifyListeners(SWT.Selection, new Event());
				}
				

			}
		});
		btnMinus.setBounds(878, 10, 30, 29);
		btnMinus.setText("-");
		
		Button btnPlus = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnPlus.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String tempStr = textStrBon.getText();
				String tempWis = textWisBonus.getText();
				String tempInt = textIntBonus.getText();
				String tempDex = textDexBonus.getText();
				String tempCha = textCharBonus.getText();
				String tempHP = textHealth.getText();
				
				String temp = textLevel.getText();
				textProficiency.setText("");
				
				//d4: 2.5 d6: 3.5 d8: 4.5 d10: 5.5 d12: 6.5 d20: 10.5
				String tempClass = "";

				int tempHealth = 0;
				
				int oldHealth = Integer.valueOf(tempHP);
				
				String tempCon = textConBonus.getText();
				int result = Integer.valueOf(tempCon);
				
				tempClass = textClass.getText();
			
				//increase number
				String levelUpString = textLevel.getText();
				int levelUp = Integer.valueOf(levelUpString);
				levelUp = levelUp + 1; 
				levelUpString = Integer.toString(levelUp); 
				textLevel.setText(levelUpString);
				
				if (tempClass.equals("Sorcerer"))
				{
					tempHealth = 4;

					tempHealth = result + tempHealth;
					if (tempHealth < 1)
					{
						tempHealth = 1;
					}
				
					tempHealth = tempHealth + oldHealth;
					
					
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
					
				}
				if (tempClass.equals("Wizard"))
				{
					tempHealth = 4;

					tempHealth = result + tempHealth;
					if (tempHealth < 1)
					{
						tempHealth = 1;
					}
				
					tempHealth = tempHealth + oldHealth;
					
					
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
					
				}
				if (tempClass.equals("Bard"))
				{
					tempHealth = 5;

					tempHealth = result + tempHealth;
					if (tempHealth < 1)
					{
						tempHealth = 1;
					}
				
					tempHealth = tempHealth + oldHealth;
					
					
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
					
				}
				if (tempClass.equals("Cleric"))
				{
					tempHealth = 5;

					tempHealth = result + tempHealth;
					if (tempHealth < 1)
					{
						tempHealth = 1;
					}
				
					tempHealth = tempHealth + oldHealth;
					
					
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
					
				}
				if (tempClass.equals("Druid"))
				{
					tempHealth = 5;

					tempHealth = result + tempHealth;
					if (tempHealth < 1)
					{
						tempHealth = 1;
					}
				
					tempHealth = tempHealth + oldHealth;
					
					
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
					
				}
				if (tempClass.equals("Monk"))
				{
					tempHealth = 5;

					tempHealth = result + tempHealth;
					if (tempHealth < 1)
					{
						tempHealth = 1;
					}
				
					tempHealth = tempHealth + oldHealth;
					
					
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
					
				}
				if (tempClass.equals("Rogue"))
				{
					tempHealth = 5;

					tempHealth = result + tempHealth;
					if (tempHealth < 1)
					{
						tempHealth = 1;
					}
				
					tempHealth = tempHealth + oldHealth;
					
					
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
					
				}
				if (tempClass.equals("Warlock"))
				{
					tempHealth = 5;

					tempHealth = result + tempHealth;
					if (tempHealth < 1)
					{
						tempHealth = 1;
					}
				
					tempHealth = tempHealth + oldHealth;
					
					
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
					
				}
				if (tempClass.equals("Fighter"))
				{
					tempHealth = 6;

					tempHealth = result + tempHealth;
					if (tempHealth < 1)
					{
						tempHealth = 1;
					}
				
					tempHealth = tempHealth + oldHealth;
					
					
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
					
				}
				if (tempClass.equals("Paladin"))
				{
					tempHealth = 6;

					tempHealth = result + tempHealth;
					if (tempHealth < 1)
					{
						tempHealth = 1;
					}
				
					tempHealth = tempHealth + oldHealth;
					
					
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
					
				}
				if (tempClass.equals("Ranger"))
				{
					tempHealth = 6;

					tempHealth = result + tempHealth;
					if (tempHealth < 1)
					{
						tempHealth = 1;
					}
				
					tempHealth = tempHealth + oldHealth;
					
					
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
					
				}
				if (tempClass.equals("Barbarian"))
				{
					tempHealth = 7;

					tempHealth = result + tempHealth;
					if (tempHealth < 1)
					{
						tempHealth = 1;
					}
				
					tempHealth = tempHealth + oldHealth;
					
					textHealth.setText(String.valueOf(tempHealth)); 
					textMaxHealth.setText(String.valueOf(tempHealth)); 
					
				}
				if (temp.equals("1")) 
				{ 	
					globalProficiency = 2;
					textProficiency.append("+2");
					
				}
				if (temp.equals("2")) 
				{
					globalProficiency = 2;
					textProficiency.append("+2");
				}
				if (temp.equals("3")) 
				{
					globalProficiency = 2;
					textProficiency.append("+2");
				}
				if (temp.equals("4")) 
				{
					globalProficiency = 2;
					textProficiency.append("+2");
				}
				if (temp.equals("5")) 
				{ 	
					globalProficiency = 3;
					textProficiency.append("+3");
				}
				if (temp.equals("6")) 
				{
					globalProficiency = 3;
					textProficiency.append("+3");
				}
				if (temp.equals("7")) 
				{
					globalProficiency = 3;
					textProficiency.append("+3");
				}
				if (temp.equals("8")) 
				{
					globalProficiency = 3;
					textProficiency.append("+3");
				}
				if (temp.equals("9")) 
				{ 	
					globalProficiency = 4;
					textProficiency.append("+4");
				}
				if (temp.equals("10")) 
				{
					globalProficiency = 4;
					textProficiency.append("+4");
				}
				if (temp.equals("11")) 
				{
					globalProficiency = 4;
					textProficiency.append("+4");
				}
				if (temp.equals("12")) 
				{
					globalProficiency = 4;
					textProficiency.append("+4");
				}
				if (temp.equals("13")) 
				{ 	
					globalProficiency = 5;
					textProficiency.append("+5");
				}
				if (temp.equals("14")) 
				{
					globalProficiency = 5;
					textProficiency.append("+5");
				}
				if (temp.equals("15")) 
				{
					globalProficiency = 5;
					textProficiency.append("+5");
				}
				if (temp.equals("16")) 
				{
					globalProficiency = 5;
					textProficiency.append("+5");
				}
				if (temp.equals("17")) 
				{ 	
					globalProficiency = 6;
					textProficiency.append("+6");
				}
				if (temp.equals("18")) 
				{
					globalProficiency = 6;
					textProficiency.append("+6");
				}
				if (temp.equals("19")) 
				{
					globalProficiency = 6;
					textProficiency.append("+6");
				}
				if (temp.equals("20")) 
				{
					globalProficiency = 6;
					textProficiency.append("+6");
				}
				
				
				if (buttonAcro.getSelection()) 
				{
					textAcro.setText(tempDex);
					buttonAcro.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonAnim.getSelection()) 
				{
					textAnim.setText(tempWis);
					buttonAnim.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonArca.getSelection()) 
				{
					textArca.setText(tempInt);
					buttonArca.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonAthl.getSelection()) 
				{
					textAthl.setText(tempStr);
					buttonAthl.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonDece.getSelection()) 
				{
					textDece.setText(tempCha);
					buttonDece.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonHist.getSelection()) 
				{
					textHist.setText(tempInt);
					buttonHist.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonInsi.getSelection()) 
				{
					textInsi.setText(tempWis);
					buttonInsi.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonInti.getSelection()) 
				{
					textInti.setText(tempCha);
					buttonInti.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonInve.getSelection()) 
				{
					textInve.setText(tempInt);
					buttonInve.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonMedi.getSelection()) 
				{
					textMedi.setText(tempWis);
					buttonMedi.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonNatu.getSelection()) 
				{
					textNatu.setText(tempInt);
					buttonNatu.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonPerc.getSelection()) 
				{
					textPerc.setText(tempWis);
					buttonPerc.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonPerf.getSelection()) 
				{
					textPerf.setText(tempCha);
					buttonPerf.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonReli.getSelection()) 
				{
					textReli.setText(tempInt);
					buttonReli.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonSlei.getSelection()) 
				{
					textSlei.setText(tempDex);
					buttonSlei.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonStea.getSelection()) 
				{
					textStea.setText(tempDex);
					buttonStea.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonSurv.getSelection()) 
				{
					textSurv.setText(tempWis);
					buttonSurv.notifyListeners(SWT.Selection, new Event());
				}
				if (buttonPers.getSelection()) 
				{
					textPers.setText(tempCha);
					buttonPers.notifyListeners(SWT.Selection, new Event());
				}
				

			}
		});
		btnPlus.setBounds(905, 10, 30, 29);
		btnPlus.setText("+");
		
		textLevel = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textLevel.setText("1");
		textLevel.setBounds(827, 10, 50, 29);
		
		textWealth = new Text(shlRandomNpcDesigner, SWT.BORDER);
		textWealth.setBounds(421, 185, 192, 29);
		
		Button btnWealth = new Button(shlRandomNpcDesigner, SWT.NONE);
		btnWealth.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				Random random = new Random();
				randomInteger = random.nextInt(7);
				finalText="";
				textWealth.setText("");
				
				if (randomInteger == 0 )
				{
					textWealth.setText("Wretched");
				}
				if (randomInteger == 1)
				{
					textWealth.setText("Squalid");
				}
				if (randomInteger == 2 )
				{
					textWealth.setText("Poor");
				}
				if (randomInteger == 3 )
				{
					textWealth.setText("Modest");
				}
				if (randomInteger == 4 )
				{
					textWealth.setText("Comfortable");
				}
				if (randomInteger == 5 )
				{
					textWealth.setText("Wealthy");
				}
				if (randomInteger == 6 )
				{
					textWealth.setText("Aristocratic");
				}
			}
		});
		btnWealth.setBounds(324, 185, 93, 29);
		btnWealth.setText("Wealth");
		
		Label lblProficient = new Label(shlRandomNpcDesigner, SWT.NONE);
		lblProficient.setBounds(208, 347, 70, 17);
		lblProficient.setText("Proficient");
		
		MenuItem mntmRandomise = new MenuItem(menu, SWT.NONE);
		mntmRandomise.setText("RANDOMISE");
		
		
		mntmRandomise.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e) 
			{

				btnFirstName.notifyListeners(SWT.Selection, new Event());
				btnLastName.notifyListeners(SWT.Selection, new Event());
				btnRace.notifyListeners(SWT.Selection, new Event());
				btnGender.notifyListeners(SWT.Selection, new Event());
				btnClass.notifyListeners(SWT.Selection, new Event());
				btnBuild.notifyListeners(SWT.Selection, new Event());
				btnAlignment.notifyListeners(SWT.Selection, new Event());
				btnJob.notifyListeners(SWT.Selection, new Event());
				btnJobSpec.notifyListeners(SWT.Selection, new Event());
				btnAge.notifyListeners(SWT.Selection, new Event());
				btnLanguage.notifyListeners(SWT.Selection, new Event());
				btnIdeals.notifyListeners(SWT.Selection, new Event());
				btnFlaw.notifyListeners(SWT.Selection, new Event());
				btnBonds.notifyListeners(SWT.Selection, new Event());
				btnTraits.notifyListeners(SWT.Selection, new Event());
				btnTrinkets.notifyListeners(SWT.Selection, new Event());
				btnFears.notifyListeners(SWT.Selection, new Event());
				btnAppearance.notifyListeners(SWT.Selection, new Event());
				btnFlawsBonus.notifyListeners(SWT.Selection, new Event());
				btnQuirks.notifyListeners(SWT.Selection, new Event());
				btnPickpocket.notifyListeners(SWT.Selection, new Event());
				btnDexterity.notifyListeners(SWT.Selection, new Event());
				btnStrength.notifyListeners(SWT.Selection, new Event());
				btnConstitution.notifyListeners(SWT.Selection, new Event());
				btnIntelligence.notifyListeners(SWT.Selection, new Event());
				btnWisdom.notifyListeners(SWT.Selection, new Event());
				btnCharisma.notifyListeners(SWT.Selection, new Event());
				btnWealth.notifyListeners(SWT.Selection, new Event());
				btnProficiencies.notifyListeners(SWT.Selection, new Event());
				btnAbilities.notifyListeners(SWT.Selection, new Event());
				btnHealth.notifyListeners(SWT.Selection, new Event());
				btnArmor.notifyListeners(SWT.Selection, new Event());
				btnWeapon.notifyListeners(SWT.Selection, new Event());
				btnOffhand.notifyListeners(SWT.Selection, new Event());
				btnWalking.notifyListeners(SWT.Selection, new Event());
				btnInventory.notifyListeners(SWT.Selection, new Event());
				btnAc.notifyListeners(SWT.Selection, new Event());
				btnCantrips.notifyListeners(SWT.Selection, new Event());
				btnSpells.notifyListeners(SWT.Selection, new Event());
			}
		});
		
	}
}
