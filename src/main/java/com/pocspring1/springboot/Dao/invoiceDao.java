package com.pocspring1.springboot.Dao;

import com.pocspring1.springboot.Entity.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class invoiceDao {

    @Autowired
    private static Map<Integer, Invoice> invoices;

    static {

        invoices = new HashMap<Integer, Invoice>();

        invoices.put(1, new Invoice(
            1,
            new Date(2020, 1, 2),
            "John Doe",
            100.25F));
        invoices.put(2, new Invoice(
            2,
            new Date(2020, 1, 3),
            "Jane Doe",
            200.5F));
        invoices.put(3, new Invoice(
                3,
                new Date(2020, 1, 4),
                "Alex Doe",
                100.25F));
    }

    public Collection<Invoice> getAll() {
        return this.invoices.values();
    }

    public Invoice getById(int id) {
        return this.invoices.get(id);
    }

    public boolean deleteById(Integer id) {
        try {
            Invoice deleted = this.invoices.remove(id);
            if (deleted == null) throw new Exception("Not deleted");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Invoice update(Invoice invoice) {
        Invoice inv = invoices.get(invoice.getNumber());
        inv.setValue(invoice.getValue());
        inv.setDateIssue(invoice.getDateIssue());
        inv.setClientName(invoice.getClientName());
        return inv;
    }

    public Invoice insert(Invoice invoice) {
        System.out.println("dao will insert");
        this.invoices.put(invoice.getNumber(), invoice);
        return invoice;
    }

}
