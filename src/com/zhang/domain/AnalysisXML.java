package com.zhang.domain;

import com.zhang.bean.Book;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * Created by ZhangLei on 2017/5/22.
 */
public class AnalysisXML {
    public Document getDocument() throws Exception{
        SAXReader reader= new SAXReader();
        Document document = reader.read("src/resources/book.xml");
        return document;
    }
    public Book Analysisbook() throws Exception{
        AnalysisXML demo = new AnalysisXML();
        Document document = demo.getDocument();
        Element root = document.getRootElement();
        List node = root.elements();
        Element book = (Element)node.get(0);
        Book b = new Book();
        b.setName(book.attributeValue("name"));
        b.setAuther(book.element("auther").getText());
        b.setTime(book.element("time").getText());

        System.out.println(b.getName());
        System.out.println(b.getAuther());
        System.out.println(b.getTime());
        return b;
    }
   //
}

