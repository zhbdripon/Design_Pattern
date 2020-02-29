package com.ziaulhoque.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
//    private List<String> urls = new ArrayList<>();
    private String urls[] = new String[10];
    private int index = 0;

//    public void push(String url){
//        this.urls.add(url);
//    }
    public void push(String url){
        if(index<10){
            urls[index++] = url;
        }else {
            for (int i = 1; i < 10; i++) {
                urls[i - 1] = urls[i];
            }
            urls[9] = url;
        }
    }

    public String pop(){
        return this.urls[index--];
    }

//    public Iterator createIterator(){
//        return new ListIterator(this);
//    }
    public Iterator createIterator(){
        return new ArrayIterator(this);
    }

//    public class ListIterator implements Iterator {
//
//        private BrowseHistory history;
//        private int index;
//
//        public ListIterator(BrowseHistory history){
//            this.history = history;
//        }
//
//        @Override
//        public boolean hasNext() {
//            return index < history.urls.size();
//        }
//
//        @Override
//        public String current() {
//            return history.urls.get(index);
//        }
//
//        @Override
//        public void next() {
//            index++;
//        }
//    }

    public class ArrayIterator implements Iterator{

        private BrowseHistory history;
        private int iteratorIndex;

        public ArrayIterator(BrowseHistory history){
            this.history = history;
            iteratorIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return (this.iteratorIndex < this.history.index);
        }

        @Override
        public String current() {
            return history.urls[iteratorIndex];
        }

        @Override
        public void next() {
            iteratorIndex++;
        }
    }
}
