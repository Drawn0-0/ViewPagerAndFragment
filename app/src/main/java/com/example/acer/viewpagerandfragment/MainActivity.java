package com.example.acer.viewpagerandfragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager vpMain;
    private TabLayout tabMain;
    private String[] tableTitle = {"tab1","tab2","tab3","tab4","tab5","tab6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        iniData();
    }

    private void iniData() {
        //设置tab的标题内容
        for (String aTableTitle : tableTitle) {
            tabMain.addTab(tabMain.newTab().setText(aTableTitle));
        }

        vpMain.setAdapter(new MyPagerAdapter(getSupportFragmentManager(),tableTitle.length));
        //在设置viewpager页面滑动监听时，创建TabLayout的滑动监听
        vpMain.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabMain));
        tabMain.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //在选中的顶部标签时，为viewpager设置currentitem
                vpMain.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void initEvent() {

    }

    private void initView() {
        vpMain = (ViewPager) findViewById(R.id.viewpager_main);
        tabMain = (TabLayout) findViewById(R.id.tab_main);

        //设置tab标签可滑动
        tabMain.setTabMode(TabLayout.MODE_SCROLLABLE);
    }

}
