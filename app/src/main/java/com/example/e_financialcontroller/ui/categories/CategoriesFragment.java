package com.example.e_financialcontroller.ui.categories;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.e_financialcontroller.R;
import com.example.e_financialcontroller.databinding.FragmentCategoriesBinding;
import com.example.e_financialcontroller.ui.ExpensesCategoriesActivity.ExpensesCategoriesActivity;
import com.example.e_financialcontroller.ui.SavingActivity.SavingActivity;

public class CategoriesFragment extends Fragment {

    private CategoriesViewModel categoriesViewModel;
    private FragmentCategoriesBinding binding;

    private Button btncreatesaving, btncreateexpenses;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_categories,container,false);

        btncreateexpenses = view.findViewById(R.id.create_expenses_categories);
        btncreatesaving = view.findViewById(R.id.create_saving_categories);

        btncreateexpenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExpensesCategoriesActivity expensesCategoriesActivity = new ExpensesCategoriesActivity();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment_activity_main,expensesCategoriesActivity);
                fragmentTransaction.commit();
            }
        });

        btncreatesaving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SavingActivity savingActivity = new SavingActivity();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment_activity_main,savingActivity);
                fragmentTransaction.commit();
            }
        });



        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}