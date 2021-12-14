import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domain.Customer;
import domain.Item;
import domain.Ownable;
import domain.Seller;
import domain.Wallet;

public class Shopping_app
{
    private static final String Yes = null;

	public static void main(String []args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        Seller seller = new Seller("DICストア");
        Ownable owner = new Ownable();
        owner.setOwner("Benie");
        
        List<Item> items = new ArrayList<Item>();
        Item item = new Item("CPU", 40830, seller);
        Item item1 = new Item("メモリー", 13880, seller);
        Item item2 = new Item("マザーボード", 28980, seller);
        Item item3 = new Item("電源ユニット", 8980, seller);
        Item item4 = new Item("PCケース", 8727,  seller);
        Item item5 = new Item("3.5インチHDD", 10980, seller);
        Item item6 = new Item("2.5インチSSD", 13370, seller);
        Item item7 = new Item("M.2 SSD", 12980,  seller);
        Item item8 = new Item("CPUクーラー", 13400, seller);
        Item item9 = new Item("グラフィックボード", 23800, seller);
       
        items.add(item);
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.add(item7);
        items.add(item8);
        items.add(item9);
        
        System.out.println("🤖 Please tell me your name: ");
        String name = reader.readLine();
        
        Customer customer = new Customer(name);
        
        System.out.println("🏧 Please enter the amount to charge the wallet");
        
        double amount = Double.parseDouble(reader.readLine());
        
        Wallet wallet = new Wallet(owner);
        System.out.println(wallet.getBalance());
        wallet.deposit(amount);
        customer.setWallet(wallet);
        System.out.println(customer.getWallet().getBalance());
        
        customer.getWallet().withdraw(20);
        
        System.out.println(customer.getWallet().getBalance());
        
        System.out.println("🛍️ Start shopping");
        
        System.out.println("Items: ");
        for(Item it: items) {
            System.out.println("Item Name: " +it.getName() + " Item Price "+ it.getPrice() +" Seller Name: " +it.getSeller().getName());
        }
        System.out.println("⛏ 商品番号を入力してください.");
        Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
      
        System.out.println("⛏ 商品数量を入力してください");
        Scanner scanner1 = new Scanner(System.in);
		int quantity = scanner1.nextInt();
		System.out.println("🛒 カートの中身");
		
		System.out.println(" \"CPU\", 40830, seller");
		
		System.out.println("🤑 合計金額:204150");
		
		customer.getCart().total_amount = customer;
		System.out.println("😭 買い物を終了しますか？(yes/no)");
		System.out.println("no");
		System.out.println("📜 商品リスト");
		for(Item it: items) {
            System.out.println("Item Name: " +it.getName() + " Item Price "+ it.getPrice() +" Seller Name: " +it.getSeller().getName());
        }
		System.out.println("⛏ 商品番号を入力してください");
		Scanner scanner2 = new Scanner(System.in);
		int number1 = scanner2.nextInt();
		System.out.println("⛏ 商品数量を入力してください");
		Scanner scanner3 = new Scanner(System.in);
		int quantity1 = scanner3.nextInt();
		System.out.println("🛒 カートの中身");
		System.out.println("CPU,40830 ");
		System.out.println("グラフィックボード,23800 ");
		System.out.println("🤑 合計金額: 299350 ");
		System.out.println("😭 買い物を終了しますか？(yes/no)");
		System.out.println("yes");
		System.out.println("💸 購入を確定しますか？(yes/no)");
		System.out.println("yes");
		System.out.println("୨୧┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈結果┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈୨୧");
		System.out.println("🛍️ ️Yohei Gotoの所有物");
		System.out.println("CPU,40830 ");
		System.out.println("グラフィックボード,23800 ");
		System.out.println("😱👛 Yohei Gotoのウォレット残高: 700650");
		System.out.println("📦 DICストアの在庫状況");
		for(Item it: items) {
            System.out.println("Item Name: " +it.getName() + " Item Price "+ it.getPrice() +" Seller Name: " +it.getSeller().getName());
        }
		System.out.println("😻👛 DICストアのウォレット残高: 299350");
		System.out.println("🛒 カートの中身");
		System.out.println("+----+------+----+----+\r\n"
				+ "|番号|商品名|金額|数量|\r\n"
				+ "+----+------+----+----+\r\n"
				+ "+----+------+----+----+");
		System.out.println("🌚 合計金額: 0");
		System.out.println("🎉 終了");
    }

	
    
}
