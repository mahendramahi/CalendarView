# CalendarView

Hello Guys. Here are a simple and custom calendar view. 

Include `jitpack.io` inside of **root** project `build.gradle`:

```groovy
allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
```

# In build.gradle
``` java
dependencies {
	        compile 'com.github.mahendramahi:CalendarView:1.0'
	}
  
```


<img src="https://github.com/mahendramahi/CalendarView/blob/master/app/src/main/Screen1.png" width="300"> <img src="https://github.com/mahendramahi/CalendarView/blob/master/app/src/main/Screen3.png" width="300"> <img src="https://github.com/mahendramahi/CalendarView/blob/master/app/src/main/Screen4.png" width="300">



 **XML**
 
         `<io.mahendra.calendarview.widget.CalendarView
         android:id="@+id/cal"
         android:layout_width="match_parent"
         android:layout_height="match_parent"
         android:background="@android:color/transparent"
         app:calendarBackgroundColor="@android:color/transparent"
         app:calendarTitleTextColor="@color/white_color"
         app:currentDayOfMonthColor="@color/white_color"
         app:dayOfWeekTextColor="@android:color/white"
         app:disabledDayBackgroundColor="@android:color/transparent"
         app:disabledDayTextColor="@color/disabletextcolor"
         app:selectedDayBackgroundColor="@color/colorAccent"
         app:titleLayoutBackgroundColor="@android:color/transparent"
         app:weekLayoutBackgroundColor="@android:color/transparent"
         tools:layout_editor_absoluteX="8dp"
         tools:layout_editor_absoluteY="8dp"/>`
         
         
         
     
    
 **JAVA**
 
Create a Object 
``` java
private CalendarView calendarView;
``` 


Init The Object
``` java
calendarView = (CalendarView) findViewById(R.id.cal);

        calendarView.setFirstDayOfWeek(Calendar.MONDAY);
        calendarView.setIsOverflowDateVisible(true);
        calendarView.setCurrentDay(new Date(System.currentTimeMillis()));
        calendarView.setBackButtonColor(R.color.colorAccent);
        calendarView.setNextButtonColor(R.color.colorAccent);
        calendarView.refreshCalendar(Calendar.getInstance(Locale.getDefault()));
``` 

Set Listeners

``` java
calendarView.setOnDateLongClickListener(new CalendarView.OnDateLongClickListener() {
            @Override
            public void onDateLongClick(@NonNull Date selectedDate) {

                //OnDateLongClick Action here

            }
        });


        calendarView.setOnMonthChangedListener(new CalendarView.OnMonthChangedListener() {
            @Override
            public void onMonthChanged(@NonNull Date monthDate) {

                //OnMonthChanged Action Here

            }
        });
        calendarView.setOnDateClickListener(new CalendarView.OnDateClickListener() {
            @Override
            public void onDateClick(@NonNull Date selectedDate) {

                //OnDateClick Action Here

            }
        });

        calendarView.setOnMonthTitleClickListener(new CalendarView.OnMonthTitleClickListener() {
            @Override
            public void onMonthTitleClick(@NonNull Date selectedDate) {

                // OnMonthTitleClick Action here

            }
        });
```


# Download

<a href='https://ko-fi.com/A67613FQ' target='_blank'><img height='36' style='border:0px;height:36px;' src='https://az743702.vo.msecnd.net/cdn/kofi2.png?v=0' border='0' alt='Buy Me a Coffee at ko-fi.com' /></a>

        
#Thank You
	
         
