import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {

	public static void main(String[] args) {
		   Main solution = new Main();
		   solution.procedure();		
	}
	
	 void procedure (){
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));	
		try {
			while (br.ready()){
				String result="Jolly";
				String[] values;
				values = br.readLine().split(" ");
				int size = Integer.parseInt(values[0]);
				if (values.length<2|| size<=0 || size >3000){
					result="Not jolly";
				}else if (!(Integer.parseInt(values[0])==1)){
					int array[] =new int [size];
					for (int i=0;i<array.length;i++){
						array[i]=Integer.parseInt(values[i+1]);
					}
					int diff[]=new int [size-1];
					for (int i=0; i<diff.length;i++){			
						diff[i]=Math.abs(array[i]-array[i+1]);
					}
					Arrays.sort(diff);
					if (diff[0]!=1){
						result="Not jolly";
					}else{
						for (int i=0; i<diff.length;i++){
							if (i+1!=diff[i]){
								result="Not jolly";
								break;
							}
						}
					}
				}		
				System.out.println(result);
			}			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
