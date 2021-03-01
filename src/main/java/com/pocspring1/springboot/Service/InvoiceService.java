package com.pocspring1.springboot.Service;

import com.pocspring1.springboot.Dao.invoiceDao;
import com.pocspring1.springboot.Entity.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class InvoiceService {

    @Autowired
    invoiceDao invoiceDao;

    public Collection<Invoice> getAll() {
        return invoiceDao.getAll();
    }

    public Invoice getById(int id) {
        return invoiceDao.getById(id);
    }

    public boolean deleteById(Integer id) {
        return this.invoiceDao.deleteById(id);
    }

    public Invoice update(Invoice invoice) throws Exception {
        invoice.validate();
        return this.invoiceDao.update(invoice);
    }

    public Invoice insert(Invoice invoice) throws Exception {
        invoice.validate();
        return this.invoiceDao.insert(invoice);
    }

}
