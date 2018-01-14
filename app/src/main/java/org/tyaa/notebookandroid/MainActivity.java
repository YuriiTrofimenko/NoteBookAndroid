package org.tyaa.notebookandroid;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import org.tyaa.notebookandroid.adapter.NotesListAdapter;
import org.tyaa.notebookandroid.model.Order;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ListActivity {

    //private ListView mNotesListView;
    //private List<Order> mOrders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mNotesListView = findViewById(android.R.id.list);

        NotesListAdapter adapter =
                new NotesListAdapter(this, R.layout.notes_list_item, generateOrders());

        //mNotesListView.setAdapter(adapter);
        setListAdapter(adapter);
    }

    private List<Order> generateOrders(){

        List<Order> orders = new ArrayList<>();
        for (int i = 0; i < 10; i++){

            Order order = new Order();
            order.setCustomer("Customer " + i);
            order.setId(i);
            order.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum");
            orders.add(order);
        }
        return orders;
    }
}
