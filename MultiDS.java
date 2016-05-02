/*
 * 
 * Luke Kraus
 * CS 0445
 * John Ramerirez
 * Tues/Thurs. 9:30-10:45
 * Recitation- Thurs: 11-11:50
 * 
 * The purpose of this class is to impliment the methods that were given to us in the Reorder and PrimQ interfaces. To do this we used generic types All of the methods have 
 * individual uses that pertain to the deck of cards. They reorder the cards or perform other actions. 
 * 
 * */

public class MultiDS<T> implements PrimQ<T>,Reorder{

	int size = 10 ;
	int count = 0;
	
	T[] deck; 
	
    
    
	@SuppressWarnings("unchecked")
	public MultiDS(int i) {
		size = i;
		this.deck = (T[]) new Object[size];
	}


	public void reverse() {

	
		int count2 = count-1;
		for (int i = 0; i < count / 2; i++) {
			  T temp = (T) deck[i];
			  deck[i] = deck[count2 - i];
			  deck[count2 - i] = temp;
			}
		
	}


	public void shiftRight() {
		int count2 = count - 1;
		T temp = (T) deck[count2];
		for (int i = 0; i < count-1; i++) {
			
			deck[count2] = deck[count2-1];
			count2--;
			
			}
		deck[0] = temp;
		
	}


	public void shiftLeft() {
		
		int count2 = count - 1;
		T temp = (T) deck[0];
		for (int i = 0; i < count-1; i++) {
			
			deck[i] = deck[i+1];
			count2--;
			
			}
		deck[count - 1] = temp;
		
		
		
	}


	public void shuffle() {
		
		for(int i = 0; i < count; i++){
			
			int s = i + ((int)(Math.random() * ((count)-i)));
			
			T temp = deck[s];
			deck[s] = deck[i];
			deck[i] = temp;
		}
		
	}


	@Override
	public T removeItem() {
		if(count == 0){
			return null;			
		}else{
			T temp = deck[0];
			for(int i = 0; i < count-1; i++){
				deck[i] = deck[i+1];
			}
			deck[count-1] = null;
			count--;
			return temp;
		}
		
	}

	@Override
	public boolean full() {
		return count == size;
	}

	
	public boolean empty() {
		return count == 0;
	}

	
	public int size() {
		
		return count;
	}

	
	public void clear() {
		for(int i = 0; i <=count; i++){
			deck[i] = null;
			
		}
		count = 0;
		
	}
	@Override
	public boolean addItem(T item) {
		if(count < size){
			deck[count] = item;
			count++;
			return true;
		}else{
			
		return false;
		}
	}

	public String toString(){
		String contents = "";
		for(int i = 0; i < count; i++){
			contents =  contents + deck[i].toString() +" ";
		}
		return "Contents: \n" + contents; 
	}



}
