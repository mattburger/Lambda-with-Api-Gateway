package Lambda.with.Api.Gateway;

public class Node<T> {
    public T data;
    protected Node next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }
}