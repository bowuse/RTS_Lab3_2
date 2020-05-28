package com.example.rtsLab32.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;

public abstract class ActivityMainBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout DeadlineColumns;

  @NonNull
  public final EditText aAct;

  @NonNull
  public final EditText aExp;

  @NonNull
  public final TextView aLabel;

  @NonNull
  public final EditText aX1;

  @NonNull
  public final EditText aX2;

  @NonNull
  public final TextView actLabel;

  @NonNull
  public final LinearLayout actualColumn;

  @NonNull
  public final EditText ax9;

  @NonNull
  public final EditText bAct;

  @NonNull
  public final EditText bExp;

  @NonNull
  public final TextView bLabel;

  @NonNull
  public final EditText bX1;

  @NonNull
  public final EditText bX2;

  @NonNull
  public final Button button;

  @NonNull
  public final EditText cAct;

  @NonNull
  public final EditText cExp;

  @NonNull
  public final TextView cLabel;

  @NonNull
  public final EditText cX1;

  @NonNull
  public final EditText cX2;

  @NonNull
  public final EditText dExp;

  @NonNull
  public final TextView dLabel;

  @NonNull
  public final EditText dX1;

  @NonNull
  public final EditText dX2;

  @NonNull
  public final TextView expLabel;

  @NonNull
  public final LinearLayout expectedColumn;

  @NonNull
  public final LinearLayout headersColumn;

  @NonNull
  public final RadioButton iterationsButton;

  @NonNull
  public final Spinner iterationsSpinner;

  @NonNull
  public final ConstraintLayout mainLayout;

  @NonNull
  public final RadioGroup radioGroup2;

  @NonNull
  public final RadioButton secondsButton;

  @NonNull
  public final Spinner secondsSpinner;

  @NonNull
  public final TextView speedLabel;

  @NonNull
  public final Spinner speedSpinner;

  @NonNull
  public final TableLayout tableLayout;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView thresholdLabel;

  @NonNull
  public final EditText thresholdText;

  @NonNull
  public final Button trainButton;

  @NonNull
  public final EditText weightX1;

  @NonNull
  public final EditText weightX2;

  @NonNull
  public final TextView weightsLabel;

  @NonNull
  public final LinearLayout x1Column;

  @NonNull
  public final TextView x1Label;

  @NonNull
  public final LinearLayout x2Column;

  @NonNull
  public final TextView x2Label;

  protected ActivityMainBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout DeadlineColumns, EditText aAct, EditText aExp,
      TextView aLabel, EditText aX1, EditText aX2, TextView actLabel, LinearLayout actualColumn,
      EditText ax9, EditText bAct, EditText bExp, TextView bLabel, EditText bX1, EditText bX2,
      Button button, EditText cAct, EditText cExp, TextView cLabel, EditText cX1, EditText cX2,
      EditText dExp, TextView dLabel, EditText dX1, EditText dX2, TextView expLabel,
      LinearLayout expectedColumn, LinearLayout headersColumn, RadioButton iterationsButton,
      Spinner iterationsSpinner, ConstraintLayout mainLayout, RadioGroup radioGroup2,
      RadioButton secondsButton, Spinner secondsSpinner, TextView speedLabel, Spinner speedSpinner,
      TableLayout tableLayout, TextView textView, TextView thresholdLabel, EditText thresholdText,
      Button trainButton, EditText weightX1, EditText weightX2, TextView weightsLabel,
      LinearLayout x1Column, TextView x1Label, LinearLayout x2Column, TextView x2Label) {
    super(_bindingComponent, _root, _localFieldCount);
    this.DeadlineColumns = DeadlineColumns;
    this.aAct = aAct;
    this.aExp = aExp;
    this.aLabel = aLabel;
    this.aX1 = aX1;
    this.aX2 = aX2;
    this.actLabel = actLabel;
    this.actualColumn = actualColumn;
    this.ax9 = ax9;
    this.bAct = bAct;
    this.bExp = bExp;
    this.bLabel = bLabel;
    this.bX1 = bX1;
    this.bX2 = bX2;
    this.button = button;
    this.cAct = cAct;
    this.cExp = cExp;
    this.cLabel = cLabel;
    this.cX1 = cX1;
    this.cX2 = cX2;
    this.dExp = dExp;
    this.dLabel = dLabel;
    this.dX1 = dX1;
    this.dX2 = dX2;
    this.expLabel = expLabel;
    this.expectedColumn = expectedColumn;
    this.headersColumn = headersColumn;
    this.iterationsButton = iterationsButton;
    this.iterationsSpinner = iterationsSpinner;
    this.mainLayout = mainLayout;
    this.radioGroup2 = radioGroup2;
    this.secondsButton = secondsButton;
    this.secondsSpinner = secondsSpinner;
    this.speedLabel = speedLabel;
    this.speedSpinner = speedSpinner;
    this.tableLayout = tableLayout;
    this.textView = textView;
    this.thresholdLabel = thresholdLabel;
    this.thresholdText = thresholdText;
    this.trainButton = trainButton;
    this.weightX1 = weightX1;
    this.weightX2 = weightX2;
    this.weightsLabel = weightsLabel;
    this.x1Column = x1Column;
    this.x1Label = x1Label;
    this.x2Column = x2Column;
    this.x2Label = x2Label;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMainBinding>inflate(inflater, com.example.rtsLab32.R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMainBinding>inflate(inflater, com.example.rtsLab32.R.layout.activity_main, null, false, component);
  }

  public static ActivityMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityMainBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityMainBinding)bind(component, view, com.example.rtsLab32.R.layout.activity_main);
  }
}
