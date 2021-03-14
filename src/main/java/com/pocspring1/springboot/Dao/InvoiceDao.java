package com.pocspring1.springboot.Dao;

import com.pocspring1.springboot.Entity.Address;
import com.pocspring1.springboot.Entity.Invoice;
import com.pocspring1.springboot.Entity.Party;
import com.pocspring1.springboot.Entity.Receivable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class InvoiceDao {

    @Autowired
    private static Map<Integer, Invoice> invoices;

    static {

        invoices = new HashMap<Integer, Invoice>();

        invoices.put(1, new Invoice(
            "1",
            new Date(2020, 1, 2),
            100.25F,
            new Party("001",
                "Alpha Services Ltd.",
                new Address("201-111 Main Street",
                    "Vancouver",
                    "BC",
                    "V6A 2S5",
                    "CAN")),
                new ArrayList<Receivable>(
                    Arrays.asList(new Receivable(new Date(2020, 2, 2), 100.25F))
            )));
        invoices.put(2, new Invoice(
            "2",
            new Date(2020, 1, 3),
            200.5F,
            new Party("002",
                "Beta Industries Inc.",
                new Address("201-111 Main Street",
                    "Vancouver",
                    "BC",
                    "V6A 2S5",
                    "CAN")),
                new ArrayList<Receivable>(
                        Arrays.asList(new Receivable(new Date(2020, 2, 3), 200.5F))
        )));
        invoices.put(3, new Invoice(
            "3",
            new Date(2020, 1, 4),
            1500F,
            new Party("001",
                "Alpha Services Ltd.",
                new Address("201-111 Main Street",
                    "Vancouver",
                    "BC",
                    "V6A 2S5",
                    "CAN")),
            new ArrayList<Receivable>(
                    Arrays.asList(
                        new Receivable(new Date(2020, 2, 4), 750F),
                        new Receivable(new Date(2020, 3, 4), 750F)
                    )
            )));
    }

    public Collection<Invoice> getAll() {
        return this.invoices.values();
    }

    public Invoice getByCod(String cod) {
        Integer number = Integer.parseInt(cod);
        System.out.println("will get invoice for cod=" + cod);
        Invoice inv = this.invoices.get(number);
        return inv;
    }

    public boolean deleteByCod(String cod) {
        try {
            Invoice deleted = this.invoices.remove(cod);
            if (deleted == null) throw new Exception("Not deleted");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Invoice update(Invoice invoice) {
        Invoice inv = invoices.get(invoice.getCod());
        inv.setVal(invoice.getVal());
        inv.setDt(invoice.getDt());
        return inv;
    }

    public Invoice insert(Invoice invoice) {
        System.out.println("dao will insert");
        Integer number = Integer.parseInt(invoice.getCod());
        this.invoices.put(number, invoice);
        return invoice;
    }

}
