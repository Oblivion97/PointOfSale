package draftForTestingClasses;

import pos.Product;
import pos.Purchase;
import pos.Inventory;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

public class MainDraft {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Inventory inventory = new Inventory();

        //       Product p = new Product("p120", "cream", 120, 100, 1, "general");
//        Product p2 = new Product("p2", "soap", 202, 180, 51, "general");
//        System.out.println(p);
//        System.out.println(p2);
//
//        LinkedList<Product> prdts = new LinkedList();
//        prdts.add(p);
//        prdts.add(p2);
//        Invoice invoice=new Invoice("i01", prdts);
//        
//        System.out.println(invoice.getTotal());
//*********************** log in test*********************************//done
//        System.out.println("Enter username & pass : ");
//       
//        User user= new User(sc.next(), sc.next());
//        
//        if (user.login()==true) {
//            System.out.println("Login Successfull");
//        }else{System.out.println("Access Denied");}
        //*************************Search***********************//done
//        System.out.println(inventory.searchProductByID("p1"));
//        System.out.println(inventory.searchProductByName("mouse"));
//
//        System.out.println(inventory.searchProductByIDboolean("p1"));
//        System.out.println(inventory.searchProductByIDboolean("p1589999"));
//        System.out.println(inventory.searchProductByIDboolean("p1203"));
        //*************************Purchase***********************
//        Product p = new Product("p1200", "keyboard", 1200, 1000, 10, "accessories");
//        new Purchase("pur120", p);
        //****************Show Inventory********************
//        inventory.showInventory();
        //***************Inventory List****************
//        LinkedList<Product> ll = new LinkedList<>();
//        ll = (LinkedList<Product>) inventory.inventoryLinkedListFromResultSet();
//
//        ll.forEach((product) -> {
//            System.out.println(product);
//        });
//****************************Customer***************************
//
//        System.out.println("ENTER Customer NAME, ADDRESS, PHONE : ");
//        Customer customer = new Customer(sc.next(), sc.next(), sc.next());
//        System.out.println("ENTER phone to delete customer : ");
//        customer.deleteCustomer(sc.next());
//delete customer
        /*
            LinkedList<String> ll = new LinkedList<>();
        ll = (LinkedList<String>) (new Customer().customersLinkedListFromResultSet());

        ll.forEach((customers) -> {
            System.out.println(customers);
        });
    
//***String List to 2D object

        
        String arr[][]=new String[10000][3];
        int a=0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j]=ll.get(a);
                System.out.print( arr[i][j]+ " ");
                
                if (!(a==ll.size()-1)) {
                    a++;
                    i=1000;
                }
                System.out.println();
            }
        }
         */
//
////****************************Sales Person***************************
        //       System.out.println("ENTER Sale Person's NAME, ADDRESS, PHONE, SALARY(INT) : ");
        //      SalesPerson salesPerson = new SalesPerson(sc.next(), sc.next(), sc.next(), sc.nextInt());
//*****************delete               
//        System.out.println("ENTER PHONE TO DELETE: ");
//        salesPerson.deleteSalesPerson(sc.next());
//********************************************************
        //************store setup*******************  
        /*      String n, a, p;
        Store store = new Store();
        System.out.println("Enter Store Name, Address, Phone: ");
        n = sc.nextLine();
        a = sc.nextLine();
        p = sc.nextLine();
        store.setName(n);
        store.setAddress(a);
        store.setPhone(p);

        store.saveStroreInfo(store);

        Store newStore = new Store();
        System.out.println(newStore);
        System.out.println("\n\n");
        newStore = store.getStoreInfo();
        System.out.println(newStore);
         */
//*****************************sale****************************
//        String id;
//        int quant;
//        System.out.println("Enter Product ID & Quantity to sale : ");
//        id = sc.next();
//        quant = sc.nextInt();
//        LinkedList<Product> prdts = new LinkedList<>();
//        Invoice invoice = new Invoice();
//        Product prdtTemp = inventory.searchProductByID(id);
//        prdtTemp.setQuantity(quant);
//        prdts.add(prdtTemp);
//        invoice.inventoryUpdateAfterInvoice(prdts);
//*************************Date ********************
//        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD HH:MM:SS");
//        GregorianCalendar gc = new GregorianCalendar();
//        String dateFormatted = gc.getCalendarType();
//
//        Product prdt = new Product("p120", "cream", 10, 1200, 30, "general");
//       // new AutoIncrementedValue().ResetAutoIncrementedValue(1);
//        String purID = new AutoIncrementedValue().autoIncrementedValue("prchs", "");
//        Purchase purchase = new Purchase(purID, prdt,  new GregorianCalendar());
//        System.out.println(purchase);
//        
//*************** calender **************
//
//        System.out.println(Purchase.calendarToString(Calendar.getInstance()));
//        System.out.println(Features.stringToCalendar("16-06-1994 12:01:01"));
//        
//
//
//
//
////*********************purchase log=============================
//
//
//
//
// Purchase purchase=new Purchase();
// LinkedList<Product> prdts = new LinkedList();
// LinkedList<Purchase> purList=purchase.purchaseLogLinkedListFromResultSet();
//
//        for(Purchase x:purchase.purchaseLogLinkedListFromResultSet()){
//            System.out.println(x);
//        }
//============================ sales log ============================
/*
LinkedList<Product> prdts = (LinkedList<Product>)inventory.inventoryLinkedListFromResultSet();
Customer customer=new Customer("dghg","ctg","0031226445");
SalesPerson salesPerson=new SalesPerson("FHIM", "dAka", "013658975541", 40000);
Invoice invoice=new Invoice("s1", prdts, new GregorianCalendar(), customer, salesPerson);
invoice.addSalesLogtoDB();
         */
//======================= Search Customer by PHONE ============================
//        System.out.println("Enter Phone no to Search Customer: ");        
//        System.out.println(Cart.cstmr=new Customer().searchCustomerByPhone(sc.next()));
//======================= store ============================
//        String s = "";
//        Store store = null;
//        try {
//            store = Store.getStoreInfo();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        s = store.storeInfoAsPara();
//
//        System.out.println(s);
//======================== user add & delete ==========================
//    User user = new User("fahim", "pass");
//    //user.addUserToDB();
//    
//    user.deleteUserDB("1");
//        System.out.println(User.searchUser("mirferdous"));
//        
//        User.changePass("mirferdous", "011152196", "1");
// ============================ theme ==============================
        //Theme.saveTheme(new Theme());
        //Theme theme=Theme.getTheme();
        //  System.out.println(Features.theme);
//        Theme theme = new Theme();
//        theme.colorBck=new Color(51,74,95);
//        theme.saveTheme(theme);
//        System.out.println(theme.getTheme());        
// ============================ save db ==============================
//        Features.saveDataBaseInfoToFile(sc.next());
//
//        System.out.println(Features.getDataBaseInfoToFile());
//        
// ============================ category ==============================
//    Product.addCatagory(sc.next());
//    Product.addCatagory(sc.next());
        //   System.out.println(Product.delCategory(sc.next()));
        //---------------------
//        Cart.prdtList.add(new Inventory().searchProductByID("p1"));
//        Cart.prdtList.add(new Inventory().searchProductByID("p2"));
//        Cart.prdtList.add(new Inventory().searchProductByID("p4"));
//
//        System.out.println(Cart.prdtList);
//        System.out.println("\n\n\n");
//
//        String id_prdt = sc.next();
//        // System.out.println(id_prdt);
//        // System.out.println("\n\n\n");
//        Product tempPrdt = new Inventory().searchProductByID(id_prdt);
//        // System.out.println(tempPrdt);
//        System.out.println("\n\n\n");
//
//        //int index = Collection.binarySearch(Cart.prdtList, "value", getName());
//        removeItemFromList(Cart.prdtList, tempPrdt);
//        Cart.prdtList.remove(tempPrdt);
//        System.out.println(Cart.prdtList);
//=============================================================
        Purchase purchase = new Purchase();
       // System.out.println(purchase.purchaseLogLinkedListFromResultSet());
        DefaultTableModel model;
       // model =purchase.purchaseLogTableModel(purchase.purchaseLogLinkedListFromResultSet());
       LinkedList<Purchase> ll=new LinkedList<>();
       ll.add(purchase);
        for (Purchase purchase1 : ll) {
            System.out.println(purchase);
        }
       
       
       

    }

    public static boolean removeItemFromList(List<Product> tList, Object item) {
        boolean removed = false;
        int index = 0;

        for (int i = 0; i < tList.size(); i++) {
            if (tList.get(i).equals(item)) {
                index = i;
            }
        }
        tList.remove(index);

        return removed;
    }
}
