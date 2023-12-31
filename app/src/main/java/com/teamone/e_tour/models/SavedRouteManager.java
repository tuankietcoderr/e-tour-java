package com.teamone.e_tour.models;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import com.teamone.e_tour.api.savedList.ViewSavedRouteListApi;
import com.teamone.e_tour.api.ticket.ViewBookedTicketApi;
import com.teamone.e_tour.entities.TouristRoute;
import com.teamone.e_tour.utils.SocketManager;

import java.util.ArrayList;

public class SavedRouteManager {

    private static SavedRouteManager instance;
    private final AppCompatActivity context;
    private ViewSavedRouteListApi api;

    private final MutableLiveData<ArrayList<TouristRoute>> routes = new MutableLiveData<>();

    private String ratingTicketId;

    public SavedRouteManager(AppCompatActivity context) {
        this.context = context;

        ViewSavedRouteListApi.getInstance(context).send();

        ViewSavedRouteListApi.getInstance(context).getData().observe(context, touristRoutes -> routes.postValue(touristRoutes));
    }

    public static SavedRouteManager getInstance(AppCompatActivity context) {
        if (instance == null) {
            instance = new SavedRouteManager(context);
        } else if (context != instance.getContext()) {
            instance = new SavedRouteManager(context);
            ViewSavedRouteListApi.getInstance(context).send();
        }
        return instance;
    }

    public MutableLiveData<ArrayList<TouristRoute>> getRoutes() {
        return routes;
    }

    public AppCompatActivity getContext() {
        return context;
    }

    public void remove(String routeId) {
        ArrayList<TouristRoute> newRoutes = routes.getValue();
        newRoutes.removeIf(touristRoute -> touristRoute.get_id() == routeId);
        routes.postValue(newRoutes);
    }
}
