package com.example.rtsLab32.databinding;
import com.example.rtsLab32.R;
import com.example.rtsLab32.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.headersColumn, 19);
        sViewsWithIds.put(R.id.aLabel, 20);
        sViewsWithIds.put(R.id.bLabel, 21);
        sViewsWithIds.put(R.id.cLabel, 22);
        sViewsWithIds.put(R.id.dLabel, 23);
        sViewsWithIds.put(R.id.weightsLabel, 24);
        sViewsWithIds.put(R.id.x1Column, 25);
        sViewsWithIds.put(R.id.x1Label, 26);
        sViewsWithIds.put(R.id.x2Column, 27);
        sViewsWithIds.put(R.id.x2Label, 28);
        sViewsWithIds.put(R.id.expectedColumn, 29);
        sViewsWithIds.put(R.id.expLabel, 30);
        sViewsWithIds.put(R.id.actualColumn, 31);
        sViewsWithIds.put(R.id.actLabel, 32);
        sViewsWithIds.put(R.id.tableLayout, 33);
        sViewsWithIds.put(R.id.thresholdLabel, 34);
        sViewsWithIds.put(R.id.thresholdText, 35);
        sViewsWithIds.put(R.id.speedLabel, 36);
        sViewsWithIds.put(R.id.speedSpinner, 37);
        sViewsWithIds.put(R.id.radioGroup2, 38);
        sViewsWithIds.put(R.id.secondsButton, 39);
        sViewsWithIds.put(R.id.iterationsButton, 40);
        sViewsWithIds.put(R.id.DeadlineColumns, 41);
        sViewsWithIds.put(R.id.secondsSpinner, 42);
        sViewsWithIds.put(R.id.iterationsSpinner, 43);
        sViewsWithIds.put(R.id.textView, 44);
        sViewsWithIds.put(R.id.trainButton, 45);
        sViewsWithIds.put(R.id.button, 46);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 47, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[41]
            , (android.widget.EditText) bindings[15]
            , (android.widget.EditText) bindings[11]
            , (android.widget.TextView) bindings[20]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[6]
            , (android.widget.TextView) bindings[32]
            , (android.widget.LinearLayout) bindings[31]
            , (android.widget.EditText) bindings[18]
            , (android.widget.EditText) bindings[16]
            , (android.widget.EditText) bindings[12]
            , (android.widget.TextView) bindings[21]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[7]
            , (android.widget.Button) bindings[46]
            , (android.widget.EditText) bindings[17]
            , (android.widget.EditText) bindings[13]
            , (android.widget.TextView) bindings[22]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[8]
            , (android.widget.EditText) bindings[14]
            , (android.widget.TextView) bindings[23]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[9]
            , (android.widget.TextView) bindings[30]
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.RadioButton) bindings[40]
            , (android.widget.Spinner) bindings[43]
            , (android.support.constraint.ConstraintLayout) bindings[0]
            , (android.widget.RadioGroup) bindings[38]
            , (android.widget.RadioButton) bindings[39]
            , (android.widget.Spinner) bindings[42]
            , (android.widget.TextView) bindings[36]
            , (android.widget.Spinner) bindings[37]
            , (android.widget.TableLayout) bindings[33]
            , (android.widget.TextView) bindings[44]
            , (android.widget.TextView) bindings[34]
            , (android.widget.EditText) bindings[35]
            , (android.widget.Button) bindings[45]
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[10]
            , (android.widget.TextView) bindings[24]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.TextView) bindings[26]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.TextView) bindings[28]
            );
        this.aAct.setTag(null);
        this.aExp.setTag(null);
        this.aX1.setTag(null);
        this.aX2.setTag(null);
        this.ax9.setTag(null);
        this.bAct.setTag(null);
        this.bExp.setTag(null);
        this.bX1.setTag(null);
        this.bX2.setTag(null);
        this.cAct.setTag(null);
        this.cExp.setTag(null);
        this.cX1.setTag(null);
        this.cX2.setTag(null);
        this.dExp.setTag(null);
        this.dX1.setTag(null);
        this.dX2.setTag(null);
        this.mainLayout.setTag(null);
        this.weightX1.setTag(null);
        this.weightX2.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
        if ((dirtyFlags & 0x1L) != 0) {
            // api target 1

            this.aAct.setTag((getFromArray(aX1.getResources().getStringArray(R.array.pointsPrefixes), 0)) + (aAct.getResources().getString(R.string.Act)));
            this.aExp.setTag((getFromArray(aX1.getResources().getStringArray(R.array.pointsPrefixes), 0)) + (aExp.getResources().getString(R.string.Exp)));
            this.aX1.setTag((getFromArray(aX1.getResources().getStringArray(R.array.pointsPrefixes), 0)) + (aX1.getResources().getString(R.string.X1)));
            this.aX2.setTag((getFromArray(aX1.getResources().getStringArray(R.array.pointsPrefixes), 0)) + (aX2.getResources().getString(R.string.X2)));
            this.ax9.setTag((getFromArray(dX1.getResources().getStringArray(R.array.pointsPrefixes), 3)) + (ax9.getResources().getString(R.string.Act)));
            this.bAct.setTag((getFromArray(bX1.getResources().getStringArray(R.array.pointsPrefixes), 1)) + (bAct.getResources().getString(R.string.Act)));
            this.bExp.setTag((getFromArray(bX1.getResources().getStringArray(R.array.pointsPrefixes), 1)) + (bExp.getResources().getString(R.string.Exp)));
            this.bX1.setTag((getFromArray(bX1.getResources().getStringArray(R.array.pointsPrefixes), 1)) + (bX1.getResources().getString(R.string.X1)));
            this.bX2.setTag((getFromArray(bX1.getResources().getStringArray(R.array.pointsPrefixes), 1)) + (bX2.getResources().getString(R.string.X2)));
            this.cAct.setTag((getFromArray(cX1.getResources().getStringArray(R.array.pointsPrefixes), 2)) + (cAct.getResources().getString(R.string.Act)));
            this.cExp.setTag((getFromArray(cX1.getResources().getStringArray(R.array.pointsPrefixes), 2)) + (cExp.getResources().getString(R.string.Exp)));
            this.cX1.setTag((getFromArray(cX1.getResources().getStringArray(R.array.pointsPrefixes), 2)) + (cX1.getResources().getString(R.string.X1)));
            this.cX2.setTag((getFromArray(cX1.getResources().getStringArray(R.array.pointsPrefixes), 2)) + (cX2.getResources().getString(R.string.X2)));
            this.dExp.setTag((getFromArray(dX1.getResources().getStringArray(R.array.pointsPrefixes), 3)) + (dExp.getResources().getString(R.string.Exp)));
            this.dX1.setTag((getFromArray(dX1.getResources().getStringArray(R.array.pointsPrefixes), 3)) + (dX1.getResources().getString(R.string.X1)));
            this.dX2.setTag((getFromArray(dX1.getResources().getStringArray(R.array.pointsPrefixes), 3)) + (dX2.getResources().getString(R.string.X2)));
            this.weightX1.setTag((weightX1.getResources().getString(R.string.weightPrefix)) + (weightX1.getResources().getString(R.string.X1)));
            this.weightX2.setTag((weightX2.getResources().getString(R.string.weightPrefix)) + (weightX2.getResources().getString(R.string.X2)));
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}