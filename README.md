# ImageRoundedView
ImageRoundedView

# 引入
## Step 1. Add the JitPack repository to your build file
    Add it in your root build.gradle at the end of repositories:

      allprojects {
        repositories {
          ...
          maven { url 'https://jitpack.io' }
        }
      }
      
## Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.sinothk:ImageRoundedView:1.0.1221'
	}


# 使用

      <?xml version="1.0" encoding="utf-8"?>
      <ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
          xmlns:app="http://schemas.android.com/apk/res-auto"
          android:layout_width="match_parent"
          android:layout_height="match_parent">

          <LinearLayout
              android:layout_width="match_parent"
              android:layout_height="wrap_content"
              android:gravity="center_horizontal"
              android:orientation="vertical">

              <View
                  android:layout_width="match_parent"
                  android:layout_height="2dp"
                  android:background="@color/colorPrimaryDark" />

              <com.sinothk.view.image.rounded.RoundedImageView
                  android:id="@+id/imageView1"
                  android:layout_width="50dp"
                  android:layout_height="50dp"
                  android:layout_marginTop="10dp"
                  android:scaleType="centerCrop"
                  android:src="@drawable/precrop"
                  app:riv_border_color="#F00"
                  app:riv_border_width="2dp"
                  app:riv_corner_radius="10dp"
                  app:riv_mutate_background="false"
                  app:riv_oval="true" />

              <com.sinothk.view.image.rounded.RoundedImageView
                  android:id="@+id/imageView2"
                  android:layout_width="50dp"
                  android:layout_height="50dp"
                  android:layout_marginTop="10dp"
                  android:scaleType="centerCrop"
                  android:src="@drawable/precrop"
                  app:riv_border_color="#F00"
                  app:riv_border_width="2dp"
                  app:riv_corner_radius_bottom_left="5dp"
                  app:riv_corner_radius_bottom_right="5dp"
                  app:riv_corner_radius_top_left="5dp"
                  app:riv_corner_radius_top_right="5dp"
                  app:riv_mutate_background="false"
                  app:riv_oval="false" />

              <com.sinothk.view.image.rounded.RoundedImageView
                  android:id="@+id/imageView3"
                  android:layout_width="200dp"
                  android:layout_height="100dp"
                  android:layout_marginTop="10dp"
                  android:scaleType="centerCrop"
                  android:src="@drawable/precrop"
                  app:riv_border_color="#F00"
                  app:riv_border_width="2dp"
                  app:riv_corner_radius_bottom_left="20dp"
                  app:riv_corner_radius_top_right="20dp"
                  app:riv_mutate_background="false"
                  app:riv_oval="false" />

              <com.sinothk.view.image.rounded.RoundedImageView
                  android:id="@+id/imageView4"
                  android:layout_width="200dp"
                  android:layout_height="100dp"
                  android:layout_margin="10dp"
                  android:background="@color/colorAccent"
                  android:padding="10dip"
                  android:scaleType="center"
                  android:src="@drawable/precrop"
                  app:riv_border_color="@color/colorPrimaryDark"
                  app:riv_border_width="3dip"
                  app:riv_corner_radius="10dip"
                  app:riv_mutate_background="true"
                  app:riv_oval="true" />

              <com.sinothk.view.image.rounded.RoundedImageView
                  android:id="@+id/imageView5"
                  android:layout_width="match_parent"
                  android:layout_height="wrap_content"
                  android:layout_margin="10dp"
                  android:adjustViewBounds="true"
                  android:background="@color/colorAccent"
                  android:padding="10dip"
                  android:scaleType="centerCrop"
                  android:src="@drawable/precrop"
                  app:riv_border_color="@color/colorPrimaryDark"
                  app:riv_border_width="3dip"
                  app:riv_corner_radius="30dip"
                  app:riv_mutate_background="true"
                  app:riv_oval="false" />

              <com.sinothk.view.image.rounded.RoundedImageView
                  android:id="@+id/imageView6"
                  android:layout_width="match_parent"
                  android:layout_height="wrap_content"
                  android:layout_margin="10dp"
                  android:adjustViewBounds="true"
                  android:background="@color/colorAccent"
                  android:padding="10dip"
                  android:scaleType="centerCrop"
                  android:src="@drawable/precrop"
                  app:riv_border_color="@color/colorPrimaryDark"
                  app:riv_border_width="3dip"
                  app:riv_corner_radius="30dip"
                  app:riv_mutate_background="true"
                  app:riv_oval="false" />


          </LinearLayout>
      </ScrollView>
