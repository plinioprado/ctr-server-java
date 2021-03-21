package com.pocspring1.springboot.Service;

import com.pocspring1.springboot.Dao.InvoiceDao;
import com.pocspring1.springboot.Entity.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class InvoiceService {

    @Autowired
    InvoiceDao invoiceDao;

    public Collection<Invoice> getAll() {
        return invoiceDao.getAll();
    }

    public Invoice getByCod(String cod) {
        return invoiceDao.getByCod(cod);
    }

    public boolean deleteByCod(String cod) throws Exception {
        return this.invoiceDao.deleteByCod(cod);
    }

    public Invoice update(Invoice invoice) throws Exception {
        System.out.print("in updateSrv");
        System.out.println(", cod=" + invoice.getCod());
        invoice.validate();
        invoice.validateCodUpdate();
        System.out.println("passed validations");
        return this.invoiceDao.update(invoice);
    }

    public Invoice create(Invoice invoice) throws Exception {
        invoice.validate();
        invoice.validateCodCreate();
        return this.invoiceDao.create(invoice);
    }

}
