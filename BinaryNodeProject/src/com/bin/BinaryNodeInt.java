package com.bin;


import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BinaryNodeInt {
	
	private Integer letter;
	private BinaryNodeInt node1;
	private BinaryNodeInt node2;
	
	public BinaryNodeInt(Integer letter,BinaryNodeInt node1,BinaryNodeInt node2){
		this.letter = letter;
		this.node1 = node1;
		this.node2 = node2;
	}
	
	public void printParentSon() {
		StringBuilder sb = new StringBuilder("Sons:");
		if(node1 != null) {
			sb.append(node1.getLetter()+ " ");

		}
		if(node2 != null) {
			sb.append(node2.getLetter()+ " ");
		}
		sb.append("Parent:"+letter);
		System.out.println(sb.toString());
		
		
		if(node1 != null) {
			node1.printParentSon();
		}
		if(node2 != null) {
			node2.printParentSon();
		}
		
	}
	
	public void preOrder(){
		System.out.println(this.getLetter());
		if(node1 != null){
			node1.preOrder();
		}
		if(node2 != null){
			node2.preOrder();
		}	
	}
	
	public void postOrder(){
		if(node1 != null){
			node1.postOrder();
		}
		if(node2 != null){
			node2.postOrder();
		}	
		System.out.println(this.getLetter());
	}
	
	public boolean isOrdered() {
		if(node1 != null) {
			System.out.println(node1.getLetter()+">"+letter);
			if(node1.getLetter() > letter || !node1.isOrdered()) {
				return false;
			}
		}
		
		if(node2 != null) {
			System.out.println(node2.getLetter()+">"+letter);
			if(node2.getLetter() < letter || !node2.isOrdered()) {
				return false;
			}
		}
		return true;
	}
	
	
	public static int maxHeight(BinaryNodeInt bn){
		if(bn == null){
			return 0;
		}
		return 1 + Math.max(maxHeight(bn.node1),maxHeight(bn.node2));
	}
	
	public static void commonNode(BinaryNodeInt bn, int num1, int num2){
		if(bn.getLetter()>num1 && bn.getLetter()>num2){
			commonNode(bn.getNode1(),num1,num2);
		}else if(bn.getLetter()<num1 && bn.getLetter()<num2){
			commonNode(bn.getNode2(),num1,num2);
		}else{
			System.out.println(bn.getLetter());
		}
	}
	
	public static boolean isBalanced(BinaryNodeInt bn){
		if(bn == null){
			return true;
		}
		int x = maxHeight(bn.node1);
		int y = maxHeight(bn.node2);
		System.out.println(x+"::::"+y);
		int difference = Math.abs(x-y);
		if(difference > 1){
			return false;
		}
		return isBalanced(bn.node1) && isBalanced(bn.node1);
	}
	
	public int maxWidth(){
		int maximun = 0;
		Queue<BinaryNodeInt> ll = new LinkedList<BinaryNodeInt>();
		ll.add(this);
		while(!ll.isEmpty()){
			int count = ll.size(); 
			maximun = maximun > count?maximun:count;
			int counter = 0; 
			while(count > counter){
				counter++;
				BinaryNodeInt current = ll.remove();
				if(current.node1 !=null){
					ll.add(current.node1);
				}
				if(current.node2 !=null){
					ll.add(current.node2);
				}
			}
			
		}
		
		return maximun;
	}
	
	public void verticalSum(Map<Integer, Integer> map, Integer value){
		
		Integer currentLine = map.get(value)==null?1:map.get(value)+1;
		map.put(value, currentLine);
		
		if(node1 != null){
			node1.verticalSum(map,value-1);
		}
		if(node2 != null){
			node2.verticalSum(map,value+1);
		}	
		System.out.println(this.getLetter());
	}
	
	public void order(){
		if(node1 != null){
			node1.order();
		}
		System.out.println(this.getLetter());
		if(node2 != null){
			node2.order();
		}	
		
	}
	
	public void low(){
		if(node1 != null){
			node1.low();
		}else{
			System.out.println(this.getLetter());
		}
	}
	
	public void max(){
		if(node2 != null){
			node2.max();
		}else{
			System.out.println(this.getLetter());
		}
	}
	
	public Integer getLetter() {
		return letter;
	}

	public void setLetter(Integer letter) {
		this.letter = letter;
	}

	public BinaryNodeInt getNode1() {
		return node1;
	}

	public void setNode1(BinaryNodeInt node1) {
		this.node1 = node1;
	}

	public BinaryNodeInt getNode2() {
		return node2;
	}

	public void setNode2(BinaryNodeInt node2) {
		this.node2 = node2;
	}

	
	
	}
