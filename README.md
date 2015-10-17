# AmountView
自定义组件：购买数量，带减少增加按钮。 API >= 8

<img src="https://github.com/abiang/AmountView/raw/master/screenshot/screenshot1.png" style="width:300px">

##用法

1. 导入库:

    ``` compile 'com.github.nukc.amountview:library:1.0' ```

2. 在你的 layout 里添加 LoadMoreLayout 控件:

	```xml
    <com.github.nukc.amountview.AmountView
            android:id="@+id/amountView"
            android:layout_width="wrap_content"
            android:layout_height="36dp"
            android:layout_centerInParent="true"
            app:btnTextSize="14sp"
            app:btnWidth="36dp"
            app:tvWidth="50dp"/>
    ```

3. 引用控件和设置:

    ```java
    AmountView mAmountView = (AmountView) findViewById(R.id.amountView);
    mAmountView.setGoods_storage(10);  //设置库存数量
    mAmountView.setListener(new AmountView.OnAmountChangeListener() {
        @Override
        public void onAmountChange(View view, int amount) {
             //do something
        }
    });
    ```
    
    
##Custom Attribute

    ```xml
    <?xml version="1.0" encoding="utf-8"?>
    <resources>
        <declare-styleable name="AmountView">
            <!-- 左右2边+-按钮的宽度 -->
            <attr name="btnWidth" format="dimension" />
            <!-- 中间TextView的宽度 -->
            <attr name="tvWidth" format="dimension" />
            <!--<attr name="tvColor" format="color"/>-->
            <attr name="tvTextSize" format="dimension"/>
            <attr name="btnTextSize" format="dimension"/>
        </declare-styleable>
    </resources>
    ```
    
## License

    Copyright 2015, nukc

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.