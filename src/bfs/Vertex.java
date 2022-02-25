
package bfs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    
    private int data;
    private boolean visited;
    private List<Vertex> neighboulist;
    
    //constructor
    public Vertex(int data){
        this.data=data;
        this.neighboulist= new ArrayList<>();
    }
 
    //agregamos vecinos 
    public void addNeighbour(Vertex vertex ){
        this.neighboulist.add(vertex);
    }
    
    //getters y setters 

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighboulist() {
        return neighboulist;
    }

    public void setNeighboulist(List<Vertex> neighboulist) {
        this.neighboulist = neighboulist;
    }
    
    @Override
    public String toString(){
        return ""+this.data;
    }
}
