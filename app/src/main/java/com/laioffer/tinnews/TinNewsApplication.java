package com.laioffer.tinnews;

import android.app.Application;

import androidx.room.Room;

import com.facebook.stetho.Stetho;
import com.laioffer.tinnews.database.TinNewsDatabase;

public class TinNewsApplication extends Application {
  private static TinNewsDatabase database;

  @Override
  public void onCreate() {
    super.onCreate();
    database = Room.databaseBuilder(this, TinNewsDatabase.class, "tinnews_db").build();
//    Stetho.initializeWithDefaults(this);
  }
    public static TinNewsDatabase getDatabase() {
      return database;

  }
}
