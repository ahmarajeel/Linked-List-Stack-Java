import java.io.*;
import java.util.Scanner;

public class LinkedListStackMain
{

	static class ListNode
	{ 
		int data;
		ListNode next; 
		ListNode()
		{
			next = null;
		}
		
		ListNode(int item)
		{
			data = item;
			next = null;
		}
		
	}

	static class LinkedListStack 
	{
		ListNode top; 
		LinkedListStack()
		{
			top = null;	
		}
		
		boolean isEmpty()
		{
			if(top == null)
				return true;
			else
				return false;
		}
		
		void push(int item)
		{
			ListNode newNode;
			newNode = new ListNode(item);
			newNode.next = top;
			System.out.println(newNode.data + "      " + newNode.next);
			top = newNode;
		}
		
		int pop()
		{
			if(isEmpty())
			{
				return 0;		
			}
			else
			{
				ListNode temp = top;
				top = top.next;
				return temp.data;
			}
		}

	}
	
	public static void main(String[] argv) throws FileNotFoundException 
	{
		Scanner inFile_1;
		inFile_1 = new Scanner(new FileReader(argv[0]));
		LinkedListStack myStack;
		myStack = new LinkedListStack();
		int intItem_1;
		System.out.println("Pushing integers to the Stack: \n\n");
				while (inFile_1.hasNext())
		{
			intItem_1 = inFile_1.nextInt();
			myStack.push(intItem_1);
		}
		int finish = 1;
		System.out.println("\n\nPopping integers out from the Stack: \n\n");
		while ((finish = myStack.pop()) != 0)             
		{
			System.out.println(finish);
		}
	}

}
