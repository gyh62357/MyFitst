package nnn;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//double []x={1,2,3,4,5,6,7,8,9,10};
		//double []y={1,2,3,5,7,9,11,8,5,2};
		double []x={29.73,29.75,29.86,29.91,29.93,29.97,30.04,30.07,30.09,30.28,30.30,30.32};
		double []y={178.9,184.7,188.8,186.8,193.1,190.7,191.8,188.6,195.4,199.8,193.1,183.9};
		System.out.print("请输入要预测的原棉右半部平均长度的值：");
		Scanner con = new Scanner(System.in);
		double a = con.nextDouble();
		//double a = 29.74;
		double y1 = 0;
		for(int i=0;i<x.length;i++){
			if(a<x[i]){
				y1 = ((y[i-1]-y[i])*(a-x[i])/(x[i-1]-x[i]))+y[i];
				break;
			}
		}
		//double z = (double)(Math.round(y1)*10000)/10000.00;
		System.out.println("预测到的强力大小是:"+y1);
		for(int i=0;i<8;i++){
			System.out.println(i);
		}
	}
}
