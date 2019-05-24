package composite;
//peripheral -> mouse , keyboard
//cabinet will have -> monther board, hdd
   //                         mother board -> ram,cpu
//computer -> cabinet, perpheral

public class CompositeTest {
	public static void main(String args[]) {		
		Component m=new Leaf(500, "mouse");
		Component kb=new Leaf(1000, "key board");
		Component hd=new Leaf(2000, "HDD");
		Component rm=new Leaf(3000, "Ram");
		Component cpu=new Leaf(4000, "CPU");
		
		Composite ph= new Composite("PeriPheral");
		Composite cabinet= new Composite("Cabinet");
		Composite computer= new Composite("Computer");
		Composite mb= new Composite("MotherBoard");
		
		ph.addComponent(m);
		ph.addComponent(kb);
		
		mb.addComponent(cpu);
		mb.addComponent(rm);
		
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		
		computer.addComponent(cabinet);
		computer.addComponent(ph);
		
		computer.showPrice();
		
	}
}
