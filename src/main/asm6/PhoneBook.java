package main.asm6;

import java.util.ArrayList;

public class PhoneBook extends Phone{
    private ArrayList<PhoneEntry> PhoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneEntry p : PhoneList) {

            // Nếu tên đã tồn tại
            if (p.getName().equalsIgnoreCase(name)) {

                // Nếu số chưa có thì thêm
                if (!p.getPhones().contains(phone)) {
                    p.addPhone(phone);
                    System.out.println("Da them so moi cho " + name);
                } else {
                    System.out.println("So dien thoai da ton tai");
                }
                return;
            }
        }

        // Nếu tên chưa tồn tại → thêm người mới
        PhoneList.add(new PhoneEntry(name, phone));
        System.out.println("Da them nguoi moi");
    }

    @Override
    public void removePhone(String name) {
        PhoneList.removeIf(p -> p.getName().equalsIgnoreCase(name));
        System.out.println("Da xoa neu ton tai!");
    }

    @Override
    public void updatePhone(String name, String newPhone) {
        for (PhoneEntry p : PhoneList) {
            if (p.getName().equalsIgnoreCase(name)) {
                p.setPhone(newPhone);
                System.out.println("Cap nhat thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay ten!");
    }

    @Override
    public void searchPhone(String name) {

    }

    @Override
    public void sort() {

    }

}
