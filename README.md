# Android RecyclerView

Example project to learn the Android RecyclerView.

- layout
- Model
- Adapter

## Add the recyclerview support dependency

- Add the following line to `app/build.gradle` below `appcompat`:

```
compile 'com.android.support:recyclerview-v7:21.0.+'
```

## Update `activity_main.xml`

- Delete the default `TextView`.
- Add a `android.support.v7.widget.RecyclerView` element.

## Create the `recycler_view_item.xml` layout

- Add one `TextView` to the layout. This layout represents a single "row" within the `RecyclerView`.

## Create the `ItemModel` class

This class is a basic model that represents the data for a single item. The single item is used to
populate a "row".

## Create the `MyRecyclerViewAdapter` class

The adapter takes one item from a list of items and inserts into into one item layout instance.

- Create a new class named `MyRecyclerViewAdapter`.
- Update the class declaration with `extends RecyclerView.Adapter<MyAdapter.ViewHolder>`.
