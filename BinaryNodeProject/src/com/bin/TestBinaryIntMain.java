package com.bin;

public class TestBinaryIntMain {

	public static void main(String[] args) {
		BinaryNodeInt num14 = new BinaryNodeInt(14,null,null); 
		BinaryNodeInt num7 = new BinaryNodeInt(7,null,null); 
		BinaryNodeInt num4 = new BinaryNodeInt(4,null,null); 
		BinaryNodeInt num6 = new BinaryNodeInt(6,num4,num7); 
		BinaryNodeInt num9 = new BinaryNodeInt(9,null,null); 
		BinaryNodeInt num11 = new BinaryNodeInt(11,null,null); 
		BinaryNodeInt num15 = new BinaryNodeInt(15,num14,null); 
		BinaryNodeInt num8 = new BinaryNodeInt(8,num6,num9); 
		BinaryNodeInt num13 = new BinaryNodeInt(13,num11,num15); 
		BinaryNodeInt num10 = new BinaryNodeInt(10,num8,num13); 
	
		//num10.order();
		
		num10.printParentSon();
		
		//System.out.println(num10.isOrdered());

		//num10.max();
		//BinaryNodeInt.commonNode(num10,4,9);
		
		//System.out.println(num10.maxWidth());
		
		//BinaryNodeInt.commonNode(num10, 7, 14);
		
		
		//System.out.println(BinaryNodeInt.isBalanced(num10));
		
		//System.out.println(BinaryNodeInt.maxHeight(num10));
		
		
//		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
//		num10.verticalSum(map, 0);
		//System.out.println(map.get(1));
	}

}
