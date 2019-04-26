package models;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private int id;
    private List<Share>shares = new ArrayList<>();
    private double sharePrice;
    private String name;
    private int numberOfSoldShares =0;
    private double totalValueOfSoldShares;
    private double capital;

    public Company(int id, double sharePrice, String name) {
        this.id = id;
        this.sharePrice = sharePrice;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Share> getShares() {
        return shares;
    }

    public void setShares(List<Share> shares) {
        this.shares = shares;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapital() {
        return shares.size()*sharePrice;
    }

    public int getNumberOfSoldShares() {
        return numberOfSoldShares;
    }

    public void setNumberOfSoldShares(int numberOfSoldShares) {
        this.numberOfSoldShares += numberOfSoldShares;
    }

    public double getTotalValueOfSoldShares() {
        return numberOfSoldShares*sharePrice;
    }

}
