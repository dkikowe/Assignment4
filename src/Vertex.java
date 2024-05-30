import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Vertex <V>{
    private V data;
    private Map<Vertex<V>, Double> adjVertices;

    public V getData() {
        return data;
    }

    public void setData(V data) {
        this.data = data;
    }

    public Vertex(V data){
        this.data = data;
        this.adjVertices = new HashMap<>();
    }
    public Map<Vertex <V>, Double>getAdjVertices(){
        return adjVertices;
    }

    public void addAdjVertices(Vertex <V> dest, Double weight){
        adjVertices.put(dest, weight);
    }

    public void removeAdjVertex(Vertex<V> dest) {
        adjVertices.remove(dest);
    }

    public boolean containsAdjVertex(Vertex<V> dest) {
        return adjVertices.containsKey(dest);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex<?> vertex = (Vertex<?>) o;
        return Objects.equals(data, vertex.data) && Objects.equals(adjVertices, vertex.adjVertices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, adjVertices);
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
