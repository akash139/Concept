package TCS;
public class PatternPrint {

	public static void main(String[] args) {
		int pat[][] = new int[4][];
		pat[0] = new int[1];
		pat[1] = new int[2];
		pat[2] = new int[3];
		pat[3] = new int[4];
		int k = 0;
		for(int i = 0; i<pat.length; i++) {
			for(int j = i+1; j<pat.length; j++) {
				pat[i][j] = k;
				k++;
			}
			for(int ii =0;ii<pat.length;ii++) {
				for(int jj=0;jj<pat.length;jj++) {
					System.out.println(pat[ii][jj]);
					System.out.println();
				}
			}
		}
}
}