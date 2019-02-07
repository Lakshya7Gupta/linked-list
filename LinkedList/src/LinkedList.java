
public class LinkedList {
	Node head;

	public void insert(int data){
          Node node = new Node();
          node.data=data;
          node.next=null;
          
         if(head==null){
        	  head=node;
          }
         else{
        	  Node n=head;
        	  while(n.next!=null){
        		  n=n.next;
        	  }
        	  n.next=node;
          }  
	}
	
//	public void insert(int data){
		
//		Node node= new Node();
//		node.data=data;
//		node.next=head;
	//	head=node;
//	}
	
	public void insertat(int data,int position){
		Node node=new Node();
		node.data=data;
		node.next=null;
		Node temp=head;
		for(int i=1;i<position;i++){
			temp=temp.next;
		}
		node.next=temp.next;
		temp.next=node;
		
		
		
	}
	
//	public void delete() {
	
//	Node temp=head;
	//head=temp.next;
//	temp.next=null;	
//	}
//	public void deleteated (){
	//	Node n=head;
		//while(n.next.next!=null){
			//n=n.next;
	//	}
//	Node temp=n;
//	n=n.next;
//	temp.next=null;
//	
		
//	}
	
	public void reverse(){
		Node current =head;
		Node previous =null;
		Node next=null;
		while(current!=null){
			next=current.next;
			current.next=previous;
			previous=current;
			current =next;
			
			
		}
		head=previous;
	}
	
	public void delat(int position){
		Node prevoius=head;
		int count=1;
		while(count<position-1){
			prevoius=prevoius.next;
			count++;
		}
		Node current=prevoius.next;
		prevoius.next=current.next;
		current.next=null;
	}
	
	
	
	
	
	
	
public void show(){
	Node node=head;
	while(node.next!=null){
		System.out.println(node.data);
		node=node.next;
	}
	System.out.println(node.data);
	
	
	
}
    






}
