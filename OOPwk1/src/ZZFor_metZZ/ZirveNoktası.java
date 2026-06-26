package ZZFor_metZZ;

public class ZirveNoktası {
	public static void zirveleriKaydır(int[] target) {
		//amaç sayı sahip olduğu komşularından büyükse bir yana kaydır tek sefer için
		//{2, 5, 8, 4, 9}
		//[2, 5, 4, 8, 9]
		for(int i =0; i<target.length-1;i++) {
			if(i==0) {
				if(target[i]>target[i+1]) {
					int temp;
					temp =target[i+1];
					target[i+1]=target[i];
					target[i]=temp;
					i++;
				}
			}
			else if(i>0 && target[i]>target[i+1]&& target[i]>target[i-1] ) {
				int temp;
				temp =target[i+1];
				target[i+1]=target[i];
				target[i]=temp;
				i++;
			}
			
			
		}
		for(int i = 0 ; i<target.length;i++) {
			System.out.print("   " + target[i]);
		}
		
	}

}
