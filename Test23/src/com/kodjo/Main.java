/**
 * 
 */
package com.kodjo;

import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.* ;
import javax.swing.text.StyleConstants.ColorConstants;

/**
 * @author Kodjo
 *
 */

enum Pays{
	Mali,
	Senegal,
	BurkinaFaso,
	Niger,	
	Guinee,
	Benin,
	Mauritanie
}
 public class Main {
	static ArrayList<String> mesListe = new ArrayList();
	private static Pays mesPays ;
	static void  afficherEnum(Pays pays){
		for(Pays pg : Pays.values()){
			System.out.println("Pays : "+pg);
		}
	}
	static void creerFenetre(){
		JFrame fenetre = new JFrame();
		fenetre.setTitle("Fenetre 1");
		fenetre.setSize(500, 500);
		fenetre.setVisible(true);
		fenetre.setAlwaysOnTop(true);
		fenetre.setResizable(false);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Panel
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		//Font 
		Font font = new Font("Times New Roman", Font.ITALIC, 14);
		//JLabel
		JLabel para1 = new JLabel("Doflamingo Donquixote Vely");
		para1.setFont(font);
		panel.add(para1);
		fenetre.add(panel);
		//fenetre.setContentPane(panel);
	}
	public static void main(String[] args) throws SQLException{
//		creerFenetre();
		
//		Fenetre fn = new Fenetre();
//		fn.initFenetre();
//		fn.borderLayoutUI();
//		fn.flowLayoutUI();
		
		AuthentificationUI authen = new AuthentificationUI();
		authen.execute();
//		
		
		
		
		
	}
	public static void main33(String[] args) throws SQLException {
		//Test UserModel
				//
				String url = "jdbc:mysql://localhost:3306/myDb";
			    String user = "root";
			    String password = "root";
			    Pharma user01 = new Pharma("ozo", "ozo");
//				user01.presentME();
				DBAcces db = new DBAcces(url, user, password);
				db.connect();
				UserModel userModel = new UserModel(db.getConnection() );
				userModel.authenticate(user01);
				db.disconnect();
				
				
	}
	public static void main2(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		
		mesListe.add("A");
		mesListe.add("A");
		mesListe.add("A");
		System.out.println(mesListe);
		mesListe.clear();
		mesListe.removeAll(mesListe);
		System.out.println(mesListe);
		afficherEnum(mesPays);
		System.out.println("Welcome");

	}
}


// //
// import java.util.HashMap;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[ ] args) {
        
//         Scanner scanner = new Scanner(System.in);
        
//         HashMap<String, Integer> ages = new HashMap<String, Integer>();
//         ages.put("David", 22);
//         ages.put("Tom", 23);
//         ages.put("Robert", 32);
//         ages.put("Alice", 21);
//         ages.put("Sophie", 19);
//         ages.put("Maria", 24);
//         ages.put("John", 28);
        
        
//         String[] nameArr = new String[ages.size()];
//         nameArr = ages.keySet().toArray(nameArr);
        
//         int ageLimit = scanner.nextInt();
        
//         for (String emp : nameArr){
//             //your code goes here
//             if(ages.get(emp) < ageLimit){
//                 ages.remove(emp);
//             }
//         }
        
//         System.out.println(ages);
//     }
// }