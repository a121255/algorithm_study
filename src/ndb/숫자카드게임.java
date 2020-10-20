package ndb;

import java.util.Scanner;

public class 숫자카드게임 {

	public static void main(String[] args) {
        int n = 3; int m = 3;
        int num[] = new int[n];
        Scanner sc = new Scanner(System.in);
        
        int tmp = 99;
        for(int i=0; i<n; i++){
        	for (int j = 0; j < m; j++) {
                int a = sc.nextInt();
                if(a<tmp){
                    tmp=a;
                    num[i] = tmp; //num[i]에는 가장 작은 값이 들어가게 된다

                    System.out.println(a);
                }
			}
        	tmp=99;
    
        }
        
        tmp = 0;
        int idx = 0;
        for(int i=0; i<num.length; i++){
            if(num[i]>tmp){
                tmp = num[i];
                idx = i+1;
            }
        }
        
        System.out.println(idx + " " + tmp); 


	}

}
