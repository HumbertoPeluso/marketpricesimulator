import models.Company;
import models.Share;
import utils.RandomGenerate;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


       List<Company> companiesList = createCompanies();

       for(Company c:companiesList){
           System.out.println("...................");
           System.out.println();
           System.out.println("Company name: "+ c.getName());
           System.out.print("Share price: ");
           System.out.printf("%.2f", + c.getSharePrice());
           System.out.println();
           System.out.println("Number of shares: "+ c.getShares().size());
           System.out.print("Capital: ");
           System.out.printf("%.2f", c.getCapital());
           System.out.println();
           System.out.println("...................");
       }
    }

    private static List<Company> createCompanies() {
        List<Company>result = new ArrayList<>();
        for(int i=1; i<=100;i++){
            Company company = new Company(100+i, RandomGenerate.generateSharePrice(), "Company"+i);
            List<Share>shares = createShares(company);
            company.setShares(shares);
            result.add(company);
        }

        return result;
    }

    private static List<Share> createShares(Company c) {
        int numberOfShares = RandomGenerate.generateNumberOfShares();
        List<Share>shareList = new ArrayList<>();
        for(int i = 1;i<=numberOfShares;i++){
            Share share = new Share(1000+i,c);
            shareList.add(share);
        }

        return shareList;

    }
}
