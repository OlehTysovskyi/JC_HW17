package First_Task;

public interface Iterator {
	public boolean hasNext();
	public String next();
}

class Collection {
	private static Number [] arr;
	
	Collection(Number [] arr){
		Collection.arr = arr;
	}
	
	public class Forward implements Iterator{
		private int i = -1;
		
		@Override
		public boolean hasNext() {
			i++;
			return i < arr.length;
		}

		@Override
		public String next() {	
			if(arr[i].doubleValue() % 2 == 0) {
				return i+1 + ") " + arr[i];
			}
			else return i+1 + ") " + 0;	
		}
	}
	
	public Forward createForward() {
		return new Forward();
	}
	
	public class Backward implements Iterator{
		private int i = arr.length;
		
		@Override
		public boolean hasNext() {
			i--;
			return i >= 0;
		}

		@Override
		public String next() {
			return i+1 + ") " + arr[i--];
		}
		
	}
	
	public Backward createBackward() {
		return new Backward();
	}
	//Local class
	public Iterator createClassLocal(){
		class ClassLocal implements Iterator{
			private int i = -5;
			
			@Override
			public boolean hasNext() {
				i += 5;
				return i < arr.length;
			}

			@Override
			public String next() {
				if(arr[i].doubleValue() % 2 == 0) {
					return i+1 + ") " + (arr[i].doubleValue()-100);
				}
				else return i+1 + ") This number is odd ";
			}
			
		}
		return new ClassLocal();
	}
	//Static class
	private static class ClassStatic implements Iterator{
		private int i = -2;

		@Override
		public boolean hasNext() {
			i += 2;
			return i < arr.length;
		}

		@Override
		public String next() {
			if(arr[i].doubleValue() % 2 == 0) {
				return i+1 + ") " + (arr[i].doubleValue()+1);
			}
			else return i+1 + ") This number is pair ";	
		}
	}
	public ClassStatic createClassStatic() {
		return new ClassStatic();
	}
}

