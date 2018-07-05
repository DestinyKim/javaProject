package test.com;

public class Test06arrayarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("array array");
		
		int[] sus = new int[3];//0 0 0 
		sus[0] = 11;
		sus[1] = 22;
		sus[2] = 33;
		System.out.println(sus);
		for (int i = 0; i < sus.length; i++) {
			System.out.println(sus[i]);
		}
		
		int[][] suss = new int[2][sus.length];
		System.out.println(suss);
		suss[0] = sus;
		System.out.println(suss[0]);
		for (int i = 0; i < suss[0].length; i++) {
			System.out.println(suss[0][i]);
		}
		suss[1] = new int[sus.length];
		System.out.println(suss[1]);
		for (int i = 0; i < suss[1].length; i++) {
			System.out.println(suss[1][i]);
		}
		
		for (int x = 0; x < suss.length; x++) {
			for (int i = 0; i < suss[x].length; i++) {
				System.out.print(suss[x][i]+" ");
			}
			System.out.println();
		}
		
		System.out.println("=========");
		
		int[][] pricess = 
				new int[][] {
					new int[3],
					new int[]{11,22},
					{44,55,66,77}
				};
		pricess[1] = new int[] {99,99,99};
		pricess[0][2] = 99;
		pricess[1][1] = 88;
//		pricess[1][2] = 99;
		System.out.println(pricess.length);
		for (int x = 0; x < pricess.length; x++) {
			for (int i = 0; i < pricess[x].length; i++) {
				System.out.print(pricess[x][i]+" ");
			}
			System.out.println();
		}
	}

}
