package hello;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bpeters
 */
public class MySQLConnection {
	private Connection conn;
	private Statement stmt;

	public MySQLConnection() {
		try {
			System.out.println("----connecting to mysql----");
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://129.150.74.214:3306/mydatabase", "root", "Oracle1!");
			
			// here sonoo is database name, root is username and password
			System.out.println("connection established");
			
			stmt = conn.createStatement();			
			
		} catch (Exception e) {

		}
	}

	public Double getMortgageAmount(String id) {
		Double mortgageAmount = null;
		try {

			System.out.println("test");
			ResultSet rs = stmt.executeQuery("SELECT Original_Mortgage_Amount FROM purchase WHERE ID =" + id);
			while (rs.next())
				mortgageAmount = Double.valueOf(rs.getString(1).replace(",", ""));
			System.out.println(mortgageAmount);

			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}finally{
			
		}
		return mortgageAmount;

	}

	public Double getAverageMortgageAmount() {
		Double average = null;
		try {

			System.out.println("test");
			ResultSet rs = stmt.executeQuery("SELECT AVG(Original_Mortgage_Amount) FROM purchase");
			while (rs.next())
				average = Double.valueOf(rs.getFloat(1));
			System.out.println(average);
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
			
		}
		return average;
	}
	public List<Purchase> getAverageMortgageAmountByCity() {
		List<Purchase> purchases = new ArrayList<>();
		try {

			System.out.println("test");
			ResultSet rs = stmt.executeQuery("SELECT Property_City, AVG(Original_Mortgage_Amount) FROM purchase GROUP BY Property_City");
			while (rs.next()){
				Purchase p = new Purchase();
				p.setOrigMortgageAmount(Double.valueOf(rs.getDouble(2)));
				p.setPropertyCity(rs.getString(1));
				purchases.add(p);
			}
			conn.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		return purchases;
	}

	public List<Purchase> getPurchasesByCity(String city) {
		List<Purchase> purchases = new ArrayList<>();

		try {

			System.out.println("test");
			ResultSet rs = stmt.executeQuery("SELECT * FROM purchase WHERE Property_City = " +"'"+ city +"'");
			while (rs.next()){
				System.out.println("---------");
				System.out.println(rs.getInt(1));
				Purchase p = new Purchase();
				p.id = rs.getInt(1);
				p.setPropertyState(rs.getString(2));
				p.setPropertyCounty(rs.getString(4));
				p.setPropertyCity(rs.getString(3));
				p.setPropertyZip(rs.getString(5));
				p.setSponsorOriginator(rs.getString(6));
				p.setMortgageNumber(rs.getString(7));
				p.setSponsorName(rs.getString(8));
				p.setSponsorNumber(rs.getString(9));
				p.setDownpaymentSource(rs.getString(10));
				p.setNonProfitNumber(rs.getString(11));
				p.setProductType(rs.getString(12));
				p.setLoanPurpose(rs.getString(13));
				p.setPropertyType(rs.getString(14));
				p.setInterestRate(rs.getFloat(15));
				p.setOrigMortgageAmount(rs.getDouble(16));
			
				
				purchases.add(p);
			}
			conn.close();
			
				
			

		} catch (Exception e) {
			System.out.println(e);
		}

		return purchases;
	}
	public List<Purchase> getPurchases() {
		List<Purchase> purchases = new ArrayList<>();

		try {

			System.out.println("test");
			ResultSet rs = stmt.executeQuery("SELECT * FROM purchase");
			while (rs.next()){
				System.out.println("---------");
				System.out.println(rs.getInt(1));
				Purchase p = new Purchase();
				p.id = rs.getInt(1);
				p.setPropertyState(rs.getString(2));
				p.setPropertyCounty(rs.getString(4));
				p.setPropertyCity(rs.getString(3));
				p.setPropertyZip(rs.getString(5));
				p.setSponsorOriginator(rs.getString(6));
				p.setMortgageNumber(rs.getString(7));
				p.setSponsorName(rs.getString(8));
				p.setSponsorNumber(rs.getString(9));
				p.setDownpaymentSource(rs.getString(10));
				p.setNonProfitNumber(rs.getString(11));
				p.setProductType(rs.getString(12));
				p.setLoanPurpose(rs.getString(13));
				p.setPropertyType(rs.getString(14));
				p.setInterestRate(rs.getFloat(15));
				p.setOrigMortgageAmount(rs.getDouble(16));
			
				
				purchases.add(p);
			}
			conn.close();
			
				
			

		} catch (Exception e) {
			System.out.println(e);
		}

		return purchases;
	}
	public List<Purchase> getPurchasesByZip(String zip) {
		List<Purchase> purchases = new ArrayList<>();

		try {

			System.out.println("test");
			ResultSet rs = stmt.executeQuery("SELECT * FROM purchase WHERE Property_Zip = " +"'"+ zip +"'");
			while (rs.next()){
				System.out.println("---------");
				System.out.println(rs.getInt(1));
				Purchase p = new Purchase();
				p.id = rs.getInt(1);
				p.setPropertyState(rs.getString(2));
				p.setPropertyCounty(rs.getString(4));
				p.setPropertyCity(rs.getString(3));
				p.setPropertyZip(rs.getString(5));
				p.setSponsorOriginator(rs.getString(6));
				p.setMortgageNumber(rs.getString(7));
				p.setSponsorName(rs.getString(8));
				p.setSponsorNumber(rs.getString(9));
				p.setDownpaymentSource(rs.getString(10));
				p.setNonProfitNumber(rs.getString(11));
				p.setProductType(rs.getString(12));
				p.setLoanPurpose(rs.getString(13));
				p.setPropertyType(rs.getString(14));
				p.setInterestRate(rs.getFloat(15));
				p.setOrigMortgageAmount(rs.getDouble(16));
			
				
				purchases.add(p);
			}
			conn.close();
			
				
			

		} catch (Exception e) {
			System.out.println(e);
		}

		return purchases;
	}

}