package First_Task;

import First_Task.Collection.Forward;

public class Main {

	public static void main(String[] args) {
		Number [] arr = {4, 3, -3, 43, -346, -25, 2, 11, 153, -145, -34, -23};
		
		Collection collection = new Collection(arr);
		
		//Inner classes
		Iterator itrFor = collection.createForward();
		System.out.println("================" + "\n-Task1:");
		
		while(itrFor.hasNext()) {
			System.out.println(itrFor.next());
		}
		
		
		Iterator itrBack = collection.createBackward();
		System.out.println("================" + "\n-Task2:");
		while(itrBack.hasNext()) {
			System.out.println(itrBack.next());
		}

		//Anonymous class
		Iterator itrAnon = new Iterator() {
			private int i = arr.length+2;
			@Override
			public boolean hasNext() {
				i -= 3;
				return i >= 0;
			}

			@Override
			public String next() {
				if(arr[i].doubleValue() % 2 != 0) {
					return i+1 + ") " + arr[i];
				}
				return i+1 + ")*This number is pair";
			}
		};
		System.out.println("================" + "\n-Task3:");
		
		while(itrAnon.hasNext()) {
			System.out.println(itrAnon.next());
		}
		
		//Local class
		Iterator itrLocal = collection.createClassLocal();
		System.out.println("================" + "\n-Task4:");
		
		while(itrLocal.hasNext()) {
			System.out.println(itrLocal.next());
		}
		
		//Static class
		Iterator itrStatic = collection.createClassStatic();
		System.out.println("================" + "\n-Task5:");
		
		while(itrStatic.hasNext()) {
			System.out.println(itrStatic.next());
		}		

	}
}
