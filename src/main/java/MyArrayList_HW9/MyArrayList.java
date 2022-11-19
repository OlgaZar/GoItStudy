package MyArrayList_HW9;

import java.util.Arrays;

public class MyArrayList {
    private Object[] elementsOfMyArrayList;
    private int size;

    public MyArrayList(Object[] elementsOfMyArrayList) {

        this.elementsOfMyArrayList = elementsOfMyArrayList;
        int count = 0;
        for (int i = 0; i < elementsOfMyArrayList.length; i++) {
            if (elementsOfMyArrayList[i] != null) {
                count++;
            }
            this.size = count;
        }
    }

    public MyArrayList() {
        this.elementsOfMyArrayList = new Object[10];
        this.size = 0;
    }

//    public MyArrayList(int initLenght) {
//        if (initLenght < 0 || initLenght == 0) {
//            throw new LengthException("Lenght of ArrayList should be >0");
//        } else {
//            this.elementsOfMyArrayList = new Object[initLenght];
//            this.size = 0;
//        }
//    }
//
//
//    public Object[] getElementsOfMyArrayList() {
//        return elementsOfMyArrayList;
//    }
//
//    public void set(int index, Object value) {
//        elementsOfMyArrayList[index] = value;
//    }
//
//    @Override
//    public String toString() {
//        return "MyArrayList{" +
//                "elementsOfMyArrayList=" + Arrays.toString(elementsOfMyArrayList) +
//                '}';
//    }
//
//    public int size(MyArrayList myArrayList) {
//        return size;
//    }
//
//    public void clear(MyArrayList myArrayList) {
//        for (int i = 0; i < size; i++) {
//            elementsOfMyArrayList[i] = null;
//        }
//    size=0;
//    }
//
//    public Object get(int index) {
//        indexCheck(index);
//        return elementsOfMyArrayList[index];
//    }
//
//
//    public void remove(int index) {
//        indexCheck(index);
//        for (int i = index; i < size - 1; i++) {
//            elementsOfMyArrayList[i] = elementsOfMyArrayList[i + 1];
//        }
//        elementsOfMyArrayList[size - 1] = null;
//            size--;
//    }
//
//    public void add(Object value) {
//        if (value == null) {
//            return;
//        }
//        if (size == elementsOfMyArrayList.length) {
//            elementsOfMyArrayList = Arrays.copyOf(elementsOfMyArrayList,
//                    (int) (elementsOfMyArrayList.length * 1.5 + 1));
//        }
//        elementsOfMyArrayList[size] = value;
//        size++;
//
//    }
//
//
//    public void indexCheck(int index) {
//        if (index < 0) {
//            throw new IndexException("Index should not be negative");
//        }
//        if (index > (size - 1)) {
//            throw new BoundsException("Such index does not exist");
//        }
//    }
//public  static class LengthException extends Exception {
//
//}
//public static class IndexException extends Exception {
//
//}
//public static class BoundsException extends Exception {
//
//}
//
//
}