package FinalZorBHYS;

public class main {

	public static void main(String[] args) {
		SavingsAccount s1 = new SavingsAccount(101, "Ahmet", 5000, 0.05);
		SavingsAccount s2 = new SavingsAccount(102, "Ayşe", 12000, 0.04);
		LoanAccount    l1 = new LoanAccount(201, "Mehmet", 10000, 0.02);
		Branch a = new Branch("zt");
		

		
		       
		        
		        s1.deposit(2000);
		        s1.withdraw(1000);
		        s1.withdraw(99999);   

		        l1.withdraw(3000);
		        l1.withdraw(8000);    
		        l1.deposit(1000);

		       
		        s1.transfer(s2, 500);
		        s1.transfer(l1, 300);
		        l1.transfer(s2, 2000);

		        
		        s2.applyInterest();
		       

		      
		        Account genel = s1;
		        genel.displayInfo();
		        genel.deposit(100);

		       
		        if (genel instanceof SavingsAccount) {
		            SavingsAccount geriDonustu = (SavingsAccount) genel;
		            geriDonustu.applyInterest();
		        }

		        // 7. Branch
		        Branch<SavingsAccount> birikimSubesi = new Branch<>("Kadıköy");
		        birikimSubesi.addAccount(s1);
		        birikimSubesi.addAccount(s2);
		        birikimSubesi.listAll();
		        birikimSubesi.totalBalance();

		        Branch<Account> genelSube = new Branch<>("Genel Merkez");
		        genelSube.addAccount(s1);
		        genelSube.addAccount(l1);
		        genelSube.listAll();
		        genelSube.totalBalance();

		        
		        Account bulunan = genelSube.findById(201);
		        if (bulunan != null) {
		            bulunan.displayInfo();
		            if (bulunan instanceof LoanAccount) {
		                LoanAccount kredi = (LoanAccount) bulunan;
		           
		            }
		        }
		        genelSube.findById(999);
		    }
	

	}


