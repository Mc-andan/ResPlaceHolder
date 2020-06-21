package com.andan.resplaceholder.resplaceholder;

import com.bekvon.bukkit.residence.api.ResidenceApi;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class papihook extends PlaceholderExpansion  {
    public papihook(ResPlaceHolder resPlaceHolder) {

    }

    @Override
    public String getIdentifier() {
        return "resholder";
    }

    @Override
    public String getPlugin() {
        return "";
    }

    @Override
    public String getAuthor() {
        return "ad";
    }

    @Override
    public String getVersion() {
        return "0.1";
    }

    @Override
    public String onPlaceholderRequest(Player player, String s) {
        if (s.toLowerCase().contains("*")){
            ArrayList<String> residenceList = ResidenceApi.getPlayerManager().getResidenceList(player.getName());
            return String.join(",", residenceList);
        }else if (s.toLowerCase().contains("flag")){
            String resname = s.split(";")[0];
            String flag_name = s.split(";")[2];
            return ""+ResidenceApi.getResidenceManager().getByName(resname).getPermissions().getFlags().get(flag_name);
        }

        return null;
    }
}
