package com.company;


import com.company.resource.BookResource;

public class Main {

    public static void main(String[] args) {

        /**
         *  Proyekt Yeni baslayanlar ucun nezerde tutulub
         *  Kitablarin filterlenmesi elave olunmasi koda gore  tapilmasi sistemidir
         *  Her hansisa bazaya qosulmayib ,sadece stream api ile interface ile oop prinsiplerini gosteren
         *  sade kicik bir proyektdir
         */
        BookResource bookResource = new BookResource();
        bookResource.start();

    }
}
