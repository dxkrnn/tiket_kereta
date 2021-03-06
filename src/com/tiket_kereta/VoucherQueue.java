package com.tiket_kereta;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class VoucherQueue {
    //inner class voucher
    @SuppressWarnings("FieldMayBeFinal")
    static class Voucher {
        private String code;
        private double discount;

        //Constructor
        Voucher(String kode, double potongan) {
            code = kode;
            discount = potongan;
        }
    }

    //queue untuk menyimpan data voucher
    @SuppressWarnings("FieldMayBeFinal")
    private Queue<Voucher> vouchers = new LinkedList<>();

    //inputVoucher
    public void inputVoucher(String kode, double potongan) {
        vouchers.add(new Voucher(kode, potongan));
    }

    //removeVoucher
    public void removeVoucher() {
        vouchers.remove();
    }

    //isEmpty
    @SuppressWarnings("unused")
    public Boolean isEmpty() {
        return vouchers.isEmpty();
    }


    //return kode voucher
    public ArrayList<String> getCode() {
        ArrayList<String> voucherCodes = new ArrayList<>();
        for (Voucher i : vouchers) {
            voucherCodes.add(i.code);
        }
        return voucherCodes;
    }

    //return nilai potongan voucher
    public ArrayList<Double> getDiscount() {
        ArrayList<Double> voucherDiscounts = new ArrayList<>();
        for (Voucher i : vouchers) {
            voucherDiscounts.add(i.discount);
        }
        return voucherDiscounts;
    }

    public void setDiscount(String kode, double potongan) {
        for (Voucher i : vouchers) {
            if (i.code.equals(kode)) {
                i.discount = potongan;
            }
        }
    }
}
