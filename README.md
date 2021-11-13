# Android_ListView
Android App Using List View &amp; ArrayAdapter


# Code

#### 1st Activity 
```
String[] arr = {"item1", "item2", "item3", "item4", "item5", "item6", "item7", "item8", "item9", "item10"};
listView = findViewById(R.id.listView);

        //using default layout using android.R.layout....
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_activated_1, arr);
        listView.setAdapter(ad);

        //setOnClickListener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked item " + (position + 1), Toast.LENGTH_SHORT).show();
            }
        });
```

# App Highlight

<img src="app_images/List View Code.png" width="1000" /><br>

<img src="app_images/List View App1.png" width="300" /><br>

<img src="app_images/List View App2.png" width="300" /><br>
