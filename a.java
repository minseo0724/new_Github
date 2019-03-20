
class A extends Thread{
A(String msg){super(msg);}
public void run(){

}
}
class B{
public static void main(String... args){
A t1=new A("일번");
A t2=new A("이번");
t1.start(); t2.start();
System.out.println(Thread.activeCount());
}
}
 