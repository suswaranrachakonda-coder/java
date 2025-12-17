//musicpalylist using linkedlist
public class musicpalyList {
    private Node head;
    private int size;

    private class Node {
        String song;
        Node next;

        Node(String song) {
            this.song = song;
            this.next = null;
        }
    }

    public musicpalyList() {
        this.head = null;
        this.size = 0;
    }







    
    public void addSong(String song) {
        Node newNode = new Node(song);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public String removeSong(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node current = head;
        String removedSong;

        if (index == 0) {
            removedSong = head.song;
            head = head.next;
        } else {
            Node previous = null;
            for (int i = 0; i < index; i++) {
                previous = current;
                current = current.next;
            }
            removedSong = current.song;
            previous.next = current.next;
        }
        size--;
        return removedSong;
    }

    public int getSize() {
        return size;
    }


    

    
}
