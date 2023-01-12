//10.38
import java.util.ArrayList;

public class PriorityyQueue{

    private ArrayList<Integer> heap;

    public PriorityyQueue(){
        heap=new ArrayList<>();
    }
    public boolean isEmpty(){
        return heap.size()==0; 
    }
    public int size(){
        return heap.size();
    }

    public int getMin() throws PriorityQueueException{
        if(isEmpty()){
            throw new PriorityQueueException();
        }
        return heap.get(0);
    }
    public void insert(int element){
        heap.add(element);
        int childIndex=heap.size()-1;
        int parentIndex=(childIndex-1)/2;

        if(heap.get(childIndex)<heap.get(parentIndex)){
            int temp=heap.get(childIndex);
            heap.set(childIndex,heap.get(parentIndex));
            heap.set(parentIndex,temp);

        }
    }
}