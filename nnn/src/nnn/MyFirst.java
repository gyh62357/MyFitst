package nnn;

public interface MyFirst {
	public void add(int x,int y);
	public void volume(int x,int y,int z);
	default void before(){
		System.out.println("现在开始计算");
}

}
