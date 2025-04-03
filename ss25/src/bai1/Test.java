package bai1;

public class Test {
    public static void main(String[] args) {
        Account account1 = Account.getInstance();
        //Dùng Account.getInstance() để lấy thể hiện duy nhất.
        Account account2 = Account.getInstance();

        account1.setId(01);
        account1.setName("Huyền Trang");
        account1.setAge(19);


        // Kiểm tra xem 1 và 2 có cùng một thể hiện không
        System.out.println("Account 1 ID: " + account1.getId());
        System.out.println("Account 2 ID: " + account2.getId());

        if(account1==account2){
            System.out.println(" cả hai biến trỏ đến cùng một vùng nhớ" );
        }else {
            System.out.println(" Singleton Pattern đã bị phá vỡ");
        }
    }
}
