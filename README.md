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
