package models;

public class Share {

    private int id;
    private  Company ownner;

    public Share(int id, Company ownner) {
        this.id = id;
        this.ownner = ownner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Company getOwnner() {
        return ownner;
    }

    public void setOwnner(Company ownner) {
        this.ownner = ownner;
    }
}
