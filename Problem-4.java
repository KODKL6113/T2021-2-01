import java.util.HashMap;
import java.util.Map;

public class Programme4java {

	public static void main(String[] args) {
		int arr[]= new int[]{1,2,8,9,12,46,76,82,15,20,30};
		Map<Integer, Integer> map =new HashMap<>();
		int x= 9;
		for(int i=1; i<=x; i++) {
			int count=0;
			for(int j=0;j<arr.length; j++) {
				if(arr[j]%i==0) {
					count++;
				}
			}
			map.put(i, count);
		}
		System.out.println(map);
	}

}
