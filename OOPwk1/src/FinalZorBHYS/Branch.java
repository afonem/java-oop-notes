package FinalZorBHYS;

import java.util.ArrayList;

public class Branch<T extends Account>{
	private String branchName ;
	private ArrayList<T> accounts;
	public Branch(String branchName) {
		this.branchName=branchName;
		this.accounts= new ArrayList<>();
	}
	public void addAccount(T account) {
	    accounts.add(account);
	    System.out.printf("[%s Şubesi] Hesap eklendi: %s (ID: %d)%n",
	            branchName, account.getOwner(), account.getId());
	}
	public double totalBalance() {
	    double toplam = 0;
	    for (T acc : accounts) {
	        toplam += acc.getBalance();
	    }
	    System.out.printf("[%s Şubesi] Toplam bakiye: %.2f TL%n", branchName, toplam);
	    return toplam;
	}
	public T findById(int id) {
	    for (T acc : accounts) {
	        if (acc.getId() == id) return acc;
	    }
	    System.out.printf("[UYARI] ID %d bulunamadı.%n", id);
	    return null;
	}
	public void listAll() {
	    System.out.println("\n*** " + branchName + " Şubesi - Tüm Hesaplar ***");
	    for (T acc : accounts) {
	        acc.displayInfo();
	    }
	}
}
