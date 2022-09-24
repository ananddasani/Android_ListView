# Android_ListView
Android App Using List View &amp; ArrayAdapter

This topic is a part of [My Complete Andorid Course](https://github.com/ananddasani/Android_Apps)

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

![List View App1](https://user-images.githubusercontent.com/74413402/192095237-ff07102b-51c3-4232-b9b0-61623c653d65.png)
![List View App2](https://user-images.githubusercontent.com/74413402/192095239-946bdee5-5f70-47d1-8989-2105441c9e9b.png)
![List View Code](https://user-images.githubusercontent.com/74413402/192095240-4067e97a-1187-4c99-86a7-92566e8cc652.png)
