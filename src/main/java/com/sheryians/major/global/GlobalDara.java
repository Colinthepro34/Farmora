package com.sheryians.major.global;

import com.sheryians.major.model.Product;

import java.util.ArrayList;
import java.util.List;

public class GlobalDara {
    public static List<Product> cart;
    static {
        cart=new ArrayList<>();
    }

}
