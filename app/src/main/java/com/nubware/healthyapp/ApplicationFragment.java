package com.nubware.healthyapp;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.codepond.wizardroid.WizardFlow;
import org.codepond.wizardroid.layouts.BasicWizardLayout;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ApplicationFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ApplicationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ApplicationFragment extends BasicWizardLayout {
    public ApplicationFragment(){
        super();
    }

    @Override
    public WizardFlow onSetup() {
        setNextButtonText("Siguiente");
        setBackButtonText("Anterior");
        setFinishButtonText("Finalizar");

        return new WizardFlow.Builder()
                .addStep(ApplicationStep1.class)
                .addStep(ApplicationStep2.class)
                .addStep(ApplicationStep3.class)
                .addStep(ApplicationSummary.class)
                .create();
    }

}
