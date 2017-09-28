import java.util.Arrays;

public class Median
{
	public int findMedian(int[] values){
		int sum=0;
		int min=100;
		int index=0;
		for(int i=0; i<values.length;i++){
			sum += values[i];
		}

		for (int i= 0; i<values.length ; i++ )
		{
			if(min>Math.abs(sum/values.length-values[i])){
				min = Math.abs(sum/values.length-values[i]);
				index = i;
			}
			else if(min == Math.abs(sum/values.length-values[i])){
				if(values[index]<values[i]){
					continue;
				}else{
					min = Math.abs(sum/values.length-values[i]);
					index = i;
				}
			}
		}

		return values[index];
	}

	public static void main(String[] args) 
	{
		Median median = new Median();

		int[] values1 = {10, 4, 53, 63, 17, 37, 52, 16, 33, 65};
		System.out.println("input : "+Arrays.toString(values1));
		System.out.println("median : "+median.findMedian(values1));
		System.out.println("=================================================");

		int[] values2 = {32, 53, 52, 76, 15, 98, 76, 65, 36, 10};
		System.out.println("input : "+Arrays.toString(values2));
		System.out.println("median : "+median.findMedian(values2));
	}	
}