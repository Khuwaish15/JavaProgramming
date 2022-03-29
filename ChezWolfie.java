
public class ChezWolfie {
	public static void main(String[]args) {
		System.out.println(cafe_day(new int[][] {{5,1,2,3},{2,5,0,4}, {1,4,4,2}}));
	}
	
	public static float cafe_day(int orders[][])
	{
		float revenue = 0;
		for (int i=0; i< orders.length; i++)
		{
			double price = 0;
			int large = orders[i][1];
			int medium = orders [i][2];
			int small = orders[i][3];
			
			if (orders[i][0]==0) {
				price = (large*3.5)+(medium*2.5)+(small*1.25);
				price= price-(price/50.0);
				revenue+=price;
			}
			else if(orders[i][0]==1) {
				price = (large*3.5)+(medium*2.5)+(small*1.25);
				if (small+medium+large >= 10)
					price = price - (price/5.0);
				revenue += price;
			}
			else if(orders[i][0] == 2) {
				if(large>=3 || medium >=4)
					if(small>3)
						small = small - 3;
					else 
						small=0;
					price = (large*3.5)+(medium*2.5)+(small*1.25);
					revenue += price;

			}
		}
		return revenue;
	}
}

	


