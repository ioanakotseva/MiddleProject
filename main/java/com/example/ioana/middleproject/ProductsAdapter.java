package com.example.ioana.middleproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ioana.middleproject.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductsAdapter extends ArrayAdapter{

    private Context context;
    private List<Product> products;
    private List<Product> orderedProducts = new ArrayList<Product>();

    public ProductsAdapter(Context context, List list){
        super(context, R.layout.product_row, list);
        this.context = context;
        this.products = new ArrayList<>();
    }

    class ProductsHolder{
        View row;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(R.layout.product_row, parent, false);

        ImageView image = (ImageView) row.findViewById(R.id.product_image);
        TextView brand = (TextView) row.findViewById(R.id.product_brand);
        TextView color = (TextView) row.findViewById(R.id.product_color);
        TextView price = (TextView) row.findViewById(R.id.product_price);

        Product product = products.get(position);
        image.setImageResource(product.getImageId());
        brand.setText(product.getColor().toString());
        color.setText(product.getColor().toString());
        price.setText(String.valueOf(product.getPrice()));

        return row;
    }
}

