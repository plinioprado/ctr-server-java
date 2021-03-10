package com.pocspring1.springboot.Controller;

import com.pocspring1.springboot.Entity.Invoice;
import com.pocspring1.springboot.Service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.ValidationException;
import java.util.Collection;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/invoice")
public class InvoiceController extends BaseController {

    @Autowired
    InvoiceService invoiceService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Collection<Invoice>> getAll() {
        try {
            Collection<Invoice> invoiceList = this.invoiceService.getAll();
            return ResponseEntity.status(200).body(invoiceList);
        } catch (Exception e) {
            System.out.println("Error getting invoices: " + e.getMessage());
            return getErrorResponse(500, e.getMessage());
        }
    }

    @RequestMapping(value = "/{cod}", method = RequestMethod.GET)
    public ResponseEntity<Object> getByCod(@PathVariable("cod") String cod) {
        try {
            Invoice invoice = this.invoiceService.getByCod(cod);
            return ResponseEntity.status(200).body(invoice);
        } catch (NullPointerException e) {
            System.out.println("Invoice not found");
            return getErrorResponse(400, e.getMessage());
        } catch (Exception e) {
            System.out.println("Error getting invoice: " + e.toString() + "," + e.getCause());
            return getErrorResponse(500, e.getMessage());
        }
    }

    @RequestMapping(value = "/{cod}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteByCod(@PathVariable("cod") String cod) {
        try {
            boolean deleted = this.invoiceService.deleteByCod(cod);
            if (!deleted) throw new ValidationException("Not deleted");
            return ResponseEntity.status(200).body(null);
        } catch (ValidationException e) {
            System.out.println("Validation error deleting invoice: " + e.getMessage() + "," + e.getCause());
            return getErrorResponse(400, e.getMessage());
        } catch(Exception e) {
            System.out.println("Error deleting invoice: " + e.getMessage() + "," + e.getCause());
            return getErrorResponse(500, e.getMessage());
        }
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> update(@RequestBody Invoice invoice) {
        try {
            Invoice newInvoice = this.invoiceService.update(invoice);
            return ResponseEntity.status(200).body(invoice);
        } catch (ValidationException e) {
            System.out.println("Validation error updating invoice: " + e.getMessage() + "," + e.getCause());
            return getErrorResponse(400, e.getMessage());
        } catch(Exception e) {
            System.out.println("Error updating invoice: " + e.getMessage() + "," + e.getCause());
            return getErrorResponse(500, e.getMessage());
        }
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> insert(@RequestBody Invoice invoice) {
        try {
            Invoice newInvoice = this.invoiceService.insert(invoice);
            return ResponseEntity.status(200).body(invoice);
        } catch (ValidationException e) {
            System.out.println("Validation error inserting invoice: " + e.getMessage() + "," + e.getCause());
            return getErrorResponse(400, e.getMessage());
        } catch(Exception e) {
            System.out.println("Error inserting invoice: " + e.getMessage() + "," + e.getCause());
            return getErrorResponse(500, e.getMessage());
        }
    }

}
