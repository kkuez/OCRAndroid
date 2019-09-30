package com.Utils;

import android.content.Context;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Set;

public class TableUtil {

    public static TableRow createTableRow(RowKind rowKind, Context context, String itemName){
        switch (rowKind){
            case ItemPlusMinus:
                Set<String> buttons = new HashSet<>();
                buttons.add("+");
                buttons.add("-");
                return createButtonTableRow(context, itemName, buttons);
            case ItemMinus:
                buttons = new HashSet<>();
                buttons.add("-");
                return createButtonTableRow(context, itemName, buttons);
        }
        return null;
    }

    public static TableRow createButtonTableRow(Context context, String name, Set<String> buttonNamesOrNull){
        TableRow tableRow = new TableRow(context);
        TextView nameTextView = new TextView(context);
        nameTextView.setText(name);
        tableRow.addView(nameTextView);
        if(buttonNamesOrNull != null){
            for(String buttonName : buttonNamesOrNull){
                Button button = new Button(context);
                button.setText(buttonName);
                tableRow.addView(button);
            }
        }
        return tableRow;
    }
    enum RowKind{
        ItemPlusMinus, ItemMinus
    }
}
