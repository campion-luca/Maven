package luca.campion;

import java.util.Random;

public class Customer {

    public Long id;
    public String name;
    public Integer tier;



    public Customer(String name, Integer tier) {
        Random rndm = new Random();
        this.id = rndm.nextLong();
        this.name = name;
        this.tier = tier;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                '}';
    }

}
