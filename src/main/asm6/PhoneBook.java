package main.asm6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{
    public ArrayList<PhoneNumber> PhoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNumber p : PhoneList) {

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
        PhoneList.add(new PhoneNumber(name, phone));
        System.out.println("Da them nguoi moi");
    }

    @Override
    public void removePhone(String name) {
        for (PhoneNumber p :PhoneList){
            if (p.getName().equalsIgnoreCase(name)){
                PhoneList.remove(p);
                return;
            }
        }
    }

    @Override
    public void updatePhone(String name, String newPhone) {
        for (PhoneNumber p : PhoneList) {
            if (p.getName().equalsIgnoreCase(name)) {
                p.getPhones().clear();
                p.addPhone(newPhone);
                System.out.println("Cap nhat thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay ten!");
    }

    @Override
    public void searchPhone(String name) {
            for (PhoneNumber p : PhoneList) {
                if (p.getName().equalsIgnoreCase(name)) {
                    System.out.println(p.getName() + " : "+ p.getPhones() );
                    return;
                }
            }
            System.out.println("Khong tim thay!");
        }

    @Override
    public void sort() {
        for (int i =0; i<PhoneList.size()-1;i++){
            for (int j =0; j<PhoneList.size()-i-1; j++){
                if (PhoneList.get(j).getName().compareTo(PhoneList.get(j+1).getName())>0){
                    PhoneNumber p = PhoneList.get(j);
                    PhoneList.set(j,PhoneList.get(j+1)); //gan nhanh gia tri j
                    PhoneList.set(j+1,p); //gan nhanh gia tri j+1
                }
            }
        }
    }

}
