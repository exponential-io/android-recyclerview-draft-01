package io.exponential.androidrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    // The dataset
    private String[] dataset;

    // Simple constructor that accepts a dataset and assigns it to a private member.
    public MyRecyclerViewAdapter(String[] dataset) {
        this.dataset = dataset;
    }

    /**
     * Create new views (invoked by the layout manager).
     *
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public MyRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View recyclerViewItemLayout = LayoutInflater
            .from(parent.getContext())
            .inflate(R.layout.recycler_view_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(recyclerViewItemLayout);
        return viewHolder;
    }

    /**
     * Set the data for each View to a value from the dataset. In other words, this method binds
     * the data from the dataset with a specific View in the item layout.
     * <p/>
     * Method called by the RecyclerView when it needs to display each data item in the layout for
     * each item.
     *
     * @param holder   The instance of ViewHolder that holds the navigation_drawer_menu_item.
     * @param position The index of the current NavigationDrawerMenuItem.
     */
    @Override
    public void onBindViewHolder(MyRecyclerViewAdapter.ViewHolder holder, int position) {
        holder.titleTextView.setText(dataset[position]);
    }

    /**
     * Return the size of the dataset. This method is invoked by the layout manager.
     *
     * @return Size of dataset.
     */
    @Override
    public int getItemCount() {
        return dataset.length;
    }

    /**
     * Store the id of each View that will have an item member's value inserted into it.
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView titleTextView;

        public ViewHolder(View itemView) {
            super(itemView);

            // Note: Initially the R.id.title pointed to an id that did not exist. However, the
            // error was not visible until runtime when onBindViewHolder threw a null pointer
            // exception because titleTextView was null.
            titleTextView = (TextView) itemView.findViewById(R.id.title);
        }
    }
}
