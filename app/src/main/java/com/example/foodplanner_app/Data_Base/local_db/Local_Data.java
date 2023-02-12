package com.example.foodplanner_app.Data_Base.local_db;

import android.content.Context;

import androidx.lifecycle.LiveData;

import com.example.foodplanner_app.details.model.MealDetailsModel;
import com.example.foodplanner_app.meals.view.AddFavClickListener;

import java.util.List;

public class Local_Data implements AddFavClickListener {

     public MealDao mealDAO;
    private static Local_Data localSource = null;
    private LiveData<List<MealDetailsModel>> storedProducts;


    private Local_Data(Context context) {
        App_Room_Db appDataBase = App_Room_Db.getInstance(context.getApplicationContext());
        mealDAO = appDataBase.mealDao();
        storedProducts = mealDAO.getAllMeals();
    }
    public static Local_Data getInstance(Context context) {
        if (localSource == null)
            localSource = new Local_Data(context);
        return localSource;
    }

    public Local_Data(MealDao mealDAO) {
        this.mealDAO = mealDAO;
    }


    @Override
    public void addFavItem(MealDetailsModel model) {

    }
}