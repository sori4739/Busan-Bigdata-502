package busancoffee;

import java.util.ArrayList;
import java.util.List;

public class CoffeeApp {

	public static void main(String[] args) {
		//Ŀ�� ������ ���� ��ü���� ����
		Customer customer = new Customer();
		Barista barista = new Barista();
		
		MenuItem m1 = new MenuItem("�Ƹ޸�ī��", 1500);
		MenuItem m2 = new MenuItem("����������", 2000);
		MenuItem m3 = new MenuItem("īǪġ��", 3000);
		MenuItem m4 = new MenuItem("ī���ī", 3500);
		List<MenuItem> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		
		Menu menu = new Menu(list);
		
		//1.Ŀ�Ǹ� �ֹ��϶�(�޽���)
		customer.order(Type.AMERICANO, barista, menu);

	}

}
