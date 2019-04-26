package models;

public class Share {

    private int id;
    private  Company InitalOwnner;
    private Company currentOwner;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Company getInitalOwnner() {
        return InitalOwnner;
    }

    public void setInitalOwnner(Company initalOwnner) {
        InitalOwnner = initalOwnner;
    }

    public Company getCurrentOwner() {
        return currentOwner;
    }

    public void setCurrentOwner(Company currentOwner) {
        this.currentOwner = currentOwner;
    }
}
