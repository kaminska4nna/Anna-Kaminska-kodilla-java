package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;


@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        Product tv = new Product("TV");
        Product dvd = new Product("DVD");
        Product book = new Product("Book");

        Item tvItem = new Item(tv, new BigDecimal(3000), 1);
        Item dvdItem = new Item(dvd, new BigDecimal(1500), 3);
        Item bookItem = new Item(book, new BigDecimal(25), 100);

        tvItem.setProduct(tv);
        dvdItem.setProduct(dvd);
        bookItem.setProduct(book);

        tv.getItemsList().add(tvItem);
        dvd.getItemsList().add(dvdItem);
        book.getItemsList().add(bookItem);

        Invoice invoice1 = new Invoice("11122017");
        invoice1.getItemList().add(tvItem);
        invoice1.getItemList().add(dvdItem);
        invoice1.getItemList().add(bookItem);

        tvItem.setInvoices(invoice1);
        dvdItem.setInvoices(invoice1);
        bookItem.setInvoices(invoice1);

        invoiceDao.save(invoice1);
        int id = invoice1.getId();

        Assert.assertEquals(1, id);

        //CleanUp
        invoiceDao.deleteAll();

    }
}
