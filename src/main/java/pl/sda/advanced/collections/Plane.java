package pl.sda.advanced.collections;

import java.util.Objects;

public class Plane implements Comparable<Plane>{
    private String model;
    private Integer weight;
    private Integer planeID;

    public String getModel() {
        return model;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getPlaneID() {
        return planeID;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model + '\'' +
                ", weight=" + weight +
                ", planeID=" + planeID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // sprawdzenie czy to TEN sam obiekt (referencja)
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return Objects.equals(planeID, plane.planeID);// czy sa TAKIE same
    }

    @Override
    public int hashCode() {
        return Objects.hash(planeID);
    }

    public Plane(String model, Integer weight, Integer planeID) {
        this.model = model;
        this.weight = weight;
        this.planeID = planeID;


    }
    @Override
    public int compareTo(Plane plane){
        return this.planeID-plane.planeID;
      //  return -(this.planeID-plane.planeID); // odwrocenie kolejnosci
    }
}
