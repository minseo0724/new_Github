
class A extends Thread{
A(String msg){super(msg);}
public void run(){

}
}
class B{
public static void main(String... args){
A t1=new A("�Ϲ�");
A t2=new A("�̹�");
t1.start(); t2.start();
System.out.println(Thread.activeCount());
}
}
 