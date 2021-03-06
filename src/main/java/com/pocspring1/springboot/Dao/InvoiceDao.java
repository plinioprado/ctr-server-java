package com.pocspring1.springboot.Dao;

import com.pocspring1.springboot.Entity.Address;
import com.pocspring1.springboot.Entity.Invoice;
import com.pocspring1.springboot.Entity.Party;
import com.pocspring1.springboot.Entity.Receivable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.*;

@Repository
public class InvoiceDao {

    @Autowired
    private static Map<Integer, Invoice> invoices;


    static {

        invoices = new HashMap<Integer, Invoice>();

        invoices.put(1, new Invoice(
            "1",
             LocalDate.of(2020, 1, 2),
            100.25F,
            new Party("001",
                "Alpha Services Ltd.",
                new Address("201-111 Main Street",
                    "Vancouver",
                    "BC",
                    "V6A2S5",
                    "CAN")),
                new ArrayList<Receivable>(
                    Arrays.asList(new Receivable(1, LocalDate.of(2020, 2, 2), 100.25F))
            )));
        invoices.put(2, new Invoice(
            "2",
                LocalDate.of(2020, 1, 3),
            200.5F,
            new Party("002",
                "Beta Industries Inc.",
                new Address("201-111 Main Street",
                    "Vancouver",
                    "BC",
                    "V6A2S5",
                    "CAN")),
                new ArrayList<Receivable>(
                        Arrays.asList(new Receivable(1, LocalDate.of(2020, 2, 3), 200.5F))
        )));
        invoices.put(3, new Invoice(
            "3",
             LocalDate.of(2020, 1, 4),
            1500F,
            new Party("001",
                "Alpha Services Ltd.",
                new Address("201-111 Main Street",
                    "Vancouver",
                    "BC",
                    "V6A2S5",
                    "CAN")),
            new ArrayList<Receivable>(
                    Arrays.asList(
                        new Receivable(1, LocalDate.of(2020, 2, 4), 750F),
                        new Receivable(2, LocalDate.of(2020, 3, 4), 750F)
                    )
            )));
    }

    public Collection<Invoice> getAll() {
        return this.invoices.values();
    }

    public Invoice getByCod(String cod) {
        Integer number = Integer.parseInt(cod);
        Invoice invoice = this.invoices.get(number);
        return invoice;
    }

    public boolean deleteByCod(String cod) throws Exception {
        try {
            System.out.println("in deleteDao");
            int number = Integer.parseInt(cod);
            Invoice deleted = this.invoices.remove(number);
            if (deleted == null) throw new Exception("Not deleted");
            return true;
        } catch (Exception e) {
            throw new Exception("Not deleted");
        }
    }

    public Invoice update(Invoice invoice) {
        int number = Integer.parseInt(invoice.getCod());
        invoices.replace(number, invoice);
        return invoice;
    }

    public Invoice create(Invoice invoice) {
        System.out.println("in dao.create");
        TreeMap sortedMap = new TreeMap<>(invoices);
        Integer nextNumber = ((Integer) sortedMap.lastKey()) + 1;
        invoice.setCod(nextNumber.toString());
        this.invoices.put(nextNumber, invoice);
        return invoice;
    }

}
