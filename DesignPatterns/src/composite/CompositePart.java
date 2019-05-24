package composite;
// peripheral -> mouse , keyboard
// cabinet will have -> monther board, hdd
      //                         mother board -> ram,cpu
//computer -> cabinet, perpheral

import java.util.ArrayList;
import java.util.List;

interface Component{
	void showPrice();
}

class Leaf  implements Component{
	int price;
	String name;
	
	
	public Leaf(int price, String name) {
		//super();
		this.price = price;
		this.name = name;
	}


	@Override
	public void showPrice() {
		System.out.println(name+" : "+price);
		
	}
	
}

class Composite implements Component
{
	List<Component> components =new ArrayList<Component>();
	String name;
	
	
	public Composite(String name) {
		//super();
		this.name = name;
	}

	public void addComponent(Component com) {
		components.add(com);
	}
	
	@Override
	public void showPrice() {
		System.out.println("composite name : "+name);
		
		for (Component component : components) {
			  component.showPrice();
		}
	}
	
}